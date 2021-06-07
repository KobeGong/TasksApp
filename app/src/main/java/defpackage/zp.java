package defpackage;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* renamed from: zp  reason: default package */
/* compiled from: PG */
final class zp extends zk implements ActionProvider.VisibilityListener {
    private rt c;

    public zp(zo zoVar, Context context, ActionProvider actionProvider) {
        super(zoVar, actionProvider);
    }

    @Override // defpackage.rs
    public final View a(MenuItem menuItem) {
        return this.b.onCreateActionView(menuItem);
    }

    @Override // defpackage.rs
    public final boolean b() {
        return this.b.overridesItemVisibility();
    }

    @Override // defpackage.rs
    public final boolean c() {
        return this.b.isVisible();
    }

    @Override // defpackage.rs
    public final void a(rt rtVar) {
        this.c = rtVar;
        this.b.setVisibilityListener(this);
    }

    public final void onActionProviderVisibilityChanged(boolean z) {
        if (this.c != null) {
            this.c.a.d.g();
        }
    }
}
