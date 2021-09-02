package defpackage;

/* renamed from: dwp reason: default package */
/* compiled from: PG */
final class dwp extends defpackage.dvz {
    private final /* synthetic */ defpackage.dww a;
    private final /* synthetic */ defpackage.dwo b;

    dwp(defpackage.dwo dwo, defpackage.dww dww) {
        this.b = dwo;
        this.a = dww;
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.dvq dvq) {
        this.b.c.w.remove(dvq);
        defpackage.dsp.b(this.b.c.G.c, dvq);
        defpackage.dwf dwf = this.b.c;
        if (!dwf.C && dwf.A.get() && dwf.w.isEmpty() && dwf.x.isEmpty()) {
            defpackage.dwf.a.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImpl", "maybeTerminateChannel", "[{0}] Terminated", dwf.d);
            defpackage.dsp.b(dwf.G.b, dwf);
            dwf.C = true;
            dwf.D.countDown();
            dwf.j.a(dwf.i);
            dwf.h.close();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.dnr dnr) {
        defpackage.dwo dwo = this.b;
        if (dnr.a == defpackage.dnq.TRANSIENT_FAILURE || dnr.a == defpackage.dnq.IDLE) {
            dwo.b.c();
        }
        if (this.b == this.b.c.t) {
            this.b.a.a((defpackage.dop) this.a, dnr);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b(defpackage.dvq dvq) {
        this.b.c.O.a(dvq, true);
    }

    /* access modifiers changed from: 0000 */
    public final void c(defpackage.dvq dvq) {
        this.b.c.O.a(dvq, false);
    }
}
