package defpackage;

/* renamed from: eek  reason: default package */
/* compiled from: PG */
public final class eek extends dlz {
    public int a = Integer.MIN_VALUE;

    public eek() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != Integer.MIN_VALUE) {
            dlx.a(1, this.a);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int a2 = super.a();
        if (this.a != Integer.MIN_VALUE) {
            return a2 + dlx.c(1, this.a);
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        return r6;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.eek a(defpackage.dlw r7) {
        /*
            r6 = this;
        L_0x0000:
            int r0 = r7.a()
            switch(r0) {
                case 0: goto L_0x000d;
                case 8: goto L_0x000e;
                default: goto L_0x0007;
            }
        L_0x0007:
            boolean r0 = super.a(r7, r0)
            if (r0 != 0) goto L_0x0000
        L_0x000d:
            return r6
        L_0x000e:
            int r1 = r7.i()
            int r2 = r7.e()     // Catch:{ IllegalArgumentException -> 0x001e }
            if (r2 < 0) goto L_0x0026
            r3 = 2
            if (r2 > r3) goto L_0x0026
            r6.a = r2     // Catch:{ IllegalArgumentException -> 0x001e }
            goto L_0x0000
        L_0x001e:
            r2 = move-exception
            r7.e(r1)
            r6.a(r7, r0)
            goto L_0x0000
        L_0x0026:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r4 = 45
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.StringBuilder r2 = r5.append(r2)
            java.lang.String r4 = " is not a valid enum AppStateEvent"
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
            switch-data {0->0x000d, 8->0x000e, }
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eek.a(dlw):eek");
    }
}
