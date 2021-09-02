package defpackage;

/* renamed from: yt reason: default package */
/* compiled from: PG */
class yt extends defpackage.yu {
    public final android.content.Context a;
    public java.util.Map b;
    public java.util.Map c;

    yt(android.content.Context context, java.lang.Object obj) {
        super(obj);
        this.a = context;
    }

    /* access modifiers changed from: 0000 */
    public final android.view.MenuItem a(android.view.MenuItem menuItem) {
        if (!(menuItem instanceof defpackage.pp)) {
            return menuItem;
        }
        defpackage.pp ppVar = (defpackage.pp) menuItem;
        if (this.b == null) {
            this.b = new defpackage.qr();
        }
        android.view.MenuItem menuItem2 = (android.view.MenuItem) this.b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        android.view.MenuItem a2 = defpackage.zx.a(this.a, ppVar);
        this.b.put(ppVar, a2);
        return a2;
    }

    /* access modifiers changed from: 0000 */
    public final android.view.SubMenu a(android.view.SubMenu subMenu) {
        if (!(subMenu instanceof defpackage.pq)) {
            return subMenu;
        }
        defpackage.pq pqVar = (defpackage.pq) subMenu;
        if (this.c == null) {
            this.c = new defpackage.qr();
        }
        android.view.SubMenu subMenu2 = (android.view.SubMenu) this.c.get(pqVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        defpackage.aae aae = new defpackage.aae(this.a, pqVar);
        this.c.put(pqVar, aae);
        return aae;
    }
}
