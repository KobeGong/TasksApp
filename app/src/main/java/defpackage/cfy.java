package defpackage;

import android.view.View;
import com.google.android.libraries.onegoogle.accountmenu.internal.SelectedAccountHeaderView;

/* renamed from: cfy  reason: default package */
public final /* synthetic */ class cfy implements View.OnClickListener {
    private final SelectedAccountHeaderView a;
    private final Object b;

    public cfy(SelectedAccountHeaderView selectedAccountHeaderView, Object obj) {
        this.a = selectedAccountHeaderView;
        this.b = obj;
    }

    public final void onClick(View view) {
        SelectedAccountHeaderView selectedAccountHeaderView = this.a;
        Object obj = this.b;
        selectedAccountHeaderView.n.a(obj);
        selectedAccountHeaderView.postDelayed(new cfz(selectedAccountHeaderView, obj), (long) selectedAccountHeaderView.getResources().getInteger(17694720));
    }
}
