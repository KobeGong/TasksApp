package defpackage;

import android.support.design.appbar.AppBarLayout;
import android.view.View;

/* renamed from: es  reason: default package */
/* compiled from: PG */
public final class es implements sl {
    private final /* synthetic */ AppBarLayout a;

    public es(AppBarLayout appBarLayout) {
        this.a = appBarLayout;
    }

    @Override // defpackage.sl
    public final tk a(View view, tk tkVar) {
        AppBarLayout appBarLayout = this.a;
        tk tkVar2 = null;
        if (sn.a.h(appBarLayout)) {
            tkVar2 = tkVar;
        }
        if (!jd.a(appBarLayout.c, tkVar2)) {
            appBarLayout.c = tkVar2;
            appBarLayout.a();
        }
        return tkVar;
    }
}
