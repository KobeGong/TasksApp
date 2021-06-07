package defpackage;

import android.support.v7.widget.SearchView;
import android.view.inputmethod.InputMethodManager;

/* renamed from: agn  reason: default package */
/* compiled from: PG */
public final class agn implements Runnable {
    private final /* synthetic */ SearchView.SearchAutoComplete a;

    public agn(SearchView.SearchAutoComplete searchAutoComplete) {
        this.a = searchAutoComplete;
    }

    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.a;
        if (searchAutoComplete.b) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.b = false;
        }
    }
}
