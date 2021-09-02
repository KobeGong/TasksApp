package defpackage;

/* renamed from: ie reason: default package */
/* compiled from: PG */
final class ie implements defpackage.C0000if {
    ie() {
    }

    public final void a(android.animation.Animator animator, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    public final void a(android.animation.Animator animator) {
        animator.pause();
    }

    public final void b(android.animation.Animator animator) {
        animator.resume();
    }
}
