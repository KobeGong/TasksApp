package defpackage;

/* renamed from: gk reason: default package */
/* compiled from: PG */
public final class gk implements defpackage.dn, defpackage.sl {
    private final /* synthetic */ defpackage.db a;

    public final void a(android.view.View view) {
        view.setVisibility(8);
        android.support.design.snackbar.BaseTransientBottomBar.a();
    }

    public final void a(int i) {
        switch (i) {
            case 0:
                defpackage.gq a2 = defpackage.gq.a();
                defpackage.gs gsVar = null.a;
                a2.c();
                return;
            case 1:
            case 2:
                defpackage.gq a3 = defpackage.gq.a();
                defpackage.gs gsVar2 = null.a;
                a3.b();
                return;
            default:
                return;
        }
    }

    public gk(defpackage.db dbVar) {
        this.a = dbVar;
    }

    public final defpackage.tk a(android.view.View view, defpackage.tk tkVar) {
        defpackage.db dbVar = this.a;
        defpackage.tk tkVar2 = null;
        if (defpackage.sn.a.h(dbVar)) {
            tkVar2 = tkVar;
        }
        if (!defpackage.jd.a((java.lang.Object) dbVar.f, (java.lang.Object) tkVar2)) {
            dbVar.f = tkVar2;
            dbVar.requestLayout();
        }
        return tkVar.f();
    }
}
