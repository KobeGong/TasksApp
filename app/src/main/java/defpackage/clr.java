package defpackage;

/* renamed from: clr reason: default package */
/* compiled from: PG */
public final class clr {
    public volatile boolean a;
    private final java.util.List b;

    public clr() {
        this.b = new java.util.ArrayList();
    }

    public final synchronized void a() {
        if (!this.a) {
            this.a = true;
            defpackage.cdm.a(3, "PrimesShutdown", "Shutdown ...", new java.lang.Object[0]);
            synchronized (this.b) {
                for (defpackage.cls a2 : this.b) {
                    try {
                        a2.a();
                    } catch (java.lang.RuntimeException e) {
                        defpackage.cdm.a("PrimesShutdown", "ShutdownListener crashed", (java.lang.Throwable) e, new java.lang.Object[0]);
                    }
                }
                this.b.clear();
                defpackage.cdm.a(3, "PrimesShutdown", "All ShutdownListeners notified.", new java.lang.Object[0]);
            }
        }
    }

    public final void a(defpackage.clt clt) {
        if (!this.a && ((java.lang.Boolean) clt.a()).booleanValue()) {
            a();
        }
    }

    public final boolean a(defpackage.cls cls) {
        boolean z;
        synchronized (this.b) {
            if (!this.a) {
                this.b.add((defpackage.cls) defpackage.cky.a((java.lang.Object) cls));
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public clr(byte b2) {
        this();
    }
}
