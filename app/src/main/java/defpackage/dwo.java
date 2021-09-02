package defpackage;

/* renamed from: dwo reason: default package */
/* compiled from: PG */
public final class dwo extends defpackage.dom {
    public defpackage.dok a;
    public final defpackage.dpf b;
    public final /* synthetic */ defpackage.dwf c;

    dwo(defpackage.dwf dwf, defpackage.dpf dpf) {
        this.c = dwf;
        this.b = (defpackage.dpf) defpackage.cld.a((java.lang.Object) dpf, (java.lang.Object) "NameResolver");
    }

    public final void a(defpackage.dnq dnq, defpackage.doq doq) {
        defpackage.cld.a((java.lang.Object) dnq, (java.lang.Object) "newState");
        defpackage.cld.a((java.lang.Object) doq, (java.lang.Object) "newPicker");
        a(new defpackage.dwr(this, doq, dnq));
    }

    public final void a(defpackage.dop dop, defpackage.doe doe) {
        defpackage.dxb dxb;
        defpackage.cld.a(dop instanceof defpackage.dww, (java.lang.Object) "subchannel must have been returned from createSubchannel");
        defpackage.dvq dvq = ((defpackage.dww) dop).a;
        try {
            synchronized (dvq.g) {
                defpackage.doe doe2 = dvq.i;
                dvq.i = doe;
                if (dvq.s.a == defpackage.dnq.READY || dvq.s.a == defpackage.dnq.CONNECTING) {
                    int indexOf = doe.a.indexOf((java.net.SocketAddress) doe2.a.get(dvq.j));
                    if (indexOf != -1) {
                        dvq.j = indexOf;
                        dxb = null;
                    } else if (dvq.s.a == defpackage.dnq.READY) {
                        dxb = dvq.r;
                        dvq.r = null;
                        dvq.j = 0;
                        dvq.a(defpackage.dnq.IDLE);
                    } else {
                        dxb = dvq.q;
                        dvq.q = null;
                        dvq.j = 0;
                        dvq.c();
                    }
                } else {
                    dxb = null;
                }
            }
            if (dxb != null) {
                dxb.a(defpackage.dpw.i.a("InternalSubchannel closed transport due to address change"));
            }
        } finally {
            dvq.h.a();
        }
    }

    public final void a(java.lang.Runnable runnable) {
        this.c.k.a(runnable).a();
    }

    public final /* synthetic */ defpackage.dop a(defpackage.doe doe, defpackage.dmv dmv) {
        defpackage.cld.a((java.lang.Object) doe, (java.lang.Object) "addressGroup");
        defpackage.cld.a((java.lang.Object) dmv, (java.lang.Object) "attrs");
        defpackage.cld.b(!this.c.C, (java.lang.Object) "Channel is terminated");
        defpackage.dww dww = new defpackage.dww(this.c, dmv);
        java.lang.String a2 = this.c.a();
        java.lang.String str = this.c.r;
        defpackage.dro dro = this.c.q;
        defpackage.dtc dtc = this.c.h;
        java.util.concurrent.ScheduledExecutorService a3 = this.c.h.a();
        defpackage.csd csd = this.c.o;
        defpackage.dso dso = this.c.k;
        defpackage.dwp dwp = new defpackage.dwp(this, dww);
        defpackage.dsp dsp = this.c.G;
        defpackage.drx drx = this.c.E;
        defpackage.dvq dvq = new defpackage.dvq(doe, a2, str, dro, dtc, a3, csd, dso, dwp, dsp, defpackage.drx.a());
        defpackage.dsp.a(this.c.G.c, dvq);
        dww.a = dvq;
        defpackage.dwf.a.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImpl$LbHelperImpl", "createSubchannel", "[{0}] {1} created for {2}", new java.lang.Object[]{this.c.d, dvq.b, doe});
        a(new defpackage.dwq(this, dvq));
        return dww;
    }
}
