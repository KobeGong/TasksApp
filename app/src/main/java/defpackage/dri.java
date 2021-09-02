package defpackage;

/* renamed from: dri reason: default package */
/* compiled from: PG */
public abstract class dri implements defpackage.dxe {
    private final defpackage.dzt a;
    private boolean b;
    private final defpackage.dzo c;
    private boolean d;
    private boolean e;
    private java.lang.Runnable f;
    public defpackage.dtl i;
    public final java.lang.Object j;
    public int k;
    public boolean l;
    public defpackage.dzq m;
    public boolean n;
    public defpackage.dob o;
    public volatile boolean p;
    public boolean q;

    private dri(int i2, defpackage.dzo dzo, defpackage.dzt dzt) {
        this.j = new java.lang.Object();
        defpackage.cld.a((java.lang.Object) dzo, (java.lang.Object) "statsTraceCtx");
        this.a = (defpackage.dzt) defpackage.cld.a((java.lang.Object) dzt, (java.lang.Object) "transportTracer");
        this.i = new defpackage.dxd(this, defpackage.dno.a, i2, dzo, dzt);
    }

    public abstract void a(java.lang.Runnable runnable);

    public final void a(defpackage.dzr dzr) {
        this.m.a(dzr);
    }

    private final boolean b() {
        boolean z;
        synchronized (this.j) {
            z = this.l && this.k < 32768 && !this.b;
        }
        return z;
    }

    public final void a() {
        boolean b2;
        synchronized (this.j) {
            b2 = b();
        }
        if (b2) {
            this.m.a();
        }
    }

    protected dri(int i2, defpackage.dzo dzo, defpackage.dzt dzt, byte b2) {
        this(i2, dzo, dzt);
        this.o = defpackage.dob.a;
        this.e = false;
        this.c = (defpackage.dzo) defpackage.cld.a((java.lang.Object) dzo, (java.lang.Object) "statsTraceCtx");
    }

    public final void a(boolean z) {
        this.e = true;
        if (this.f != null) {
            this.f.run();
            this.f = null;
        }
    }

    public final void b(defpackage.dpw dpw, boolean z, defpackage.dor dor) {
        int i2 = defpackage.bg.av;
        defpackage.cld.a((java.lang.Object) dpw, (java.lang.Object) "status");
        defpackage.cld.a((java.lang.Object) dor, (java.lang.Object) "trailers");
        if (!this.q || z) {
            this.q = true;
            synchronized (this.j) {
                this.b = true;
            }
            if (this.e) {
                this.f = null;
                a(dpw, i2, dor);
                return;
            }
            this.f = new defpackage.dqu(this, dpw, i2, dor);
            if (z) {
                this.i.close();
            } else {
                this.i.a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.dpw dpw, int i2, defpackage.dor dor) {
        if (!this.d) {
            this.d = true;
            defpackage.dzo dzo = this.c;
            if (dzo.b.compareAndSet(false, true)) {
                for (defpackage.dqc a2 : dzo.a) {
                    a2.a();
                }
            }
            this.m.a(dpw, i2, dor);
            if (this.a != null) {
                defpackage.dzt dzt = this.a;
                if (dpw.a()) {
                    dzt.c++;
                } else {
                    dzt.d++;
                }
            }
        }
    }
}
