package defpackage;

/* renamed from: cfz reason: default package */
final /* synthetic */ class cfz implements java.lang.Runnable {
    private final com.google.android.libraries.onegoogle.accountmenu.internal.SelectedAccountHeaderView a;

    cfz(com.google.android.libraries.onegoogle.accountmenu.internal.SelectedAccountHeaderView selectedAccountHeaderView, java.lang.Object obj) {
        this.a = selectedAccountHeaderView;
    }

    public final void run() {
        com.google.android.libraries.onegoogle.accountmenu.internal.SelectedAccountHeaderView selectedAccountHeaderView = this.a;
        if (selectedAccountHeaderView.j != null) {
            selectedAccountHeaderView.j.a();
        }
    }
}
