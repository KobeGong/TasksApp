package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* renamed from: dsb  reason: default package */
/* compiled from: PG */
final class dsb extends dnm {
    public static final AtomicIntegerFieldUpdater a;
    private static final AtomicReferenceFieldUpdater h;
    public final drz b;
    public final csb c;
    public volatile dsc d;
    public volatile int e;
    public final ebi f;
    public final boolean g;
    private final ebi i;

    dsb(drz drz, ebi ebi, String str, boolean z, boolean z2) {
        this.b = drz;
        cld.a(str, "fullMethodName");
        this.i = (ebi) cld.a(ebi);
        this.f = drz.d.a(ebi).a(eak.b, ebl.a(str)).a();
        this.c = ((csb) drz.f.b()).a();
        this.g = z2;
        if (z) {
            drz.e.a().a().a(this.f);
        }
    }

    @Override // defpackage.dnm
    public final dqc a(dor dor) {
        dsc dsc = new dsc();
        if (h != null) {
            cld.b(h.compareAndSet(this, null, dsc), "Are you creating multiple streams per call? This class doesn't yet support this case");
        } else {
            cld.b(this.d == null, "Are you creating multiple streams per call? This class doesn't yet support this case");
            this.d = dsc;
        }
        if (this.b.h) {
            dor.b(this.b.g);
            if (!this.b.d.a().equals(this.i)) {
                dor.a(this.b.g, this.i);
            }
        }
        return dsc;
    }

    static {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = null;
        try {
            AtomicReferenceFieldUpdater newUpdater = AtomicReferenceFieldUpdater.newUpdater(dsb.class, dsc.class, "d");
            atomicIntegerFieldUpdater = AtomicIntegerFieldUpdater.newUpdater(dsb.class, "e");
            atomicReferenceFieldUpdater = newUpdater;
        } catch (Throwable th) {
            drz.a.logp(Level.SEVERE, "io.grpc.internal.CensusStatsModule$ClientCallTracer", "<clinit>", "Creating atomic field updaters failed", th);
            atomicIntegerFieldUpdater = null;
        }
        h = atomicReferenceFieldUpdater;
        a = atomicIntegerFieldUpdater;
    }
}
