package defpackage;

/* renamed from: cmr reason: default package */
/* compiled from: PG */
public final class cmr implements defpackage.clt {
    public final /* synthetic */ java.lang.Object a() {
        return new defpackage.ckj().a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0060, code lost:
        if ((((r2 & 1) != 0) & (r9 == java.math.RoundingMode.HALF_EVEN)) != false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(int r7, int r8, java.math.RoundingMode r9) {
        /*
            r0 = 1
            r1 = 0
            defpackage.cld.a(r9)
            if (r8 != 0) goto L_0x000f
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "/ by zero"
            r0.<init>(r1)
            throw r0
        L_0x000f:
            int r2 = r7 / r8
            int r3 = r8 * r2
            int r3 = r7 - r3
            if (r3 != 0) goto L_0x0019
            r0 = r2
        L_0x0018:
            return r0
        L_0x0019:
            r4 = r7 ^ r8
            int r4 = r4 >> 31
            r5 = r4 | 1
            int[] r4 = defpackage.cwy.a
            int r6 = r9.ordinal()
            r4 = r4[r6]
            switch(r4) {
                case 1: goto L_0x0030;
                case 2: goto L_0x0035;
                case 3: goto L_0x0041;
                case 4: goto L_0x0036;
                case 5: goto L_0x003d;
                case 6: goto L_0x0045;
                case 7: goto L_0x0045;
                case 8: goto L_0x0045;
                default: goto L_0x002a;
            }
        L_0x002a:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0030:
            if (r3 != 0) goto L_0x003b
        L_0x0032:
            defpackage.cub.a(r0)
        L_0x0035:
            r0 = r1
        L_0x0036:
            if (r0 == 0) goto L_0x006d
            int r0 = r2 + r5
            goto L_0x0018
        L_0x003b:
            r0 = r1
            goto L_0x0032
        L_0x003d:
            if (r5 > 0) goto L_0x0036
            r0 = r1
            goto L_0x0036
        L_0x0041:
            if (r5 < 0) goto L_0x0036
            r0 = r1
            goto L_0x0036
        L_0x0045:
            int r3 = java.lang.Math.abs(r3)
            int r4 = java.lang.Math.abs(r8)
            int r4 = r4 - r3
            int r3 = r3 - r4
            if (r3 != 0) goto L_0x0069
            java.math.RoundingMode r3 = java.math.RoundingMode.HALF_UP
            if (r9 == r3) goto L_0x0062
            java.math.RoundingMode r3 = java.math.RoundingMode.HALF_EVEN
            if (r9 != r3) goto L_0x0065
            r4 = r0
        L_0x005a:
            r3 = r2 & 1
            if (r3 == 0) goto L_0x0067
            r3 = r0
        L_0x005f:
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0063
        L_0x0062:
            r1 = r0
        L_0x0063:
            r0 = r1
            goto L_0x0036
        L_0x0065:
            r4 = r1
            goto L_0x005a
        L_0x0067:
            r3 = r1
            goto L_0x005f
        L_0x0069:
            if (r3 > 0) goto L_0x0036
            r0 = r1
            goto L_0x0036
        L_0x006d:
            r0 = r2
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmr.a(int, int, java.math.RoundingMode):int");
    }
}
