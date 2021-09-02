package defpackage;

/* renamed from: acg reason: default package */
/* compiled from: PG */
final class acg implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
    private final /* synthetic */ defpackage.ace a;

    acg(defpackage.ace ace) {
        this.a = ace;
    }

    public final void onGlobalLayout() {
        defpackage.ace ace = this.a;
        defpackage.acb acb = this.a.d;
        if (!(defpackage.sn.a.s(acb) && acb.getGlobalVisibleRect(ace.c))) {
            this.a.e();
            return;
        }
        this.a.a();
        defpackage.acg.super.d();
    }
}
