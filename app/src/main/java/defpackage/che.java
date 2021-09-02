package defpackage;

/* renamed from: che reason: default package */
/* compiled from: PG */
final class che extends defpackage.cgj implements defpackage.cgx, defpackage.cgy, defpackage.cle {
    public final defpackage.cmk d;
    private volatile boolean e = false;
    private final java.lang.Object f = new java.lang.Object();
    private final java.util.concurrent.atomic.AtomicBoolean g = new java.util.concurrent.atomic.AtomicBoolean();
    private final defpackage.clz h;
    private final boolean i;
    private final java.util.List j;

    che(defpackage.coe coe, android.app.Application application, defpackage.clt clt, android.content.SharedPreferences sharedPreferences, defpackage.clz clz, boolean z) {
        super(coe, application, clt, defpackage.bg.Z);
        new java.util.concurrent.ConcurrentHashMap();
        this.d = new defpackage.cmk(sharedPreferences);
        this.h = clz;
        this.i = z;
        this.j = z ? new java.util.ArrayList() : null;
    }

    public final void e() {
    }

    public final void f() {
        if (!this.g.get()) {
            if (this.g.getAndSet(true)) {
                defpackage.cdm.a(5, "BatteryMetricService", "unexpected state onAppToForeground", new java.lang.Object[0]);
            } else if (this.i) {
                a(2);
            } else {
                c().submit(new defpackage.chj(this, 2));
            }
        }
        synchronized (this.f) {
            if (!this.e) {
                defpackage.cha.a(this.a).a((defpackage.cgp) this);
                this.e = true;
            }
        }
    }

    public final void a(android.app.Activity activity) {
        if (this.g.getAndSet(true)) {
            defpackage.cdm.a(5, "BatteryMetricService", "unexpected state onAppToForeground", new java.lang.Object[0]);
        } else if (this.i) {
            a(2);
        } else {
            c().submit(new defpackage.chj(this, 2));
        }
    }

    public final void b(android.app.Activity activity) {
        if (!this.g.getAndSet(false)) {
            defpackage.cdm.a(5, "BatteryMetricService", "unexpected state onAppToBackground", new java.lang.Object[0]);
        } else if (this.i) {
            a(1);
        } else {
            c().submit(new defpackage.chj(this, 1));
        }
    }

