package defpackage;

/* renamed from: atd reason: default package */
/* compiled from: PG */
public final class atd extends defpackage.gu {
    private android.widget.LinearLayout U;

    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View inflate = layoutInflater.inflate(2131034212, viewGroup, false);
        this.U = (android.widget.LinearLayout) inflate.findViewById(2131755353);
        return inflate;
    }

    public final void c(android.os.Bundle bundle) {
        defpackage.dcd dcd;
        super.c(bundle);
        defpackage.anc c = defpackage.any.a().c();
        if (c == null) {
            a(true);
            defpackage.azb.a("SyncEngine not yet initialized", new java.lang.Object[0]);
            return;
        }
        android.os.Bundle bundle2 = this.i;
        java.lang.Object obj = bundle2 != null ? bundle2.getString("selectedTaskList") : null;
        for (defpackage.dcb dcb : c.d()) {
            com.google.android.apps.tasks.ui.components.CheckOptionItem checkOptionItem = new com.google.android.apps.tasks.ui.components.CheckOptionItem(getContext());
            checkOptionItem.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
            if (dcb.c == null) {
                dcd = defpackage.dcd.c;
            } else {
                dcd = dcb.c;
            }
            checkOptionItem.a(dcd.a);
            if (dcb.b.equals(obj)) {
                checkOptionItem.a(true);
            }
            this.U.addView(checkOptionItem);
            checkOptionItem.setOnClickListener(new defpackage.ate(this, dcb));
        }
    }
}
