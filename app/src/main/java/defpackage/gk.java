package defpackage;

import android.support.design.snackbar.BaseTransientBottomBar;
import android.view.View;

/* renamed from: gk  reason: default package */
/* compiled from: PG */
public final class gk implements dn, sl {
    private final /* synthetic */ db a;

    @Override // defpackage.dn
    public final void a(View view) {
        view.setVisibility(8);
        BaseTransientBottomBar.a();
    }

    @Override // defpackage.dn
    public final void a(int i) {
        BaseTransientBottomBar baseTransientBottomBar = null;
        switch (i) {
            case 0:
                gq a2 = gq.a();
                gs gsVar = baseTransientBottomBar.a;
                a2.c();
                return;
            case 1:
            case 2:
                gq a3 = gq.a();
                gs gsVar2 = baseTransientBottomBar.a;
                a3.b();
                return;
            default:
                return;
        }
    }

    public gk(db dbVar) {
        this.a = dbVar;
    }

    @Override // defpackage.sl
    public final tk a(View view, tk tkVar) {
        db dbVar = this.a;
        tk tkVar2 = null;
        if (sn.a.h(dbVar)) {
            tkVar2 = tkVar;
        }
        if (!jd.a(dbVar.f, tkVar2)) {
            dbVar.f = tkVar2;
            dbVar.requestLayout();
        }
        return tkVar.f();
    }
}
