package defpackage;

import android.support.v4.widget.SwipeRefreshLayout;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: vm  reason: default package */
/* compiled from: PG */
public final class vm extends Animation {
    private final /* synthetic */ SwipeRefreshLayout a;

    public vm(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        this.a.b(f);
    }
}
