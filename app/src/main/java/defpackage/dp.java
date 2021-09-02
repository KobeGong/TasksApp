package defpackage;

/* renamed from: dp reason: default package */
/* compiled from: PG */
final class dp extends android.animation.AnimatorListenerAdapter {
    private final /* synthetic */ android.support.design.bottomappbar.BottomAppBar a;

    dp(android.support.design.bottomappbar.BottomAppBar bottomAppBar) {
        this.a = bottomAppBar;
    }

    public final void onAnimationEnd(android.animation.Animator animator) {
        this.a.c = null;
    }
}
