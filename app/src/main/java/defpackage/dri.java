package defpackage;

/* renamed from: dri  reason: default package */
/* compiled from: PG */
public abstract class dri implements dxe {
    private final dzt a;
    private boolean b;
    private final dzo c;
    private boolean d;
    private boolean e;
    private Runnable f;
    public dtl i;
    public final Object j;
    public int k;
    public boolean l;
    public dzq m;
    public boolean n;
    public dob o;
    public volatile boolean p;
    public boolean q;

    private dri(int i2, dzo dzo, dzt dzt) {
        this.j = new Object();
        cld.a(dzo, "statsTraceCtx");
        this.a = (dzt) cld.a(dzt, "transportTracer");
        this.i = new dxd(this, dno.a, i2, dzo, dzt);
    }

    public abstract void a(Runnable runnable);

    @Override // defpackage.dxe
    public final void a(dzr dzr) {
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

    protected dri(int i2, dzo dzo, dzt dzt, byte b2) {
        this(i2, dzo, dzt);
        this.o = dob.a;
        this.e = false;
        this.c = (dzo) cld.a(dzo, "statsTraceCtx");
    }

    @Override // defpackage.dxe
    public final void a(boolean z) {
        this.e = true;
        if (this.f != null) {
            this.f.run();
            this.f = null;
        }
    }

    public final void b(dpw dpw, boolean z, dor dor) {
        int i2 = bg.av;
        cld.a(dpw, "status");
        cld.a(dor, "trailers");
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
            this.f = new dqu(this, dpw, i2, dor);
            if (z) {
                this.i.close();
            } else {
                this.i.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(dpw dpw, int i2, dor dor) {
        if (!this.d) {
            this.d = true;
            dzo dzo = this.c;
            if (dzo.b.compareAndSet(false, true)) {
                for (dqc dqc : dzo.a) {
                    dqc.a();
                }
            }
            this.m.a(dpw, i2, dor);
            if (this.a != null) {
                dzt dzt = this.a;
                if (dpw.a()) {
                    dzt.c++;
                } else {
                    dzt.d++;
                }
            }
        }
    }
}
