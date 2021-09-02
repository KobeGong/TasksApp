package defpackage;

/* renamed from: dwf reason: default package */
/* compiled from: PG */
public final class dwf extends defpackage.dnc implements defpackage.dzw {
    private static final java.util.regex.Pattern U = java.util.regex.Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.dwf.class.getName());
    public static final defpackage.dpw b = defpackage.dpw.i.a("Channel shutdown invoked");
    public static final defpackage.dpw c = defpackage.dpw.i.a("Subchannel shutdown invoked");
    public final java.util.concurrent.atomic.AtomicBoolean A = new java.util.concurrent.atomic.AtomicBoolean(false);
    public volatile boolean B;
    public volatile boolean C;
    public final java.util.concurrent.CountDownLatch D = new java.util.concurrent.CountDownLatch(1);
    public final defpackage.drx E;
    public final defpackage.drw F;
    public final defpackage.dsp G;
    public final defpackage.dyr H = new defpackage.dyr();
    public defpackage.dzb I;
    public final int J;
    public final long K;
    public final long L;
    public defpackage.dyt M;
    public final boolean N;
    public final defpackage.dvp O = new defpackage.dwj(this);
    public defpackage.dwn P;
    public java.util.concurrent.ScheduledFuture Q;
    public defpackage.dwu R;
    public defpackage.drn S;
    public final defpackage.dsx T = new defpackage.dsx(this);
    private final defpackage.dol V;
    private final long W;
    private final defpackage.dnc X;
    private final defpackage.dxc Y = new defpackage.dwi(this);
    private java.util.concurrent.ScheduledFuture Z;
    public final defpackage.dwd d = defpackage.dwd.a(getClass().getName());
    public final java.lang.String e;
    public final defpackage.dpg f;
    public final defpackage.dmv g;
    public final defpackage.dtc h;
    public final java.util.concurrent.Executor i;
    public final defpackage.dxn j;
    public final defpackage.dso k = new defpackage.dwg(this);
    public boolean l;
    public final defpackage.dob m;
    public final defpackage.dnp n;
    public final defpackage.csd o;
    public final defpackage.dti p = new defpackage.dti();
    public final defpackage.dro q;
    public final java.lang.String r;
    public defpackage.dpf s;
    public defpackage.dwo t;
    public volatile defpackage.doq u;
    public boolean v;
    public final java.util.Set w = new java.util.HashSet(16, 0.75f);
    public final java.util.Set x = new java.util.HashSet(1, 0.75f);
    public final defpackage.dtm y;
    public final defpackage.dwy z = new defpackage.dwy();

    public final defpackage.dwd b() {
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    public final void a(boolean z2) {
        boolean z3;
        if (z2) {
            defpackage.cld.b(this.s != null, (java.lang.Object) "nameResolver is null");
            if (this.t != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            defpackage.cld.b(z3, (java.lang.Object) "lbHelper is null");
        }
        if (this.s != null) {
            if (this.Q != null) {
                this.Q.cancel(false);
                this.R.a = true;
                this.Q = null;
                this.R = null;
                this.S = null;
            }
            this.s.b();
            this.s = null;
        }
        if (this.t != null) {
            this.t.a.a();
            this.t = null;
        }
        this.u = null;
    }

    /* access modifiers changed from: 0000 */
    public final void c() {
        if (!this.A.get() && !this.v) {
            if (!this.O.a.isEmpty()) {
                d();
            } else {
                e();
            }
            if (this.t == null) {
                a.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImpl", "exitIdleMode", "[{0}] Exiting idle mode", this.d);
                this.t = new defpackage.dwo(this, this.s);
                this.t.a = this.V.a(this.t);
                defpackage.dph dph = new defpackage.dph(this, this.t);
                try {
                    this.s.a(dph);
                } catch (Throwable th) {
                    dph.a(defpackage.dpw.a(th));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void d() {
        if (this.Z != null) {
            this.Z.cancel(false);
            this.P.a = true;
            this.Z = null;
            this.P = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void e() {
        if (this.W != -1) {
            d();
            this.P = new defpackage.dwn(this);
            this.Z = this.h.a().schedule(new defpackage.dwc(new defpackage.dwk(this)), this.W, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
    }

    public dwf(defpackage.dqv dqv, defpackage.dtc dtc, defpackage.dro dro, defpackage.dxn dxn, defpackage.csd csd, java.util.List list, defpackage.drx drx) {
        super(0);
        this.e = (java.lang.String) defpackage.cld.a((java.lang.Object) dqv.e, (java.lang.Object) "target");
        this.f = dqv.d;
        this.g = (defpackage.dmv) defpackage.cld.a((java.lang.Object) dqv.b(), (java.lang.Object) "nameResolverParams");
        this.s = a(this.e, this.f, this.g);
        defpackage.dol dol = dqv.g;
        this.V = new defpackage.drk();
        this.j = (defpackage.dxn) defpackage.cld.a((java.lang.Object) dqv.b, (java.lang.Object) "executorPool");
        defpackage.cld.a((java.lang.Object) dxn, (java.lang.Object) "oobExecutorPool");
        this.i = (java.util.concurrent.Executor) defpackage.cld.a((java.lang.Object) (java.util.concurrent.Executor) this.j.a(), (java.lang.Object) "executor");
        this.y = new defpackage.dtm(this.i, this.k);
        this.y.a(this.Y);
        this.q = dro;
        this.h = new defpackage.dru(dtc, this.i);
        defpackage.dnc dwv = new defpackage.dwv(this);
        if (dqv.s != null) {
            dwv = defpackage.dng.a(dwv, dqv.s.d);
        }
        this.X = defpackage.dng.a(dwv, list);
        this.o = (defpackage.csd) defpackage.cld.a((java.lang.Object) csd, (java.lang.Object) "stopwatchSupplier");
        if (dqv.k == -1) {
            this.W = dqv.k;
        } else {
            defpackage.cld.a(dqv.k >= defpackage.dqv.a, "invalid idleTimeoutMillis %s", dqv.k);
            this.W = dqv.k;
        }
        this.l = dqv.h;
        this.m = (defpackage.dob) defpackage.cld.a((java.lang.Object) dqv.i, (java.lang.Object) "decompressorRegistry");
        this.n = (defpackage.dnp) defpackage.cld.a((java.lang.Object) dqv.j, (java.lang.Object) "compressorRegistry");
        this.r = dqv.f;
        this.J = dqv.l;
        int i2 = dqv.m;
        this.L = dqv.n;
        this.K = dqv.o;
        this.N = !dqv.p;
        this.E = drx;
        this.F = defpackage.drx.a();
        this.G = (defpackage.dsp) defpackage.cld.a((java.lang.Object) dqv.q);
        defpackage.dsp.a(this.G.b, this);
        a.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImpl", "<init>", "[{0}] Created with target {1}", new java.lang.Object[]{this.d, this.e});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r0 == null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r0 != null) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static defpackage.dpf a(java.lang.String r7, defpackage.dpg r8, defpackage.dmv r9) {
        /*
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.net.URI r0 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0014 }
            r0.<init>(r7)     // Catch:{ URISyntaxException -> 0x0014 }
        L_0x000b:
            if (r0 == 0) goto L_0x001e
            dpf r0 = r8.a(r0, r9)
            if (r0 == 0) goto L_0x001e
        L_0x0013:
            return r0
        L_0x0014:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            r0 = r1
            goto L_0x000b
        L_0x001e:
            java.util.regex.Pattern r0 = U
            java.util.regex.Matcher r0 = r0.matcher(r7)
            boolean r0 = r0.matches()
            if (r0 != 0) goto L_0x004c
            java.net.URI r1 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0094 }
            java.lang.String r3 = r8.a()     // Catch:{ URISyntaxException -> 0x0094 }
            java.lang.String r4 = ""
            java.lang.String r5 = "/"
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ URISyntaxException -> 0x0094 }
            int r6 = r0.length()     // Catch:{ URISyntaxException -> 0x0094 }
            if (r6 == 0) goto L_0x008e
            java.lang.String r0 = r5.concat(r0)     // Catch:{ URISyntaxException -> 0x0094 }
        L_0x0042:
            r5 = 0
            r1.<init>(r3, r4, r0, r5)     // Catch:{ URISyntaxException -> 0x0094 }
            dpf r0 = r8.a(r1, r9)
            if (r0 != 0) goto L_0x0013
        L_0x004c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "cannot find a NameResolver for %s%s"
            r0 = 2
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r0 = 0
            r4[r0] = r7
            r5 = 1
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x009b
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            int r2 = r2 + 3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r2)
            java.lang.String r2 = " ("
            java.lang.StringBuilder r2 = r6.append(r2)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = ")"
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
        L_0x0084:
            r4[r5] = r0
            java.lang.String r0 = java.lang.String.format(r3, r4)
            r1.<init>(r0)
            throw r1
        L_0x008e:
            java.lang.String r0 = new java.lang.String     // Catch:{ URISyntaxException -> 0x0094 }
            r0.<init>(r5)     // Catch:{ URISyntaxException -> 0x0094 }
            goto L_0x0042
        L_0x0094:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x009b:
            java.lang.String r0 = ""
            goto L_0x0084
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwf.a(java.lang.String, dpg, dmv):dpf");
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.doq doq) {
        this.u = doq;
        this.y.a(doq);
    }

    public final defpackage.dnd a(defpackage.dpb dpb, defpackage.dna dna) {
        return this.X.a(dpb, dna);
    }

    public final java.lang.String a() {
        return this.X.a();
    }

    static defpackage.dzb a(defpackage.dmv dmv) {
        return defpackage.dzh.b((java.util.Map) dmv.a(defpackage.dvb.a));
    }

    public final java.lang.String toString() {
        return defpackage.cky.b((java.lang.Object) this).a("logId", (java.lang.Object) this.d).a("target", (java.lang.Object) this.e).toString();
    }

    static {
        defpackage.dpw.i.a("Channel shutdownNow invoked");
    }
}
