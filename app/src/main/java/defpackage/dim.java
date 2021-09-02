package defpackage;

/* renamed from: dim reason: default package */
/* compiled from: PG */
public final class dim {
    public static final java.nio.charset.Charset a = java.nio.charset.Charset.forName("UTF-8");
    public static final byte[] b;

    public static java.lang.Object a(java.lang.Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException();
    }

    static java.lang.Object a(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException(str);
    }

    public static boolean a(byte[] bArr) {
        return defpackage.dli.a.a(bArr, 0, bArr.length);
    }

    public static java.lang.String b(byte[] bArr) {
        return new java.lang.String(bArr, a);
    }

    public static int a(long j) {
        return (int) ((j >>> 32) ^ j);
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int c(byte[] bArr) {
        int length = bArr.length;
        int a2 = a(length, bArr, 0, length);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    static int a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    static boolean a() {
        return false;
    }

    static java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.djo) obj).g().a((defpackage.djo) obj2).c();
    }

    static {
        java.nio.charset.Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        java.nio.ByteBuffer.wrap(bArr);
        byte[] bArr2 = b;
        defpackage.dhj.a(bArr2, 0, bArr2.length, false);
    }
}
