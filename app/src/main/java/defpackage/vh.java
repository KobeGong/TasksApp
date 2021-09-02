package defpackage;

/* renamed from: vh reason: default package */
/* compiled from: PG */
public final class vh extends android.view.animation.Animation {
    private final /* synthetic */ android.support.v4.widget.SwipeRefreshLayout a;

    public vh(android.support.v4.widget.SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, android.view.animation.Transformation transformation) {
        this.a.a(f);
    }
}
