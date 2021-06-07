package defpackage;

import java.util.logging.Level;

/* renamed from: dwp  reason: default package */
/* compiled from: PG */
final class dwp extends dvz {
    private final /* synthetic */ dww a;
    private final /* synthetic */ dwo b;

    dwp(dwo dwo, dww dww) {
        this.b = dwo;
        this.a = dww;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.dvz
    public final void a(dvq dvq) {
        this.b.c.w.remove(dvq);
        dsp.b(this.b.c.G.c, dvq);
        dwf dwf = this.b.c;
        if (!dwf.C && dwf.A.get() && dwf.w.isEmpty() && dwf.x.isEmpty()) {
            dwf.a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImpl", "maybeTerminateChannel", "[{0}] Terminated", dwf.d);
            dsp.b(dwf.G.b, dwf);
            dwf.C = true;
            dwf.D.countDown();
            dwf.j.a(dwf.i);
            dwf.h.close();
        }
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.dvz
    public final void a(dnr dnr) {
        dwo dwo = this.b;
        if (dnr.a == dnq.TRANSIENT_FAILURE || dnr.a == dnq.IDLE) {
            dwo.b.c();
        }
        if (this.b == this.b.c.t) {
            this.b.a.a(this.a, dnr);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.dvz
    public final void b(dvq dvq) {
        this.b.c.O.a(dvq, true);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.dvz
    public final void c(dvq dvq) {
        this.b.c.O.a(dvq, false);
    }
}
