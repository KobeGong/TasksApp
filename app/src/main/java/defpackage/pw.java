package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: pw  reason: default package */
/* compiled from: PG */
public final class pw implements qg {
    private final /* synthetic */ String a;

    pw(String str) {
        this.a = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r1 >= r0.size()) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        ((defpackage.qg) r0.get(r1)).a(r5);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r1 = 0;
     */
    @Override // defpackage.qg
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(java.lang.Object r5) {
        /*
            r4 = this;
            qa r5 = (defpackage.qa) r5
            java.lang.Object r1 = defpackage.pt.b
            monitor-enter(r1)
            ri r0 = defpackage.pt.c     // Catch:{ all -> 0x0030 }
            java.lang.String r2 = r4.a     // Catch:{ all -> 0x0030 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0030 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x0030 }
            if (r0 != 0) goto L_0x0013
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
        L_0x0012:
            return
        L_0x0013:
            ri r2 = defpackage.pt.c     // Catch:{ all -> 0x0030 }
            java.lang.String r3 = r4.a     // Catch:{ all -> 0x0030 }
            r2.remove(r3)     // Catch:{ all -> 0x0030 }
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            r1 = 0
            r2 = r1
        L_0x001d:
            int r1 = r0.size()
            if (r2 >= r1) goto L_0x0012
            java.lang.Object r1 = r0.get(r2)
            qg r1 = (defpackage.qg) r1
            r1.a(r5)
            int r1 = r2 + 1
            r2 = r1
            goto L_0x001d
        L_0x0030:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pw.a(java.lang.Object):void");
    }
}
