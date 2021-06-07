package defpackage;

import com.google.android.libraries.onegoogle.accountmenu.internal.SelectedAccountHeaderView;

/* renamed from: cfz  reason: default package */
final /* synthetic */ class cfz implements Runnable {
    private final SelectedAccountHeaderView a;

    cfz(SelectedAccountHeaderView selectedAccountHeaderView, Object obj) {
        this.a = selectedAccountHeaderView;
    }

    public final void run() {
        SelectedAccountHeaderView selectedAccountHeaderView = this.a;
        if (selectedAccountHeaderView.j != null) {
            selectedAccountHeaderView.j.a();
        }
    }
}
