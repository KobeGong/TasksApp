package defpackage;

/* renamed from: jf reason: default package */
/* compiled from: PG */
final class jf extends android.animation.AnimatorListenerAdapter {
    private final /* synthetic */ defpackage.qr a;
    private final /* synthetic */ defpackage.je b;

    jf(defpackage.je jeVar, defpackage.qr qrVar) {
        this.b = jeVar;
        this.a = qrVar;
    }

    public final void onAnimationStart(android.animation.Animator animator) {
        this.b.k.add(animator);
    }

    public final void onAnimationEnd(android.animation.Animator animator) {
        this.a.remove(animator);
        this.b.k.remove(animator);
    }
}
