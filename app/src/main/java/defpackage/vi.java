package defpackage;

/* renamed from: vi reason: default package */
/* compiled from: PG */
public final class vi extends android.view.animation.Animation {
    private final /* synthetic */ android.support.v4.widget.SwipeRefreshLayout a;

    public vi(android.support.v4.widget.SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, android.view.animation.Transformation transformation) {
        this.a.a(1.0f - f);
    }
}
