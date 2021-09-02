package defpackage;

/* renamed from: cyt reason: default package */
/* compiled from: PG */
final class cyt implements java.lang.Runnable {
    private final /* synthetic */ defpackage.cyr a;

    cyt(defpackage.cyr cyr) {
        this.a = cyr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r12.a.e = defpackage.bg.ag;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        if (r3 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        monitor-enter(r12.a.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r12.a.e = defpackage.bg.ag;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005f, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0064, code lost:
        r8 = r3 | java.lang.Thread.interrupted();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r6.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006a, code lost:
        r2 = r9;
        r3 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0071, code lost:
        if (r3 != false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x007a, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x007b, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r6 = java.lang.String.valueOf(r6);
        defpackage.cyr.a.logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.SequentialExecutor$QueueWorker", "workOnQueue", new java.lang.StringBuilder(java.lang.String.valueOf(r6).length() + 35).append("Exception while executing runnable ").append(r6).toString(), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a8, code lost:
        r2 = r9;
        r3 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00af, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b0, code lost:
        r3 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (r3 == false) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            r9 = 0
            r2 = r9
            r3 = r9
        L_0x0003:
            cyr r4 = r12.a     // Catch:{ all -> 0x0070 }
            java.util.Deque r4 = r4.b     // Catch:{ all -> 0x0070 }
            monitor-enter(r4)     // Catch:{ all -> 0x0070 }
            if (r2 != 0) goto L_0x00b2
            cyr r2 = r12.a     // Catch:{ all -> 0x006d }
            int r2 = r2.e     // Catch:{ all -> 0x006d }
            int r5 = defpackage.bg.aj     // Catch:{ all -> 0x006d }
            if (r2 != r5) goto L_0x001f
            monitor-exit(r4)     // Catch:{ all -> 0x006d }
            if (r3 == 0) goto L_0x001e
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ Error -> 0x0051 }
            r2.interrupt()     // Catch:{ Error -> 0x0051 }
        L_0x001e:
            return
        L_0x001f:
            cyr r2 = r12.a     // Catch:{ all -> 0x006d }
            long r6 = r2.c     // Catch:{ all -> 0x006d }
            r8 = 1
            long r6 = r6 + r8
            r2.c = r6     // Catch:{ all -> 0x006d }
            cyr r2 = r12.a     // Catch:{ all -> 0x006d }
            int r5 = defpackage.bg.aj     // Catch:{ all -> 0x006d }
            r2.e = r5     // Catch:{ all -> 0x006d }
            r2 = 1
            r9 = r2
        L_0x0031:
            cyr r2 = r12.a     // Catch:{ all -> 0x006d }
            java.util.Deque r2 = r2.b     // Catch:{ all -> 0x006d }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x006d }
            r0 = r2
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x006d }
            r6 = r0
            if (r6 != 0) goto L_0x0060
            cyr r2 = r12.a     // Catch:{ all -> 0x006d }
            int r5 = defpackage.bg.ag     // Catch:{ all -> 0x006d }
            r2.e = r5     // Catch:{ all -> 0x006d }
            monitor-exit(r4)     // Catch:{ all -> 0x006d }
            if (r3 == 0) goto L_0x001e
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ Error -> 0x0051 }
            r2.interrupt()     // Catch:{ Error -> 0x0051 }
            goto L_0x001e
        L_0x0051:
            r2 = move-exception
            cyr r3 = r12.a
            java.util.Deque r3 = r3.b
            monitor-enter(r3)
            cyr r4 = r12.a     // Catch:{ all -> 0x00ac }
            int r5 = defpackage.bg.ag     // Catch:{ all -> 0x00ac }
            r4.e = r5     // Catch:{ all -> 0x00ac }
            monitor-exit(r3)     // Catch:{ all -> 0x00ac }
            throw r2
        L_0x0060:
            monitor-exit(r4)     // Catch:{ all -> 0x006d }
            boolean r2 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x0070 }
            r8 = r3 | r2
            r6.run()     // Catch:{ RuntimeException -> 0x007b }
            r2 = r9
            r3 = r8
            goto L_0x0003
        L_0x006d:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006d }
            throw r2     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r2 = move-exception
        L_0x0071:
            if (r3 == 0) goto L_0x007a
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ Error -> 0x0051 }
            r3.interrupt()     // Catch:{ Error -> 0x0051 }
        L_0x007a:
            throw r2     // Catch:{ Error -> 0x0051 }
        L_0x007b:
            r7 = move-exception
            java.util.logging.Logger r2 = defpackage.cyr.a     // Catch:{ all -> 0x00af }
            java.util.logging.Level r3 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x00af }
            java.lang.String r4 = "com.google.common.util.concurrent.SequentialExecutor$QueueWorker"
            java.lang.String r5 = "workOnQueue"
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00af }
            java.lang.String r10 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00af }
            int r10 = r10.length()     // Catch:{ all -> 0x00af }
            int r10 = r10 + 35
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00af }
            r11.<init>(r10)     // Catch:{ all -> 0x00af }
            java.lang.String r10 = "Exception while executing runnable "
            java.lang.StringBuilder r10 = r11.append(r10)     // Catch:{ all -> 0x00af }
            java.lang.StringBuilder r6 = r10.append(r6)     // Catch:{ all -> 0x00af }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00af }
            r2.logp(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00af }
            r2 = r9
            r3 = r8
            goto L_0x0003
        L_0x00ac:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00ac }
            throw r2
        L_0x00af:
            r2 = move-exception
            r3 = r8
            goto L_0x0071
        L_0x00b2:
            r9 = r2
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyt.run():void");
    }
}
