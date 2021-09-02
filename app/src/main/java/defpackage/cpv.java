package defpackage;

/* renamed from: cpv reason: default package */
final /* synthetic */ class cpv implements android.widget.AdapterView.OnItemClickListener {
    private final defpackage.cpu a;

    cpv(defpackage.cpu cpu) {
        this.a = cpu;
    }

    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        defpackage.cpu cpu = this.a;
        defpackage.cpq cpq = (defpackage.cpq) adapterView.getItemAtPosition(i);
        if (cpu.a != null) {
            cpu.a.a(cpq);
        }
    }
}
