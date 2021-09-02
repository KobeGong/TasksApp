package defpackage;

/* renamed from: cma reason: default package */
/* compiled from: PG */
public final class cma {
    private final java.lang.Long a;
    private final java.lang.Long b;
    private final android.os.health.HealthStats c;
    private final java.lang.Integer d;
    private final java.lang.String e;
    private final java.lang.Boolean f;
    private final defpackage.eeo g = null;
    private final /* synthetic */ defpackage.clz h;

    public cma(defpackage.clz clz, java.lang.Long l, java.lang.Long l2, android.os.health.HealthStats healthStats, java.lang.Integer num, java.lang.String str, java.lang.Boolean bool, defpackage.eeo eeo) {
        this.h = clz;
        this.a = l;
        this.b = l2;
        this.c = healthStats;
        this.d = num;
        this.e = str;
        this.f = bool;
    }

    public final defpackage.cml a() {
        defpackage.cmm cmm = this.h.a;
        android.os.health.HealthStats healthStats = this.c;
        defpackage.egf egf = new defpackage.egf();
        egf.a = defpackage.cky.a(healthStats, 10001);
        egf.b = defpackage.cky.a(healthStats, 10003);
        egf.c = defpackage.cky.c(healthStats, 10005);
        egf.d = defpackage.cky.c(healthStats, 10006);
        egf.e = defpackage.cky.c(healthStats, 10007);
        egf.f = defpackage.cky.c(healthStats, 10008);
        egf.g = defpackage.cky.c(healthStats, 10009);
        egf.h = defpackage.cky.c(healthStats, 10010);
        egf.i = defpackage.cky.b(healthStats, 10011);
        egf.l = defpackage.cky.c(healthStats, 10012);
        egf.m = (defpackage.efk[]) defpackage.cmg.a.a(defpackage.cky.d(healthStats, 10014));
        egf.n = (defpackage.eeu[]) defpackage.cmf.a.a(defpackage.cky.d(healthStats, 10015));
        egf.o = defpackage.cky.a(healthStats, 10016);
        egf.p = defpackage.cky.a(healthStats, 10017);
        egf.q = defpackage.cky.a(healthStats, 10018);
        egf.r = defpackage.cky.a(healthStats, 10019);
        egf.s = defpackage.cky.a(healthStats, 10020);
        egf.t = defpackage.cky.a(healthStats, 10021);
        egf.u = defpackage.cky.a(healthStats, 10022);
        egf.v = defpackage.cky.a(healthStats, 10023);
        egf.w = defpackage.cky.a(healthStats, 10024);
        egf.x = defpackage.cky.a(healthStats, 10025);
        egf.y = defpackage.cky.a(healthStats, 10026);
        egf.z = defpackage.cky.a(healthStats, 10027);
        egf.A = defpackage.cky.a(healthStats, 10028);
        egf.B = defpackage.cky.a(healthStats, 10029);
        egf.C = defpackage.cky.b(healthStats, 10030);
        egf.D = defpackage.cky.a(healthStats, 10031);
        egf.E = defpackage.cky.b(healthStats, 10032);
        egf.F = defpackage.cky.b(healthStats, 10033);
        egf.G = defpackage.cky.b(healthStats, 10034);
        egf.H = defpackage.cky.b(healthStats, 10035);
        egf.I = defpackage.cky.b(healthStats, 10036);
        egf.J = defpackage.cky.b(healthStats, 10037);
        egf.K = defpackage.cky.b(healthStats, 10038);
        egf.L = defpackage.cky.b(healthStats, 10039);
        egf.M = defpackage.cky.b(healthStats, 10040);
        egf.N = defpackage.cky.b(healthStats, 10041);
        egf.O = defpackage.cky.b(healthStats, 10042);
        egf.P = defpackage.cky.b(healthStats, 10043);
        egf.Q = defpackage.cky.b(healthStats, 10044);
        egf.R = defpackage.cky.a(healthStats, 10045);
        egf.S = defpackage.cky.a(healthStats, 10046);
        egf.T = defpackage.cky.a(healthStats, 10047);
        egf.U = defpackage.cky.a(healthStats, 10048);
        egf.V = defpackage.cky.a(healthStats, 10049);
        egf.W = defpackage.cky.a(healthStats, 10050);
        egf.X = defpackage.cky.a(healthStats, 10051);
        egf.Y = defpackage.cky.a(healthStats, 10052);
        egf.Z = defpackage.cky.a(healthStats, 10053);
        egf.aa = defpackage.cky.a(healthStats, 10054);
        egf.ab = defpackage.cky.a(healthStats, 10055);
        egf.ac = defpackage.cky.a(healthStats, 10056);
        egf.ad = defpackage.cky.a(healthStats, 10057);
        egf.ae = defpackage.cky.a(healthStats, 10058);
        egf.af = defpackage.cky.a(healthStats, 10059);
        egf.ag = defpackage.cky.b(healthStats, 10061);
        egf.ah = defpackage.cky.a(healthStats, 10062);
        egf.ai = defpackage.cky.a(healthStats, 10063);
        egf.aj = defpackage.cky.a(healthStats, 10064);
        defpackage.cmc cmc = cmm.b;
        cmc.a(defpackage.cmd.WAKELOCK, egf.c);
        cmc.a(defpackage.cmd.WAKELOCK, egf.d);
        cmc.a(defpackage.cmd.WAKELOCK, egf.e);
        cmc.a(defpackage.cmd.WAKELOCK, egf.f);
        cmc.a(defpackage.cmd.SYNC, egf.g);
        cmc.a(defpackage.cmd.JOB, egf.h);
        cmc.a(defpackage.cmd.SENSOR, egf.l);
        java.lang.Long l = this.a;
        java.lang.Long l2 = this.b;
        java.lang.Long l3 = ((defpackage.cip) this.h.d.a()).g;
        java.lang.String str = ((defpackage.cip) this.h.d.a()).c;
        return new defpackage.cml(egf, l, l2, l3, java.lang.Long.valueOf(str == null ? 0 : (long) str.hashCode()), this.d, this.e, this.f, this.g);
    }
}
