package defpackage;

/* renamed from: cfy reason: default package */
public final /* synthetic */ class cfy implements android.view.View.OnClickListener {
    private final com.google.android.libraries.onegoogle.accountmenu.internal.SelectedAccountHeaderView a;
    private final java.lang.Object b;

    public cfy(com.google.android.libraries.onegoogle.accountmenu.internal.SelectedAccountHeaderView selectedAccountHeaderView, java.lang.Object obj) {
        this.a = selectedAccountHeaderView;
        this.b = obj;
    }

    public final void onClick(android.view.View view) {
        com.google.android.libraries.onegoogle.accountmenu.internal.SelectedAccountHeaderView selectedAccountHeaderView = this.a;
        java.lang.Object obj = this.b;
        selectedAccountHeaderView.n.a(obj);
        selectedAccountHeaderView.postDelayed(new defpackage.cfz(selectedAccountHeaderView, obj), (long) selectedAccountHeaderView.getResources().getInteger(17694720));
    }
}
