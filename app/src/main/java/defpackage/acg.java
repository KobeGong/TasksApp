package defpackage;

import android.view.ViewTreeObserver;

/* renamed from: acg  reason: default package */
/* compiled from: PG */
final class acg implements ViewTreeObserver.OnGlobalLayoutListener {
    private final /* synthetic */ ace a;

    acg(ace ace) {
        this.a = ace;
    }

    public final void onGlobalLayout() {
        ace ace = this.a;
        acb acb = this.a.d;
        if (!(sn.a.s(acb) && acb.getGlobalVisibleRect(ace.c))) {
            this.a.e();
            return;
        }
        this.a.a();
        acg.super.d();
    }
}
