package defpackage;

/* renamed from: dor reason: default package */
/* compiled from: PG */
public final class dor {
    public static final defpackage.dox a = new defpackage.dos();
    public static final defpackage.dov b = new defpackage.dot();
    public byte[][] c;
    public int d;

    dor(byte[]... bArr) {
        this(bArr.length / 2, bArr);
    }

    private dor(int i, byte[]... bArr) {
        this.d = i;
        this.c = bArr;
    }

    public final byte[] a(int i) {
        return this.c[i << 1];
    }

    private final void a(int i, byte[] bArr) {
        this.c[i << 1] = bArr;
    }

    private final byte[] b(int i) {
        return this.c[(i << 1) + 1];
    }

    private final void b(int i, byte[] bArr) {
        this.c[(i << 1) + 1] = bArr;
    }

    /* access modifiers changed from: 0000 */
    public final int a() {
        if (this.c != null) {
            return this.c.length;
        }
        return 0;
    }

    private final boolean b() {
        return this.d == 0;
    }

    public dor() {
    }

    public final java.lang.Object a(defpackage.doy doy) {
        for (int i = this.d - 1; i >= 0; i--) {
            if (java.util.Arrays.equals(doy.b, a(i))) {
                return doy.a(b(i));
            }
        }
        return null;
    }

    public final void a(defpackage.doy doy, java.lang.Object obj) {
        defpackage.cld.a((java.lang.Object) doy, (java.lang.Object) "key");
        defpackage.cld.a(obj, (java.lang.Object) "value");
        if ((this.d << 1) == 0 || (this.d << 1) == a()) {
            c(java.lang.Math.max((this.d << 1) << 1, 8));
        }
        a(this.d, doy.b);
        b(this.d, doy.a(obj));
        this.d++;
    }

    private final void c(int i) {
        byte[][] bArr = new byte[i][];
        if (!b()) {
            java.lang.System.arraycopy(this.c, 0, bArr, 0, this.d << 1);
        }
        this.c = bArr;
    }

    public final void b(defpackage.doy doy) {
        if (!b()) {
            int i = 0;
            for (int i2 = 0; i2 < this.d; i2++) {
                if (!java.util.Arrays.equals(doy.b, a(i2))) {
                    a(i, a(i2));
                    b(i, b(i2));
                    i++;
                }
            }
            java.util.Arrays.fill(this.c, i << 1, this.d << 1, null);
            this.d = i;
        }
    }

    public final void a(defpackage.dor dor) {
        if (!dor.b()) {
            int a2 = a() - (this.d << 1);
            if (b() || a2 < (dor.d << 1)) {
                c((this.d << 1) + (dor.d << 1));
            }
            java.lang.System.arraycopy(dor.c, 0, this.c, this.d << 1, dor.d << 1);
            this.d += dor.d;
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Metadata(");
        for (int i = 0; i < this.d; i++) {
            if (i != 0) {
                sb.append(',');
            }
            java.lang.String str = new java.lang.String(a(i), defpackage.crp.a);
            sb.append(str).append('=');
            if (str.endsWith("-bin")) {
                defpackage.cwe cwe = defpackage.cwe.a;
                byte[] b2 = b(i);
                sb.append(cwe.a(b2, b2.length));
            } else {
                sb.append(new java.lang.String(b(i), defpackage.crp.a));
            }
        }
        return sb.append(')').toString();
    }

    public static boolean a(byte[] bArr, byte[] bArr2) {
        return java.util.Arrays.equals(bArr, bArr2);
    }
}
