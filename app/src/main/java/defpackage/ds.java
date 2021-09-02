package defpackage;

/* renamed from: ds reason: default package */
/* compiled from: PG */
final class ds implements android.animation.ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ android.support.design.bottomappbar.BottomAppBar a;

    ds(android.support.design.bottomappbar.BottomAppBar bottomAppBar) {
        this.a = bottomAppBar;
    }

    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.a.a.a(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
