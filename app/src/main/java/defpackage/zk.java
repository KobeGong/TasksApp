package defpackage;

import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: zk  reason: default package */
/* compiled from: PG */
public class zk extends rs {
    public final ActionProvider b;
    private final /* synthetic */ zj c;

    public zk(zj zjVar, ActionProvider actionProvider) {
        this.c = zjVar;
        this.b = actionProvider;
    }

    @Override // defpackage.rs
    public final View a() {
        return this.b.onCreateActionView();
    }

    @Override // defpackage.rs
    public final boolean d() {
        return this.b.onPerformDefaultAction();
    }

    @Override // defpackage.rs
    public final boolean e() {
        return this.b.hasSubMenu();
    }

    @Override // defpackage.rs
    public final void a(SubMenu subMenu) {
        this.b.onPrepareSubMenu(this.c.a(subMenu));
    }
}
