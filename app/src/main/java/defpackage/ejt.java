package defpackage;

/* renamed from: ejt reason: default package */
/* compiled from: PG */
public final class ejt implements java.lang.Runnable {
    public java.nio.ByteBuffer a;
    public boolean b;
    private final /* synthetic */ org.chromium.net.impl.CronetBidirectionalStream c;

    public ejt(org.chromium.net.impl.CronetBidirectionalStream cronetBidirectionalStream) {
        this.c = cronetBidirectionalStream;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r6.c.a.a(r6.c, r6.c.g, r1, r6.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        r6.c.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            r0 = 0
            java.nio.ByteBuffer r1 = r6.a     // Catch:{ Exception -> 0x0040 }
            r2 = 0
            r6.a = r2     // Catch:{ Exception -> 0x0040 }
            org.chromium.net.impl.CronetBidirectionalStream r2 = r6.c     // Catch:{ Exception -> 0x0040 }
            java.lang.Object r2 = r2.c     // Catch:{ Exception -> 0x0040 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x0040 }
            org.chromium.net.impl.CronetBidirectionalStream r3 = r6.c     // Catch:{ all -> 0x004e }
            boolean r3 = r3.d()     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x0015
            monitor-exit(r2)     // Catch:{ all -> 0x004e }
        L_0x0014:
            return
        L_0x0015:
            boolean r3 = r6.b     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x0047
            org.chromium.net.impl.CronetBidirectionalStream r3 = r6.c     // Catch:{ all -> 0x004e }
            int r4 = defpackage.bg.aC     // Catch:{ all -> 0x004e }
            r3.e = r4     // Catch:{ all -> 0x004e }
            org.chromium.net.impl.CronetBidirectionalStream r3 = r6.c     // Catch:{ all -> 0x004e }
            int r3 = r3.f     // Catch:{ all -> 0x004e }
            int r4 = defpackage.bg.aI     // Catch:{ all -> 0x004e }
            if (r3 != r4) goto L_0x0028
            r0 = 1
        L_0x0028:
            monitor-exit(r2)     // Catch:{ all -> 0x004e }
            org.chromium.net.impl.CronetBidirectionalStream r2 = r6.c     // Catch:{ Exception -> 0x0040 }
            eks r2 = r2.a     // Catch:{ Exception -> 0x0040 }
            org.chromium.net.impl.CronetBidirectionalStream r3 = r6.c     // Catch:{ Exception -> 0x0040 }
            org.chromium.net.impl.CronetBidirectionalStream r4 = r6.c     // Catch:{ Exception -> 0x0040 }
            ekq r4 = r4.g     // Catch:{ Exception -> 0x0040 }
            boolean r5 = r6.b     // Catch:{ Exception -> 0x0040 }
            r2.a(r3, r4, r1, r5)     // Catch:{ Exception -> 0x0040 }
            if (r0 == 0) goto L_0x0014
            org.chromium.net.impl.CronetBidirectionalStream r0 = r6.c     // Catch:{ Exception -> 0x0040 }
            r0.e()     // Catch:{ Exception -> 0x0040 }
            goto L_0x0014
        L_0x0040:
            r0 = move-exception
            org.chromium.net.impl.CronetBidirectionalStream r1 = r6.c
            r1.a(r0)
            goto L_0x0014
        L_0x0047:
            org.chromium.net.impl.CronetBidirectionalStream r3 = r6.c     // Catch:{ all -> 0x004e }
            int r4 = defpackage.bg.aA     // Catch:{ all -> 0x004e }
            r3.e = r4     // Catch:{ all -> 0x004e }
            goto L_0x0028
        L_0x004e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004e }
            throw r0     // Catch:{ Exception -> 0x0040 }
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejt.run():void");
    }
}
