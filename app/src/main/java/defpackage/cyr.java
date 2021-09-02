package defpackage;

/* renamed from: cyr reason: default package */
/* compiled from: PG */
public final class cyr implements java.util.concurrent.Executor {
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.cyr.class.getName());
    public final java.util.Deque b = new java.util.ArrayDeque();
    public long c = 0;
    private final java.util.concurrent.Executor d;
    /* access modifiers changed from: private */
    public int e = defpackage.bg.ag;
    private final defpackage.cyt f = new defpackage.cyt(this);

    public cyr(java.util.concurrent.Executor executor) {
        this.d = (java.util.concurrent.Executor) defpackage.cld.a((java.lang.Object) executor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r6.d.execute(r6.f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r6.e != defpackage.bg.ah) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        r1 = r6.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        if (r6.c != r2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        if (r6.e != defpackage.bg.ah) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        r6.e = defpackage.bg.ai;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0055, code lost:
        monitor-enter(r6.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005a, code lost:
        if (r6.e == defpackage.bg.ag) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x006a, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x006d, code lost:
        if ((r0 instanceof java.util.concurrent.RejectedExecutionException) == false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0071, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0075, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void execute(java.lang.Runnable r7) {
        /*
            r6 = this;
            defpackage.cld.a(r7)
            java.util.Deque r1 = r6.b
            monitor-enter(r1)
            int r0 = r6.e     // Catch:{ all -> 0x004f }
            int r2 = defpackage.bg.aj     // Catch:{ all -> 0x004f }
            if (r0 == r2) goto L_0x0012
            int r0 = r6.e     // Catch:{ all -> 0x004f }
            int r2 = defpackage.bg.ai     // Catch:{ all -> 0x004f }
            if (r0 != r2) goto L_0x0019
        L_0x0012:
            java.util.Deque r0 = r6.b     // Catch:{ all -> 0x004f }
            r0.add(r7)     // Catch:{ all -> 0x004f }
            monitor-exit(r1)     // Catch:{ all -> 0x004f }
        L_0x0018:
            return
        L_0x0019:
            long r2 = r6.c     // Catch:{ all -> 0x004f }
            cys r4 = new cys     // Catch:{ all -> 0x004f }
            r4.<init>(r7)     // Catch:{ all -> 0x004f }
            java.util.Deque r0 = r6.b     // Catch:{ all -> 0x004f }
            r0.add(r4)     // Catch:{ all -> 0x004f }
            int r0 = defpackage.bg.ah     // Catch:{ all -> 0x004f }
            r6.e = r0     // Catch:{ all -> 0x004f }
            monitor-exit(r1)     // Catch:{ all -> 0x004f }
            java.util.concurrent.Executor r0 = r6.d     // Catch:{ RuntimeException -> 0x0052, Error -> 0x0079 }
            cyt r1 = r6.f     // Catch:{ RuntimeException -> 0x0052, Error -> 0x0079 }
            r0.execute(r1)     // Catch:{ RuntimeException -> 0x0052, Error -> 0x0079 }
            int r0 = r6.e
            int r1 = defpackage.bg.ah
            if (r0 != r1) goto L_0x0018
            java.util.Deque r1 = r6.b
            monitor-enter(r1)
            long r4 = r6.c     // Catch:{ all -> 0x004c }
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x004a
            int r0 = r6.e     // Catch:{ all -> 0x004c }
            int r2 = defpackage.bg.ah     // Catch:{ all -> 0x004c }
            if (r0 != r2) goto L_0x004a
            int r0 = defpackage.bg.ai     // Catch:{ all -> 0x004c }
            r6.e = r0     // Catch:{ all -> 0x004c }
        L_0x004a:
            monitor-exit(r1)     // Catch:{ all -> 0x004c }
            goto L_0x0018
        L_0x004c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x004c }
            throw r0
        L_0x004f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x004f }
            throw r0
        L_0x0052:
            r0 = move-exception
        L_0x0053:
            java.util.Deque r2 = r6.b
            monitor-enter(r2)
            int r1 = r6.e     // Catch:{ all -> 0x0072 }
            int r3 = defpackage.bg.ag     // Catch:{ all -> 0x0072 }
            if (r1 == r3) goto L_0x0062
            int r1 = r6.e     // Catch:{ all -> 0x0072 }
            int r3 = defpackage.bg.ah     // Catch:{ all -> 0x0072 }
            if (r1 != r3) goto L_0x0075
        L_0x0062:
            java.util.Deque r1 = r6.b     // Catch:{ all -> 0x0072 }
            boolean r1 = r1.removeLastOccurrence(r4)     // Catch:{ all -> 0x0072 }
            if (r1 == 0) goto L_0x0075
            r1 = 1
        L_0x006b:
            boolean r3 = r0 instanceof java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x0072 }
            if (r3 == 0) goto L_0x0071
            if (r1 == 0) goto L_0x0077
        L_0x0071:
            throw r0     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0072 }
            throw r0
        L_0x0075:
            r1 = 0
            goto L_0x006b
        L_0x0077:
            monitor-exit(r2)     // Catch:{ all -> 0x0072 }
            goto L_0x0018
        L_0x0079:
            r0 = move-exception
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyr.execute(java.lang.Runnable):void");
    }
}
