package defpackage;

import android.support.v7.app.AlertController;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: wi  reason: default package */
/* compiled from: PG */
public final class wi implements AdapterView.OnItemClickListener {
    private final /* synthetic */ AlertController a;
    private final /* synthetic */ agq b;

    public wi(agq agq, AlertController alertController) {
        this.b = agq;
        this.a = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.o.onClick(this.a.b, i);
        this.a.b.dismiss();
    }
}
