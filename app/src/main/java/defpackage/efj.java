package defpackage;

/* renamed from: efj  reason: default package */
/* compiled from: PG */
public final class efj extends dlz {
    private static volatile efj[] a;
    private int b = Integer.MIN_VALUE;
    private Integer c = null;

    public static efj[] d() {
        if (a == null) {
            synchronized (dmd.b) {
                if (a == null) {
                    a = new efj[0];
                }
            }
        }
        return a;
    }

    public efj() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.b != Integer.MIN_VALUE) {
            dlx.a(1, this.b);
        }
        if (this.c != null) {
            dlx.a(2, this.c.intValue());
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int a2 = super.a();
        if (this.b != Integer.MIN_VALUE) {
            a2 += dlx.c(1, this.b);
        }
        if (this.c != null) {
            return a2 + dlx.c(2, this.c.intValue());
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        return r6;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.efj a(defpackage.dlw r7) {
        /*
            r6 = this;
        L_0x0000:
            int r0 = r7.a()
            switch(r0) {
                case 0: goto L_0x000d;
                case 8: goto L_0x000e;
                case 16: goto L_0x0043;
                default: goto L_0x0007;
            }
        L_0x0007:
            boolean r0 = super.a(r7, r0)
            if (r0 != 0) goto L_0x0000
        L_0x000d:
            return r6
        L_0x000e:
            int r1 = r7.i()
            int r2 = r7.e()     // Catch:{ IllegalArgumentException -> 0x0020 }
            r3 = 4
            if (r2 < r3) goto L_0x0028
            r3 = 11
            if (r2 > r3) goto L_0x0028
            r6.b = r2     // Catch:{ IllegalArgumentException -> 0x0020 }
            goto L_0x0000
        L_0x0020:
            r2 = move-exception
            r7.e(r1)
            r6.a(r7, r0)
            goto L_0x0000
        L_0x0028:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r4 = 45
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.StringBuilder r2 = r5.append(r2)
            java.lang.String r4 = " is not a valid enum PrimitiveType"
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L_0x0043:
            int r0 = r7.e()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.c = r0
            goto L_0x0000
            switch-data {0->0x000d, 8->0x000e, 16->0x0043, }
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efj.a(dlw):efj");
    }
}
