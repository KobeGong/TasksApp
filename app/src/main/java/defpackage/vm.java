package defpackage;

/* renamed from: vm reason: default package */
/* compiled from: PG */
public final class vm extends android.view.animation.Animation {
    private final /* synthetic */ android.support.v4.widget.SwipeRefreshLayout a;

    public vm(android.support.v4.widget.SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, android.view.animation.Transformation transformation) {
        this.a.b(f);
    }
}
