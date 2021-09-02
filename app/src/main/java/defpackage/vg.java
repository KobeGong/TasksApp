package defpackage;

/* renamed from: vg reason: default package */
/* compiled from: PG */
public final class vg implements android.view.animation.Animation.AnimationListener {
    private final /* synthetic */ android.support.v4.widget.SwipeRefreshLayout a;

    public vg(android.support.v4.widget.SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    public final void onAnimationStart(android.view.animation.Animation animation) {
    }

    public final void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    public final void onAnimationEnd(android.view.animation.Animation animation) {
        if (this.a.b) {
            this.a.i.setAlpha(255);
            this.a.i.start();
            if (this.a.j && this.a.a != null) {
                this.a.a.a();
            }
            this.a.c = this.a.e.getTop();
            return;
        }
        this.a.a();
    }
}
