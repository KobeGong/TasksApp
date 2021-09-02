package defpackage;

/* renamed from: vl reason: default package */
/* compiled from: PG */
public final class vl extends android.view.animation.Animation {
    private final /* synthetic */ android.support.v4.widget.SwipeRefreshLayout a;

    public vl(android.support.v4.widget.SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, android.view.animation.Transformation transformation) {
        boolean z = this.a.k;
        int abs = this.a.h - java.lang.Math.abs(this.a.g);
        this.a.a((((int) (((float) (abs - this.a.f)) * f)) + this.a.f) - this.a.e.getTop());
        this.a.i.a(1.0f - f);
    }
}
