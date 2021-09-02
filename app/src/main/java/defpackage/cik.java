package defpackage;

/* renamed from: cik reason: default package */
/* compiled from: PG */
final class cik extends defpackage.cgj {
    public final boolean d;
    public final defpackage.cid e;
    public final boolean f;
    public final boolean g;
    private defpackage.cie h;

    cik(defpackage.coe coe, android.app.Application application, defpackage.clt clt, int i, boolean z, defpackage.cid cid, boolean z2, boolean z3) {
        super(coe, application, clt, defpackage.bg.Z, i);
        new java.util.concurrent.atomic.AtomicReference(null);
        new java.util.concurrent.ConcurrentHashMap();
        this.d = z;
        this.e = cid;
        this.f = z2;
        this.g = z3;
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void e() {
        if (!this.c && this.h == null) {
            this.h = new defpackage.cie(new defpackage.cij(this), this.a, this.b);
            defpackage.cie cie = this.h;
            if (cie.a.getAndSet(true)) {
                defpackage.cdm.a(5, "MemoryMetricMonitor", "Memory Monitor has already started. This MemoryMetricMonitor.start() is ignored.", new java.lang.Object[0]);
            } else {
                cie.f.a((defpackage.cgp) cie.g);
                cie.f.a((defpackage.cgp) cie.h);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void d() {
        if (this.h != null) {
            defpackage.cie cie = this.h;
            cie.f.b(cie.g);
            cie.f.b(cie.h);
            this.h = null;
        }
    }
}
