package defpackage;

/* renamed from: cta reason: default package */
/* compiled from: PG */
public final class cta extends defpackage.css {
    public static final defpackage.css a = new defpackage.cta(null, new java.lang.Object[0], 0);
    public static final long serialVersionUID = 0;
    private final transient int[] b;
    private final transient java.lang.Object[] c;
    private final transient int d;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0058, code lost:
        r1[r0] = r2 * 2;
        r2 = r2 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.cta a(int r9, java.lang.Object[] r10) {
        /*
            r0 = 0
            r8 = -1
            r2 = 0
            r3 = 1
            if (r9 != 0) goto L_0x000b
            css r0 = a
            cta r0 = (defpackage.cta) r0
        L_0x000a:
            return r0
        L_0x000b:
            if (r9 != r3) goto L_0x001b
            r1 = r10[r2]
            r2 = r10[r3]
            defpackage.cky.c(r1, r2)
            cta r1 = new cta
            r1.<init>(r0, r10, r3)
            r0 = r1
            goto L_0x000a
        L_0x001b:
            int r1 = r10.length
            int r1 = r1 >> 1
            defpackage.cld.b(r9, r1)
            int r1 = defpackage.csv.a(r9)
            if (r9 != r3) goto L_0x0035
            r1 = r10[r2]
            r2 = r10[r3]
            defpackage.cky.c(r1, r2)
        L_0x002e:
            cta r1 = new cta
            r1.<init>(r0, r10, r9)
            r0 = r1
            goto L_0x000a
        L_0x0035:
            int r3 = r1 + -1
            int[] r1 = new int[r1]
            java.util.Arrays.fill(r1, r8)
        L_0x003c:
            if (r2 >= r9) goto L_0x00de
            int r0 = r2 * 2
            r4 = r10[r0]
            int r0 = r2 * 2
            int r0 = r0 + 1
            r5 = r10[r0]
            defpackage.cky.c(r4, r5)
            int r0 = r4.hashCode()
            int r0 = defpackage.cky.a(r0)
        L_0x0053:
            r0 = r0 & r3
            r6 = r1[r0]
            if (r6 != r8) goto L_0x0060
            int r4 = r2 * 2
            r1[r0] = r4
            int r0 = r2 + 1
            r2 = r0
            goto L_0x003c
        L_0x0060:
            r7 = r10[r6]
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L_0x00da
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r2 = java.lang.String.valueOf(r5)
            r3 = r10[r6]
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r4 = r6 ^ 1
            r4 = r10[r4]
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = java.lang.String.valueOf(r1)
            int r5 = r5.length()
            int r5 = r5 + 39
            java.lang.String r6 = java.lang.String.valueOf(r2)
            int r6 = r6.length()
            int r5 = r5 + r6
            java.lang.String r6 = java.lang.String.valueOf(r3)
            int r6 = r6.length()
            int r5 = r5 + r6
            java.lang.String r6 = java.lang.String.valueOf(r4)
            int r6 = r6.length()
            int r5 = r5 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "Multiple entries with same key: "
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.StringBuilder r1 = r5.append(r1)
            java.lang.String r5 = "="
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " and "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = "="
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00da:
            int r0 = r0 + 1
            goto L_0x0053
        L_0x00de:
            r0 = r1
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cta.a(int, java.lang.Object[]):cta");
    }

    private cta(int[] iArr, java.lang.Object[] objArr, int i) {
        this.b = iArr;
        this.c = objArr;
        this.d = i;
    }

    public final int size() {
        return this.d;
    }

    public final java.lang.Object get(java.lang.Object obj) {
        int[] iArr = this.b;
        java.lang.Object[] objArr = this.c;
        int i = this.d;
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[0].equals(obj)) {
                return objArr[1];
            }
            return null;
        } else if (iArr == null) {
            return null;
        } else {
            int length = iArr.length - 1;
            int a2 = defpackage.cky.a(obj.hashCode());
            while (true) {
                int i2 = a2 & length;
                int i3 = iArr[i2];
                if (i3 == -1) {
                    return null;
                }
                if (objArr[i3].equals(obj)) {
                    return objArr[i3 ^ 1];
                }
                a2 = i2 + 1;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.csv a() {
        return new defpackage.ctb(this, this.c, this.d);
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.csv b() {
        return new defpackage.ctd(this, new defpackage.cte(this.c, 0, this.d));
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.csn c() {
        return new defpackage.cte(this.c, 1, this.d);
    }

    /* access modifiers changed from: 0000 */
    public final boolean d() {
        return false;
    }
}
