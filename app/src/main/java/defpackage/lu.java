package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* access modifiers changed from: package-private */
/* renamed from: lu  reason: default package */
/* compiled from: PG */
public final class lu extends AnimatorListenerAdapter {
    private final /* synthetic */ ViewGroup a;
    private final /* synthetic */ View b;
    private final /* synthetic */ lc c;

    lu(ViewGroup viewGroup, View view, lc lcVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = lcVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.endViewTransition(this.b);
        animator.removeListener(this);
        if (this.c.J != null) {
            this.c.J.setVisibility(8);
        }
    }
}
