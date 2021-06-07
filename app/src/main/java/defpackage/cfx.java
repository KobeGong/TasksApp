package defpackage;

import android.view.View;
import com.google.android.libraries.onegoogle.accountmenu.internal.SelectedAccountHeaderView;

/* access modifiers changed from: package-private */
/* renamed from: cfx  reason: default package */
public final /* synthetic */ class cfx implements View.OnClickListener {
    private final SelectedAccountHeaderView a;

    cfx(SelectedAccountHeaderView selectedAccountHeaderView) {
        this.a = selectedAccountHeaderView;
    }

    public final void onClick(View view) {
        SelectedAccountHeaderView selectedAccountHeaderView = this.a;
        selectedAccountHeaderView.k.c().d().a(view, selectedAccountHeaderView.n.c());
    }
}
