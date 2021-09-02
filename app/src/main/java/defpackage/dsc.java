package defpackage;

/* renamed from: dsc reason: default package */
/* compiled from: PG */
final class dsc extends defpackage.dqc {
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater g;
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater h;
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater i;
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater j;
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater k;
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater l;
    public volatile long a;
    public volatile long b;
    public volatile long c;
    public volatile long d;
    public volatile long e;
    public volatile long f;

    dsc() {
        super(0);
    }

    public final void a(long j2) {
        if (i != null) {
            i.getAndAdd(this, j2);
        } else {
            this.c += j2;
        }
    }

    public final void c(long j2) {
        if (j != null) {
            j.getAndAdd(this, j2);
        } else {
            this.d += j2;
        }
    }

    public final void b(long j2) {
        if (k != null) {
            k.getAndAdd(this, j2);
        } else {
            this.e += j2;
        }
    }

    public final void d(long j2) {
        if (l != null) {
            l.getAndAdd(this, j2);
        } else {
            this.f += j2;
        }
    }

    public final void c() {
        if (h != null) {
            h.getAndIncrement(this);
        } else {
            this.b++;
        }
    }

    public final void b() {
        if (g != null) {
            g.getAndIncrement(this);
        } else {
            this.a++;
        }
    }

    static {
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater2;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater3;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater4;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater5;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater6 = null;
        try {
            java.util.concurrent.atomic.AtomicLongFieldUpdater newUpdater = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(defpackage.dsc.class, "a");
            java.util.concurrent.atomic.AtomicLongFieldUpdater newUpdater2 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(defpackage.dsc.class, "b");
            java.util.concurrent.atomic.AtomicLongFieldUpdater newUpdater3 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(defpackage.dsc.class, "c");
            java.util.concurrent.atomic.AtomicLongFieldUpdater newUpdater4 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(defpackage.dsc.class, "d");
            java.util.concurrent.atomic.AtomicLongFieldUpdater newUpdater5 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(defpackage.dsc.class, "e");
            atomicLongFieldUpdater = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(defpackage.dsc.class, "f");
            atomicLongFieldUpdater6 = newUpdater5;
            atomicLongFieldUpdater2 = newUpdater4;
            atomicLongFieldUpdater3 = newUpdater3;
            atomicLongFieldUpdater4 = newUpdater2;
            atomicLongFieldUpdater5 = newUpdater;
        } catch (Throwable th) {
            defpackage.drz.a.logp(java.util.logging.Level.SEVERE, "io.grpc.internal.CensusStatsModule$ClientTracer", "<clinit>", "Creating atomic field updaters failed", th);
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
