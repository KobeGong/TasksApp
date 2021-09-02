package defpackage;

/* renamed from: dc reason: default package */
/* compiled from: PG */
final class dc implements android.animation.ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ defpackage.db a;

    dc(defpackage.db dbVar) {
        this.a = dbVar;
    }

    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.a.a(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
