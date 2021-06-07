package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: lz  reason: default package */
/* compiled from: PG */
public final class lz extends AnimatorListenerAdapter {
    private View a;

    lz(View view) {
        this.a = view;
    }

    public final void onAnimationStart(Animator animator) {
        this.a.setLayerType(2, null);
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.setLayerType(0, null);
        animator.removeListener(this);
    }
}
