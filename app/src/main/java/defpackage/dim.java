package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: dim  reason: default package */
/* compiled from: PG */
public final class dim {
    public static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    public static Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException();
    }

    static Object a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static boolean a(byte[] bArr) {
        return dli.a.a(bArr, 0, bArr.length);
    }

    public static String b(byte[] bArr) {
        return new String(bArr, a);
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

    static Object a(Object obj, Object obj2) {
        return ((djo) obj).g().a((djo) obj2).c();
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        byte[] bArr2 = b;
        dhj.a(bArr2, 0, bArr2.length, false);
    }
}
