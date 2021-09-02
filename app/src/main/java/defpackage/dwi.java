package defpackage;

/* renamed from: dwi reason: default package */
/* compiled from: PG */
final class dwi implements defpackage.dxc {
    private final /* synthetic */ defpackage.dwf a;

    dwi(defpackage.dwf dwf) {
        this.a = dwf;
    }

    public final void a(defpackage.dpw dpw) {
        defpackage.cld.b(this.a.A.get(), (java.lang.Object) "Channel must have been shut down");
    }

    public final void a() {
    }

    public final void a(boolean z) {
        this.a.O.a(this.a.y, z);
    }

    public final void b() {
        defpackage.cld.b(this.a.A.get(), (java.lang.Object) "Channel must have been shut down");
        this.a.B = true;
        this.a.a(false);
        defpackage.dwf dwf = this.a;
        if (!dwf.C && dwf.A.get() && dwf.w.isEmpty() && dwf.x.isEmpty()) {
            defpackage.dwf.a.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImpl", "maybeTerminateChannel", "[{0}] Terminated", dwf.d);
            defpackage.dsp.b(dwf.G.b, dwf);
            dwf.C = true;
            dwf.D.countDown();
            dwf.j.a(dwf.i);
            dwf.h.close();
        }
    }
}
