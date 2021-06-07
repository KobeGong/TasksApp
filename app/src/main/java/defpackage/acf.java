package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* access modifiers changed from: package-private */
/* renamed from: acf  reason: default package */
/* compiled from: PG */
public final class acf implements AdapterView.OnItemClickListener {
    private final /* synthetic */ ace a;

    acf(ace ace) {
        this.a = ace;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.a.d.setSelection(i);
        if (this.a.d.getOnItemClickListener() != null) {
            this.a.d.performItemClick(view, i, this.a.b.getItemId(i));
        }
        this.a.e();
    }
}
