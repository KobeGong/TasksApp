package defpackage;

import android.support.v7.widget.SearchView;
import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: agb  reason: default package */
/* compiled from: PG */
public final class agb implements TextWatcher {
    private final /* synthetic */ SearchView a;

    public agb(SearchView searchView) {
        this.a = searchView;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.a(charSequence);
    }

    public final void afterTextChanged(Editable editable) {
    }
}
