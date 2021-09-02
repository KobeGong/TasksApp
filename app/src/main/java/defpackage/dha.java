package defpackage;

/* renamed from: dha reason: default package */
/* compiled from: PG */
public abstract class dha implements java.io.Serializable, java.lang.Iterable {
    public static final defpackage.dha a = new defpackage.dhh(defpackage.dim.b);
    private static final defpackage.dhd c;
    public int b = 0;

    dha() {
    }

    public abstract byte a(int i);

    public abstract int a();

    /* access modifiers changed from: protected */
    public abstract int a(int i, int i2, int i3);

    public abstract defpackage.dha a(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract java.lang.String a(java.nio.charset.Charset charset);

    /* access modifiers changed from: 0000 */
    public abstract void a(defpackage.dgz dgz);

    /* access modifiers changed from: protected */
    public abstract int b(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract void b(byte[] bArr, int i, int i2, int i3);

    public abstract boolean d();

    public abstract defpackage.dhj e();

    public abstract boolean equals(java.lang.Object obj);

    /* access modifiers changed from: protected */
    public abstract int f();

    /* access modifiers changed from: protected */
    public abstract boolean g();

    public static defpackage.dha a(byte[] bArr, int i, int i2) {
        return new defpackage.dhh(c.a(bArr, i, i2));
    }

    static defpackage.dha a(byte[] bArr) {
        return new defpackage.dhh(bArr);
    }

    public static defpackage.dha a(java.lang.String str) {
        return new defpackage.dhh(str.getBytes(defpackage.dim.a));
    }

    public static defpackage.dha a(java.lang.Iterable iterable) {
        int size = ((java.util.Collection) iterable).size();
        if (size == 0) {
            return a;
        }
        return a(iterable.iterator(), size);
    }

    private static defpackage.dha a(java.util.Iterator it, int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("length (%s) must be >= 1", new java.lang.Object[]{java.lang.Integer.valueOf(i)}));
        } else if (i == 1) {
            return (defpackage.dha) it.next();
        } else {
            int i2 = i >>> 1;
            defpackage.dha a2 = a(it, i2);
            defpackage.dha a3 = a(it, i - i2);
            if (Integer.MAX_VALUE - a2.a() >= a3.a()) {
                return defpackage.dkd.a(a2, a3);
            }
            int a4 = a2.a();
            throw new java.lang.IllegalArgumentException("ByteString would be too long: " + a4 + "+" + a3.a());
        }
    }

    public final void a(byte[] bArr, int i, int i2, int i3) {
        c(i, i + i3, a());
        c(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            b(bArr, i, i2, i3);
        }
    }

    public final byte[] b() {
        int a2 = a();
        if (a2 == 0) {
            return defpackage.dim.b;
        }
        byte[] bArr = new byte[a2];
        b(bArr, 0, 0, a2);
        return bArr;
    }

    public final java.lang.String c() {
        return a() == 0 ? "" : a(defpackage.dim.a);
    }

    public final int hashCode() {
        int i = this.b;
        if (i == 0) {
            int a2 = a();
            i = b(a2, 0, a2);
            if (i == 0) {
                i = 1;
            }
            this.b = i;
        }
        return i;
    }

    static defpackage.dhf b(int i) {
        return new defpackage.dhf(i);
    }

    static void b(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new java.lang.ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    static int c(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new java.lang.IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        } else if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        } else {
            throw new java.lang.IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
        }
    }

    public final java.lang.String toString() {
        return java.lang.String.format("<ByteString@%s size=%d>", new java.lang.Object[]{java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(a())});
    }

    public /* synthetic */ java.util.Iterator iterator() {
        return new defpackage.dhe(this);
    }

    static {
        defpackage.dhd dhb;
        if (defpackage.dgt.a()) {
            dhb = new defpackage.dhi();
        } else {
            dhb = new defpackage.dhb();
        }
        c = dhb;
    }
}
