package defpackage;

/* renamed from: aab reason: default package */
/* compiled from: PG */
final class aab implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
    private final /* synthetic */ defpackage.aaa a;

    aab(defpackage.aaa aaa) {
        this.a = aaa;
    }

    public final void onGlobalLayout() {
        if (this.a.f() && !this.a.a.q) {
            android.view.View view = this.a.c;
            if (view == null || !view.isShown()) {
                this.a.e();
            } else {
                this.a.a.d();
            }
        }
    }
}
