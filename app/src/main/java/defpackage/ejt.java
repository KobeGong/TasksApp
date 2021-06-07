package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.impl.CronetBidirectionalStream;

/* renamed from: ejt  reason: default package */
/* compiled from: PG */
public final class ejt implements Runnable {
    public ByteBuffer a;
    public boolean b;
    private final /* synthetic */ CronetBidirectionalStream c;

    public ejt(CronetBidirectionalStream cronetBidirectionalStream) {
        this.c = cronetBidirectionalStream;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        r6.c.a.a(r6.c, r6.c.g, r1, r6.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        r6.c.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
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
            org.chromium.net.impl.CronetBidirectionalStream r2 = r6.c
            eks r2 = r2.a
            org.chromium.net.impl.CronetBidirectionalStream r3 = r6.c
            org.chromium.net.impl.CronetBidirectionalStream r4 = r6.c
            ekq r4 = r4.g
            boolean r5 = r6.b
            r2.a(r3, r4, r1, r5)
            if (r0 == 0) goto L_0x0014
            org.chromium.net.impl.CronetBidirectionalStream r0 = r6.c
            r0.e()
            goto L_0x0014
        L_0x0040:
            r0 = move-exception
            org.chromium.net.impl.CronetBidirectionalStream r1 = r6.c
            r1.a(r0)
            goto L_0x0014
        L_0x0047:
            org.chromium.net.impl.CronetBidirectionalStream r3 = r6.c
            int r4 = defpackage.bg.aA
            r3.e = r4
            goto L_0x0028
        L_0x004e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejt.run():void");
    }
}
