package defpackage;

/* renamed from: dsb reason: default package */
/* compiled from: PG */
final class dsb extends defpackage.dnm {
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater a;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater h;
    public final defpackage.drz b;
    public final defpackage.csb c;
    public volatile defpackage.dsc d;
    public volatile int e;
    public final defpackage.ebi f;
    public final boolean g;
    private final defpackage.ebi i;

    dsb(defpackage.drz drz, defpackage.ebi ebi, java.lang.String str, boolean z, boolean z2) {
        this.b = drz;
        defpackage.cld.a((java.lang.Object) str, (java.lang.Object) "fullMethodName");
        this.i = (defpackage.ebi) defpackage.cld.a((java.lang.Object) ebi);
        this.f = drz.d.a(ebi).a(defpackage.eak.b, defpackage.ebl.a(str)).a();
        this.c = ((defpackage.csb) drz.f.b()).a();
        this.g = z2;
        if (z) {
            drz.e.a().a().a(this.f);
        }
    }

    public final defpackage.dqc a(defpackage.dor dor) {
        defpackage.dsc dsc = new defpackage.dsc();
        if (h != null) {
            defpackage.cld.b(h.compareAndSet(this, null, dsc), (java.lang.Object) "Are you creating multiple streams per call? This class doesn't yet support this case");
        } else {
            defpackage.cld.b(this.d == null, (java.lang.Object) "Are you creating multiple streams per call? This class doesn't yet support this case");
            this.d = dsc;
        }
        if (this.b.h) {
            dor.b(this.b.g);
            if (!this.b.d.a().equals(this.i)) {
                dor.a(this.b.g, (java.lang.Object) this.i);
            }
        }
        return dsc;
    }

    static {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = null;
        try {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater newUpdater = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.dsb.class, defpackage.dsc.class, "d");
            atomicIntegerFieldUpdater = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.dsb.class, "e");
            atomicReferenceFieldUpdater = newUpdater;
        } catch (Throwable th) {
            defpackage.drz.a.logp(java.util.logging.Level.SEVERE, "io.grpc.internal.CensusStatsModule$ClientCallTracer", "<clinit>", "Creating atomic field updaters failed", th);
            atomicIntegerFieldUpdater = null;
        }
        h = atomicReferenceFieldUpdater;
        a = atomicIntegerFieldUpdater;
    }
}
