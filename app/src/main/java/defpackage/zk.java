package defpackage;

/* renamed from: zk reason: default package */
/* compiled from: PG */
class zk extends defpackage.rs {
    public final android.view.ActionProvider b;
    private final /* synthetic */ defpackage.zj c;

    public zk(defpackage.zj zjVar, android.view.ActionProvider actionProvider) {
        this.c = zjVar;
        this.b = actionProvider;
    }

    public final android.view.View a() {
        return this.b.onCreateActionView();
    }

    public final boolean d() {
        return this.b.onPerformDefaultAction();
    }

    public final boolean e() {
        return this.b.hasSubMenu();
    }

    public final void a(android.view.SubMenu subMenu) {
        this.b.onPrepareSubMenu(this.c.a(subMenu));
    }
}
