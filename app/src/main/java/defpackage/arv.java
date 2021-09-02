package defpackage;

import com.google.android.apps.tasks.R;

/* renamed from: arv reason: default package */
/* compiled from: PG */
/* compiled from: EditListFragment */
public final class arv extends defpackage.arb {
    public android.widget.EditText a;
    public defpackage.dcb b;

    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View inflate = layoutInflater.inflate(com.google.android.apps.tasks.R.layout.edit_list_fragment, null);
        this.a = (android.widget.EditText) inflate.findViewById(com.google.android.apps.tasks.R.id.edit_list_title);
        a(new defpackage.arw(this));
        return inflate;
    }

    public final void e() {
        super.e();
        b(this.a);
    }

    public final void f() {
        defpackage.bdk.a((android.view.View) this.a, false);
        super.f();
    }
}
