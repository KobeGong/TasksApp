package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;

/* renamed from: yt  reason: default package */
/* compiled from: PG */
class yt extends yu {
    public final Context a;
    public Map b;
    public Map c;

    yt(Context context, Object obj) {
        super(obj);
        this.a = context;
    }

    /* access modifiers changed from: package-private */
    public final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof pp)) {
            return menuItem;
        }
        pp ppVar = (pp) menuItem;
        if (this.b == null) {
            this.b = new qr();
        }
        MenuItem menuItem2 = (MenuItem) this.b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItem a2 = zx.a(this.a, ppVar);
        this.b.put(ppVar, a2);
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final SubMenu a(SubMenu subMenu) {
        if (!(subMenu instanceof pq)) {
            return subMenu;
        }
        pq pqVar = (pq) subMenu;
        if (this.c == null) {
            this.c = new qr();
        }
        SubMenu subMenu2 = (SubMenu) this.c.get(pqVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        aae aae = new aae(this.a, pqVar);
        this.c.put(pqVar, aae);
        return aae;
    }
}
