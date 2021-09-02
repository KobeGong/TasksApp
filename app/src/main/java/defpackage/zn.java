package defpackage;

/* renamed from: zn reason: default package */
/* compiled from: PG */
final class zn extends defpackage.yu implements android.view.MenuItem.OnMenuItemClickListener {
    private final /* synthetic */ defpackage.zj a;

    zn(defpackage.zj zjVar, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.a = zjVar;
        super(onMenuItemClickListener);
    }

    public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
        return ((android.view.MenuItem.OnMenuItemClickListener) this.d).onMenuItemClick(this.a.a(menuItem));
    }
}
