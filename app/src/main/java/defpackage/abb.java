package defpackage;

/* renamed from: abb reason: default package */
/* compiled from: PG */
public final class abb implements defpackage.zf {
    private final /* synthetic */ android.support.v7.widget.ActionMenuView a;

    public abb(android.support.v7.widget.ActionMenuView actionMenuView) {
        this.a = actionMenuView;
    }

    public final boolean a(defpackage.ze zeVar, android.view.MenuItem menuItem) {
        boolean z;
        if (this.a.f == null) {
            return false;
        }
        defpackage.abc abc = this.a.f;
        if (abc.a.mOnMenuItemClickListener != null) {
            z = abc.a.mOnMenuItemClickListener.onMenuItemClick(menuItem);
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public final void a(defpackage.ze zeVar) {
    }
}
