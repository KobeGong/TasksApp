package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: ie  reason: default package */
/* compiled from: PG */
final class ie implements AbstractC0000if {
    ie() {
    }

    @Override // defpackage.AbstractC0000if
    public final void a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    @Override // defpackage.AbstractC0000if
    public final void a(Animator animator) {
        animator.pause();
    }

    @Override // defpackage.AbstractC0000if
    public final void b(Animator animator) {
        animator.resume();
    }
}
