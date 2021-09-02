package defpackage;

/* renamed from: yw reason: default package */
/* compiled from: PG */
final class yw implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
    private final /* synthetic */ defpackage.yv a;

    yw(defpackage.yv yvVar) {
        this.a = yvVar;
    }

    public final void onGlobalLayout() {
        if (this.a.f() && this.a.b.size() > 0 && !((defpackage.za) this.a.b.get(0)).a.q) {
            android.view.View view = this.a.d;
            if (view == null || !view.isShown()) {
                this.a.e();
                return;
            }
            for (defpackage.za zaVar : this.a.b) {
                zaVar.a.d();
            }
        }
    }
}
