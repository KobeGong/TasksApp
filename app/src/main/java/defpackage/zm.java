package defpackage;

/* renamed from: zm reason: default package */
/* compiled from: PG */
final class zm extends defpackage.yu implements android.view.MenuItem.OnActionExpandListener {
    private final /* synthetic */ defpackage.zj a;

    zm(defpackage.zj zjVar, android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
        this.a = zjVar;
        super(onActionExpandListener);
    }

    public final boolean onMenuItemActionExpand(android.view.MenuItem menuItem) {
        return ((android.view.MenuItem.OnActionExpandListener) this.d).onMenuItemActionExpand(this.a.a(menuItem));
    }

    public final boolean onMenuItemActionCollapse(android.view.MenuItem menuItem) {
        return ((android.view.MenuItem.OnActionExpandListener) this.d).onMenuItemActionCollapse(this.a.a(menuItem));
    }
}
