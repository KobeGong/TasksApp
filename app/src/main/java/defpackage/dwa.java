package defpackage;

/* renamed from: dwa reason: default package */
/* compiled from: PG */
final class dwa implements defpackage.dxc {
    private final defpackage.dth a;
    private final java.net.SocketAddress b;
    private final /* synthetic */ defpackage.dvq c;

    dwa(defpackage.dvq dvq, defpackage.dth dth, java.net.SocketAddress socketAddress) {
        this.c = dvq;
        this.a = dth;
        this.b = socketAddress;
    }

    public final void a() {
        defpackage.dpw dpw;
        if (defpackage.dvq.a.isLoggable(java.util.logging.Level.FINE)) {
            defpackage.dvq.a.logp(java.util.logging.Level.FINE, "io.grpc.internal.InternalSubchannel$TransportListener", "transportReady", "[{0}] {1} for {2} is ready", new java.lang.Object[]{this.c.b, this.a.b(), this.b});
        }
        try {
            synchronized (this.c.g) {
                dpw = this.c.t;
                this.c.k = null;
                if (dpw != null) {
                    defpackage.cld.b(this.c.r == null, (java.lang.Object) "Unexpected non-null activeTransport");
                } else if (this.c.q == this.a) {
                    this.c.a(defpackage.dnq.READY);
                    this.c.r = this.a;
                    this.c.q = null;
                }
            }
            if (dpw != null) {
                this.a.a(dpw);
            }
        } finally {
            this.c.h.a();
        }
    }

