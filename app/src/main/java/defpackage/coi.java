package defpackage;

/* renamed from: coi reason: default package */
/* compiled from: PG */
public final class coi extends defpackage.col {
    public final java.lang.Object b;
    public final java.util.concurrent.atomic.AtomicLong c;
    public defpackage.bqw d;
    public final defpackage.bra e;
    public final defpackage.bqz f;
    private final defpackage.coc g;
    private final android.content.Context h;
    private final defpackage.bqn i;
    private final defpackage.bqk j;
    private final java.lang.String k;
    private defpackage.bqx l;
    private volatile java.util.HashMap m;
    private final java.lang.Runnable n;
    private final defpackage.brd o;

    public coi(android.content.Context context, defpackage.bqn bqn, defpackage.bqy bqy, defpackage.bqk bqk, java.lang.String str) {
        this(context, bqn, bqy, bqk, str, defpackage.coc.a);
    }

    private coi(android.content.Context context, defpackage.bqn bqn, defpackage.bqy bqy, defpackage.bqk bqk, java.lang.String str, defpackage.coc coc) {
        this.b = new java.lang.Object();
        this.c = new java.util.concurrent.atomic.AtomicLong(-1000);
        this.m = new java.util.HashMap();
        this.n = new defpackage.coj(this);
        this.e = new defpackage.bra(this);
        this.f = new defpackage.bqz(this);
        this.o = new defpackage.cok(this);
        this.h = context.getApplicationContext();
        this.i = (defpackage.bqn) defpackage.cky.a((java.lang.Object) bqn);
        defpackage.cky.a((java.lang.Object) bqy);
        this.j = (defpackage.bqk) defpackage.cky.a((java.lang.Object) bqk);
        this.k = (java.lang.String) defpackage.cky.a((java.lang.Object) str);
        this.g = (defpackage.coc) defpackage.cky.a((java.lang.Object) coc);
    }

    /* access modifiers changed from: protected */
    public final void b(defpackage.efx efx) {
        long j2 = this.c.get();
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        if (uptimeMillis - j2 >= 1000 && this.c.compareAndSet(j2, uptimeMillis)) {
            long j3 = 15000 + uptimeMillis;
            try {
                defpackage.cky.d().removeCallbacks(this.n);
                defpackage.cky.d().postAtTime(this.n, j3);
            } catch (java.lang.RuntimeException e2) {
                defpackage.cdm.a("ClearcutTransmitter", "reschedule disconnect failed", (java.lang.Throwable) e2, new java.lang.Object[0]);
            }
        }
        byte[] a = defpackage.dmf.a((defpackage.dmf) efx);
        java.lang.String str = this.k;
        try {
            this.g.a();
        } catch (java.lang.Exception e3) {
            java.lang.String str2 = "ClearcutTransmitter";
            java.lang.String valueOf = java.lang.String.valueOf(e3);
            defpackage.cdm.a(3, str2, new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 73).append("Failed to get Account Name, falling back to Zwieback logging, exception: ").append(valueOf).toString(), new java.lang.Object[0]);
        } finally {
            defpackage.bql a2 = a(str).a(a).a(null);
            a();
            a2.a().a(this.o);
        }
    }

    private final defpackage.bqm a(java.lang.String str) {
        if (this.m.get(str) == null) {
            synchronized (this.b) {
                if (this.m.get(str) == null) {
                    this.m.put(str, defpackage.bqn.a(this.h, str, null));
                }
            }
        }
        return (defpackage.bqm) this.m.get(str);
    }

    private final defpackage.bqw a() {
        defpackage.bqw bqw;
        synchronized (this.b) {
            if (this.d == null) {
                if (this.l == null) {
                    this.l = new defpackage.bqx(this.h, 0);
                }
                defpackage.bqx bqx = this.l;
                bqx.a.a(bqx.b.a((defpackage.bqu) this.j.a));
                this.d = bqx.a();
                this.d.a(this.e);
                this.d.a(this.f);
                defpackage.cdm.a(3, "ClearcutTransmitter", "Connecting to GmsCore", new java.lang.Object[0]);
                this.d.a();
            }
            bqw = this.d;
        }
        return bqw;
    }

    static void a(defpackage.bre bre) {
        defpackage.cdm.a(2, "ClearcutTransmitter", "handleResult, success: %b", java.lang.Boolean.valueOf(bre.b()));
        if (!bre.b()) {
            defpackage.cdm.a(3, "ClearcutTransmitter", "Clearcut logging failed", new java.lang.Object[0]);
        }
    }

    public static void a(int i2) {
        defpackage.cdm.a(3, "ClearcutTransmitter", "onConnectionSuspended, cause: %d", java.lang.Integer.valueOf(i2));
    }
}
