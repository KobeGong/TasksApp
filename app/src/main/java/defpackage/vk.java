package defpackage;

/* renamed from: vk reason: default package */
/* compiled from: PG */
public final class vk implements android.view.animation.Animation.AnimationListener {
    private final /* synthetic */ android.support.v4.widget.SwipeRefreshLayout a;

    public vk(android.support.v4.widget.SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    public final void onAnimationStart(android.view.animation.Animation animation) {
    }

    public final void onAnimationEnd(android.view.animation.Animation animation) {
        boolean z = this.a.d;
        this.a.a((android.view.animation.Animation.AnimationListener) null);
    }

    public final void onAnimationRepeat(android.view.animation.Animation animation) {
    }
}
