package defpackage;

/* renamed from: egc  reason: default package */
/* compiled from: PG */
public final class egc extends dlz {
    public Long a = null;
    public int b = Integer.MIN_VALUE;

    public egc() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a.longValue());
        }
        if (this.b != Integer.MIN_VALUE) {
            dlx.a(2, this.b);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += dlx.c(1, this.a.longValue());
        }
        if (this.b != Integer.MIN_VALUE) {
            return a2 + dlx.c(2, this.b);
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder(41).append(r2).append(" is not a valid enum EndStatus").toString());
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.egc a(defpackage.dlw r7) {
        /*
            r6 = this;
        L_0x0000:
            int r0 = r7.a()
            switch(r0) {
                case 0: goto L_0x000d;
                case 8: goto L_0x000e;
                case 16: goto L_0x0019;
                default: goto L_0x0007;
            }
        L_0x0007:
            boolean r0 = super.a(r7, r0)
            if (r0 != 0) goto L_0x0000
        L_0x000d:
            return r6
        L_0x000e:
            long r0 = r7.b()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.a = r0
            goto L_0x0000
        L_0x0019:
            int r1 = r7.i()
            int r2 = r7.e()     // Catch:{ IllegalArgumentException -> 0x0029 }
            if (r2 < 0) goto L_0x0031
            r3 = 3
            if (r2 > r3) goto L_0x0031
            r6.b = r2     // Catch:{ IllegalArgumentException -> 0x0029 }
            goto L_0x0000
        L_0x0029:
            r2 = move-exception
            r7.e(r1)
            r6.a(r7, r0)
            goto L_0x0000
        L_0x0031:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r4 = 41
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.StringBuilder r2 = r5.append(r2)
            java.lang.String r4 = " is not a valid enum EndStatus"
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
            switch-data {0->0x000d, 8->0x000e, 16->0x0019, }
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egc.a(dlw):egc");
    }
}
