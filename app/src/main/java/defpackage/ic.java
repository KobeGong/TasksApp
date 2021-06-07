package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* renamed from: ic  reason: default package */
/* compiled from: PG */
final class ic implements AbstractC0000if {
    ic() {
    }

    @Override // defpackage.AbstractC0000if
    public final void a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
    }

    @Override // defpackage.AbstractC0000if
    public final void a(Animator animator) {
        ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                Animator.AnimatorListener animatorListener = listeners.get(i);
                if (animatorListener instanceof id) {
                    ((id) animatorListener).onAnimationPause(animator);
                }
            }
        }
    }

    @Override // defpackage.AbstractC0000if
    public final void b(Animator animator) {
        ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                Animator.AnimatorListener animatorListener = listeners.get(i);
                if (animatorListener instanceof id) {
                    ((id) animatorListener).onAnimationResume(animator);
                }
            }
        }
    }
}
