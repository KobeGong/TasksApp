package defpackage;

/* renamed from: dq reason: default package */
/* compiled from: PG */
final class dq extends android.animation.AnimatorListenerAdapter {
    private boolean a;
    private final /* synthetic */ android.support.v7.widget.ActionMenuView b;
    private final /* synthetic */ int c = 0;
    private final /* synthetic */ boolean d = false;
    private final /* synthetic */ android.support.design.bottomappbar.BottomAppBar e;

    dq(android.support.design.bottomappbar.BottomAppBar bottomAppBar, android.support.v7.widget.ActionMenuView actionMenuView, int i, boolean z) {
        this.e = bottomAppBar;
        this.b = actionMenuView;
    }

    public final void onAnimationCancel(android.animation.Animator animator) {
        this.a = true;
    }

    public final void onAnimationEnd(android.animation.Animator animator) {
        if (!this.a) {
            this.e.a(this.b, this.c, this.d);
        }
    }
}
