package defpackage;

/* renamed from: dvq reason: default package */
/* compiled from: PG */
final class dvq implements defpackage.dzw {
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.dvq.class.getName());
    public final defpackage.dwd b = defpackage.dwd.a(getClass().getName());
    public final defpackage.dro c;
    public final defpackage.dvz d;
    public final java.util.concurrent.ScheduledExecutorService e;
    public final defpackage.dsp f;
    public final java.lang.Object g = new java.lang.Object();
    public final defpackage.dso h;
    public defpackage.doe i;
    public int j;
    public defpackage.drn k;
    public final defpackage.csb l;
    public java.util.concurrent.ScheduledFuture m;
    public boolean n;
    public final java.util.Collection o = new java.util.ArrayList();
    public final defpackage.dvp p = new defpackage.dvr(this);
    public defpackage.dth q;
    public volatile defpackage.dxb r;
    public defpackage.dnr s = defpackage.dnr.a(defpackage.dnq.IDLE);
    public defpackage.dpw t;
    private final java.lang.String u;
    private final java.lang.String v;
    private final defpackage.dtc w;
    private final defpackage.drw x;

    dvq(defpackage.doe doe, java.lang.String str, java.lang.String str2, defpackage.dro dro, defpackage.dtc dtc, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.csd csd, defpackage.dso dso, defpackage.dvz dvz, defpackage.dsp dsp, defpackage.drw drw) {
        this.i = (defpackage.doe) defpackage.cld.a((java.lang.Object) doe, (java.lang.Object) "addressGroup");
        this.u = str;
        this.v = str2;
        this.c = dro;
        this.w = dtc;
        this.e = scheduledExecutorService;
        this.l = (defpackage.csb) csd.b();
        this.h = dso;
        this.d = dvz;
        this.f = dsp;
        this.x = drw;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        r3.h.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.dtb a() {
        /*
            r3 = this;
            dxb r0 = r3.r
            if (r0 == 0) goto L_0x0005
        L_0x0004:
            return r0
        L_0x0005:
            java.lang.Object r1 = r3.g     // Catch:{ all -> 0x002e }
            monitor-enter(r1)     // Catch:{ all -> 0x002e }
            dxb r0 = r3.r     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0013
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            dso r1 = r3.h
            r1.a()
            goto L_0x0004
        L_0x0013:
            dnr r0 = r3.s     // Catch:{ all -> 0x002b }
            dnq r0 = r0.a     // Catch:{ all -> 0x002b }
            dnq r2 = defpackage.dnq.IDLE     // Catch:{ all -> 0x002b }
            if (r0 != r2) goto L_0x0023
            dnq r0 = defpackage.dnq.CONNECTING     // Catch:{ all -> 0x002b }
            r3.a(r0)     // Catch:{ all -> 0x002b }
            r3.c()     // Catch:{ all -> 0x002b }
        L_0x0023:
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            dso r0 = r3.h
            r0.a()
            r0 = 0
            goto L_0x0004
        L_0x002b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            throw r0     // Catch:{ all -> 0x002e }
        L_0x002e:
            r0 = move-exception
            dso r1 = r3.h
            r1.a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvq.a():dtb");
    }

    /* access modifiers changed from: 0000 */
    public final void c() {
        java.net.SocketAddress socketAddress;
        defpackage.cld.b(this.m == null, (java.lang.Object) "Should have no reconnectTask scheduled");
        if (this.j == 0) {
            defpackage.csb csb = this.l;
            csb.c = 0;
            csb.b = false;
            csb.a();
        }
        java.net.SocketAddress socketAddress2 = (java.net.SocketAddress) this.i.a.get(this.j);
        defpackage.dxu dxu = null;
        if (socketAddress2 instanceof defpackage.dxo) {
            dxu = (defpackage.dxu) ((defpackage.dxo) socketAddress2).b.a(defpackage.dxq.a);
            socketAddress = ((defpackage.dxo) socketAddress2).a;
        } else {
            socketAddress = socketAddress2;
        }
        defpackage.dvw dvw = new defpackage.dvw(this.w.a(socketAddress, this.u, this.v, dxu), this.x);
        defpackage.dsp.a(this.f.d, dvw);
        if (a.isLoggable(java.util.logging.Level.FINE)) {
            a.logp(java.util.logging.Level.FINE, "io.grpc.internal.InternalSubchannel", "startNewTransport", "[{0}] Created {1} for {2}", new java.lang.Object[]{this.b, dvw.b(), socketAddress});
        }
        this.q = dvw;
        this.o.add(dvw);
        java.lang.Runnable a2 = dvw.a((defpackage.dxc) new defpackage.dwa(this, dvw, socketAddress));
        if (a2 != null) {
            this.h.a(a2);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.dnq dnq) {
        a(defpackage.dnr.a(dnq));
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.dnr dnr) {
        if (this.s.a != dnr.a) {
            boolean z = this.s.a != defpackage.dnq.SHUTDOWN;
            java.lang.String valueOf = java.lang.String.valueOf(dnr);
            defpackage.cld.b(z, (java.lang.Object) new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 37).append("Cannot transition out of SHUTDOWN to ").append(valueOf).toString());
            this.s = dnr;
            this.h.a((java.lang.Runnable) new defpackage.dvt(this, dnr));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        r9.h.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0063, code lost:
        if (r7 == null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        r7.a(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        if (r8 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        r8.a(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.dpw r10) {
        /*
            r9 = this;
            java.lang.Object r6 = r9.g     // Catch:{ all -> 0x0071 }
            monitor-enter(r6)     // Catch:{ all -> 0x0071 }
            dnr r0 = r9.s     // Catch:{ all -> 0x006e }
            dnq r0 = r0.a     // Catch:{ all -> 0x006e }
            dnq r1 = defpackage.dnq.SHUTDOWN     // Catch:{ all -> 0x006e }
            if (r0 != r1) goto L_0x0012
            monitor-exit(r6)     // Catch:{ all -> 0x006e }
            dso r0 = r9.h
            r0.a()
        L_0x0011:
            return
        L_0x0012:
            r9.t = r10     // Catch:{ all -> 0x006e }
            dnq r0 = defpackage.dnq.SHUTDOWN     // Catch:{ all -> 0x006e }
            r9.a(r0)     // Catch:{ all -> 0x006e }
            dxb r7 = r9.r     // Catch:{ all -> 0x006e }
            dth r8 = r9.q     // Catch:{ all -> 0x006e }
            r0 = 0
            r9.r = r0     // Catch:{ all -> 0x006e }
            r0 = 0
            r9.q = r0     // Catch:{ all -> 0x006e }
            r0 = 0
            r9.j = r0     // Catch:{ all -> 0x006e }
            java.util.Collection r0 = r9.o     // Catch:{ all -> 0x006e }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x004a
            r9.d()     // Catch:{ all -> 0x006e }
            java.util.logging.Logger r0 = a     // Catch:{ all -> 0x006e }
            java.util.logging.Level r1 = java.util.logging.Level.FINE     // Catch:{ all -> 0x006e }
            boolean r0 = r0.isLoggable(r1)     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x004a
            java.util.logging.Logger r0 = a     // Catch:{ all -> 0x006e }
            java.util.logging.Level r1 = java.util.logging.Level.FINE     // Catch:{ all -> 0x006e }
            java.lang.String r2 = "io.grpc.internal.InternalSubchannel"
            java.lang.String r3 = "shutdown"
            java.lang.String r4 = "[{0}] Terminated in shutdown()"
            dwd r5 = r9.b     // Catch:{ all -> 0x006e }
            r0.logp(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x006e }
        L_0x004a:
            java.util.concurrent.ScheduledFuture r0 = r9.m     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x005d
            java.util.concurrent.ScheduledFuture r0 = r9.m     // Catch:{ all -> 0x006e }
            r1 = 0
            r0.cancel(r1)     // Catch:{ all -> 0x006e }
            r0 = 1
            r9.n = r0     // Catch:{ all -> 0x006e }
            r0 = 0
            r9.m = r0     // Catch:{ all -> 0x006e }
            r0 = 0
            r9.k = r0     // Catch:{ all -> 0x006e }
        L_0x005d:
            monitor-exit(r6)     // Catch:{ all -> 0x006e }
            dso r0 = r9.h
            r0.a()
            if (r7 == 0) goto L_0x0068
            r7.a(r10)
        L_0x0068:
            if (r8 == 0) goto L_0x0011
            r8.a(r10)
            goto L_0x0011
        L_0x006e:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x006e }
            throw r0     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r0 = move-exception
            dso r1 = r9.h
            r1.a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvq.a(dpw):void");
    }

    /* access modifiers changed from: 0000 */
    public final void d() {
        this.h.a((java.lang.Runnable) new defpackage.dvu(this));
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.dth dth, boolean z) {
        this.h.a((java.lang.Runnable) new defpackage.dvv(this, dth, z)).a();
    }

    public final defpackage.dwd b() {
        return this.b;
    }
}
