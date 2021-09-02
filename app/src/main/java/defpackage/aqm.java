package defpackage;

/* renamed from: aqm reason: default package */
final /* synthetic */ class aqm implements android.view.View.OnClickListener {
    private final defpackage.aql a;
    private final java.lang.Throwable b;

    aqm(defpackage.aql aql, java.lang.Throwable th) {
        this.a = aql;
        this.b = th;
    }

    public final void onClick(android.view.View view) {
        this.a.startActivityForResult(((defpackage.avf) this.b).a(), 1001);
    }
}
