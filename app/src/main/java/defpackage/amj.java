package defpackage;

/* renamed from: amj reason: default package */
/* compiled from: PG */
public final class amj {
    public static final defpackage.cwl a = new defpackage.cwo(new defpackage.cwm());
    public final android.content.Context b;
    public final java.util.Queue c;
    public defpackage.cyj d;
    public final defpackage.ais e;
    public boolean f = false;
    private final java.util.concurrent.Executor g;
    private final android.content.BroadcastReceiver h = new defpackage.aml(this);
    private final defpackage.aiy i = new defpackage.aiy(this);

    public amj(defpackage.ais ais, java.util.concurrent.Executor executor, android.content.Context context) {
        this.b = context.getApplicationContext();
        this.c = new java.util.concurrent.LinkedBlockingQueue();
        this.e = ais;
        this.g = defpackage.cub.a(executor);
    }

    public final synchronized void a() {
        boolean z = true;
        synchronized (this) {
            if (this.f) {
                z = false;
            }
            defpackage.cld.b(z, (java.lang.Object) "The coordinator is already running.");
            defpackage.cld.b(true, (java.lang.Object) "The coordinator is shutting down.");
            this.b.registerReceiver(this.h, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.e.a(this.i);
            this.f = true;
        }
    }

    public final synchronized defpackage.cyi a(defpackage.csd csd, int i2, java.lang.Runnable runnable) {
        defpackage.amm amm;
        defpackage.cld.b(this.f, (java.lang.Object) "The coordinator is not running. Please call start().");
        amm = new defpackage.amm(csd, i2, runnable);
        this.c.add(amm);
        b();
        return amm.d;
    }

    public final synchronized void b() {
        if (this.f && (this.d == null || this.d.isDone())) {
            this.d = new defpackage.cyj(new defpackage.amk(this));
            this.g.execute(this.d);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.amm amm, java.lang.Throwable th) {
        synchronized (this) {
            this.c.poll();
        }
        amm.d.a(th);
        a(amm);
    }

    static void a(defpackage.amm amm) {
        if (amm.c != null) {
            amm.c.run();
        }
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void c() {
        java.lang.Throwable ami;
        boolean z;
        if (defpackage.bdk.a(this.b)) {
            ami = new java.lang.RuntimeException("Fail fast");
        } else {
            ami = new defpackage.ami();
        }
        boolean z2 = false;
        java.util.Iterator it = this.c.iterator();
        while (it.hasNext()) {
            defpackage.amm amm = (defpackage.amm) it.next();
            if (amm.b == defpackage.bg.D) {
                it.remove();
                amm.d.a(ami);
                z = true;
            } else {
                z = z2;
            }
            z2 = z;
        }
        if (z2) {
            this.e.a(defpackage.air.a(ami));
        }
    }
}
