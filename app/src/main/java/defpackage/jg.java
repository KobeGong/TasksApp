package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* access modifiers changed from: package-private */
/* renamed from: jg  reason: default package */
/* compiled from: PG */
public final class jg extends AnimatorListenerAdapter {
    private final /* synthetic */ je a;

    jg(je jeVar) {
        this.a = jeVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.e();
        animator.removeListener(this);
    }
}
