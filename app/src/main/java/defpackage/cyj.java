package defpackage;

/* renamed from: cyj reason: default package */
/* compiled from: PG */
public final class cyj extends java.util.concurrent.FutureTask implements defpackage.cyi {
    private final defpackage.cxy a = new defpackage.cxy();

    public cyj(java.lang.Runnable runnable) {
        super(runnable, null);
    }

    public final void a(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        defpackage.cxy cxy = this.a;
        defpackage.cld.a((java.lang.Object) runnable, (java.lang.Object) "Runnable was null.");
        defpackage.cld.a((java.lang.Object) executor, (java.lang.Object) "Executor was null.");
        synchronized (cxy) {
            if (!cxy.b) {
                cxy.a = new defpackage.cxz(runnable, executor, cxy.a);
            } else {
                defpackage.cxy.a(runnable, executor);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        if (r0 == null) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
        defpackage.cxy.a(r0.a, r0.b);
        r0 = r0.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r1 == null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        r2 = r1.c;
        r1.c = r0;
        r0 = r1;
        r1 = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void done() {
        /*
            r4 = this;
            r0 = 0
            cxy r2 = r4.a
            monitor-enter(r2)
            boolean r1 = r2.b     // Catch:{ all -> 0x001c }
            if (r1 == 0) goto L_0x000a
            monitor-exit(r2)     // Catch:{ all -> 0x001c }
        L_0x0009:
            return
        L_0x000a:
            r1 = 1
            r2.b = r1     // Catch:{ all -> 0x001c }
            cxz r1 = r2.a     // Catch:{ all -> 0x001c }
            r3 = 0
            r2.a = r3     // Catch:{ all -> 0x001c }
            monitor-exit(r2)     // Catch:{ all -> 0x001c }
        L_0x0013:
            if (r1 == 0) goto L_0x001f
            cxz r2 = r1.c
            r1.c = r0
            r0 = r1
            r1 = r2
            goto L_0x0013
        L_0x001c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001c }
            throw r0
        L_0x001f:
            if (r0 == 0) goto L_0x0009
            java.lang.Runnable r1 = r0.a
            java.util.concurrent.Executor r2 = r0.b
            defpackage.cxy.a(r1, r2)
            cxz r0 = r0.c
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyj.done():void");
    }
}
