package defpackage;

/* renamed from: cfi reason: default package */
final /* synthetic */ class cfi implements android.view.View.OnClickListener {
    private final defpackage.cff a;
    private final defpackage.cdh b;

    cfi(defpackage.cff cff, defpackage.cdh cdh) {
        this.a = cff;
        this.b = cdh;
    }

    public final void onClick(android.view.View view) {
        this.b.c().a(view, this.a.d.c());
    }
}
