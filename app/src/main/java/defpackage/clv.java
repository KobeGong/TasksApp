package defpackage;

/* renamed from: clv reason: default package */
/* compiled from: PG */
final class clv extends defpackage.cgj {
    public final defpackage.cky d;
    private final java.util.concurrent.ConcurrentHashMap e = new java.util.concurrent.ConcurrentHashMap();

    static defpackage.efx a(defpackage.clu clu, java.lang.String str) {
        defpackage.efx efx = new defpackage.efx();
        defpackage.egc egc = new defpackage.egc();
        egc.a = java.lang.Long.valueOf(clu.b - clu.a);
        egc.b = clu.c - 1;
        efx.d = egc;
        if (str != null) {
            efx.u = new defpackage.edd();
            efx.u.a = str;
        }
        return efx;
    }

    clv(defpackage.coe coe, android.app.Application application, defpackage.clt clt, int i, defpackage.cky cky) {
        super(coe, application, clt, defpackage.bg.Z, i);
        this.d = cky;
    }

    /* access modifiers changed from: 0000 */
    public final void d() {
        this.e.clear();
    }

    static {
        new java.util.HashSet(java.util.Arrays.asList(new java.lang.String[]{"Cold startup", "Cold startup interactive", "Cold startup interactive before onDraw", "Warm startup", "Warm startup interactive", "Warm startup interactive before onDraw", "Warm startup activity onStart"}));
    }
}
