package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: dha  reason: default package */
/* compiled from: PG */
public abstract class dha implements Serializable, Iterable {
    public static final dha a = new dhh(dim.b);
    private static final dhd c;
    public int b = 0;

    dha() {
    }

    public abstract byte a(int i);

    public abstract int a();

    /* access modifiers changed from: protected */
    public abstract int a(int i, int i2, int i3);

    public abstract dha a(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract String a(Charset charset);

    /* access modifiers changed from: package-private */
    public abstract void a(dgz dgz);

    /* access modifiers changed from: protected */
    public abstract int b(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract void b(byte[] bArr, int i, int i2, int i3);

    public abstract boolean d();

    public abstract dhj e();

    public abstract boolean equals(Object obj);

    /* access modifiers changed from: protected */
    public abstract int f();

    /* access modifiers changed from: protected */
    public abstract boolean g();

    public static dha a(byte[] bArr, int i, int i2) {
        return new dhh(c.a(bArr, i, i2));
    }

    static dha a(byte[] bArr) {
        return new dhh(bArr);
    }

    public static dha a(String str) {
        return new dhh(str.getBytes(dim.a));
    }

    public static dha a(Iterable iterable) {
        int size = ((Collection) iterable).size();
        if (size == 0) {
            return a;
        }
        return a(iterable.iterator(), size);
    }

    private static dha a(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
        } else if (i == 1) {
            return (dha) it.next();
        } else {
            int i2 = i >>> 1;
            dha a2 = a(it, i2);
            dha a3 = a(it, i - i2);
            if (Integer.MAX_VALUE - a2.a() >= a3.a()) {
                return dkd.a(a2, a3);
            }
            int a4 = a2.a();
            throw new IllegalArgumentException(new StringBuilder(53).append("ByteString would be too long: ").append(a4).append("+").append(a3.a()).toString());
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
            return dim.b;
        }
        byte[] bArr = new byte[a2];
        b(bArr, 0, 0, a2);
        return bArr;
    }

    public final String c() {
        return a() == 0 ? "" : a(dim.a);
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

    static dhf b(int i) {
        return new dhf(i);
    }

    static void b(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(new StringBuilder(22).append("Index < 0: ").append(i).toString());
        }
        throw new ArrayIndexOutOfBoundsException(new StringBuilder(40).append("Index > length: ").append(i).append(", ").append(i2).toString());
    }

    static int c(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(new StringBuilder(32).append("Beginning index: ").append(i).append(" < 0").toString());
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException(new StringBuilder(66).append("Beginning index larger than ending index: ").append(i).append(", ").append(i2).toString());
        } else {
            throw new IndexOutOfBoundsException(new StringBuilder(37).append("End index: ").append(i2).append(" >= ").append(i3).toString());
        }
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(a()));
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return new dhe(this);
    }

    static {
        dhd dhb;
        if (dgt.a()) {
            dhb = new dhi();
        } else {
            dhb = new dhb();
        }
        c = dhb;
    }
}
