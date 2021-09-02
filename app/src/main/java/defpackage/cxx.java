package defpackage;

/* renamed from: cxx reason: default package */
/* compiled from: PG */
final class cxx extends defpackage.cxo {
    private defpackage.cxw e;
    private final /* synthetic */ defpackage.cxu f;

    cxx(defpackage.cxu cxu, defpackage.csn csn, boolean z, defpackage.cxw cxw) {
        this.f = cxu;
        super(cxu, csn, z);
        this.e = cxw;
    }

    /* access modifiers changed from: 0000 */
    public final void c() {
        defpackage.cxw cxw = this.e;
        if (cxw != null) {
            try {
                cxw.a.execute(cxw);
            } catch (java.util.concurrent.RejectedExecutionException e2) {
                if (cxw.b) {
                    cxw.c.a((java.lang.Throwable) e2);
                }
            }
        } else {
            defpackage.cld.b(this.f.isDone());
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        super.b();
        this.e = null;
    }

    /* access modifiers changed from: 0000 */
    public final void d() {
        defpackage.cxw cxw = this.e;
        if (cxw != null) {
            cxw.d();
        }
    }
}
