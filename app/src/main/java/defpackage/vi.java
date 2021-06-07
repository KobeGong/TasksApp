package defpackage;

import android.support.v4.widget.SwipeRefreshLayout;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: vi  reason: default package */
/* compiled from: PG */
public final class vi extends Animation {
    private final /* synthetic */ SwipeRefreshLayout a;

    public vi(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        this.a.a(1.0f - f);
    }
}
