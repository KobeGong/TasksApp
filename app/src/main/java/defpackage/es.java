package defpackage;

/* renamed from: es reason: default package */
/* compiled from: PG */
public final class es implements OnApplyWindowInsetsListener {
    private final /* synthetic */ android.support.design.appbar.AppBarLayout a;

    public es(android.support.design.appbar.AppBarLayout appBarLayout) {
        this.a = appBarLayout;
    }

    public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat tkVar) {
        android.support.design.appbar.AppBarLayout appBarLayout = this.a;
        WindowInsetsCompat tkVar2 = null;
        if (ViewCompat.a.h(appBarLayout)) {
            tkVar2 = tkVar;
        }
        if (!defpackage.jd.a((java.lang.Object) appBarLayout.c, (java.lang.Object) tkVar2)) {
            appBarLayout.c = tkVar2;
            appBarLayout.a();
        }
        return tkVar;
    }
}
