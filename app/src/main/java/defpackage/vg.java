package defpackage;

import android.support.v4.widget.SwipeRefreshLayout;
import android.view.animation.Animation;

/* renamed from: vg  reason: default package */
/* compiled from: PG */
public final class vg implements Animation.AnimationListener {
    private final /* synthetic */ SwipeRefreshLayout a;

    public vg(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
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
