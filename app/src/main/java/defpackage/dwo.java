package defpackage;

import java.net.SocketAddress;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;

/* renamed from: dwo  reason: default package */
/* compiled from: PG */
public final class dwo extends dom {
    public dok a;
    public final dpf b;
    public final /* synthetic */ dwf c;

    dwo(dwf dwf, dpf dpf) {
        this.c = dwf;
        this.b = (dpf) cld.a(dpf, "NameResolver");
    }

    @Override // defpackage.dom
    public final void a(dnq dnq, doq doq) {
        cld.a(dnq, "newState");
        cld.a(doq, "newPicker");
        a(new dwr(this, doq, dnq));
    }

    @Override // defpackage.dom
    public final void a(dop dop, doe doe) {
        dxb dxb;
        cld.a(dop instanceof dww, "subchannel must have been returned from createSubchannel");
        dvq dvq = ((dww) dop).a;
        try {
            synchronized (dvq.g) {
                doe doe2 = dvq.i;
                dvq.i = doe;
                if (dvq.s.a == dnq.READY || dvq.s.a == dnq.CONNECTING) {
                    int indexOf = doe.a.indexOf((SocketAddress) doe2.a.get(dvq.j));
                    if (indexOf != -1) {
                        dvq.j = indexOf;
                        dxb = null;
                    } else if (dvq.s.a == dnq.READY) {
                        dxb = dvq.r;
                        dvq.r = null;
                        dvq.j = 0;
                        dvq.a(dnq.IDLE);
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
                dxb.a(dpw.i.a("InternalSubchannel closed transport due to address change"));
            }
        } finally {
            dvq.h.a();
        }
    }

    public final void a(Runnable runnable) {
        this.c.k.a(runnable).a();
    }

    @Override // defpackage.dom
    public final /* synthetic */ dop a(doe doe, dmv dmv) {
        cld.a(doe, "addressGroup");
        cld.a(dmv, "attrs");
        cld.b(!this.c.C, "Channel is terminated");
        dww dww = new dww(this.c, dmv);
        String a2 = this.c.a();
        String str = this.c.r;
        dro dro = this.c.q;
        dtc dtc = this.c.h;
        ScheduledExecutorService a3 = this.c.h.a();
        csd csd = this.c.o;
        dso dso = this.c.k;
        dwp dwp = new dwp(this, dww);
        dsp dsp = this.c.G;
        drx drx = this.c.E;
        dvq dvq = new dvq(doe, a2, str, dro, dtc, a3, csd, dso, dwp, dsp, drx.a());
        dsp.a(this.c.G.c, dvq);
        dww.a = dvq;
        dwf.a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImpl$LbHelperImpl", "createSubchannel", "[{0}] {1} created for {2}", new Object[]{this.c.d, dvq.b, doe});
        a(new dwq(this, dvq));
        return dww;
    }
}
