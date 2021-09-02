package defpackage;

/* renamed from: ct reason: default package */
/* compiled from: PG */
public final class ct {
    private final defpackage.ri a = new defpackage.ri();

    public static defpackage.ct a(android.content.Context context, android.content.res.TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                return a(context, resourceId);
            }
        }
        return null;
    }

    private static defpackage.ct a(android.content.Context context, int i) {
        try {
            android.animation.Animator loadAnimator = android.animation.AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof android.animation.AnimatorSet) {
                return a(((android.animation.AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(loadAnimator);
            return a(arrayList);
        } catch (java.lang.Exception e) {
            java.lang.Exception exc = e;
            java.lang.String str = "MotionSpec";
            java.lang.String str2 = "Can't load animation resource ID #0x";
            java.lang.String valueOf = java.lang.String.valueOf(java.lang.Integer.toHexString(i));
            android.util.Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new java.lang.String(str2), exc);
            return null;
        }
    }

    private static defpackage.ct a(java.util.List list) {
        defpackage.ct ctVar = new defpackage.ct();
        int size = list.size();
        int i = 0;
        while (i < size) {
            android.animation.Animator animator = (android.animation.Animator) list.get(i);
            if (animator instanceof android.animation.ObjectAnimator) {
                android.animation.ObjectAnimator objectAnimator = (android.animation.ObjectAnimator) animator;
                java.lang.String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                android.animation.TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof android.view.animation.AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = defpackage.cs.a;
                } else if (interpolator instanceof android.view.animation.AccelerateInterpolator) {
                    interpolator = defpackage.cs.b;
                } else if (interpolator instanceof android.view.animation.DecelerateInterpolator) {
                    interpolator = defpackage.cs.c;
                }
                defpackage.cu cuVar = new defpackage.cu(startDelay, duration, interpolator);
                cuVar.a = objectAnimator.getRepeatCount();
                cuVar.b = objectAnimator.getRepeatMode();
                ctVar.a.put(propertyName, cuVar);
                i++;
            } else {
                java.lang.String valueOf = java.lang.String.valueOf(animator);
                throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 36).append("Animator must be an ObjectAnimator: ").append(valueOf).toString());
            }
        }
        return ctVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((defpackage.ct) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(10);
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append(" timings: ");
        sb.append(this.a);
        sb.append("}\n");
        return sb.toString();
    }
}
