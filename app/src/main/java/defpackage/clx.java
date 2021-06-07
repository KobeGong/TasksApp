package defpackage;

import android.app.Application;

/* access modifiers changed from: package-private */
/* renamed from: clx  reason: default package */
/* compiled from: PG */
public final class clx extends cgj {
    static synchronized clx a(coe coe, Application application, clt clt, clm clm) {
        clx clx;
        synchronized (clx.class) {
            clx = new clx(coe, application, clt, clm.c, 1.0f);
        }
        return clx;
    }

    static synchronized clx a(coe coe, Application application, clt clt, clp clp) {
        clx clx;
        synchronized (clx.class) {
            float f = clp.c;
            int i = clp.d;
            int i2 = clp.e;
            clx = new clx(coe, application, clt, 10, f);
        }
        return clx;
    }

    clx(coe coe, Application application, clt clt, int i, float f) {
        super(coe, application, clt, bg.aa, i);
        new coa(f);
        cob.a(clo.a);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cgj
    public final void d() {
        cob.b(clo.a);
    }
}
