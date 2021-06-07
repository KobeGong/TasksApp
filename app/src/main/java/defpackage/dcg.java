package defpackage;

/* renamed from: dcg  reason: default package */
/* compiled from: PG */
public final class dcg {
    private static volatile dpb a;
    private static volatile dpb b;
    private static volatile dpb c;
    private static volatile dpb d;

    private dcg() {
    }

    public static dpb a() {
        dpb dpb = a;
        if (dpb == null) {
            synchronized (dcg.class) {
                dpb = a;
                if (dpb == null) {
                    dpc dpc = new dpc();
                    dpc.a = null;
                    dpc.b = null;
                    dpc.c = dpe.UNARY;
                    dpc.d = dpb.a("google.internal.tasks.v1.TasksApiService", "Query");
                    dpc.h = true;
                    dpc.a = eaa.a(dbs.b);
                    dpc.b = eaa.a(dbt.b);
                    dpb = dpc.a();
                    a = dpb;
                }
            }
        }
        return dpb;
    }

    public static dpb b() {
        dpb dpb = b;
        if (dpb == null) {
            synchronized (dcg.class) {
                dpb = b;
                if (dpb == null) {
                    dpc dpc = new dpc();
                    dpc.a = null;
                    dpc.b = null;
                    dpc.c = dpe.UNARY;
                    dpc.d = dpb.a("google.internal.tasks.v1.TasksApiService", "Mutate");
                    dpc.h = true;
                    dpc.a = eaa.a(daz.b);
                    dpc.b = eaa.a(dba.d);
                    dpb = dpc.a();
                    b = dpb;
                }
            }
        }
        return dpb;
    }

    public static dpb c() {
        dpb dpb = c;
        if (dpb == null) {
            synchronized (dcg.class) {
                dpb = c;
                if (dpb == null) {
                    dpc dpc = new dpc();
                    dpc.a = null;
                    dpc.b = null;
                    dpc.c = dpe.UNARY;
                    dpc.d = dpb.a("google.internal.tasks.v1.TasksApiService", "CheckVersion");
                    dpc.h = true;
                    dpc.a = eaa.a(czm.c);
                    dpc.b = eaa.a(czp.b);
                    dpb = dpc.a();
                    c = dpb;
                }
            }
        }
        return dpb;
    }

    public static dpb d() {
        dpb dpb = d;
        if (dpb == null) {
            synchronized (dcg.class) {
                dpb = d;
                if (dpb == null) {
                    dpc dpc = new dpc();
                    dpc.a = null;
                    dpc.b = null;
                    dpc.c = dpe.UNARY;
                    dpc.d = dpb.a("google.internal.tasks.v1.TasksApiService", "Setup");
                    dpc.h = true;
                    dpc.a = eaa.a(dbv.b);
                    dpc.b = eaa.a(dbx.a);
                    dpb = dpc.a();
                    d = dpb;
                }
            }
        }
        return dpb;
    }

    public static ead a(dnc dnc) {
        return new ead(dnc, (byte) 0);
    }

    static {
        a();
        b();
        c();
        d();
    }
}
