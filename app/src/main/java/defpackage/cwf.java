package defpackage;

import java.math.RoundingMode;
import java.util.Arrays;

/* access modifiers changed from: package-private */
/* renamed from: cwf  reason: default package */
/* compiled from: PG */
public final class cwf {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    private final boolean[] h;

    cwf(String str, char[] cArr) {
        int i;
        this.a = (String) cld.a(str);
        this.b = (char[]) cld.a(cArr);
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (length <= 0) {
                throw new IllegalArgumentException(new StringBuilder(String.valueOf("x").length() + 26).append("x").append(" (").append(length).append(") must be > 0").toString());
            }
            switch (cwy.a[roundingMode.ordinal()]) {
                case 1:
                    cub.a((((length + -1) & length) == 0) & (length > 0));
                case 2:
                case 3:
                    i = 31 - Integer.numberOfLeadingZeros(length);
                    break;
                case 4:
                case 5:
                    i = 32 - Integer.numberOfLeadingZeros(length - 1);
                    break;
                case 6:
                case 7:
                case 8:
                    int numberOfLeadingZeros = Integer.numberOfLeadingZeros(length);
                    i = (31 - numberOfLeadingZeros) + (((((-1257966797 >>> numberOfLeadingZeros) - length) ^ -1) ^ -1) >>> 31);
                    break;
                default:
                    throw new AssertionError();
            }
            this.d = i;
            int min = Math.min(8, Integer.lowestOneBit(this.d));
            try {
                this.e = 8 / min;
                this.f = this.d / min;
                this.c = cArr.length - 1;
                byte[] bArr = new byte[128];
                Arrays.fill(bArr, (byte) -1);
                for (int i2 = 0; i2 < cArr.length; i2++) {
                    char c2 = cArr[i2];
                    cld.a(c2 < 128, "Non-ASCII character: %s", c2);
                    cld.a(bArr[c2] == -1, "Duplicate character: %s", c2);
                    bArr[c2] = (byte) i2;
                }
                this.g = bArr;
                boolean[] zArr = new boolean[this.e];
                for (int i3 = 0; i3 < this.f; i3++) {
                    zArr[cmr.a(i3 << 3, this.d, RoundingMode.CEILING)] = true;
                }
                this.h = zArr;
            } catch (ArithmeticException e2) {
                String valueOf = String.valueOf(new String(cArr));
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Illegal alphabet ".concat(valueOf) : new String("Illegal alphabet "), e2);
            }
        } catch (ArithmeticException e3) {
            throw new IllegalArgumentException(new StringBuilder(35).append("Illegal alphabet length ").append(cArr.length).toString(), e3);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(int i) {
        return this.h[i % this.e];
    }

    /* access modifiers changed from: package-private */
    public final int a(char c2) {
        if (c2 > 127) {
            String valueOf = String.valueOf(Integer.toHexString(c2));
            throw new cwi(valueOf.length() != 0 ? "Unrecognized character: 0x".concat(valueOf) : new String("Unrecognized character: 0x"));
        }
        byte b2 = this.g[c2];
        if (b2 != -1) {
            return b2;
        }
        if (c2 <= ' ' || c2 == 127) {
            String valueOf2 = String.valueOf(Integer.toHexString(c2));
            throw new cwi(valueOf2.length() != 0 ? "Unrecognized character: 0x".concat(valueOf2) : new String("Unrecognized character: 0x"));
        }
        throw new cwi(new StringBuilder(25).append("Unrecognized character: ").append(c2).toString());
    }

    public final String toString() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cwf) {
            return Arrays.equals(this.b, ((cwf) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }
}
