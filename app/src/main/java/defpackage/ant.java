package defpackage;

/* renamed from: ant reason: default package */
final /* synthetic */ class ant implements java.lang.Runnable {
    private final defpackage.anc a;
    private final defpackage.anu b;
    private final defpackage.cyi c;

    ant(defpackage.anc anc, defpackage.anu anu, defpackage.cyi cyi) {
        this.a = anc;
        this.b = anu;
        this.c = cyi;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            anc r1 = r5.a
            anu r0 = r5.b
            cyi r2 = r5.c
            monitor-enter(r1)
            anu r3 = r1.a     // Catch:{ all -> 0x0027 }
            if (r3 == r0) goto L_0x000d
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
        L_0x000c:
            return
        L_0x000d:
            boolean r2 = defpackage.ajd.a(r2)     // Catch:{ all -> 0x0027 }
            if (r2 == 0) goto L_0x0025
            alq r2 = defpackage.alq.a()     // Catch:{ all -> 0x0027 }
            alv r0 = r0.a     // Catch:{ all -> 0x0027 }
            java.lang.String r0 = r0.a     // Catch:{ all -> 0x0027 }
            android.os.Handler r3 = r2.b     // Catch:{ all -> 0x0027 }
            alr r4 = new alr     // Catch:{ all -> 0x0027 }
            r4.<init>(r2, r0)     // Catch:{ all -> 0x0027 }
            r3.post(r4)     // Catch:{ all -> 0x0027 }
        L_0x0025:
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            goto L_0x000c
        L_0x0027:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ant.run():void");
    }
}
