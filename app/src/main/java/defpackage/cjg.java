package defpackage;

/* renamed from: cjg reason: default package */
/* compiled from: PG */
public final class cjg {
    private static final defpackage.cjg b;
    private static volatile defpackage.cjg c;
    public final defpackage.cjh a;

    private cjg(defpackage.cjh cjh) {
        this.a = (defpackage.cjh) defpackage.cky.a((java.lang.Object) cjh);
    }

    public static synchronized defpackage.cjg a(defpackage.cgk cgk) {
        defpackage.cjg cjg;
        boolean z = false;
        synchronized (defpackage.cjg.class) {
            if (c != b) {
                z = true;
            }
            if (z) {
                defpackage.cdm.a(3, "Primes", "Primes.initialize() is called more than once. This call will be ignored.", new java.lang.Object[0]);
                cjg = c;
            } else {
                cjg = new defpackage.cjg(cgk.a());
                c = cjg;
            }
        }
        return cjg;
    }

    public static defpackage.cjg a() {
        if (c == b) {
            android.util.Log.w("Primes", defpackage.cdm.a("Primes not initialized, returning default (no-op) Primes instance which will ignore all calls. Please call Primes.initialize(...) before using any Primes API.", new java.lang.Object[0]));
        }
        return c;
    }

    /* access modifiers changed from: 0000 */
    public final boolean b() {
        return this.a.f();
    }

    static {
        defpackage.cjg cjg = new defpackage.cjg(new defpackage.ciw());
        b = cjg;
        c = cjg;
    }
}
