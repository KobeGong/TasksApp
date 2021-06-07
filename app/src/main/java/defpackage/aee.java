package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* access modifiers changed from: package-private */
/* renamed from: aee  reason: default package */
/* compiled from: PG */
public final class aee implements AdapterView.OnItemSelectedListener {
    private final /* synthetic */ aec a;

    aee(aec aec) {
        this.a = aec;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ade ade;
        if (i != -1 && (ade = this.a.e) != null) {
            ade.a = false;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
