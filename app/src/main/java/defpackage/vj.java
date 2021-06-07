package defpackage;

import android.support.v4.widget.SwipeRefreshLayout;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: vj  reason: default package */
/* compiled from: PG */
public final class vj extends Animation {
    private final /* synthetic */ int a;
    private final /* synthetic */ int b;
    private final /* synthetic */ SwipeRefreshLayout c;

    public vj(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.c = swipeRefreshLayout;
        this.a = i;
        this.b = i2;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        this.c.i.setAlpha((int) (((float) this.a) + (((float) (this.b - this.a)) * f)));
    }
}
