package defpackage;

import android.view.MenuItem;

/* renamed from: zm  reason: default package */
/* compiled from: PG */
final class zm extends yu implements MenuItem.OnActionExpandListener {
    private final /* synthetic */ zj a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zm(zj zjVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        super(onActionExpandListener);
        this.a = zjVar;
    }

    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return ((MenuItem.OnActionExpandListener) this.d).onMenuItemActionExpand(this.a.a(menuItem));
    }

    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return ((MenuItem.OnActionExpandListener) this.d).onMenuItemActionCollapse(this.a.a(menuItem));
    }
}
