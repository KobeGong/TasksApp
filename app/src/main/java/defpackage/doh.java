package defpackage;

/* renamed from: doh reason: default package */
/* compiled from: PG */
public final class doh {
    public static final java.nio.charset.Charset a = java.nio.charset.Charset.forName("US-ASCII");

    public static defpackage.doy a(java.lang.String str, defpackage.dpa dpa) {
        boolean z = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        return defpackage.doy.a(str, z, dpa);
    }

    public static defpackage.dor a(byte[]... bArr) {
        return new defpackage.dor(bArr);
    }

    public static byte[][] a(defpackage.dor dor) {
        if ((dor.d << 1) == dor.a()) {
            return dor.c;
        }
        byte[][] bArr = new byte[(dor.d << 1)][];
        java.lang.System.arraycopy(dor.c, 0, bArr, 0, dor.d << 1);
        return bArr;
    }
}
