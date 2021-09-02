package defpackage;

/* renamed from: dcg reason: default package */
/* compiled from: PG */
public final class dcg {
    private static volatile defpackage.dpb a;
    private static volatile defpackage.dpb b;
    private static volatile defpackage.dpb c;
    private static volatile defpackage.dpb d;

    private dcg() {
    }

    public static defpackage.dpb a() {
        defpackage.dpb dpb = a;
        if (dpb == null) {
            synchronized (defpackage.dcg.class) {
                dpb = a;
                if (dpb == null) {
                    defpackage.dpc dpc = new defpackage.dpc();
                    dpc.a = null;
                    dpc.b = null;
                    dpc.c = defpackage.dpe.UNARY;
                    dpc.d = defpackage.dpb.a("google.internal.tasks.v1.TasksApiService", "Query");
                    dpc.h = true;
                    dpc.a = defpackage.eaa.a(defpackage.dbs.b);
                    dpc.b = defpackage.eaa.a(defpackage.dbt.b);
                    dpb = dpc.a();
                    a = dpb;
                }
            }
        }
        return dpb;
    }

    public static defpackage.dpb b() {
        defpackage.dpb dpb = b;
        if (dpb == null) {
            synchronized (defpackage.dcg.class) {
                dpb = b;
                if (dpb == null) {
                    defpackage.dpc dpc = new defpackage.dpc();
                    dpc.a = null;
                    dpc.b = null;
                    dpc.c = defpackage.dpe.UNARY;
                    dpc.d = defpackage.dpb.a("google.internal.tasks.v1.TasksApiService", "Mutate");
                    dpc.h = true;
                    dpc.a = defpackage.eaa.a(defpackage.daz.b);
                    dpc.b = defpackage.eaa.a(defpackage.dba.d);
                    dpb = dpc.a();
                    b = dpb;
                }
            }
        }
        return dpb;
    }

    public static defpackage.dpb c() {
        defpackage.dpb dpb = c;
        if (dpb == null) {
            synchronized (defpackage.dcg.class) {
                dpb = c;
                if (dpb == null) {
                    defpackage.dpc dpc = new defpackage.dpc();
                    dpc.a = null;
                    dpc.b = null;
                    dpc.c = defpackage.dpe.UNARY;
                    dpc.d = defpackage.dpb.a("google.internal.tasks.v1.TasksApiService", "CheckVersion");
                    dpc.h = true;
                    dpc.a = defpackage.eaa.a(defpackage.czm.c);
                    dpc.b = defpackage.eaa.a(defpackage.czp.b);
                    dpb = dpc.a();
                    c = dpb;
                }
            }
        }
        return dpb;
    }

    public static defpackage.dpb d() {
        defpackage.dpb dpb = d;
        if (dpb == null) {
            synchronized (defpackage.dcg.class) {
                dpb = d;
                if (dpb == null) {
                    defpackage.dpc dpc = new defpackage.dpc();
                    dpc.a = null;
                    dpc.b = null;
                    dpc.c = defpackage.dpe.UNARY;
                    dpc.d = defpackage.dpb.a("google.internal.tasks.v1.TasksApiService", "Setup");
                    dpc.h = true;
                    dpc.a = defpackage.eaa.a(defpackage.dbv.b);
                    dpc.b = defpackage.eaa.a(defpackage.dbx.a);
                    dpb = dpc.a();
                    d = dpb;
                }
            }
        }
        return dpb;
    }

    public static defpackage.ead a(defpackage.dnc dnc) {
        return new defpackage.ead(dnc, 0);
    }

    static {
        a();
        b();
        c();
        d();
    }
}
