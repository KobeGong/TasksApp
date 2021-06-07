package defpackage;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: dzs  reason: default package */
/* compiled from: PG */
public final class dzs {
    private static final Logger a = Logger.getLogger(dzs.class.getName());
    private static final byte[] b = "-bin".getBytes(crp.a);

    public static byte[][] a(dor dor) {
        boolean z;
        byte[][] a2 = doh.a(dor);
        if (a2 == null) {
            return new byte[0][];
        }
        int i = 0;
        for (int i2 = 0; i2 < a2.length; i2 += 2) {
            byte[] bArr = a2[i2];
            byte[] bArr2 = a2[i2 + 1];
            if (a(bArr, b)) {
                a2[i] = bArr;
                a2[i + 1] = cwe.a.a(bArr2, bArr2.length).getBytes(crp.a);
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
                    String str = new String(bArr, crp.a);
                    Logger logger = a;
                    Level level = Level.WARNING;
                    String arrays = Arrays.toString(bArr2);
                    logger.logp(level, "io.grpc.internal.TransportFrameUtil", "toHttp2Headers", new StringBuilder(String.valueOf(str).length() + 55 + String.valueOf(arrays).length()).append("Metadata key=").append(str).append(", value=").append(arrays).append(" contains invalid ASCII characters").toString());
                }
            }
        }
        return i == a2.length ? a2 : (byte[][]) Arrays.copyOfRange(a2, 0, i);
    }

    public static byte[][] a(byte[][] bArr) {
        for (int i = 0; i < bArr.length; i += 2) {
            byte[] bArr2 = bArr[i];
            byte[] bArr3 = bArr[i + 1];
            bArr[i] = bArr2;
            if (a(bArr2, b)) {
                bArr[i + 1] = cwe.a.a(new String(bArr3, crp.a));
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
