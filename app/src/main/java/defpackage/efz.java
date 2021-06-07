package defpackage;

/* renamed from: efz  reason: default package */
/* compiled from: PG */
public final class efz extends dlz {
    public String a = null;
    public int b = Integer.MIN_VALUE;
    private String c = null;

    public efz() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a);
        }
        if (this.b != Integer.MIN_VALUE) {
            dlx.a(2, this.b);
        }
        if (this.c != null) {
            dlx.a(3, this.c);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += dlx.b(1, this.a);
        }
        if (this.b != Integer.MIN_VALUE) {
            a2 += dlx.c(2, this.b);
        }
        if (this.c != null) {
            return a2 + dlx.b(3, this.c);
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        return r6;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.efz a(defpackage.dlw r7) {
        /*
            r6 = this;
        L_0x0000:
            int r0 = r7.a()
            switch(r0) {
                case 0: goto L_0x000d;
                case 10: goto L_0x000e;
                case 16: goto L_0x0015;
                case 26: goto L_0x0048;
                default: goto L_0x0007;
            }
        L_0x0007:
            boolean r0 = super.a(r7, r0)
            if (r0 != 0) goto L_0x0000
        L_0x000d:
            return r6
        L_0x000e:
            java.lang.String r0 = r7.d()
            r6.a = r0
            goto L_0x0000
        L_0x0015:
            int r1 = r7.i()
            int r2 = r7.e()     // Catch:{ IllegalArgumentException -> 0x0025 }
            if (r2 < 0) goto L_0x002d
            r3 = 5
            if (r2 > r3) goto L_0x002d
            r6.b = r2     // Catch:{ IllegalArgumentException -> 0x0025 }
            goto L_0x0000
        L_0x0025:
            r2 = move-exception
            r7.e(r1)
            r6.a(r7, r0)
            goto L_0x0000
        L_0x002d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r4 = 38
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.StringBuilder r2 = r5.append(r2)
            java.lang.String r4 = " is not a valid enum Metric"
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L_0x0048:
            java.lang.String r0 = r7.d()
            r6.c = r0
            goto L_0x0000
            switch-data {0->0x000d, 10->0x000e, 16->0x0015, 26->0x0048, }
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efz.a(dlw):efz");
    }
}
