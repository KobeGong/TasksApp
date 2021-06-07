package defpackage;

import android.animation.ValueAnimator;
import android.support.design.appbar.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;

/* renamed from: cv  reason: default package */
/* compiled from: PG */
public final class cv implements ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ CoordinatorLayout a;
    private final /* synthetic */ AppBarLayout b;
    private final /* synthetic */ AppBarLayout.BaseBehavior c;

    public cv(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.c = baseBehavior;
        this.a = coordinatorLayout;
        this.b = appBarLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.c.a_(this.a, this.b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