    public final void a(boolean z) {
        this.c.a(this.a, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0064, code lost:
        r14.c.h.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.dpw r15) {
        /*
            r14 = this;
            r9 = 2
            r6 = 1
            r7 = 0
            java.util.logging.Logger r0 = defpackage.dvq.a
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L_0x0032
            java.util.logging.Logger r0 = defpackage.dvq.a
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            java.lang.String r2 = "io.grpc.internal.InternalSubchannel$TransportListener"
            java.lang.String r3 = "transportShutdown"
            java.lang.String r4 = "[{0}] {1} for {2} is being shutdown with status {3}"
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            dvq r8 = r14.c
            dwd r8 = r8.b
            r5[r7] = r8
            dth r8 = r14.a
            dwd r8 = r8.b()
            r5[r6] = r8
            java.net.SocketAddress r8 = r14.b
            r5[r9] = r8
            r8 = 3
            r5[r8] = r15
            r0.logp(r1, r2, r3, r4, r5)
        L_0x0032:
            dvq r0 = r14.c     // Catch:{ all -> 0x012d }
            java.lang.Object r8 = r0.g     // Catch:{ all -> 0x012d }
            monitor-enter(r8)     // Catch:{ all -> 0x012d }
            dvq r0 = r14.c     // Catch:{ all -> 0x012a }
            dnr r0 = r0.s     // Catch:{ all -> 0x012a }
            dnq r0 = r0.a     // Catch:{ all -> 0x012a }
            dnq r1 = defpackage.dnq.SHUTDOWN     // Catch:{ all -> 0x012a }
            if (r0 != r1) goto L_0x004a
            monitor-exit(r8)     // Catch:{ all -> 0x012a }
            dvq r0 = r14.c
            dso r0 = r0.h
            r0.a()
        L_0x0049:
            return
        L_0x004a:
            dvq r0 = r14.c     // Catch:{ all -> 0x012a }
            dxb r0 = r0.r     // Catch:{ all -> 0x012a }
            dth r1 = r14.a     // Catch:{ all -> 0x012a }
            if (r0 != r1) goto L_0x006c
            dvq r0 = r14.c     // Catch:{ all -> 0x012a }
            dnq r1 = defpackage.dnq.IDLE     // Catch:{ all -> 0x012a }
            r0.a(r1)     // Catch:{ all -> 0x012a }
            dvq r0 = r14.c     // Catch:{ all -> 0x012a }
            r1 = 0
            r0.r = r1     // Catch:{ all -> 0x012a }
            dvq r0 = r14.c     // Catch:{ all -> 0x012a }
            r1 = 0
            r0.j = r1     // Catch:{ all -> 0x012a }
        L_0x0063:
            monitor-exit(r8)     // Catch:{ all -> 0x012a }
            dvq r0 = r14.c
            dso r0 = r0.h
            r0.a()
            goto L_0x0049
        L_0x006c:
            dvq r0 = r14.c     // Catch:{ all -> 0x012a }
            dth r0 = r0.q     // Catch:{ all -> 0x012a }
            dth r1 = r14.a     // Catch:{ all -> 0x012a }
            if (r0 != r1) goto L_0x0063
            dvq r0 = r14.c     // Catch:{ all -> 0x012a }
            dnr r0 = r0.s     // Catch:{ all -> 0x012a }
            dnq r0 = r0.a     // Catch:{ all -> 0x012a }
            dnq r1 = defpackage.dnq.CONNECTING     // Catch:{ all -> 0x012a }
            if (r0 != r1) goto L_0x0136
            r0 = r6
        L_0x007f:
            java.lang.String r1 = "Expected state is CONNECTING, actual state is %s"
            dvq r2 = r14.c     // Catch:{ all -> 0x012a }
            dnr r2 = r2.s     // Catch:{ all -> 0x012a }
            dnq r2 = r2.a     // Catch:{ all -> 0x012a }
            defpackage.cld.a(r0, r1, r2)     // Catch:{ all -> 0x012a }
            dvq r0 = r14.c     // Catch:{ all -> 0x012a }
            int r1 = r0.j     // Catch:{ all -> 0x012a }
            int r1 = r1 + 1
            r0.j = r1     // Catch:{ all -> 0x012a }
            dvq r0 = r14.c     // Catch:{ all -> 0x012a }
            int r0 = r0.j     // Catch:{ all -> 0x012a }
            dvq r1 = r14.c     // Catch:{ all -> 0x012a }
            doe r1 = r1.i     // Catch:{ all -> 0x012a }
            java.util.List r1 = r1.a     // Catch:{ all -> 0x012a }
            int r1 = r1.size()     // Catch:{ all -> 0x012a }
            if (r0 < r1) goto L_0x013e
            dvq r0 = r14.c     // Catch:{ all -> 0x012a }
            r1 = 0
            r0.q = r1     // Catch:{ all -> 0x012a }
            dvq r0 = r14.c     // Catch:{ all -> 0x012a }
            r1 = 0
            r0.j = r1     // Catch:{ all -> 0x012a }
            dvq r9 = r14.c     // Catch:{ all -> 0x012a }
            boolean r0 = r15.a()     // Catch:{ all -> 0x012a }
            if (r0 != 0) goto L_0x0139
            r0 = r6
        L_0x00b5:
            java.lang.String r1 = "The error status must not be OK"
            defpackage.cld.a(r0, r1)     // Catch:{ all -> 0x012a }
            dnr r0 = new dnr     // Catch:{ all -> 0x012a }
            dnq r1 = defpackage.dnq.TRANSIENT_FAILURE     // Catch:{ all -> 0x012a }
            r0.<init>(r1, r15)     // Catch:{ all -> 0x012a }
            r9.a(r0)     // Catch:{ all -> 0x012a }
            drn r0 = r9.k     // Catch:{ all -> 0x012a }
            if (r0 != 0) goto L_0x00d1
            dro r0 = r9.c     // Catch:{ all -> 0x012a }
            drn r0 = new drn     // Catch:{ all -> 0x012a }
            r0.<init>()     // Catch:{ all -> 0x012a }
            r9.k = r0     // Catch:{ all -> 0x012a }
        L_0x00d1:
            drn r0 = r9.k     // Catch:{ all -> 0x012a }
            long r0 = r0.a()     // Catch:{ all -> 0x012a }
            csb r2 = r9.l     // Catch:{ all -> 0x012a }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x012a }
            long r2 = r2.a(r3)     // Catch:{ all -> 0x012a }
            long r10 = r0 - r2
            java.util.logging.Logger r0 = defpackage.dvq.a     // Catch:{ all -> 0x012a }
            java.util.logging.Level r1 = java.util.logging.Level.FINE     // Catch:{ all -> 0x012a }
            boolean r0 = r0.isLoggable(r1)     // Catch:{ all -> 0x012a }
            if (r0 == 0) goto L_0x0107
            java.util.logging.Logger r0 = defpackage.dvq.a     // Catch:{ all -> 0x012a }
            java.util.logging.Level r1 = java.util.logging.Level.FINE     // Catch:{ all -> 0x012a }
            java.lang.String r2 = "io.grpc.internal.InternalSubchannel"
            java.lang.String r3 = "scheduleBackoff"
            java.lang.String r4 = "[{0}] Scheduling backoff for {1} ns"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x012a }
            r12 = 0
            dwd r13 = r9.b     // Catch:{ all -> 0x012a }
            r5[r12] = r13     // Catch:{ all -> 0x012a }
            r12 = 1
            java.lang.Long r13 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x012a }
            r5[r12] = r13     // Catch:{ all -> 0x012a }
            r0.logp(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x012a }
        L_0x0107:
            java.util.concurrent.ScheduledFuture r0 = r9.m     // Catch:{ all -> 0x012a }
            if (r0 != 0) goto L_0x013c
            r0 = r6
        L_0x010c:
            java.lang.String r1 = "previous reconnectTask is not done"
            defpackage.cld.b(r0, r1)     // Catch:{ all -> 0x012a }
            r0 = 0
            r9.n = r0     // Catch:{ all -> 0x012a }
            java.util.concurrent.ScheduledExecutorService r0 = r9.e     // Catch:{ all -> 0x012a }
            dwc r1 = new dwc     // Catch:{ all -> 0x012a }
            dvs r2 = new dvs     // Catch:{ all -> 0x012a }
            r2.<init>(r9)     // Catch:{ all -> 0x012a }
            r1.<init>(r2)     // Catch:{ all -> 0x012a }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x012a }
            java.util.concurrent.ScheduledFuture r0 = r0.schedule(r1, r10, r2)     // Catch:{ all -> 0x012a }
            r9.m = r0     // Catch:{ all -> 0x012a }
            goto L_0x0063
        L_0x012a:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x012a }
            throw r0     // Catch:{ all -> 0x012d }
        L_0x012d:
            r0 = move-exception
            dvq r1 = r14.c
            dso r1 = r1.h
            r1.a()
            throw r0
        L_0x0136:
            r0 = r7
            goto L_0x007f
        L_0x0139:
            r0 = r7
            goto L_0x00b5
        L_0x013c:
            r0 = r7
            goto L_0x010c
        L_0x013e:
            dvq r0 = r14.c     // Catch:{ all -> 0x012a }
            r0.c()     // Catch:{ all -> 0x012a }
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwa.a(dpw):void");
    }

    /* JADX INFO: finally extract failed */
    public final void b() {
        boolean z;
        if (defpackage.dvq.a.isLoggable(java.util.logging.Level.FINE)) {
            defpackage.dvq.a.logp(java.util.logging.Level.FINE, "io.grpc.internal.InternalSubchannel$TransportListener", "transportTerminated", "[{0}] {1} for {2} is terminated", new java.lang.Object[]{this.c.b, this.a.b(), this.b});
        }
        defpackage.dsp dsp = this.c.f;
        defpackage.dsp.b(dsp.d, this.a);
        this.c.a(this.a, false);
        try {
            synchronized (this.c.g) {
                this.c.o.remove(this.a);
                if (this.c.s.a == defpackage.dnq.SHUTDOWN && this.c.o.isEmpty()) {
                    if (defpackage.dvq.a.isLoggable(java.util.logging.Level.FINE)) {
                        defpackage.dvq.a.logp(java.util.logging.Level.FINE, "io.grpc.internal.InternalSubchannel$TransportListener", "transportTerminated", "[{0}] Terminated in transportTerminated()", this.c.b);
                    }
                    this.c.d();
                }
            }
            this.c.h.a();
            if (this.c.r != this.a) {
                z = true;
            } else {
                z = false;
            }
            defpackage.cld.b(z, (java.lang.Object) "activeTransport still points to this transport. Seems transportShutdown() was not called.");
        } catch (Throwable th) {
            this.c.h.a();
            throw th;
        }
    }
}
