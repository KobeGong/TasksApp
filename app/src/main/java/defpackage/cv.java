package defpackage;

/* renamed from: cv reason: default package */
/* compiled from: PG */
public final class cv implements android.animation.ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ android.support.design.widget.CoordinatorLayout a;
    private final /* synthetic */ android.support.design.appbar.AppBarLayout b;
    private final /* synthetic */ android.support.design.appbar.AppBarLayout.BaseBehavior c;

    public cv(android.support.design.appbar.AppBarLayout.BaseBehavior baseBehavior, android.support.design.widget.CoordinatorLayout coordinatorLayout, android.support.design.appbar.AppBarLayout appBarLayout) {
        this.c = baseBehavior;
        this.a = coordinatorLayout;
        this.b = appBarLayout;
    }

    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.c.a_(this.a, this.b, ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
