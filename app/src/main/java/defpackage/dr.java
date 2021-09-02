package defpackage;

/* renamed from: dr reason: default package */
/* compiled from: PG */
final class dr extends android.animation.AnimatorListenerAdapter {
    private final /* synthetic */ android.support.design.bottomappbar.BottomAppBar a;

    dr(android.support.design.bottomappbar.BottomAppBar bottomAppBar) {
        this.a = bottomAppBar;
    }

    public final void onAnimationEnd(android.animation.Animator animator) {
        this.a.b = null;
    }
}
