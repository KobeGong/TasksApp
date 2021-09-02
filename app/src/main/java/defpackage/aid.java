package defpackage;

/* renamed from: aid reason: default package */
/* compiled from: PG */
final class aid implements android.animation.ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ defpackage.aic a;

    aid(defpackage.aic aic) {
        this.a = aic;
    }

    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.a.m = valueAnimator.getAnimatedFraction();
    }
}
