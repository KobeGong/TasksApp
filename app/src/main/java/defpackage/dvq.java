package defpackage;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Level;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
/* renamed from: dvq  reason: default package */
/* compiled from: PG */
public final class dvq implements dzw {
    public static final Logger a = Logger.getLogger(dvq.class.getName());
    public final dwd b = dwd.a(getClass().getName());
    public final dro c;
    public final dvz d;
    public final ScheduledExecutorService e;
    public final dsp f;
    public final Object g = new Object();
    public final dso h;
    public doe i;
    public int j;
    public drn k;
    public final csb l;
    public ScheduledFuture m;
    public boolean n;
    public final Collection o = new ArrayList();
    public final dvp p = new dvr(this);
    public dth q;
    public volatile dxb r;
    public dnr s = dnr.a(dnq.IDLE);
    public dpw t;
    private final String u;
    private final String v;
    private final dtc w;
    private final drw x;

    dvq(doe doe, String str, String str2, dro dro, dtc dtc, ScheduledExecutorService scheduledExecutorService, csd csd, dso dso, dvz dvz, dsp dsp, drw drw) {
        this.i = (doe) cld.a(doe, "addressGroup");
        this.u = str;
        this.v = str2;
        this.c = dro;
        this.w = dtc;
        this.e = scheduledExecutorService;
        this.l = (csb) csd.b();
        this.h = dso;
        this.d = dvz;
        this.f = dsp;
        this.x = drw;
    }

    /* access modifiers changed from: package-private */
    public final dtb a() {
        dxb dxb = this.r;
        if (dxb != null) {
            return dxb;
        }
        try {
            synchronized (this.g) {
                dxb dxb2 = this.r;
                if (dxb2 != null) {
                    return dxb2;
                }
                if (this.s.a == dnq.IDLE) {
                    a(dnq.CONNECTING);
                    c();
                }
                this.h.a();
                return null;
            }
        } finally {
            this.h.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        SocketAddress socketAddress;
        cld.b(this.m == null, "Should have no reconnectTask scheduled");
        if (this.j == 0) {
            csb csb = this.l;
            csb.c = 0;
            csb.b = false;
            csb.a();
        }
        SocketAddress socketAddress2 = (SocketAddress) this.i.a.get(this.j);
        dxu dxu = null;
        if (socketAddress2 instanceof dxo) {
            dxu = (dxu) ((dxo) socketAddress2).b.a(dxq.a);
            socketAddress = ((dxo) socketAddress2).a;
        } else {
            socketAddress = socketAddress2;
        }
        dvw dvw = new dvw(this.w.a(socketAddress, this.u, this.v, dxu), this.x);
        dsp.a(this.f.d, dvw);
        if (a.isLoggable(Level.FINE)) {
            a.logp(Level.FINE, "io.grpc.internal.InternalSubchannel", "startNewTransport", "[{0}] Created {1} for {2}", new Object[]{this.b, dvw.b(), socketAddress});
        }
        this.q = dvw;
        this.o.add(dvw);
        Runnable a2 = dvw.a(new dwa(this, dvw, socketAddress));
        if (a2 != null) {
            this.h.a(a2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(dnq dnq) {
        a(dnr.a(dnq));
    }

    /* access modifiers changed from: package-private */
    public final void a(dnr dnr) {
        if (this.s.a != dnr.a) {
            boolean z = this.s.a != dnq.SHUTDOWN;
            String valueOf = String.valueOf(dnr);
            cld.b(z, new StringBuilder(String.valueOf(valueOf).length() + 37).append("Cannot transition out of SHUTDOWN to ").append(valueOf).toString());
            this.s = dnr;
            this.h.a(new dvt(this, dnr));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        r9.h.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0063, code lost:
        if (r7 == null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        r7.a(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
        if (r8 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006a, code lost:
        r8.a(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.dpw r10) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvq.a(dpw):void");
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        this.h.a(new dvu(this));
    }

    /* access modifiers changed from: package-private */
    public final void a(dth dth, boolean z) {
        this.h.a(new dvv(this, dth, z)).a();
    }

    @Override // defpackage.dzw
    public final dwd b() {
        return this.b;
    }
}
