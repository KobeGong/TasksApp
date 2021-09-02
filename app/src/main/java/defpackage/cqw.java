package defpackage;

/* renamed from: cqw reason: default package */
final /* synthetic */ class cqw implements java.lang.Runnable {
    private final defpackage.cqv a;
    private final defpackage.cyi b;

    cqw(defpackage.cqv cqv, defpackage.cyi cyi) {
        this.a = cqv;
        this.b = cyi;
    }

    public final void run() {
        this.a.b.set(defpackage.cqv.a(this.b));
    }
}
