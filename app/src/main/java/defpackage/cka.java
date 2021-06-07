package defpackage;

import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: cka  reason: default package */
/* compiled from: PG */
public final class cka implements Runnable {
    private final /* synthetic */ eht a;
    private final /* synthetic */ cjz b;

    cka(cjz cjz, eht eht) {
        this.b = cjz;
        this.a = eht;
    }

    public final void run() {
        if (!cjg.a().b()) {
            cdm.a(4, "PrimesCronetExtension", "Network metric disabled. Skip initializing network monitor.", new Object[0]);
            return;
        }
        synchronized (this.b.b) {
            if (this.b.c == null) {
                if (cjg.a().a.a(new ckb(this.b))) {
                    this.b.c = (ehy) this.a;
                    this.b.a = new ckz((Executor) cjg.a().a.b().a());
                    this.b.c.a(this.b.a);
                }
            } else if (this.b.c.equals(this.a)) {
                cdm.a(5, "PrimesCronetExtension", "Network monitoring is already started for the specified CronetEngine object, startNetworkMonitor() call is ignored", new Object[0]);
            } else {
                cdm.a(5, "PrimesCronetExtension", "Only 1 CronetEngine monitoring is supported, startNetworkMonitor() call is ignored", new Object[0]);
            }
        }
    }
}
