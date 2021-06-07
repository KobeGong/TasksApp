package defpackage;

import java.util.concurrent.ExecutionException;

/* renamed from: cxp  reason: default package */
/* compiled from: PG */
final class cxp implements Runnable {
    private final /* synthetic */ cyi a;
    private final /* synthetic */ cxo b;

    cxp(cxo cxo, int i, cyi cyi) {
        this.b = cxo;
        this.a = cyi;
    }

    public final void run() {
        boolean z = false;
        try {
            cxo cxo = this.b;
            cyi cyi = this.a;
            if (cxo.b || !cxo.c.isDone() || cxo.c.isCancelled()) {
                z = true;
            }
            cld.b(z, "Future was done before all dependencies completed");
            try {
                cld.b(cyi.isDone(), "Tried to set value from future which is not done");
                if (cxo.b) {
                    if (cyi.isCancelled()) {
                        cxo.c.f = null;
                        cxo.c.cancel(false);
                    } else {
                        cyd.b(cyi);
                    }
                }
            } catch (ExecutionException e) {
                cxo.a(e.getCause());
            } catch (Throwable th) {
                cxo.a(th);
            }
        } finally {
            this.b.a();
        }
    }
}
