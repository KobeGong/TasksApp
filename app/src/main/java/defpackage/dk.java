package defpackage;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.apps.tasks.R;

/* renamed from: dk  reason: default package */
/* compiled from: PG */
public final class dk {
    private static final int[] a = {16843848};

    public static void a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    public static void a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        TypedArray a2 = fp.a(context, attributeSet, a, 0, 2132017714);
        try {
            if (a2.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, a2.getResourceId(0, 0)));
            }
        } finally {
            a2.recycle();
        }
    }

    public static void a(View view, float f) {
        int integer = view.getResources().getInteger(R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(new int[]{16842766, R.attr.state_collapsible, -2130772112}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration((long) integer));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration((long) integer));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
