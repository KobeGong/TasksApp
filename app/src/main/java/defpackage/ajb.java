package defpackage;

/* renamed from: ajb reason: default package */
/* compiled from: PG */
public final class ajb {
    private static final java.lang.String a = "tasks-pa.googleapis.com";
    private static defpackage.ajb e;
    private final android.content.Context b;
    private defpackage.eht c;
    private defpackage.dnc d;

    private ajb(android.content.Context context) {
        this.b = context;
    }

    public static synchronized defpackage.ajb a(android.content.Context context) {
        defpackage.ajb ajb;
        synchronized (defpackage.ajb.class) {
            if (e == null) {
                e = new defpackage.ajb(context.getApplicationContext());
            }
            ajb = e;
        }
        return ajb;
    }

    public final synchronized defpackage.dnc a() {
        defpackage.dnc dnc;
        boolean z = true;
        synchronized (this) {
            if (this.d == null) {
                defpackage.dqh a2 = defpackage.dqh.a(a, b());
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
                if (60 <= 0) {
                    z = false;
                }
                defpackage.cld.a(z, "idle timeout is %s, but must be positive", 60);
                if (timeUnit.toDays(60) >= 30) {
                    a2.k = -1;
                } else {
                    a2.k = java.lang.Math.max(timeUnit.toMillis(60), defpackage.dqv.a);
                }
                defpackage.dqh dqh = a2;
                defpackage.dtc a3 = dqh.a();
                defpackage.dro dro = new defpackage.dro();
                defpackage.dzn a4 = defpackage.dzn.a(defpackage.dvc.l);
                defpackage.csd csd = defpackage.dvc.n;
                java.util.ArrayList arrayList = new java.util.ArrayList(dqh.c);
                if (dqh.t) {
                    dqh.p = true;
                    arrayList.add(0, new defpackage.dsd(new defpackage.drz(defpackage.dvc.n), dqh.u, dqh.v));
                }
                if (dqh.w) {
                    dqh.p = true;
                    defpackage.ecn a5 = defpackage.ecp.a.a();
                    defpackage.ecp.a.b();
                    arrayList.add(0, new defpackage.dsg(a5, defpackage.ecx.a()).e);
                }
                if (dqh.s != null) {
                    arrayList.add(0, defpackage.drp.e);
                }
                this.d = new defpackage.dwz(new defpackage.dwf(dqh, a3, dro, a4, csd, arrayList, defpackage.drw.b));
            }
            dnc = this.d;
        }
        return dnc;
    }

    private final synchronized defpackage.eht b() {
        if (this.c == null) {
            this.c = new defpackage.ehu(this.b).a();
            defpackage.cjz.a(this.c);
        }
        return this.c;
    }

    static {
        defpackage.alj.a().b();
        new java.lang.Object[1][0] = "tasks-pa.googleapis.com";
    }
}
