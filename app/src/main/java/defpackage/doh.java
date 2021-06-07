package defpackage;

import java.nio.charset.Charset;

/* renamed from: doh  reason: default package */
/* compiled from: PG */
public final class doh {
    public static final Charset a = Charset.forName("US-ASCII");

    public static doy a(String str, dpa dpa) {
        boolean z = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        return doy.a(str, z, dpa);
    }

    public static dor a(byte[]... bArr) {
        return new dor(bArr);
    }

    public static byte[][] a(dor dor) {
        if ((dor.d << 1) == dor.a()) {
            return dor.c;
        }
        byte[][] bArr = new byte[(dor.d << 1)][];
        System.arraycopy(dor.c, 0, bArr, 0, dor.d << 1);
        return bArr;
    }
}
