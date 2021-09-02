package defpackage;

/* renamed from: amk reason: default package */
final /* synthetic */ class amk implements java.lang.Runnable {
    private final defpackage.amj a;

    amk(defpackage.amj amj) {
        this.a = amj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r6 = (long) defpackage.amj.a.b(r0.e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004b, code lost:
        if (r6 <= 0) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004d, code lost:
        java.lang.Thread.sleep(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0050, code lost:
        r0.d.a(r0.a.b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005b, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r5.c.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0061, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        defpackage.amj.a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00f1, code lost:
        r1 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            r4 = 1
            r3 = 0
            amj r5 = r10.a
        L_0x0004:
            android.content.Context r0 = r5.b     // Catch:{ all -> 0x008d }
            boolean r0 = defpackage.bdk.a(r0)     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0028
            ais r0 = r5.e     // Catch:{ all -> 0x008d }
            boolean r0 = r0.a()     // Catch:{ all -> 0x008d }
            if (r0 != 0) goto L_0x0028
            boolean r0 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x008d }
            if (r0 != 0) goto L_0x0028
            boolean r0 = r5.f     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0028
            monitor-enter(r5)     // Catch:{ all -> 0x008d }
            java.util.Queue r0 = r5.c     // Catch:{ all -> 0x009b }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x0035
            monitor-exit(r5)     // Catch:{ all -> 0x009b }
        L_0x0028:
            monitor-enter(r5)
            r0 = 0
            r5.d = r0     // Catch:{ all -> 0x00f3 }
            boolean r0 = r5.f     // Catch:{ all -> 0x00f3 }
            if (r0 == 0) goto L_0x0033
            r5.c()     // Catch:{ all -> 0x00f3 }
        L_0x0033:
            monitor-exit(r5)     // Catch:{ all -> 0x00f3 }
            return
        L_0x0035:
            java.util.Queue r0 = r5.c     // Catch:{ all -> 0x009b }
            java.lang.Object r0 = r0.peek()     // Catch:{ all -> 0x009b }
            amm r0 = (defpackage.amm) r0     // Catch:{ all -> 0x009b }
            monitor-exit(r5)     // Catch:{ all -> 0x009b }
            cwl r1 = defpackage.amj.a     // Catch:{ Throwable -> 0x0066 }
            int r2 = r0.e     // Catch:{ Throwable -> 0x0066 }
            int r1 = r1.b(r2)     // Catch:{ Throwable -> 0x0066 }
            long r6 = (long) r1     // Catch:{ Throwable -> 0x0066 }
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x0050
            java.lang.Thread.sleep(r6)     // Catch:{ Throwable -> 0x0066 }
        L_0x0050:
            cyu r1 = r0.d     // Catch:{ Throwable -> 0x0066 }
            csd r2 = r0.a     // Catch:{ Throwable -> 0x0066 }
            java.lang.Object r2 = r2.b()     // Catch:{ Throwable -> 0x0066 }
            r1.a(r2)     // Catch:{ Throwable -> 0x0066 }
            monitor-enter(r5)     // Catch:{ Throwable -> 0x0066 }
            java.util.Queue r1 = r5.c     // Catch:{ all -> 0x009e }
            r1.poll()     // Catch:{ all -> 0x009e }
            monitor-exit(r5)     // Catch:{ all -> 0x009e }
            defpackage.amj.a(r0)     // Catch:{ Throwable -> 0x0066 }
            goto L_0x0004
        L_0x0066:
            r1 = move-exception
            r2 = r1
            java.lang.String r1 = "Cannot execute. Attempt: %d"
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x008d }
            r7 = 0
            int r8 = r0.e     // Catch:{ all -> 0x008d }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x008d }
            r6[r7] = r8     // Catch:{ all -> 0x008d }
            defpackage.azb.a(r1, r2, r6)     // Catch:{ all -> 0x008d }
            int r1 = r0.b     // Catch:{ all -> 0x008d }
            int r6 = defpackage.bg.D     // Catch:{ all -> 0x008d }
            if (r1 != r6) goto L_0x00a1
            r5.a(r0, r2)     // Catch:{ all -> 0x008d }
            ais r0 = r5.e     // Catch:{ all -> 0x008d }
            air r1 = defpackage.air.a(r2)     // Catch:{ all -> 0x008d }
            r0.a(r1)     // Catch:{ all -> 0x008d }
            goto L_0x0004
        L_0x008d:
            r0 = move-exception
            monitor-enter(r5)
            r1 = 0
            r5.d = r1     // Catch:{ all -> 0x00f6 }
            boolean r1 = r5.f     // Catch:{ all -> 0x00f6 }
            if (r1 == 0) goto L_0x0099
            r5.c()     // Catch:{ all -> 0x00f6 }
        L_0x0099:
            monitor-exit(r5)     // Catch:{ all -> 0x00f6 }
            throw r0
        L_0x009b:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x009b }
            throw r0     // Catch:{ all -> 0x008d }
        L_0x009e:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x009e }
            throw r1     // Catch:{ Throwable -> 0x0066 }
        L_0x00a1:
            android.content.Context r1 = r5.b     // Catch:{ all -> 0x008d }
            boolean r1 = defpackage.bdk.a(r1)     // Catch:{ all -> 0x008d }
            if (r1 == 0) goto L_0x0028
            int r1 = r0.e     // Catch:{ all -> 0x008d }
            int r1 = r1 + 1
            r0.e = r1     // Catch:{ all -> 0x008d }
            int r1 = r0.e     // Catch:{ all -> 0x008d }
            r6 = 3
            if (r1 >= r6) goto L_0x00c0
            r1 = r2
        L_0x00b5:
            boolean r6 = r1 instanceof defpackage.axx     // Catch:{ all -> 0x008d }
            if (r6 != 0) goto L_0x00bd
            boolean r6 = r1 instanceof defpackage.avf     // Catch:{ all -> 0x008d }
            if (r6 == 0) goto L_0x00d6
        L_0x00bd:
            r1 = r3
        L_0x00be:
            if (r1 != 0) goto L_0x0004
        L_0x00c0:
            java.lang.String r1 = "Discarding operation after too many attempts"
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x008d }
            defpackage.azb.b(r1, r6)     // Catch:{ all -> 0x008d }
            r5.a(r0, r2)     // Catch:{ all -> 0x008d }
            ais r0 = r5.e     // Catch:{ all -> 0x008d }
            air r1 = defpackage.air.a(r2)     // Catch:{ all -> 0x008d }
            r0.a(r1)     // Catch:{ all -> 0x008d }
            goto L_0x0004
        L_0x00d6:
            boolean r6 = r1 instanceof defpackage.dqb     // Catch:{ all -> 0x008d }
            if (r6 == 0) goto L_0x00e6
            dqb r1 = (defpackage.dqb) r1     // Catch:{ all -> 0x008d }
            dpw r1 = r1.a     // Catch:{ all -> 0x008d }
            dpx r1 = r1.l     // Catch:{ all -> 0x008d }
            dpx r6 = defpackage.dpx.PERMISSION_DENIED     // Catch:{ all -> 0x008d }
            if (r1 != r6) goto L_0x00f1
            r1 = r3
            goto L_0x00be
        L_0x00e6:
            java.lang.Throwable r6 = r1.getCause()     // Catch:{ all -> 0x008d }
            if (r6 == 0) goto L_0x00f1
            java.lang.Throwable r1 = r1.getCause()     // Catch:{ all -> 0x008d }
            goto L_0x00b5
        L_0x00f1:
            r1 = r4
            goto L_0x00be
        L_0x00f3:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00f3 }
            throw r0
        L_0x00f6:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00f6 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amk.run():void");
    }
}
