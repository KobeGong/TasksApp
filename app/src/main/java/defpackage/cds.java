package defpackage;

/* renamed from: cds reason: default package */
/* compiled from: PG */
public class cds implements defpackage.cdp {
    private static final java.lang.String b = defpackage.cds.class.getSimpleName();
    public final java.util.concurrent.Executor a;
    private final android.content.Context c;
    private final defpackage.bsa d;
    private final defpackage.cql e;

    cds(android.content.Context context, defpackage.bsa bsa, defpackage.cql cql) {
        this(context, bsa, cql, android.os.AsyncTask.THREAD_POOL_EXECUTOR);
    }

    private cds(android.content.Context context, defpackage.bsa bsa, defpackage.cql cql, java.util.concurrent.Executor executor) {
        this.c = (android.content.Context) defpackage.cky.a((java.lang.Object) context);
        this.d = (defpackage.bsa) defpackage.cky.a((java.lang.Object) bsa);
        this.e = (defpackage.cql) defpackage.cky.a((java.lang.Object) cql);
        this.a = (java.util.concurrent.Executor) defpackage.cky.a((java.lang.Object) executor);
    }

    public final /* synthetic */ void a(java.lang.Object obj, int i, defpackage.cdq cdq) {
        int i2 = 2;
        defpackage.cdu cdu = (defpackage.cdu) obj;
        if (!this.e.a() && !this.e.b()) {
            android.util.Log.w(b, "Client is not connected, no image could be loaded");
            cdq.a(null);
        }
        defpackage.bsa bsa = this.d;
        defpackage.cql cql = this.e;
        java.lang.String b2 = cdu.b();
        if (i > 0) {
            float f = ((float) i) / this.c.getResources().getDisplayMetrics().density;
            if (f > 64.0f) {
                i2 = 3;
            } else if (f <= 48.0f) {
                i2 = f > 32.0f ? 1 : 0;
            }
        }
        bsa.a(cql, b2, i2).a(new defpackage.cgl(this, cdq));
    }
}
