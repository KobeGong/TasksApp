package defpackage;

import android.support.v4.widget.SwipeRefreshLayout;
import android.view.animation.Animation;

/* renamed from: vk  reason: default package */
/* compiled from: PG */
public final class vk implements Animation.AnimationListener {
    private final /* synthetic */ SwipeRefreshLayout a;

    public vk(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        boolean z = this.a.d;
        this.a.a((Animation.AnimationListener) null);
    }

    public final void onAnimationRepeat(Animation animation) {
    }
}
