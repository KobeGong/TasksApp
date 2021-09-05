package defpackage;

/* renamed from: fc reason: default package */
/* compiled from: PG */
final class fc implements android.view.View.OnClickListener {
    private final /* synthetic */ NavigationMenuPresenter a;

    fc(NavigationMenuPresenter fbVar) {
        this.a = fbVar;
    }

    public final void onClick(android.view.View view) {
        android.support.design.internal.NavigationMenuItemView navigationMenuItemView = (android.support.design.internal.NavigationMenuItemView) view;
        this.a.b(true);
        MenuItemImpl ziVar = navigationMenuItemView.e;
        boolean a2 = this.a.menu.a((android.view.MenuItem) ziVar, (MenuPresenter) this.a, 0);
        if (ziVar != null && ziVar.isCheckable() && a2) {
            this.a.menuAdapter.a(ziVar);
        }
        this.a.b(false);
        this.a.a(false);
    }
}
