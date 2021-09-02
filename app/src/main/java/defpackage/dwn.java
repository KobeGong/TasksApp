package defpackage;

/* renamed from: dwn reason: default package */
/* compiled from: PG */
final class dwn implements java.lang.Runnable {
    public boolean a;
    private final /* synthetic */ defpackage.dwf b;

    dwn(defpackage.dwf dwf) {
        this.b = dwf;
    }

    public final void run() {
        if (!this.a) {
            defpackage.dwf dwf = this.b;
            defpackage.dwf.a.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImpl", "enterIdleMode", "[{0}] Entering idle mode", dwf.d);
            dwf.a(true);
            dwf.y.a((defpackage.doq) null);
            dwf.s = defpackage.dwf.a(dwf.e, dwf.f, dwf.g);
            dwf.p.a(defpackage.dnq.IDLE);
        }
    }
}
