package defpackage;

/* renamed from: dsq reason: default package */
/* compiled from: PG */
final class dsq extends defpackage.dnd {
    private static final java.util.logging.Logger j = java.util.logging.Logger.getLogger(defpackage.dsq.class.getName());
    private static final byte[] k = "gzip".getBytes(java.nio.charset.Charset.forName("US-ASCII"));
    public final defpackage.dpb a;
    public final java.util.concurrent.Executor b;
    public final defpackage.drw c;
    public final defpackage.dns d;
    public defpackage.dta e;
    public volatile boolean f;
    public boolean g;
    public defpackage.dob h = defpackage.dob.a;
    public defpackage.dnp i = defpackage.dnp.a;
    private volatile java.util.concurrent.ScheduledFuture l;
    private final boolean m;
    private final defpackage.dna n;
    private final boolean o;
    private boolean p;
    private boolean q;
    private final defpackage.dsx r;
    private final defpackage.dnu s = new defpackage.dsy(this);
    private java.util.concurrent.ScheduledExecutorService t;

    dsq(defpackage.dpb dpb, java.util.concurrent.Executor executor, defpackage.dna dna, defpackage.dsx dsx, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.drw drw, boolean z) {
        java.util.concurrent.Executor dzd;
        this.a = dpb;
        if (executor == defpackage.cyn.a) {
            dzd = new defpackage.dzc();
        } else {
            dzd = new defpackage.dzd(executor);
        }
        this.b = dzd;
        this.c = drw;
        this.d = defpackage.dns.a();
        this.m = dpb.a == defpackage.dpe.UNARY || dpb.a == defpackage.dpe.SERVER_STREAMING;
        this.n = dna;
        this.r = dsx;
        this.t = scheduledExecutorService;
        this.o = z;
    }

