package defpackage;

/* renamed from: zp reason: default package */
/* compiled from: PG */
final class zp extends defpackage.zk implements android.view.ActionProvider.VisibilityListener {
    private defpackage.rt c;

    public zp(defpackage.zo zoVar, android.content.Context context, android.view.ActionProvider actionProvider) {
        super(zoVar, actionProvider);
    }

    public final android.view.View a(android.view.MenuItem menuItem) {
        return this.b.onCreateActionView(menuItem);
    }

    public final boolean b() {
        return this.b.overridesItemVisibility();
    }

    public final boolean c() {
        return this.b.isVisible();
    }

    public final void a(defpackage.rt rtVar) {
        this.c = rtVar;
        this.b.setVisibilityListener(this);
    }

    public final void onActionProviderVisibilityChanged(boolean z) {
        if (this.c != null) {
            this.c.a.d.g();
        }
    }
}
