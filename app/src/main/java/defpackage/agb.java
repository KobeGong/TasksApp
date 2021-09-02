package defpackage;

/* renamed from: agb reason: default package */
/* compiled from: PG */
public final class agb implements android.text.TextWatcher {
    private final /* synthetic */ android.support.v7.widget.SearchView a;

    public agb(android.support.v7.widget.SearchView searchView) {
        this.a = searchView;
    }

    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        this.a.a(charSequence);
    }

    public final void afterTextChanged(android.text.Editable editable) {
    }
}
