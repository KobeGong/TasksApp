package defpackage;

/* renamed from: cxp reason: default package */
/* compiled from: PG */
final class cxp implements java.lang.Runnable {
    private final /* synthetic */ defpackage.cyi a;
    private final /* synthetic */ defpackage.cxo b;

    cxp(defpackage.cxo cxo, int i, defpackage.cyi cyi) {
        this.b = cxo;
        this.a = cyi;
    }

    public final void run() {
        defpackage.cxo cxo;
        boolean z = false;
        try {
            cxo = this.b;
            defpackage.cyi cyi = this.a;
            if (cxo.b || !cxo.c.isDone() || cxo.c.isCancelled()) {
                z = true;
            }
            defpackage.cld.b(z, (java.lang.Object) "Future was done before all dependencies completed");
            defpackage.cld.b(cyi.isDone(), (java.lang.Object) "Tried to set value from future which is not done");
            if (cxo.b) {
                if (cyi.isCancelled()) {
                    cxo.c.f = null;
                    cxo.c.cancel(false);
                } else {
                    defpackage.cyd.b(cyi);
                }
            }
        } catch (java.util.concurrent.ExecutionException e) {
            cxo.a(e.getCause());
        } catch (Throwable th) {
            this.b.a();
            throw th;
        }
        this.b.a();
    }
}
