package defpackage;

/* renamed from: acf reason: default package */
/* compiled from: PG */
final class acf implements android.widget.AdapterView.OnItemClickListener {
    private final /* synthetic */ defpackage.ace a;

    acf(defpackage.ace ace) {
        this.a = ace;
    }

    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        this.a.d.setSelection(i);
        if (this.a.d.getOnItemClickListener() != null) {
            this.a.d.performItemClick(view, i, this.a.b.getItemId(i));
        }
        this.a.e();
    }
}
