package defpackage;

import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: agj  reason: default package */
/* compiled from: PG */
public final class agj implements AdapterView.OnItemSelectedListener {
    private final /* synthetic */ SearchView a;

    public agj(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.a.a.getText();
        throw new NoSuchMethodError();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
