package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: dsg  reason: default package */
/* compiled from: PG */
public final class dsg {
    public static final Logger a = Logger.getLogger(dsg.class.getName());
    public static final AtomicIntegerFieldUpdater b;
    public final ecn c;
    public final doy d;
    public final dsl e = new dsl(this);

    public dsg(ecn ecn, ecv ecv) {
        new dpt((char) 0);
        this.c = (ecn) cld.a(ecn, "censusTracer");
        cld.a(ecv, "censusPropagationBinaryFormat");
        this.d = doy.a("grpc-trace-bin", new dsh(ecv));
    }

    static ebw a(dpw dpw, boolean z) {
        ech ech;
        ejw c2 = ebw.c();
        switch (dpw.l.ordinal()) {
            case 0:
                ech = ech.b;
                break;
            case 1:
                ech = ech.c;
                break;
            case 2:
                ech = ech.d;
                break;
            case 3:
                ech = ech.e;
                break;
            case 4:
                ech = ech.f;
                break;
            case 5:
                ech = ech.g;
                break;
            case 6:
                ech = ech.h;
                break;
            case 7:
                ech = ech.i;
                break;
            case 8:
                ech = ech.k;
                break;
            case 9:
                ech = ech.l;
                break;
            case 10:
                ech = ech.m;
                break;
            case 11:
                ech = ech.n;
                break;
            case 12:
                ech = ech.o;
                break;
            case 13:
                ech = ech.p;
                break;
            case 14:
                ech = ech.q;
                break;
            case 15:
                ech = ech.r;
                break;
            case 16:
                ech = ech.j;
                break;
            default:
                String valueOf = String.valueOf(dpw.l);
                throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Unhandled status code ").append(valueOf).toString());
        }
        if (dpw.m != null) {
            String str = dpw.m;
            if (!cru.d(ech.t, str)) {
                ech = new ech(ech.s, str);
            }
        }
        c2.a = ech;
        return c2.a(z).a();
    }

    /* access modifiers changed from: private */
    public static void b(ecc ecc, ecb ecb, int i, long j, long j2) {
        eca a2 = ebz.a(ecb, (long) i);
        if (j2 != -1) {
            a2.a(j2);
        }
        if (j != -1) {
            a2.b(j);
        }
        ecc.a(a2.a());
    }

    static String a(String str) {
        String replace = str.replace('/', '.');
        return new StringBuilder(String.valueOf("Sent").length() + 1 + String.valueOf(replace).length()).append("Sent").append(".").append(replace).toString();
    }

    static {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        try {
            atomicIntegerFieldUpdater = AtomicIntegerFieldUpdater.newUpdater(dsi.class, "a");
            AtomicIntegerFieldUpdater.newUpdater(dsk.class, "a");
        } catch (Throwable th) {
            a.logp(Level.SEVERE, "io.grpc.internal.CensusTracingModule", "<clinit>", "Creating atomic field updaters failed", th);
            atomicIntegerFieldUpdater = null;
        }
        b = atomicIntegerFieldUpdater;
    }
}
