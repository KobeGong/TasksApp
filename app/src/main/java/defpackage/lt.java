package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* access modifiers changed from: package-private */
/* renamed from: lt  reason: default package */
/* compiled from: PG */
public final class lt extends AnimatorListenerAdapter {
    private final /* synthetic */ ViewGroup a;
    private final /* synthetic */ View b;
    private final /* synthetic */ lc c;
    private final /* synthetic */ lp d;

    lt(lp lpVar, ViewGroup viewGroup, View view, lc lcVar) {
        this.d = lpVar;
        this.a = viewGroup;
        this.b = view;
        this.c = lcVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.endViewTransition(this.b);
        Animator J = this.c.J();
        this.c.a((Animator) null);
        if (J != null && this.a.indexOfChild(this.b) < 0) {
            this.d.a(this.c, this.c.K(), 0, 0, false);
        }
    }
}
