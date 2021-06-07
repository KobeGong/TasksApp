package defpackage;

/* renamed from: bhc  reason: default package */
/* compiled from: PG */
public final class bhc extends dlz {
    private int a = Integer.MIN_VALUE;
    private String b = null;

    public bhc() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != Integer.MIN_VALUE) {
            dlx.a(1, this.a);
        }
        if (this.b != null) {
            dlx.a(2, this.b);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int a2 = super.a();
        if (this.a != Integer.MIN_VALUE) {
            a2 += dlx.c(1, this.a);
        }
        if (this.b != null) {
            return a2 + dlx.b(2, this.b);
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        return r6;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.bhc a(defpackage.dlw r7) {
        /*
            r6 = this;
        L_0x0000:
            int r0 = r7.a()
            switch(r0) {
                case 0: goto L_0x000d;
                case 8: goto L_0x000e;
                case 18: goto L_0x0041;
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
            r4 = 46
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.StringBuilder r2 = r5.append(r2)
            java.lang.String r4 = " is not a valid enum EntryPointType"
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L_0x0041:
            java.lang.String r0 = r7.d()
            r6.b = r0
            goto L_0x0000
            switch-data {0->0x000d, 8->0x000e, 18->0x0041, }
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhc.a(dlw):bhc");
    }
}
