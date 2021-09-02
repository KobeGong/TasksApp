package defpackage;

/* renamed from: cep reason: default package */
final /* synthetic */ class cep implements android.view.View.OnClickListener {
    private final defpackage.ceo a;
    private final java.lang.Object b;

    cep(defpackage.ceo ceo, java.lang.Object obj) {
        this.a = ceo;
        this.b = obj;
    }

    public final void onClick(android.view.View view) {
        defpackage.ceo ceo = this.a;
        ceo.a.a(this.b);
        if (ceo.b != null) {
            ceo.b.a();
        }
    }
}
