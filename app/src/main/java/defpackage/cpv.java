package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: cpv  reason: default package */
final /* synthetic */ class cpv implements AdapterView.OnItemClickListener {
    private final cpu a;

    cpv(cpu cpu) {
        this.a = cpu;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        cpu cpu = this.a;
        cpq cpq = (cpq) adapterView.getItemAtPosition(i);
        if (cpu.a != null) {
            cpu.a.a(cpq);
        }
    }
}
