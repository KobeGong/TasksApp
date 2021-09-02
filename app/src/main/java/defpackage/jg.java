package defpackage;

/* renamed from: jg reason: default package */
/* compiled from: PG */
final class jg extends android.animation.AnimatorListenerAdapter {
    private final /* synthetic */ defpackage.je a;

    jg(defpackage.je jeVar) {
        this.a = jeVar;
    }

    public final void onAnimationEnd(android.animation.Animator animator) {
        this.a.e();
        animator.removeListener(this);
    }
}
