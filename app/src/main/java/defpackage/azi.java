package defpackage;

/* renamed from: azi reason: default package */
/* compiled from: PG */
public final class azi implements defpackage.bae {
    public final defpackage.baf a;
    private boolean b = false;

    public azi(defpackage.baf baf) {
        this.a = baf;
    }

    public final void a() {
    }

    public final defpackage.bca a(defpackage.bca bca) {
        return b(bca);
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [ayk] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.bca b(defpackage.bca r4) {
        /*
            r3 = this;
            baf r0 = r3.a     // Catch:{ DeadObjectException -> 0x0045 }
            azx r0 = r0.m     // Catch:{ DeadObjectException -> 0x0045 }
            bbr r0 = r0.g     // Catch:{ DeadObjectException -> 0x0045 }
            r0.a(r4)     // Catch:{ DeadObjectException -> 0x0045 }
            baf r0 = r3.a     // Catch:{ DeadObjectException -> 0x0045 }
            azx r0 = r0.m     // Catch:{ DeadObjectException -> 0x0045 }
            ayh r1 = r4.c     // Catch:{ DeadObjectException -> 0x0045 }
            java.util.Map r0 = r0.d     // Catch:{ DeadObjectException -> 0x0045 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ DeadObjectException -> 0x0045 }
            ayj r0 = (defpackage.ayj) r0     // Catch:{ DeadObjectException -> 0x0045 }
            java.lang.String r1 = "Appropriate Api was not requested."
            defpackage.azb.b(r0, r1)     // Catch:{ DeadObjectException -> 0x0045 }
            boolean r1 = r0.f()     // Catch:{ DeadObjectException -> 0x0045 }
            if (r1 != 0) goto L_0x0039
            baf r1 = r3.a     // Catch:{ DeadObjectException -> 0x0045 }
            java.util.Map r1 = r1.g     // Catch:{ DeadObjectException -> 0x0045 }
            ayh r2 = r4.c     // Catch:{ DeadObjectException -> 0x0045 }
            boolean r1 = r1.containsKey(r2)     // Catch:{ DeadObjectException -> 0x0045 }
            if (r1 == 0) goto L_0x0039
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status     // Catch:{ DeadObjectException -> 0x0045 }
            r1 = 17
            r0.<init>(r1)     // Catch:{ DeadObjectException -> 0x0045 }
            r4.c(r0)     // Catch:{ DeadObjectException -> 0x0045 }
        L_0x0038:
            return r4
        L_0x0039:
            boolean r1 = r0 instanceof defpackage.bef     // Catch:{ DeadObjectException -> 0x0045 }
            if (r1 == 0) goto L_0x0041
            ayk r0 = defpackage.bef.q()     // Catch:{ DeadObjectException -> 0x0045 }
        L_0x0041:
            r4.b(r0)     // Catch:{ DeadObjectException -> 0x0045 }
            goto L_0x0038
        L_0x0045:
            r0 = move-exception
            baf r0 = r3.a
            azj r1 = new azj
            r1.<init>(r3, r3)
            r0.a(r1)
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azi.b(bca):bca");
    }

    public final boolean b() {
        defpackage.azx azx = this.a.m;
        azx.b.lock();
        azx.b.unlock();
        this.a.a((defpackage.axq) null);
        return true;
    }

    public final void c() {
    }

    public final void a(android.os.Bundle bundle) {
    }

    public final void a(defpackage.axq axq, defpackage.ayd ayd, boolean z) {
    }

    public final void a(int i) {
        this.a.a((defpackage.axq) null);
        this.a.n.a(i, false);
    }
}
