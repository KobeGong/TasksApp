package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: bla  reason: default package */
/* compiled from: PG */
public final class bla {
    public static final Object a = new Object();

    public static boolean a(int[] iArr, int[] iArr2) {
        if (iArr == null || iArr.length == 0) {
            return iArr2 == null || iArr2.length == 0;
        }
        return Arrays.equals(iArr, iArr2);
    }

    public static boolean a(long[] jArr, long[] jArr2) {
        if (jArr == null || jArr.length == 0) {
            return jArr2 == null || jArr2.length == 0;
        }
        return Arrays.equals(jArr, jArr2);
    }

    public static boolean a(byte[][] bArr, byte[][] bArr2) {
        boolean z;
        int length = bArr == null ? 0 : bArr.length;
        int length2 = bArr2 == null ? 0 : bArr2.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length || bArr[i2] != null) {
                int i3 = i;
                while (i3 < length2 && bArr2[i3] == null) {
                    i3++;
                }
                boolean z2 = i2 >= length;
                if (i3 >= length2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z2 && z) {
                    return true;
                }
                if (z2 != z || !Arrays.equals(bArr[i2], bArr2[i3])) {
                    return false;
                }
                i = i3 + 1;
                i2++;
            } else {
                i2++;
            }
        }
    }

    public static boolean a(Object[] objArr, Object[] objArr2) {
        boolean z;
        int length = objArr == null ? 0 : objArr.length;
        int length2 = objArr2 == null ? 0 : objArr2.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length || objArr[i2] != null) {
                int i3 = i;
                while (i3 < length2 && objArr2[i3] == null) {
                    i3++;
                }
                boolean z2 = i2 >= length;
                if (i3 >= length2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z2 && z) {
                    return true;
                }
                if (z2 != z || !objArr[i2].equals(objArr2[i3])) {
                    return false;
                }
                i = i3 + 1;
                i2++;
            } else {
                i2++;
            }
        }
    }

    public static int a(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(iArr);
    }

    public static int a(long[] jArr) {
        if (jArr == null || jArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(jArr);
    }

    public static int a(byte[][] bArr) {
        int i = 0;
        int length = bArr == null ? 0 : bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            byte[] bArr2 = bArr[i2];
            if (bArr2 != null) {
                i = (i * 31) + Arrays.hashCode(bArr2);
            }
        }
        return i;
    }

    public static int a(Object[] objArr) {
        int i = 0;
        int length = objArr == null ? 0 : objArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = objArr[i2];
            if (obj != null) {
                i = (i * 31) + obj.hashCode();
            }
        }
        return i;
    }

    public static void a(bkw bkw, bkw bkw2) {
        if (bkw.a != null) {
            bkw2.a = (bky) bkw.a.clone();
        }
    }

    static {
        Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
    }
}