    /* access modifiers changed from: 0000 */
    public final void d() {
        synchronized (this.f) {
            if (this.e) {
                defpackage.cha.a(this.a).b(this);
                this.e = false;
            }
        }
        synchronized (this.d) {
            this.d.a.a.edit().remove("primes.battery.snapshot").commit();
        }
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.cml g() {
        defpackage.cml cml;
        defpackage.cky.c();
        synchronized (this.d) {
            defpackage.cmk cmk = this.d;
            defpackage.com com2 = new defpackage.com();
            if (cmk.a.a("primes.battery.snapshot", com2)) {
                cml = new defpackage.cml(com2.a, com2.b, com2.c, com2.d, com2.e, com2.f, com2.g, com2.h, com2.i);
            } else {
                cml = null;
            }
        }
        return cml;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(defpackage.cml cml) {
        boolean commit;
        defpackage.cky.c();
        synchronized (this.d) {
            defpackage.cmk cmk = this.d;
            defpackage.com com2 = new defpackage.com();
            com2.a = cml.a;
            com2.b = cml.b;
            com2.c = cml.c;
            com2.d = cml.d;
            com2.e = cml.e;
            com2.f = cml.f;
            com2.g = cml.g;
            com2.h = cml.h;
            com2.i = cml.i;
            defpackage.cny cny = cmk.a;
            byte[] a = defpackage.dmf.a((defpackage.dmf) defpackage.cky.a((java.lang.Object) com2));
            byte[] bArr = new byte[(a.length + 1)];
            bArr[0] = 1;
            java.lang.System.arraycopy(a, 0, bArr, 1, a.length);
            commit = cny.a.edit().putString("primes.battery.snapshot", android.util.Base64.encodeToString(bArr, 0)).commit();
        }
        return commit;
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.cma a(int i2, java.lang.String str, boolean z) {
        defpackage.clz clz = this.h;
        android.os.health.SystemHealthManager systemHealthManager = (android.os.health.SystemHealthManager) clz.a.a.getSystemService("systemhealth");
        return new defpackage.cma(clz, java.lang.Long.valueOf(clz.c.a()), java.lang.Long.valueOf(clz.b.a()), systemHealthManager != null ? systemHealthManager.takeMyUidSnapshot() : null, java.lang.Integer.valueOf(i2), str, java.lang.Boolean.valueOf(z), null);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005a, code lost:
        if (r0 != false) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.cml r14, defpackage.cml r15) {
        /*
            r13 = this;
            r4 = 0
            r12 = 3
            r6 = 2
            r1 = 1
            r2 = 0
            java.lang.String r0 = "BatteryMetricService"
            java.lang.String r3 = "log start: %s\nend: %s"
            java.lang.Object[] r5 = new java.lang.Object[r6]
            r5[r2] = r14
            r5[r1] = r15
            defpackage.cdm.a(r6, r0, r3, r5)
            clz r5 = r13.h
            if (r14 == 0) goto L_0x00cd
            if (r15 == 0) goto L_0x00cd
            java.lang.Long r0 = r14.d
            if (r0 == 0) goto L_0x0078
            java.lang.Long r0 = r15.d
            if (r0 == 0) goto L_0x0078
            java.lang.Long r0 = r14.d
            long r6 = r0.longValue()
            java.lang.Long r0 = r15.d
            long r8 = r0.longValue()
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0078
            r0 = r1
        L_0x0031:
            java.lang.Long r3 = r14.e
            if (r3 == 0) goto L_0x0039
            java.lang.Long r3 = r15.e
            if (r3 != 0) goto L_0x007c
        L_0x0039:
            java.lang.Long r3 = r14.e
            if (r3 != 0) goto L_0x007a
            java.lang.Long r3 = r15.e
            if (r3 != 0) goto L_0x007a
            r3 = r1
        L_0x0042:
            if (r0 == 0) goto L_0x0090
            if (r3 == 0) goto L_0x0090
            r0 = r1
        L_0x0047:
            if (r0 == 0) goto L_0x00cd
            java.lang.Long r0 = r14.b
            if (r0 == 0) goto L_0x0059
            java.lang.Long r0 = r14.c
            if (r0 == 0) goto L_0x0059
            java.lang.Long r0 = r15.b
            if (r0 == 0) goto L_0x0059
            java.lang.Long r0 = r15.c
            if (r0 != 0) goto L_0x0092
        L_0x0059:
            r0 = r2
        L_0x005a:
            if (r0 == 0) goto L_0x00cd
        L_0x005c:
            if (r1 != 0) goto L_0x00cf
            java.lang.String r0 = "BatteryCapture"
            java.lang.String r1 = "inconsistent stats"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            defpackage.cdm.a(r12, r0, r1, r2)
            r0 = r4
        L_0x0068:
            if (r0 == 0) goto L_0x0077
            java.lang.String r1 = r15.g
            java.lang.Boolean r2 = r15.h
            boolean r2 = r2.booleanValue()
            eeo r3 = r15.i
            r13.a(r1, r2, r0, r3)
        L_0x0077:
            return
        L_0x0078:
            r0 = r2
            goto L_0x0031
        L_0x007a:
            r3 = r2
            goto L_0x0042
        L_0x007c:
            java.lang.Long r3 = r14.e
            long r6 = r3.longValue()
            java.lang.Long r3 = r15.e
            long r8 = r3.longValue()
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x008e
            r3 = r1
            goto L_0x0042
        L_0x008e:
            r3 = r2
            goto L_0x0042
        L_0x0090:
            r0 = r2
            goto L_0x0047
        L_0x0092:
            java.lang.Long r0 = r15.b
            long r6 = r0.longValue()
            java.lang.Long r0 = r14.b
            long r8 = r0.longValue()
            long r6 = r6 - r8
            java.lang.Long r0 = r15.c
            long r8 = r0.longValue()
            java.lang.Long r0 = r14.c
            long r10 = r0.longValue()
            long r8 = r8 - r10
            r10 = 0
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x00cb
            long r6 = r6 - r8
            long r6 = java.lang.Math.abs(r6)
            r10 = 25
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x00c9
            double r6 = (double) r6
            double r8 = (double) r8
            double r6 = r6 / r8
            r8 = 4540248920338119903(0x3f023456789abcdf, double:3.472222222222222E-5)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x00cb
        L_0x00c9:
            r0 = r1
            goto L_0x005a
        L_0x00cb:
            r0 = r2
            goto L_0x005a
        L_0x00cd:
            r1 = r2
            goto L_0x005c
        L_0x00cf:
            cmm r5 = r5.a
            egf r1 = r15.a
            egf r6 = r14.a
            defpackage.cky.a(r1)
            if (r6 != 0) goto L_0x011c
            r0 = r1
        L_0x00db:
            cmc r1 = r5.b
            egb[] r3 = r0.c
            r1.a(r3)
            egb[] r3 = r0.d
            r1.a(r3)
            egb[] r3 = r0.e
            r1.a(r3)
            egb[] r3 = r0.f
            r1.a(r3)
            egb[] r3 = r0.g
            r1.a(r3)
            egb[] r3 = r0.h
            r1.a(r3)
            egb[] r3 = r0.l
            r1.a(r3)
            java.lang.Long r1 = r0.a
            if (r1 == 0) goto L_0x0110
            java.lang.Long r1 = r0.a
            long r6 = r1.longValue()
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 > 0) goto L_0x0384
        L_0x0110:
            java.lang.String r0 = "BatteryCapture"
            java.lang.String r1 = "invalid realtime"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            defpackage.cdm.a(r12, r0, r1, r2)
            r0 = r4
            goto L_0x0068
        L_0x011c:
            egf r3 = new egf
            r3.<init>()
            java.lang.Long r0 = r1.a
            java.lang.Long r7 = r6.a
            java.lang.Long r0 = defpackage.cky.a(r0, r7)
            r3.a = r0
            java.lang.Long r0 = r1.b
            java.lang.Long r7 = r6.b
            java.lang.Long r0 = defpackage.cky.a(r0, r7)
            r3.b = r0
            egb[] r0 = r1.c
            egb[] r7 = r6.c
            egb[] r0 = defpackage.cky.a(r0, r7)
            r3.c = r0
            egb[] r0 = r1.d
            egb[] r7 = r6.d
            egb[] r0 = defpackage.cky.a(r0, r7)
            r3.d = r0
            egb[] r0 = r1.e
            egb[] r7 = r6.e
            egb[] r0 = defpackage.cky.a(r0, r7)
            r3.e = r0
            egb[] r0 = r1.f
            egb[] r7 = r6.f
            egb[] r0 = defpackage.cky.a(r0, r7)
            r3.f = r0
            egb[] r0 = r1.g
            egb[] r7 = r6.g
            egb[] r0 = defpackage.cky.a(r0, r7)
            r3.g = r0
            egb[] r0 = r1.h
            egb[] r7 = r6.h
            egb[] r0 = defpackage.cky.a(r0, r7)
            r3.h = r0
            egb r0 = r1.i
            egb r7 = r6.i
            egb r0 = defpackage.cky.a(r0, r7)
            r3.i = r0
            egb[] r0 = r1.l
            egb[] r7 = r6.l
            egb[] r0 = defpackage.cky.a(r0, r7)
            r3.l = r0
            efk[] r0 = r1.m
            efk[] r7 = r6.m
            cmg r8 = defpackage.cmg.a
            dmf[] r0 = r8.a(r0, r7)
            efk[] r0 = (defpackage.efk[]) r0
            r3.m = r0
            eeu[] r0 = r1.n
            eeu[] r7 = r6.n
            cmf r8 = defpackage.cmf.a
            dmf[] r0 = r8.a(r0, r7)
            eeu[] r0 = (defpackage.eeu[]) r0
            r3.n = r0
            java.lang.Long r0 = r1.o
            java.lang.Long r7 = r6.o
            java.lang.Long r0 = defpackage.cky.a(r0, r7)
            r3.o = r0
            java.lang.Long r0 = r1.p
            java.lang.Long r7 = r6.p
            java.lang.Long r0 = defpackage.cky.a(r0, r7)
            r3.p = r0
            java.lang.Long r0 = r1.q
            java.lang.Long r7 = r6.q
            java.lang.Long r0 = defpackage.cky.a(r0, r7)
            r3.q = r0
            java.lang.Long r0 = r1.r
            java.lang.Long r7 = r6.r
            java.lang.Long r0 = defpackage.cky.a(r0, r7)
            r3.r = r0
            java.lang.Long r0 = r1.s
            java.lang.Long r7 = r6.s
            java.lang.Long r0 = defpackage.cky.a(r0, r7)
            r3.s = r0
            java.lang.Long r0 = r1.t
            java.lang.Long r7 = r6.t
            java.lang.Long r0 = defpackage.cky.a(r0, r7)
            r3.t = r0
            java.lang.Long r0 = r1.u
            java.lang.Long r7 = r6.u
            java.lang.Long r0 = defpackage.cky.a(r0, r7)
            r3.u = r0
            java.lang.Long r0 = r1.v
            java.lang.Long r7 = r6.v
            java.lang.Long r0 = defpackage.cky.a(r0, r7)
            r3.v = r0
            java.lang.Long r0 = r1.w
            java.lang.Long r7 = r6.w
            java.lang.Long r0 = defpackage.cky.a(r0, r7)
            r3.w = r0
            java.lang.Long r0 = r1.x
            java.lang.Long r7 = r6.x
            java.lang.Long r0 = defpackage.cky.a(r0, r7)
            r3.x = r0
            java.lang.Long r0 = r1.y
            java.lang.Long r7 = r6.y
            java.lang.Long r0 = defpackage.cky.a(r0, r7)
            r3.y = r0
            java.lang.Long r0 = r1.z
            java.lang.Long r7 = r6.z
            java.lang.Long r0 = defpackage.cky.a(r0, r7)
            r3.z = r0
            java.lang.Long r0 = r1.A
            java.lang.Long r7 = r6.A
            java.lang.Long r0 = defpackage.cky.a(r0, r7)
            r3.A = r0
            java.lang.Long r0 = r1.B
            java.lang.Long r7 = r6.B
            java.lang.Long r0 = defpackage.cky.a(r0, r7)
            r3.B = r0
            egb r0 = r1.C
            egb r7 = r6.C
            egb r0 = defpackage.cky.a(r0, r7)
            r3.C = r0
            java.lang.Long r0 = r1.D
            java.lang.Long r7 = r6.D
            java.lang.Long r0 = defpackage.cky.a(r0, r7)
            r3.D = r0
            egb r0 = r1.E
            egb r7 = r6.E
            egb r0 = defpackage.cky.a(r0, r7)
            r3.E = r0
            egb r0 = r1.F
            egb r7 = r6.F
            egb r0 = defpackage.cky.a(r0, r7)
            r3.F = r0
            egb r0 = r1.G
            egb r7 = r6.G
            egb r0 = defpackage.cky.a(r0, r7)
            r3.G = r0
            egb r0 = r1.H
            egb r7 = r6.H
            egb r0 = defpackage.cky.a(r0, r7)
            r3.H = r0
            egb r0 = r1.I
            egb r7 = r6.I
            egb r0 = defpackage.cky.a(r0, r7)
            r3.I = r0
            egb r0 = r1.J
            egb r7 = r6.J
            egb r0 = defpackage.cky.a(r0, r7)
            r3.J = r0
            egb r0 = r1.K
            egb r7 = r6.K
            egb r0 = defpackage.cky.a(r0, r7)
            r3.K = r0
            egb r0 = r1.L
            egb r7 = r6.L
            egb r0 = defpackage.cky.a(r0, r7)
            r3.L = r0
            egb r0 = r1.M
            egb r7 = r6.M
            egb r0 = defpackage.cky.a(r0, r7)
            r3.M = r0
            egb r0 = r1.N
            egb r7 = r6.N
            egb r0 = defpackage.cky.a(r0, r7)
            r3.N = r0
            egb r0 = r1.O
            egb r7 = r6.O
            egb r0 = defpackage.cky.a(r0, r7)
            r3.O = r0
            egb r0 = r1.P
            egb r7 = r6.P
            egb r0 = defpackage.cky.a(r0, r7)
            r3.P = r0
            egb r0 = r1.Q
            egb r7 = r6.Q
            egb r0 = defpackage.cky.a(r0, r7)
            r3.Q = r0
            java.lang.Long r0 = r1.R
            java.lang.Long r7 = r6.R
            java.lang.Long r0 = defpackage.cky.a(r0, r7)
            r3.R = r0
            java.lang.Long r0 = r1.S
            java.lang.Long r7 = r6.S
            java.lang.Long r0 = defpackage.cky.a(r0, r7)
            r3.S = r0
            java.lang.Long r0 = r1.T
            java.lang.Long r7 = r6.T
            java.lang.Long r0 = defpackage.cky.a(r0, r7)
            r3.T = r0
            java.lang.Long r0 = r1.U
            java.lang.Long r7 = r6.U
            java.lang.Long r0 = defpackage.cky.a(r0, r7)
            r3.U = r0
            java.lang.Long r0 = r1.V
            java.lang.Long r7 = r6.V
            java.lang.Long r0 = defpackage.cky.a(r0, r7)
            r3.V = r0
            java.lang.Long r0 = r1.W
            java.lang.Long r7 = r6.W
            java.lang.Long r0 = defpackage.cky.a(r0, r7)
            r3.W = r0
            java.lang.Long r0 = r1.X
            java.lang.Long r7 = r6.X
            java.lang.Long r0 = defpackage.cky.a(r0, r7)
            r3.X = r0
            java.lang.Long r0 = r1.Y
            java.lang.Long r7 = r6.Y
            java.lang.Long r0 = defpackage.cky.a(r0, r7)
            r3.Y = r0
            java.lang.Long r0 = r1.Z
            java.lang.Long r7 = r6.Z
            java.lang.Long r0 = defpackage.cky.a(r0, r7)
            r3.Z = r0
            java.lang.Long r0 = r1.aa
            java.lang.Long r7 = r6.aa
            java.lang.Long r0 = defpackage.cky.a(r0, r7)
            r3.aa = r0
            java.lang.Long r0 = r1.ab
            java.lang.Long r7 = r6.ab
            java.lang.Long r0 = defpackage.cky.a(r0, r7)
            r3.ab = r0
            java.lang.Long r0 = r1.ac
            java.lang.Long r7 = r6.ac
            java.lang.Long r0 = defpackage.cky.a(r0, r7)
            r3.ac = r0
            java.lang.Long r0 = r1.ad
            java.lang.Long r7 = r6.ad
            java.lang.Long r0 = defpackage.cky.a(r0, r7)
            r3.ad = r0
            java.lang.Long r0 = r1.ae
            java.lang.Long r7 = r6.ae
            java.lang.Long r0 = defpackage.cky.a(r0, r7)
            r3.ae = r0
            java.lang.Long r0 = r1.af
            java.lang.Long r7 = r6.af
            java.lang.Long r0 = defpackage.cky.a(r0, r7)
            r3.af = r0
            egb r0 = r1.ag
            egb r7 = r6.ag
            egb r0 = defpackage.cky.a(r0, r7)
            r3.ag = r0
            java.lang.Long r0 = r1.ah
            java.lang.Long r7 = r6.ah
            java.lang.Long r0 = defpackage.cky.a(r0, r7)
            r3.ah = r0
            java.lang.Long r0 = r1.ai
            java.lang.Long r7 = r6.ai
            java.lang.Long r0 = defpackage.cky.a(r0, r7)
            r3.ai = r0
            java.lang.Long r0 = r1.aj
            java.lang.Long r1 = r6.aj
            java.lang.Long r0 = defpackage.cky.a(r0, r1)
            r3.aj = r0
            r0 = r3
            goto L_0x00db
        L_0x0384:
            edl r1 = new edl
            r1.<init>()
            java.lang.Long r2 = r15.b
            long r2 = r2.longValue()
            java.lang.Long r4 = r14.b
            long r4 = r4.longValue()
            long r2 = r2 - r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.g = r2
            java.lang.Integer r2 = r14.f
            int r2 = r2.intValue()
            r1.a = r2
            java.lang.Boolean r2 = r14.h
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x03d2
            java.lang.String r2 = r14.g
            r1.d = r2
        L_0x03b0:
            eeo r2 = r14.i
            r1.e = r2
            java.lang.Integer r2 = r15.f
            int r2 = r2.intValue()
            r1.f = r2
            java.lang.Long r2 = r15.b
            r1.i = r2
            r1.h = r0
            edm r2 = new edm
            r2.<init>()
            r2.a = r1
            efx r0 = new efx
            r0.<init>()
            r0.l = r2
            goto L_0x0068
        L_0x03d2:
            java.lang.String r2 = r14.g
            r1.c = r2
            goto L_0x03b0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.che.a(cml, cml):void");
    }

    private final java.util.concurrent.Future a(int i2) {
        java.util.concurrent.Future submit = c().submit(new defpackage.chh(this, i2, null, true));
        defpackage.cdm.a(3, "BatteryMetricService", "adding future BatteryCapture", new java.lang.Object[0]);
        synchronized (this.j) {
            this.j.add(submit);
            if (!this.g.get()) {
                submit = h();
            }
        }
        return submit;
    }

    private final java.util.concurrent.Future h() {
        java.util.ArrayList arrayList;
        synchronized (this.j) {
            arrayList = new java.util.ArrayList(this.j);
            this.j.clear();
        }
        defpackage.cdm.a(4, "BatteryMetricService", "Logging captures: %d", java.lang.Integer.valueOf(arrayList.size()));
        return c().submit(new defpackage.chi(this, arrayList));
    }
}
