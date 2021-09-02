package defpackage;

/* renamed from: cka reason: default package */
/* compiled from: PG */
final class cka implements java.lang.Runnable {
    private final /* synthetic */ defpackage.eht a;
    private final /* synthetic */ defpackage.cjz b;

    cka(defpackage.cjz cjz, defpackage.eht eht) {
        this.b = cjz;
        this.a = eht;
    }

    public final void run() {
        if (!defpackage.cjg.a().b()) {
            defpackage.cdm.a(4, "PrimesCronetExtension", "Network metric disabled. Skip initializing network monitor.", new java.lang.Object[0]);
            return;
        }
        synchronized (this.b.b) {
            if (this.b.c == null) {
                if (defpackage.cjg.a().a.a((defpackage.cls) new defpackage.ckb(this.b))) {
                    this.b.c = (defpackage.ehy) this.a;
                    this.b.a = new defpackage.ckz((java.util.concurrent.Executor) defpackage.cjg.a().a.b().a());
                    this.b.c.a(this.b.a);
                }
            } else if (this.b.c.equals(this.a)) {
                defpackage.cdm.a(5, "PrimesCronetExtension", "Network monitoring is already started for the specified CronetEngine object, startNetworkMonitor() call is ignored", new java.lang.Object[0]);
            } else {
                defpackage.cdm.a(5, "PrimesCronetExtension", "Only 1 CronetEngine monitoring is supported, startNetworkMonitor() call is ignored", new java.lang.Object[0]);
            }
        }
    }
}
