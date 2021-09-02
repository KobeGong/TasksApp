package defpackage;

/* renamed from: ckb reason: default package */
final /* synthetic */ class ckb implements defpackage.cls {
    private final defpackage.cjz a;

    ckb(defpackage.cjz cjz) {
        this.a = cjz;
    }

    public final void a() {
        defpackage.cjz cjz = this.a;
        synchronized (cjz.b) {
            if (cjz.c != null) {
                cjz.c.b(cjz.a);
            }
        }
    }
}
