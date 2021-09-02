package defpackage;

/* renamed from: clx reason: default package */
/* compiled from: PG */
final class clx extends defpackage.cgj {
    static synchronized defpackage.clx a(defpackage.coe coe, android.app.Application application, defpackage.clt clt, defpackage.clm clm) {
        defpackage.clx clx;
        synchronized (defpackage.clx.class) {
            clx = new defpackage.clx(coe, application, clt, clm.c, 1.0f);
        }
        return clx;
    }

    static synchronized defpackage.clx a(defpackage.coe coe, android.app.Application application, defpackage.clt clt, defpackage.clp clp) {
        defpackage.clx clx;
        synchronized (defpackage.clx.class) {
            float f = clp.c;
            int i = clp.d;
            int i2 = clp.e;
            clx = new defpackage.clx(coe, application, clt, 10, f);
        }
        return clx;
    }

    clx(defpackage.coe coe, android.app.Application application, defpackage.clt clt, int i, float f) {
        super(coe, application, clt, defpackage.bg.aa, i);
        new defpackage.coa(f);
        defpackage.cob.a(defpackage.clo.a);
    }

    /* access modifiers changed from: 0000 */
    public final void d() {
        defpackage.cob.b(defpackage.clo.a);
    }
}
