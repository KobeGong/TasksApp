package defpackage;

/* renamed from: bbb reason: default package */
/* compiled from: PG */
public final class bbb extends android.os.Handler {
    private /* synthetic */ defpackage.bba a;

    public bbb(defpackage.bba bba, android.os.Looper looper) {
        this.a = bba;
        super(looper);
    }

    public final void handleMessage(android.os.Message message) {
        boolean z = true;
        if (message.what != 1) {
            z = false;
        }
        defpackage.azb.b(z);
        defpackage.bbd bbd = (defpackage.bbd) message.obj;
        java.lang.Object obj = this.a.b;
        if (obj != null) {
            try {
                defpackage.bly bly = (defpackage.bly) obj;
                bly.a.a(bbd.a, bbd.b, bbd.c);
            } catch (java.lang.RuntimeException e) {
                throw e;
            }
        }
    }
}
