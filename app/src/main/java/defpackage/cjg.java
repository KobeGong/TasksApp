package defpackage;

import android.util.Log;

/* renamed from: cjg  reason: default package */
/* compiled from: PG */
public final class cjg {
    private static final cjg b;
    private static volatile cjg c;
    public final cjh a;

    private cjg(cjh cjh) {
        this.a = (cjh) cky.a(cjh);
    }

    public static synchronized cjg a(cgk cgk) {
        cjg cjg;
        boolean z = false;
        synchronized (cjg.class) {
            if (c != b) {
                z = true;
            }
            if (z) {
                cdm.a(3, "Primes", "Primes.initialize() is called more than once. This call will be ignored.", new Object[0]);
                cjg = c;
            } else {
                cjg = new cjg(cgk.a());
                c = cjg;
            }
        }
        return cjg;
    }

    public static cjg a() {
        if (c == b) {
            Log.w("Primes", cdm.a("Primes not initialized, returning default (no-op) Primes instance which will ignore all calls. Please call Primes.initialize(...) before using any Primes API.", new Object[0]));
        }
        return c;
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return this.a.f();
    }

    static {
        cjg cjg = new cjg(new ciw());
        b = cjg;
        c = cjg;
    }
}
