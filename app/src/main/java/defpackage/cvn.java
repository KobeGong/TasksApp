package defpackage;

/* renamed from: cvn reason: default package */
/* compiled from: PG */
final class cvn extends defpackage.cvg {
    public static final java.util.concurrent.atomic.AtomicReference b = new java.util.concurrent.atomic.AtomicReference();
    private static defpackage.cvj d;
    private static final java.util.concurrent.atomic.AtomicLong e = new java.util.concurrent.atomic.AtomicLong();
    private static final java.util.concurrent.ConcurrentLinkedQueue f = new java.util.concurrent.ConcurrentLinkedQueue();
    private volatile defpackage.cup c;

    static void b() {
        while (true) {
            defpackage.cvn cvn = (defpackage.cvn) defpackage.cvo.a.poll();
            if (cvn != null) {
                cvn.c = ((defpackage.cvj) b.get()).a(cvn.a());
            } else {
                c();
                return;
            }
        }
    }

    cvn(java.lang.String str) {
        super(str);
        this.c = d != null ? d.a(a()) : null;
    }

    private static void c() {
        while (true) {
            defpackage.cvp cvp = (defpackage.cvp) f.poll();
            if (cvp != null) {
                e.getAndDecrement();
                defpackage.cup cup = cvp.a;
                defpackage.cuo cuo = cvp.b;
                if (cuo.j() || cup.a(cuo.d())) {
                    cup.a(cuo);
                }
            } else {
                return;
            }
        }
    }

    public final boolean a(java.util.logging.Level level) {
        if (this.c != null) {
            return this.c.a(level);
        }
        return true;
    }

    public final void a(defpackage.cuo cuo) {
        if (this.c != null) {
            this.c.a(cuo);
            return;
        }
        if (e.incrementAndGet() > 20) {
            f.poll();
            android.util.Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        f.offer(new defpackage.cvp(this, cuo));
        if (this.c != null) {
            c();
        }
    }

    static {
        boolean z = false;
        boolean z2 = android.os.Build.FINGERPRINT == null || "robolectric".equals(android.os.Build.FINGERPRINT);
        if ("goldfish".equals(android.os.Build.HARDWARE) || "ranchu".equals(android.os.Build.HARDWARE)) {
            z = true;
        }
        if (z2 || z) {
            d = new defpackage.cvj();
        } else {
            d = null;
        }
    }
}
