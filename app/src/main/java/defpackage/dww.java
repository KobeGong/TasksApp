package defpackage;

/* renamed from: dww reason: default package */
/* compiled from: PG */
final class dww extends defpackage.dop {
    public defpackage.dvq a;
    private final java.lang.Object b = new java.lang.Object();
    private boolean c;
    private java.util.concurrent.ScheduledFuture d;
    private final /* synthetic */ defpackage.dwf e;

    dww(defpackage.dwf dwf, defpackage.dmv dmv) {
        this.e = dwf;
        super(0);
        defpackage.cld.a((java.lang.Object) dmv, (java.lang.Object) "attrs");
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.dtb c() {
        return this.a.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r6 = this;
            java.lang.Object r1 = r6.b
            monitor-enter(r1)
            boolean r0 = r6.c     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0043
            dwf r0 = r6.e     // Catch:{ all -> 0x0040 }
            boolean r0 = r0.B     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x003e
            java.util.concurrent.ScheduledFuture r0 = r6.d     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x003e
            java.util.concurrent.ScheduledFuture r0 = r6.d     // Catch:{ all -> 0x0040 }
            r2 = 0
            r0.cancel(r2)     // Catch:{ all -> 0x0040 }
            r0 = 0
            r6.d = r0     // Catch:{ all -> 0x0040 }
        L_0x001a:
            dwf r0 = r6.e     // Catch:{ all -> 0x0040 }
            boolean r0 = r0.B     // Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x0047
            dwf r0 = r6.e     // Catch:{ all -> 0x0040 }
            dtc r0 = r0.h     // Catch:{ all -> 0x0040 }
            java.util.concurrent.ScheduledExecutorService r0 = r0.a()     // Catch:{ all -> 0x0040 }
            dwc r2 = new dwc     // Catch:{ all -> 0x0040 }
            dwx r3 = new dwx     // Catch:{ all -> 0x0040 }
            r3.<init>(r6)     // Catch:{ all -> 0x0040 }
            r2.<init>(r3)     // Catch:{ all -> 0x0040 }
            r4 = 5
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0040 }
            java.util.concurrent.ScheduledFuture r0 = r0.schedule(r2, r4, r3)     // Catch:{ all -> 0x0040 }
            r6.d = r0     // Catch:{ all -> 0x0040 }
            monitor-exit(r1)     // Catch:{ all -> 0x0040 }
        L_0x003d:
            return
        L_0x003e:
            monitor-exit(r1)     // Catch:{ all -> 0x0040 }
            goto L_0x003d
        L_0x0040:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0040 }
            throw r0
        L_0x0043:
            r0 = 1
            r6.c = r0     // Catch:{ all -> 0x0040 }
            goto L_0x001a
        L_0x0047:
            monitor-exit(r1)     // Catch:{ all -> 0x0040 }
            dvq r0 = r6.a
            dpw r1 = defpackage.dwf.b
            r0.a(r1)
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dww.a():void");
    }

    public final void b() {
        this.a.a();
    }

    public final java.lang.String toString() {
        return this.a.b.toString();
    }
}
