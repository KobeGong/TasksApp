package defpackage;

/* renamed from: ckb  reason: default package */
final /* synthetic */ class ckb implements cls {
    private final cjz a;

    ckb(cjz cjz) {
        this.a = cjz;
    }

    @Override // defpackage.cls
    public final void a() {
        cjz cjz = this.a;
        synchronized (cjz.b) {
            if (cjz.c != null) {
                cjz.c.b(cjz.a);
            }
        }
    }
}
