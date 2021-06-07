package defpackage;

import android.support.v4.widget.SwipeRefreshLayout;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: vh  reason: default package */
/* compiled from: PG */
public final class vh extends Animation {
    private final /* synthetic */ SwipeRefreshLayout a;

    public vh(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        this.a.a(f);
    }
}
