package defpackage;

/* renamed from: bpz reason: default package */
/* compiled from: PG */
final class bpz {
    public final java.lang.Object a = new java.lang.Object();
    public java.util.Queue b;
    private boolean c;

    bpz() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
        r1 = r3.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = (defpackage.bpy) r3.b.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
        if (r0 != null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001e, code lost:
        r3.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0021, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x002a, code lost:
        r1 = r0.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x002f, code lost:
        if (r0.c != null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0031, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0037, code lost:
        r0.a.execute(new defpackage.bpx(r0, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.bpv r4) {
        /*
            r3 = this;
            java.lang.Object r1 = r3.a
            monitor-enter(r1)
            java.util.Queue r0 = r3.b     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x000b
            boolean r0 = r3.c     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x000d
        L_0x000b:
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
        L_0x000c:
            return
        L_0x000d:
            r0 = 1
            r3.c = r0     // Catch:{ all -> 0x0026 }
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
        L_0x0011:
            java.lang.Object r1 = r3.a
            monitor-enter(r1)
            java.util.Queue r0 = r3.b     // Catch:{ all -> 0x0023 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0023 }
            bpy r0 = (defpackage.bpy) r0     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x0029
            r0 = 0
            r3.c = r0     // Catch:{ all -> 0x0023 }
            monitor-exit(r1)     // Catch:{ all -> 0x0023 }
            goto L_0x000c
        L_0x0023:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0023 }
            throw r0
        L_0x0026:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            throw r0
        L_0x0029:
            monitor-exit(r1)     // Catch:{ all -> 0x0023 }
            java.lang.Object r1 = r0.b
            monitor-enter(r1)
            bpu r2 = r0.c     // Catch:{ all -> 0x0033 }
            if (r2 != 0) goto L_0x0036
            monitor-exit(r1)     // Catch:{ all -> 0x0033 }
            goto L_0x0011
        L_0x0033:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0033 }
            throw r0
        L_0x0036:
            monitor-exit(r1)     // Catch:{ all -> 0x0033 }
            java.util.concurrent.Executor r1 = r0.a
            bpx r2 = new bpx
            r2.<init>(r0, r4)
            r1.execute(r2)
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpz.a(bpv):void");
    }
}
