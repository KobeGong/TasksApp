package defpackage;

/* renamed from: adk reason: default package */
/* compiled from: PG */
final class adk extends android.animation.AnimatorListenerAdapter {
    private boolean a = false;
    private final /* synthetic */ defpackage.adh b;

    adk(defpackage.adh adh) {
        this.b = adh;
    }

    public final void onAnimationEnd(android.animation.Animator animator) {
        if (this.a) {
            this.a = false;
        } else if (((java.lang.Float) this.b.n.getAnimatedValue()).floatValue() == 0.0f) {
            this.b.o = 0;
            this.b.a(0);
        } else {
            this.b.o = 2;
            this.b.j.invalidate();
        }
    }

    public final void onAnimationCancel(android.animation.Animator animator) {
        this.a = true;
    }
}
