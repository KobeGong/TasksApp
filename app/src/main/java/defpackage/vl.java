package defpackage;

import android.support.v4.widget.SwipeRefreshLayout;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: vl  reason: default package */
/* compiled from: PG */
public final class vl extends Animation {
    private final /* synthetic */ SwipeRefreshLayout a;

    public vl(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        boolean z = this.a.k;
        int abs = this.a.h - Math.abs(this.a.g);
        this.a.a((((int) (((float) (abs - this.a.f)) * f)) + this.a.f) - this.a.e.getTop());
        this.a.i.a(1.0f - f);
    }
}
