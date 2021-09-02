package defpackage;

/* renamed from: eju reason: default package */
/* compiled from: PG */
public final class eju implements java.lang.Runnable {
    private java.nio.ByteBuffer a;
    private final boolean b;
    private final /* synthetic */ org.chromium.net.impl.CronetBidirectionalStream c;

    public eju(org.chromium.net.impl.CronetBidirectionalStream cronetBidirectionalStream, java.nio.ByteBuffer byteBuffer, boolean z) {
        this.c = cronetBidirectionalStream;
        this.a = byteBuffer;
        this.b = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r6.c.a.b(r6.c, r6.c.g, r1, r6.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        r6.c.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
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
            org.chromium.net.impl.CronetBidirectionalStream r3 = r6.c     // Catch:{ all -> 0x0047 }
            boolean r3 = r3.d()     // Catch:{ all -> 0x0047 }
            if (r3 == 0) goto L_0x0015
            monitor-exit(r2)     // Catch:{ all -> 0x0047 }
        L_0x0014:
            return
        L_0x0015:
            boolean r3 = r6.b     // Catch:{ all -> 0x0047 }
            if (r3 == 0) goto L_0x0028
            org.chromium.net.impl.CronetBidirectionalStream r3 = r6.c     // Catch:{ all -> 0x0047 }
            int r4 = defpackage.bg.aI     // Catch:{ all -> 0x0047 }
            r3.f = r4     // Catch:{ all -> 0x0047 }
            org.chromium.net.impl.CronetBidirectionalStream r3 = r6.c     // Catch:{ all -> 0x0047 }
            int r3 = r3.e     // Catch:{ all -> 0x0047 }
            int r4 = defpackage.bg.aC     // Catch:{ all -> 0x0047 }
            if (r3 != r4) goto L_0x0028
            r0 = 1
        L_0x0028:
            monitor-exit(r2)     // Catch:{ all -> 0x0047 }
            org.chromium.net.impl.CronetBidirectionalStream r2 = r6.c     // Catch:{ Exception -> 0x0040 }
            eks r2 = r2.a     // Catch:{ Exception -> 0x0040 }
            org.chromium.net.impl.CronetBidirectionalStream r3 = r6.c     // Catch:{ Exception -> 0x0040 }
            org.chromium.net.impl.CronetBidirectionalStream r4 = r6.c     // Catch:{ Exception -> 0x0040 }
            ekq r4 = r4.g     // Catch:{ Exception -> 0x0040 }
            boolean r5 = r6.b     // Catch:{ Exception -> 0x0040 }
            r2.b(r3, r4, r1, r5)     // Catch:{ Exception -> 0x0040 }
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
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0047 }
            throw r0     // Catch:{ Exception -> 0x0040 }
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eju.run():void");
    }
}
