package defpackage;

/* renamed from: agn reason: default package */
/* compiled from: PG */
public final class agn implements java.lang.Runnable {
    private final /* synthetic */ android.support.v7.widget.SearchView.SearchAutoComplete a;

    public agn(android.support.v7.widget.SearchView.SearchAutoComplete searchAutoComplete) {
        this.a = searchAutoComplete;
    }

    public final void run() {
        android.support.v7.widget.SearchView.SearchAutoComplete searchAutoComplete = this.a;
        if (searchAutoComplete.b) {
            ((android.view.inputmethod.InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.b = false;
        }
    }
}
