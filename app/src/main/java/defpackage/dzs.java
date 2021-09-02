package defpackage;

/* renamed from: dzs reason: default package */
/* compiled from: PG */
public final class dzs {
    private static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.dzs.class.getName());
    private static final byte[] b = "-bin".getBytes(defpackage.crp.a);

    public static byte[][] a(defpackage.dor dor) {
        boolean z;
        byte[][] a2 = defpackage.doh.a(dor);
        if (a2 == null) {
            return new byte[0][];
        }
        int i = 0;
        for (int i2 = 0; i2 < a2.length; i2 += 2) {
            byte[] bArr = a2[i2];
            byte[] bArr2 = a2[i2 + 1];
            if (a(bArr, b)) {
                a2[i] = bArr;
                a2[i + 1] = defpackage.cwe.a.a(bArr2, bArr2.length).getBytes(defpackage.crp.a);
                i += 2;
            } else {
                int length = bArr2.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        z = true;
                        break;
                    }
                    byte b2 = bArr2[i3];
                    if (b2 < 32 || b2 > 126) {
                        z = false;
                    } else {
                        i3++;
                    }
                }
                z = false;
                if (z) {
                    a2[i] = bArr;
                    a2[i + 1] = bArr2;
                    i += 2;
                } else {
                    java.lang.String str = new java.lang.String(bArr, defpackage.crp.a);
                    java.lang.String arrays = java.util.Arrays.toString(bArr2);
                    a.logp(java.util.logging.Level.WARNING, "io.grpc.internal.TransportFrameUtil", "toHttp2Headers", new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 55 + java.lang.String.valueOf(arrays).length()).append("Metadata key=").append(str).append(", value=").append(arrays).append(" contains invalid ASCII characters").toString());
                }
            }
        }
        if (i == a2.length) {
            return a2;
        }
        return (byte[][]) java.util.Arrays.copyOfRange(a2, 0, i);
    }

    public static byte[][] a(byte[][] bArr) {
        for (int i = 0; i < bArr.length; i += 2) {
            byte[] bArr2 = bArr[i];
            byte[] bArr3 = bArr[i + 1];
            bArr[i] = bArr2;
            if (a(bArr2, b)) {
                bArr[i + 1] = defpackage.cwe.a.a((java.lang.CharSequence) new java.lang.String(bArr3, defpackage.crp.a));
            }
        }
        return bArr;
    }

    private static boolean a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i = length; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i - length]) {
                return false;
            }
        }
        return true;
    }

    private dzs() {
    }
}
