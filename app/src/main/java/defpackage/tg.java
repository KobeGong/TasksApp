package defpackage;

/* renamed from: tg reason: default package */
/* compiled from: PG */
final class tg implements android.animation.ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ defpackage.tj a;

    tg(defpackage.tj tjVar) {
        this.a = tjVar;
    }

    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        ((android.view.View) this.a.a.c.getParent()).invalidate();
    }
}
