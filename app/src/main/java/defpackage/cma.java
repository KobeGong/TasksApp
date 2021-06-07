package defpackage;

import android.os.health.HealthStats;

/* renamed from: cma  reason: default package */
/* compiled from: PG */
public final class cma {
    private final Long a;
    private final Long b;
    private final HealthStats c;
    private final Integer d;
    private final String e;
    private final Boolean f;
    private final eeo g = null;
    private final /* synthetic */ clz h;

    public cma(clz clz, Long l, Long l2, HealthStats healthStats, Integer num, String str, Boolean bool, eeo eeo) {
        this.h = clz;
        this.a = l;
        this.b = l2;
        this.c = healthStats;
        this.d = num;
        this.e = str;
        this.f = bool;
    }

    public final cml a() {
        cmm cmm = this.h.a;
        HealthStats healthStats = this.c;
        egf egf = new egf();
        egf.a = cky.a(healthStats, 10001);
        egf.b = cky.a(healthStats, 10003);
        egf.c = cky.c(healthStats, 10005);
        egf.d = cky.c(healthStats, 10006);
        egf.e = cky.c(healthStats, 10007);
        egf.f = cky.c(healthStats, 10008);
        egf.g = cky.c(healthStats, 10009);
        egf.h = cky.c(healthStats, 10010);
        egf.i = cky.b(healthStats, 10011);
        egf.l = cky.c(healthStats, 10012);
        egf.m = (efk[]) cmg.a.a(cky.d(healthStats, 10014));
        egf.n = (eeu[]) cmf.a.a(cky.d(healthStats, 10015));
        egf.o = cky.a(healthStats, 10016);
        egf.p = cky.a(healthStats, 10017);
        egf.q = cky.a(healthStats, 10018);
        egf.r = cky.a(healthStats, 10019);
        egf.s = cky.a(healthStats, 10020);
        egf.t = cky.a(healthStats, 10021);
        egf.u = cky.a(healthStats, 10022);
        egf.v = cky.a(healthStats, 10023);
        egf.w = cky.a(healthStats, 10024);
        egf.x = cky.a(healthStats, 10025);
        egf.y = cky.a(healthStats, 10026);
        egf.z = cky.a(healthStats, 10027);
        egf.A = cky.a(healthStats, 10028);
        egf.B = cky.a(healthStats, 10029);
        egf.C = cky.b(healthStats, 10030);
        egf.D = cky.a(healthStats, 10031);
        egf.E = cky.b(healthStats, 10032);
        egf.F = cky.b(healthStats, 10033);
        egf.G = cky.b(healthStats, 10034);
        egf.H = cky.b(healthStats, 10035);
        egf.I = cky.b(healthStats, 10036);
        egf.J = cky.b(healthStats, 10037);
        egf.K = cky.b(healthStats, 10038);
        egf.L = cky.b(healthStats, 10039);
        egf.M = cky.b(healthStats, 10040);
        egf.N = cky.b(healthStats, 10041);
        egf.O = cky.b(healthStats, 10042);
        egf.P = cky.b(healthStats, 10043);
        egf.Q = cky.b(healthStats, 10044);
        egf.R = cky.a(healthStats, 10045);
        egf.S = cky.a(healthStats, 10046);
        egf.T = cky.a(healthStats, 10047);
        egf.U = cky.a(healthStats, 10048);
        egf.V = cky.a(healthStats, 10049);
        egf.W = cky.a(healthStats, 10050);
        egf.X = cky.a(healthStats, 10051);
        egf.Y = cky.a(healthStats, 10052);
        egf.Z = cky.a(healthStats, 10053);
        egf.aa = cky.a(healthStats, 10054);
        egf.ab = cky.a(healthStats, 10055);
        egf.ac = cky.a(healthStats, 10056);
        egf.ad = cky.a(healthStats, 10057);
        egf.ae = cky.a(healthStats, 10058);
        egf.af = cky.a(healthStats, 10059);
        egf.ag = cky.b(healthStats, 10061);
        egf.ah = cky.a(healthStats, 10062);
        egf.ai = cky.a(healthStats, 10063);
        egf.aj = cky.a(healthStats, 10064);
        cmc cmc = cmm.b;
        cmc.a(cmd.WAKELOCK, egf.c);
        cmc.a(cmd.WAKELOCK, egf.d);
        cmc.a(cmd.WAKELOCK, egf.e);
        cmc.a(cmd.WAKELOCK, egf.f);
        cmc.a(cmd.SYNC, egf.g);
        cmc.a(cmd.JOB, egf.h);
        cmc.a(cmd.SENSOR, egf.l);
        Long l = this.a;
        Long l2 = this.b;
        Long l3 = ((cip) this.h.d.a()).g;
        String str = ((cip) this.h.d.a()).c;
        return new cml(egf, l, l2, l3, Long.valueOf(str == null ? 0 : (long) str.hashCode()), this.d, this.e, this.f, this.g);
    }
}
