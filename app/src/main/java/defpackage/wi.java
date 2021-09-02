package defpackage;

/* renamed from: wi reason: default package */
/* compiled from: PG */
public final class wi implements android.widget.AdapterView.OnItemClickListener {
    private final /* synthetic */ android.support.v7.app.AlertController a;
    private final /* synthetic */ defpackage.agq b;

    public wi(defpackage.agq agq, android.support.v7.app.AlertController alertController) {
        this.b = agq;
        this.a = alertController;
    }

    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        this.b.o.onClick(this.a.b, i);
        this.a.b.dismiss();
    }
}