    public final void a(defpackage.dne dne, defpackage.dor dor) {
        defpackage.doa doa;
        defpackage.dyu dyu;
        defpackage.cld.b(this.e == null, (java.lang.Object) "Already started");
        defpackage.cld.b(!this.p, (java.lang.Object) "call was cancelled");
        defpackage.cld.a((java.lang.Object) dne, (java.lang.Object) "observer");
        defpackage.cld.a((java.lang.Object) dor, (java.lang.Object) "headers");
        this.d.d();
        java.lang.String str = this.n.f;
        if (str != null) {
            defpackage.doa doa2 = (defpackage.doa) this.i.b.get(str);
            if (doa2 == null) {
                this.e = defpackage.dxm.a;
                this.b.execute(new defpackage.dsr(this, dne, str));
                return;
            }
            doa = doa2;
        } else {
            doa = defpackage.dno.a;
        }
        defpackage.dob dob = this.h;
        boolean z = this.g;
        dor.b(defpackage.dvc.c);
        if (doa != defpackage.dno.a) {
            dor.a(defpackage.dvc.c, (java.lang.Object) doa.a());
        }
        dor.b(defpackage.dvc.d);
        byte[] bArr = dob.c;
        if (bArr.length != 0) {
            dor.a(defpackage.dvc.d, (java.lang.Object) bArr);
        }
        dor.b(defpackage.dvc.e);
        dor.b(defpackage.dvc.f);
        if (z) {
            dor.a(defpackage.dvc.f, (java.lang.Object) k);
        }
        defpackage.dny c2 = c();
        if (!(c2 != null && c2.a())) {
            defpackage.dny dny = this.n.b;
            this.d.e();
            dor.b(defpackage.dvc.b);
            if (c2 != null) {
                long max = java.lang.Math.max(0, c2.b(java.util.concurrent.TimeUnit.NANOSECONDS));
                dor.a(defpackage.dvc.b, (java.lang.Object) java.lang.Long.valueOf(max));
                if (j.isLoggable(java.util.logging.Level.FINE) && c2 == null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(java.lang.String.format("Call timeout set to '%d' ns, due to context deadline.", new java.lang.Object[]{java.lang.Long.valueOf(max)}));
                    if (dny == null) {
                        sb.append(" Explicit call timeout was not set.");
                    } else {
                        sb.append(java.lang.String.format(" Explicit call timeout was '%d' ns.", new java.lang.Object[]{java.lang.Long.valueOf(dny.b(java.util.concurrent.TimeUnit.NANOSECONDS))}));
                    }
                    j.logp(java.util.logging.Level.FINE, "io.grpc.internal.ClientCallImpl", "logIfContextNarrowedTimeout", sb.toString());
                }
            }
            if (this.o) {
                defpackage.dsx dsx = this.r;
                defpackage.dpb dpb = this.a;
                defpackage.dna dna = this.n;
                defpackage.dns dns = this.d;
                defpackage.cld.b(dsx.a.N, (java.lang.Object) "retry should be enabled");
                if (dsx.a.M == null) {
                    dyu = defpackage.dyu.f;
                } else {
                    defpackage.dyt dyt = dsx.a.M;
                    defpackage.dyu dyu2 = (defpackage.dyu) dyt.a.get(dpb.b);
                    if (dyu2 == null) {
                        dyu2 = (defpackage.dyu) dyt.b.get(defpackage.dpb.a(dpb.b));
                    }
                    if (dyu2 == null) {
                        dyu2 = defpackage.dyu.f;
                    }
                    dyu = dyu2;
                }
                defpackage.dyr dyr = dsx.a.H;
                long j2 = dsx.a.K;
                long j3 = dsx.a.L;
                defpackage.dwf dwf = dsx.a;
                java.util.concurrent.Executor executor = dna.c;
                if (executor == null) {
                    executor = dwf.i;
                }
                this.e = new defpackage.dwm(dsx, dpb, dor, dyr, j2, j3, executor, dsx.a.h.a(), dyu, dsx.a.I, dna, dpb, dns);
            } else {
                defpackage.dtb a2 = this.r.a(new defpackage.dxp(this.a, dor, this.n));
                defpackage.dns c3 = this.d.c();
                try {
                    this.e = a2.a(this.a, dor, this.n);
                } finally {
                    this.d.a(c3);
                }
            }
        } else {
            defpackage.dpw dpw = defpackage.dpw.e;
            java.lang.String valueOf = java.lang.String.valueOf(c2);
            this.e = new defpackage.duu(dpw.a(new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 19).append("deadline exceeded: ").append(valueOf).toString()));
        }
        if (this.n.d != null) {
            this.e.a(this.n.d);
        }
        if (this.n.j != null) {
            this.e.b(this.n.j.intValue());
        }
        if (this.n.k != null) {
            this.e.a(this.n.k.intValue());
        }
        this.e.a(doa);
        this.e.a(this.g);
        this.e.a(this.h);
        this.c.a();
        this.e.a((defpackage.dzq) new defpackage.dss(this, dne));
        defpackage.dns dns2 = this.d;
        defpackage.dnu dnu = this.s;
        defpackage.cyn cyn = defpackage.cyn.a;
        defpackage.dns.a(dnu, "cancellationListener");
        defpackage.dns.a(cyn, "executor");
        dns2.b();
        if (!(c2 == null || this.d.e() == c2 || this.t == null)) {
            long b2 = c2.b(java.util.concurrent.TimeUnit.NANOSECONDS);
            this.l = this.t.schedule(new defpackage.dwc(new defpackage.dsz(this, b2)), b2, java.util.concurrent.TimeUnit.NANOSECONDS);
        }
        if (this.f) {
            b();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        this.d.b();
        java.util.concurrent.ScheduledFuture scheduledFuture = this.l;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.dny c() {
        defpackage.dny dny = this.n.b;
        this.d.e();
        if (dny == null) {
            return null;
        }
        return dny;
    }

    public final void a(int i2) {
        boolean z;
        boolean z2 = true;
        if (this.e != null) {
            z = true;
        } else {
            z = false;
        }
        defpackage.cld.b(z, (java.lang.Object) "Not started");
        if (i2 < 0) {
            z2 = false;
        }
        defpackage.cld.a(z2, (java.lang.Object) "Number requested must be non-negative");
        this.e.c(i2);
    }

    public final void a(java.lang.String str, java.lang.Throwable th) {
        defpackage.dpw a2;
        if (str == null && th == null) {
            java.lang.Throwable cancellationException = new java.util.concurrent.CancellationException("Cancelled without a message or cause");
            j.logp(java.util.logging.Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancel", "Cancelling without a message or cause is suboptimal", cancellationException);
            th = cancellationException;
        }
        if (!this.p) {
            this.p = true;
            try {
                if (this.e != null) {
                    defpackage.dpw dpw = defpackage.dpw.c;
                    if (str != null) {
                        a2 = dpw.a(str);
                    } else {
                        a2 = dpw.a("Call cancelled without message");
                    }
                    if (th != null) {
                        a2 = a2.b(th);
                    }
                    this.e.b(a2);
                }
            } finally {
                b();
            }
        }
    }

    public final void a() {
        boolean z;
        boolean z2 = false;
        defpackage.cld.b(this.e != null, (java.lang.Object) "Not started");
        if (!this.p) {
            z = true;
        } else {
            z = false;
        }
        defpackage.cld.b(z, (java.lang.Object) "call was cancelled");
        if (!this.q) {
            z2 = true;
        }
        defpackage.cld.b(z2, (java.lang.Object) "call already half-closed");
        this.q = true;
        this.e.e();
    }

    public final void a(java.lang.Object obj) {
        boolean z;
        boolean z2 = true;
        defpackage.cld.b(this.e != null, (java.lang.Object) "Not started");
        if (!this.p) {
            z = true;
        } else {
            z = false;
        }
        defpackage.cld.b(z, (java.lang.Object) "call was cancelled");
        if (this.q) {
            z2 = false;
        }
        defpackage.cld.b(z2, (java.lang.Object) "call was half-closed");
        try {
            if (this.e instanceof defpackage.dyb) {
                defpackage.dyb dyb = (defpackage.dyb) this.e;
                defpackage.dyv dyv = dyb.l;
                if (dyv.a) {
                    dyv.d.a.a(dyb.c.a(obj));
                } else {
                    dyb.a((defpackage.dyp) new defpackage.dyn(dyb, obj));
                }
            } else {
                this.e.a(this.a.a(obj));
            }
            if (!this.m) {
                this.e.f();
            }
        } catch (java.lang.RuntimeException e2) {
            this.e.b(defpackage.dpw.c.b((java.lang.Throwable) e2).a("Failed to stream message"));
        } catch (java.lang.Error e3) {
            this.e.b(defpackage.dpw.c.a("Client sendMessage() failed with Error"));
            throw e3;
        }
    }

    static void a(defpackage.dne dne, defpackage.dpw dpw, defpackage.dor dor) {
        dne.a(dpw, dor);
    }
}
