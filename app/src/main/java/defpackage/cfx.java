package defpackage;

/* renamed from: cfx reason: default package */
final /* synthetic */ class cfx implements android.view.View.OnClickListener {
    private final com.google.android.libraries.onegoogle.accountmenu.internal.SelectedAccountHeaderView a;

    cfx(com.google.android.libraries.onegoogle.accountmenu.internal.SelectedAccountHeaderView selectedAccountHeaderView) {
        this.a = selectedAccountHeaderView;
    }

    public final void onClick(android.view.View view) {
        com.google.android.libraries.onegoogle.accountmenu.internal.SelectedAccountHeaderView selectedAccountHeaderView = this.a;
        selectedAccountHeaderView.k.c().d().a(view, selectedAccountHeaderView.n.c());
    }
}
