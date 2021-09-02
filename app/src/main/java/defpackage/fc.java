package defpackage;

/* renamed from: fc reason: default package */
/* compiled from: PG */
final class fc implements android.view.View.OnClickListener {
    private final /* synthetic */ defpackage.fb a;

    fc(defpackage.fb fbVar) {
        this.a = fbVar;
    }

    public final void onClick(android.view.View view) {
        android.support.design.internal.NavigationMenuItemView navigationMenuItemView = (android.support.design.internal.NavigationMenuItemView) view;
        this.a.b(true);
        defpackage.zi ziVar = navigationMenuItemView.e;
        boolean a2 = this.a.c.a((android.view.MenuItem) ziVar, (defpackage.zt) this.a, 0);
        if (ziVar != null && ziVar.isCheckable() && a2) {
            this.a.e.a(ziVar);
        }
        this.a.b(false);
        this.a.a(false);
    }
}
