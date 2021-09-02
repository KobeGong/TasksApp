package defpackage;

/* renamed from: ejq reason: default package */
/* compiled from: PG */
public final class ejq implements java.lang.Runnable {
    private final /* synthetic */ defpackage.ejh a;
    private final /* synthetic */ org.chromium.net.impl.CronetBidirectionalStream b;

    public ejq(org.chromium.net.impl.CronetBidirectionalStream cronetBidirectionalStream, defpackage.ejh ejh) {
        this.b = cronetBidirectionalStream;
        this.a = ejh;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            org.chromium.net.impl.CronetBidirectionalStream r0 = r4.b
            java.lang.Object r1 = r0.c
            monitor-enter(r1)
            org.chromium.net.impl.CronetBidirectionalStream r0 = r4.b     // Catch:{ all -> 0x0027 }
            boolean r0 = r0.d()     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x000f
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
        L_0x000e:
            return
        L_0x000f:
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            org.chromium.net.impl.CronetBidirectionalStream r0 = r4.b     // Catch:{ Exception -> 0x0020 }
            eks r0 = r0.a     // Catch:{ Exception -> 0x0020 }
            org.chromium.net.impl.CronetBidirectionalStream r1 = r4.b     // Catch:{ Exception -> 0x0020 }
            org.chromium.net.impl.CronetBidirectionalStream r2 = r4.b     // Catch:{ Exception -> 0x0020 }
            ekq r2 = r2.g     // Catch:{ Exception -> 0x0020 }
            ejh r3 = r4.a     // Catch:{ Exception -> 0x0020 }
            r0.a(r1, r2, r3)     // Catch:{ Exception -> 0x0020 }
            goto L_0x000e
        L_0x0020:
            r0 = move-exception
            org.chromium.net.impl.CronetBidirectionalStream r1 = r4.b
            r1.a(r0)
            goto L_0x000e
        L_0x0027:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejq.run():void");
    }
}
