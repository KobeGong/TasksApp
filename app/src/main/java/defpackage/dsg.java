package defpackage;

/* renamed from: dsg reason: default package */
/* compiled from: PG */
public final class dsg {
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.dsg.class.getName());
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater b;
    public final defpackage.ecn c;
    public final defpackage.doy d;
    public final defpackage.dsl e = new defpackage.dsl(this);

    public dsg(defpackage.ecn ecn, defpackage.ecv ecv) {
        new defpackage.dpt(0);
        this.c = (defpackage.ecn) defpackage.cld.a((java.lang.Object) ecn, (java.lang.Object) "censusTracer");
        defpackage.cld.a((java.lang.Object) ecv, (java.lang.Object) "censusPropagationBinaryFormat");
        this.d = defpackage.doy.a("grpc-trace-bin", (defpackage.dox) new defpackage.dsh(ecv));
    }

    static defpackage.ebw a(defpackage.dpw dpw, boolean z) {
        defpackage.ech ech;
        defpackage.ejw c2 = defpackage.ebw.c();
        switch (dpw.l.ordinal()) {
            case 0:
                ech = defpackage.ech.b;
                break;
            case 1:
                ech = defpackage.ech.c;
                break;
            case 2:
                ech = defpackage.ech.d;
                break;
            case 3:
                ech = defpackage.ech.e;
                break;
            case 4:
                ech = defpackage.ech.f;
                break;
            case 5:
                ech = defpackage.ech.g;
                break;
            case 6:
                ech = defpackage.ech.h;
                break;
            case 7:
                ech = defpackage.ech.i;
                break;
            case 8:
                ech = defpackage.ech.k;
                break;
            case 9:
                ech = defpackage.ech.l;
                break;
            case 10:
                ech = defpackage.ech.m;
                break;
            case 11:
                ech = defpackage.ech.n;
                break;
            case 12:
                ech = defpackage.ech.o;
                break;
            case 13:
                ech = defpackage.ech.p;
                break;
            case 14:
                ech = defpackage.ech.q;
                break;
            case 15:
                ech = defpackage.ech.r;
                break;
            case 16:
                ech = defpackage.ech.j;
                break;
            default:
                java.lang.String valueOf = java.lang.String.valueOf(dpw.l);
                throw new java.lang.AssertionError(new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 22).append("Unhandled status code ").append(valueOf).toString());
        }
        if (dpw.m != null) {
            java.lang.String str = dpw.m;
            if (!defpackage.cru.d(ech.t, str)) {
                ech = new defpackage.ech(ech.s, str);
            }
        }
        c2.a = ech;
        return c2.a(z).a();
    }

    /* access modifiers changed from: private */
    public static void b(defpackage.ecc ecc, defpackage.ecb ecb, int i, long j, long j2) {
        defpackage.eca a2 = defpackage.ebz.a(ecb, (long) i);
        if (j2 != -1) {
            a2.a(j2);
        }
        if (j != -1) {
            a2.b(j);
        }
        ecc.a(a2.a());
    }

    static java.lang.String a(java.lang.String str) {
        java.lang.String str2 = "Sent";
        java.lang.String replace = str.replace('/', '.');
        return new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 1 + java.lang.String.valueOf(replace).length()).append(str2).append(".").append(replace).toString();
    }

    static {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        try {
            atomicIntegerFieldUpdater = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.dsi.class, "a");
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.dsk.class, "a");
        } catch (Throwable th) {
            a.logp(java.util.logging.Level.SEVERE, "io.grpc.internal.CensusTracingModule", "<clinit>", "Creating atomic field updaters failed", th);
            atomicIntegerFieldUpdater = null;
        }
        b = atomicIntegerFieldUpdater;
    }
}
