package defpackage;

import android.app.SearchableInfo;
import android.support.v7.widget.SearchView;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: agg  reason: default package */
/* compiled from: PG */
public final class agg implements View.OnKeyListener {
    private final /* synthetic */ SearchView a;

    public agg(SearchView searchView) {
        this.a = searchView;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        SearchableInfo searchableInfo = this.a.o;
        return false;
    }
}
