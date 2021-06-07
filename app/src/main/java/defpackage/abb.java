package defpackage;

import android.support.v7.widget.ActionMenuView;
import android.view.MenuItem;

/* renamed from: abb  reason: default package */
/* compiled from: PG */
public final class abb implements zf {
    private final /* synthetic */ ActionMenuView a;

    public abb(ActionMenuView actionMenuView) {
        this.a = actionMenuView;
    }

    @Override // defpackage.zf
    public final boolean a(ze zeVar, MenuItem menuItem) {
        boolean z;
        if (this.a.f == null) {
            return false;
        }
        abc abc = this.a.f;
        if (abc.a.A != null) {
            z = abc.a.A.a(menuItem);
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    @Override // defpackage.zf
    public final void a(ze zeVar) {
    }
}
