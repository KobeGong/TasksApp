package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.logging.Level;

/* renamed from: dsc  reason: default package */
/* compiled from: PG */
final class dsc extends dqc {
    private static final AtomicLongFieldUpdater g;
    private static final AtomicLongFieldUpdater h;
    private static final AtomicLongFieldUpdater i;
    private static final AtomicLongFieldUpdater j;
    private static final AtomicLongFieldUpdater k;
    private static final AtomicLongFieldUpdater l;
    public volatile long a;
    public volatile long b;
    public volatile long c;
    public volatile long d;
    public volatile long e;
    public volatile long f;

    dsc() {
        super((short) 0);
    }

    @Override // defpackage.dqc
    public final void a(long j2) {
        if (i != null) {
            i.getAndAdd(this, j2);
        } else {
            this.c += j2;
        }
    }

    @Override // defpackage.dqc
    public final void c(long j2) {
        if (j != null) {
            j.getAndAdd(this, j2);
        } else {
            this.d += j2;
        }
    }

    @Override // defpackage.dqc
    public final void b(long j2) {
        if (k != null) {
            k.getAndAdd(this, j2);
        } else {
            this.e += j2;
        }
    }

    @Override // defpackage.dqc
    public final void d(long j2) {
        if (l != null) {
            l.getAndAdd(this, j2);
        } else {
            this.f += j2;
        }
    }

    @Override // defpackage.dqc
    public final void c() {
        if (h != null) {
            h.getAndIncrement(this);
        } else {
            this.b++;
        }
    }

    @Override // defpackage.dqc
    public final void b() {
        if (g != null) {
            g.getAndIncrement(this);
        } else {
            this.a++;
        }
    }

    static {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        AtomicLongFieldUpdater atomicLongFieldUpdater2;
        AtomicLongFieldUpdater atomicLongFieldUpdater3;
        AtomicLongFieldUpdater atomicLongFieldUpdater4;
        AtomicLongFieldUpdater atomicLongFieldUpdater5;
        AtomicLongFieldUpdater atomicLongFieldUpdater6 = null;
        try {
            AtomicLongFieldUpdater newUpdater = AtomicLongFieldUpdater.newUpdater(dsc.class, "a");
            AtomicLongFieldUpdater newUpdater2 = AtomicLongFieldUpdater.newUpdater(dsc.class, "b");
            AtomicLongFieldUpdater newUpdater3 = AtomicLongFieldUpdater.newUpdater(dsc.class, "c");
            AtomicLongFieldUpdater newUpdater4 = AtomicLongFieldUpdater.newUpdater(dsc.class, "d");
            AtomicLongFieldUpdater newUpdater5 = AtomicLongFieldUpdater.newUpdater(dsc.class, "e");
            atomicLongFieldUpdater = AtomicLongFieldUpdater.newUpdater(dsc.class, "f");
            atomicLongFieldUpdater6 = newUpdater5;
            atomicLongFieldUpdater2 = newUpdater4;
            atomicLongFieldUpdater3 = newUpdater3;
            atomicLongFieldUpdater4 = newUpdater2;
            atomicLongFieldUpdater5 = newUpdater;
        } catch (Throwable th) {
            drz.a.logp(Level.SEVERE, "io.grpc.internal.CensusStatsModule$ClientTracer", "<clinit>", "Creating atomic field updaters failed", th);
            atomicLongFieldUpdater = null;
            atomicLongFieldUpdater2 = null;
            atomicLongFieldUpdater3 = null;
            atomicLongFieldUpdater4 = null;
            atomicLongFieldUpdater5 = null;
        }
        g = atomicLongFieldUpdater5;
        h = atomicLongFieldUpdater4;
        i = atomicLongFieldUpdater3;
        j = atomicLongFieldUpdater2;
        k = atomicLongFieldUpdater6;
        l = atomicLongFieldUpdater;
    }
}
