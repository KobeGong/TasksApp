package defpackage;

/* renamed from: tf reason: default package */
/* compiled from: PG */
final class tf extends android.animation.AnimatorListenerAdapter {
    private final /* synthetic */ defpackage.th a;

    tf(defpackage.th thVar, android.view.View view) {
        this.a = thVar;
    }

    public final void onAnimationCancel(android.animation.Animator animator) {
        this.a.c();
    }

    public final void onAnimationEnd(android.animation.Animator animator) {
        this.a.b();
    }

    public final void onAnimationStart(android.animation.Animator animator) {
        this.a.a();
    }
}
