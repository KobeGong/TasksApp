package defpackage;

/* renamed from: dso reason: default package */
/* compiled from: PG */
public class dso {
    private static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.dso.class.getName());
    private final java.lang.Object b = new java.lang.Object();
    private final java.util.Queue c = new java.util.ArrayDeque();
    private boolean d;

    dso() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r0.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0027, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0029, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002a, code lost:
        a(r0);
        r0 = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r4 = this;
            r2 = 1
            r0 = 0
        L_0x0002:
            java.lang.Object r3 = r4.b
            monitor-enter(r3)
            if (r0 != 0) goto L_0x002f
            boolean r0 = r4.d     // Catch:{ all -> 0x0020 }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r3)     // Catch:{ all -> 0x0020 }
        L_0x000c:
            return
        L_0x000d:
            r0 = 1
            r4.d = r0     // Catch:{ all -> 0x0020 }
            r1 = r2
        L_0x0011:
            java.util.Queue r0 = r4.c     // Catch:{ all -> 0x0020 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0020 }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x0020 }
            if (r0 != 0) goto L_0x0023
            r0 = 0
            r4.d = r0     // Catch:{ all -> 0x0020 }
            monitor-exit(r3)     // Catch:{ all -> 0x0020 }
            goto L_0x000c
        L_0x0020:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0020 }
            throw r0
        L_0x0023:
            monitor-exit(r3)     // Catch:{ all -> 0x0020 }
            r0.run()     // Catch:{ Throwable -> 0x0029 }
            r0 = r1
            goto L_0x0002
        L_0x0029:
            r0 = move-exception
            r4.a(r0)
            r0 = r1
            goto L_0x0002
        L_0x002f:
            r1 = r0
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dso.a():void");
    }

    public final defpackage.dso a(java.lang.Runnable runnable) {
        synchronized (this.b) {
            this.c.add((java.lang.Runnable) defpackage.cld.a((java.lang.Object) runnable, (java.lang.Object) "runnable is null"));
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    public void a(java.lang.Throwable th) {
        a.logp(java.util.logging.Level.WARNING, "io.grpc.internal.ChannelExecutor", "handleUncaughtThrowable", "Runnable threw exception in ChannelExecutor", th);
    }
}
