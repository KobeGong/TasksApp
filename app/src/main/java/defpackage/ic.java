package defpackage;

/* renamed from: ic reason: default package */
/* compiled from: PG */
final class ic implements defpackage.C0000if {
    ic() {
    }

    public final void a(android.animation.Animator animator, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
    }

    public final void a(android.animation.Animator animator) {
        java.util.ArrayList listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                android.animation.Animator.AnimatorListener animatorListener = (android.animation.Animator.AnimatorListener) listeners.get(i);
                if (animatorListener instanceof defpackage.id) {
                    ((defpackage.id) animatorListener).onAnimationPause(animator);
                }
            }
        }
    }

    public final void b(android.animation.Animator animator) {
        java.util.ArrayList listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                android.animation.Animator.AnimatorListener animatorListener = (android.animation.Animator.AnimatorListener) listeners.get(i);
                if (animatorListener instanceof defpackage.id) {
                    ((defpackage.id) animatorListener).onAnimationResume(animator);
                }
            }
        }
    }
}
