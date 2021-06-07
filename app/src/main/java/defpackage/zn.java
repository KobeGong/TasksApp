package defpackage;

import android.view.MenuItem;

/* renamed from: zn  reason: default package */
/* compiled from: PG */
final class zn extends yu implements MenuItem.OnMenuItemClickListener {
    private final /* synthetic */ zj a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zn(zj zjVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        super(onMenuItemClickListener);
        this.a = zjVar;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return ((MenuItem.OnMenuItemClickListener) this.d).onMenuItemClick(this.a.a(menuItem));
    }
}
