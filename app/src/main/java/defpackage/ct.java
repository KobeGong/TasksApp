package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ct  reason: default package */
/* compiled from: PG */
public final class ct {
    private final ri a = new ri();

    public static ct a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return a(context, resourceId);
    }

    private static ct a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return a(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return a(arrayList);
        } catch (Exception e) {
            String valueOf = String.valueOf(Integer.toHexString(i));
            Log.w("MotionSpec", valueOf.length() != 0 ? "Can't load animation resource ID #0x".concat(valueOf) : new String("Can't load animation resource ID #0x"), e);
            return null;
        }
    }

    private static ct a(List list) {
        ct ctVar = new ct();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = cs.a;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = cs.b;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = cs.c;
                }
                cu cuVar = new cu(startDelay, duration, interpolator);
                cuVar.a = objectAnimator.getRepeatCount();
                cuVar.b = objectAnimator.getRepeatMode();
                ctVar.a.put(propertyName, cuVar);
            } else {
                String valueOf = String.valueOf(animator);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 36).append("Animator must be an ObjectAnimator: ").append(valueOf).toString());
            }
        }
        return ctVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((ct) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
