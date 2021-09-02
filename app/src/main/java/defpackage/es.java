package defpackage;

/* renamed from: es reason: default package */
/* compiled from: PG */
public final class es implements defpackage.sl {
    private final /* synthetic */ android.support.design.appbar.AppBarLayout a;

    public es(android.support.design.appbar.AppBarLayout appBarLayout) {
        this.a = appBarLayout;
    }

    public final defpackage.tk a(android.view.View view, defpackage.tk tkVar) {
        android.support.design.appbar.AppBarLayout appBarLayout = this.a;
        defpackage.tk tkVar2 = null;
        if (defpackage.sn.a.h(appBarLayout)) {
            tkVar2 = tkVar;
        }
        if (!defpackage.jd.a((java.lang.Object) appBarLayout.c, (java.lang.Object) tkVar2)) {
            appBarLayout.c = tkVar2;
            appBarLayout.a();
        }
        return tkVar;
    }
}
