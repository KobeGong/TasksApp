package defpackage;

import android.view.View;

/* renamed from: cep  reason: default package */
final /* synthetic */ class cep implements View.OnClickListener {
    private final ceo a;
    private final Object b;

    cep(ceo ceo, Object obj) {
        this.a = ceo;
        this.b = obj;
    }

    public final void onClick(View view) {
        ceo ceo = this.a;
        ceo.a.a(this.b);
        if (ceo.b != null) {
            ceo.b.a();
        }
    }
}
