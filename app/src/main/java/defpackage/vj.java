package defpackage;

/* renamed from: vj reason: default package */
/* compiled from: PG */
public final class vj extends android.view.animation.Animation {
    private final /* synthetic */ int a;
    private final /* synthetic */ int b;
    private final /* synthetic */ android.support.v4.widget.SwipeRefreshLayout c;

    public vj(android.support.v4.widget.SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.c = swipeRefreshLayout;
        this.a = i;
        this.b = i2;
    }

    public final void applyTransformation(float f, android.view.animation.Transformation transformation) {
        this.c.i.setAlpha((int) (((float) this.a) + (((float) (this.b - this.a)) * f)));
    }
}
