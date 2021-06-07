package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.design.bottomappbar.BottomAppBar;
import android.support.v7.widget.ActionMenuView;

/* renamed from: dq  reason: default package */
/* compiled from: PG */
final class dq extends AnimatorListenerAdapter {
    private boolean a;
    private final /* synthetic */ ActionMenuView b;
    private final /* synthetic */ int c = 0;
    private final /* synthetic */ boolean d = false;
    private final /* synthetic */ BottomAppBar e;

    dq(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.e = bottomAppBar;
        this.b = actionMenuView;
    }

    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.a) {
            this.e.a(this.b, this.c, this.d);
        }
    }
}
