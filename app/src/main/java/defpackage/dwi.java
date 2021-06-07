package defpackage;

import java.util.logging.Level;

/* access modifiers changed from: package-private */
/* renamed from: dwi  reason: default package */
/* compiled from: PG */
public final class dwi implements dxc {
    private final /* synthetic */ dwf a;

    dwi(dwf dwf) {
        this.a = dwf;
    }

    @Override // defpackage.dxc
    public final void a(dpw dpw) {
        cld.b(this.a.A.get(), "Channel must have been shut down");
    }

    @Override // defpackage.dxc
    public final void a() {
    }

    @Override // defpackage.dxc
    public final void a(boolean z) {
        this.a.O.a(this.a.y, z);
    }

    @Override // defpackage.dxc
    public final void b() {
        cld.b(this.a.A.get(), "Channel must have been shut down");
        this.a.B = true;
        this.a.a(false);
        dwf dwf = this.a;
        if (!dwf.C && dwf.A.get() && dwf.w.isEmpty() && dwf.x.isEmpty()) {
            dwf.a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImpl", "maybeTerminateChannel", "[{0}] Terminated", dwf.d);
            dsp.b(dwf.G.b, dwf);
            dwf.C = true;
            dwf.D.countDown();
            dwf.j.a(dwf.i);
            dwf.h.close();
        }
    }
}
