package defpackage;

/* renamed from: cwf reason: default package */
/* compiled from: PG */
final class cwf {
    public final java.lang.String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    private final boolean[] h;

    cwf(java.lang.String str, char[] cArr) {
        int i;
        boolean z;
        boolean z2;
        this.a = (java.lang.String) defpackage.cld.a((java.lang.Object) str);
        this.b = (char[]) defpackage.cld.a((java.lang.Object) cArr);
        try {
            int length = cArr.length;
            java.math.RoundingMode roundingMode = java.math.RoundingMode.UNNECESSARY;
            java.lang.String str2 = "x";
            if (length <= 0) {
                throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 26).append(str2).append(" (").append(length).append(") must be > 0").toString());
            }
            switch (defpackage.cwy.a[roundingMode.ordinal()]) {
                case 1:
                    defpackage.cub.a((((length + -1) & length) == 0) & (length > 0));
                    break;
                case 2:
                case 3:
                    break;
                case 4:
                case 5:
                    i = 32 - java.lang.Integer.numberOfLeadingZeros(length - 1);
                    break;
                case 6:
                case 7:
                case 8:
                    int numberOfLeadingZeros = java.lang.Integer.numberOfLeadingZeros(length);
                    i = (31 - numberOfLeadingZeros) + (((((-1257966797 >>> numberOfLeadingZeros) - length) ^ -1) ^ -1) >>> 31);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
            i = 31 - java.lang.Integer.numberOfLeadingZeros(length);
            this.d = i;
            int min = java.lang.Math.min(8, java.lang.Integer.lowestOneBit(this.d));
            try {
                this.e = 8 / min;
                this.f = this.d / min;
                this.c = cArr.length - 1;
                byte[] bArr = new byte[128];
                java.util.Arrays.fill(bArr, -1);
                for (int i2 = 0; i2 < cArr.length; i2++) {
                    char c2 = cArr[i2];
                    if (c2 < 128) {
                        z = true;
                    } else {
                        z = false;
                    }
                    defpackage.cld.a(z, "Non-ASCII character: %s", c2);
                    if (bArr[c2] == -1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    defpackage.cld.a(z2, "Duplicate character: %s", c2);
                    bArr[c2] = (byte) i2;
                }
                this.g = bArr;
                boolean[] zArr = new boolean[this.e];
                for (int i3 = 0; i3 < this.f; i3++) {
                    zArr[defpackage.cmr.a(i3 << 3, this.d, java.math.RoundingMode.CEILING)] = true;
                }
                this.h = zArr;
            } catch (java.lang.ArithmeticException e2) {
                java.lang.ArithmeticException arithmeticException = e2;
                java.lang.String str3 = "Illegal alphabet ";
                java.lang.String valueOf = java.lang.String.valueOf(new java.lang.String(cArr));
                throw new java.lang.IllegalArgumentException(valueOf.length() != 0 ? str3.concat(valueOf) : new java.lang.String(str3), arithmeticException);
            }
        } catch (java.lang.ArithmeticException e3) {
            throw new java.lang.IllegalArgumentException("Illegal alphabet length " + cArr.length, e3);
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(int i) {
        return this.h[i % this.e];
    }

    /* access modifiers changed from: 0000 */
    public final int a(char c2) {
        if (c2 > 127) {
            java.lang.String str = "Unrecognized character: 0x";
            java.lang.String valueOf = java.lang.String.valueOf(java.lang.Integer.toHexString(c2));
            throw new defpackage.cwi(valueOf.length() != 0 ? str.concat(valueOf) : new java.lang.String(str));
        }
        byte b2 = this.g[c2];
        if (b2 != -1) {
            return b2;
        }
        if (c2 <= ' ' || c2 == 127) {
            java.lang.String str2 = "Unrecognized character: 0x";
            java.lang.String valueOf2 = java.lang.String.valueOf(java.lang.Integer.toHexString(c2));
            throw new defpackage.cwi(valueOf2.length() != 0 ? str2.concat(valueOf2) : new java.lang.String(str2));
        }
        throw new defpackage.cwi("Unrecognized character: " + c2);
    }

    public final java.lang.String toString() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.cwf)) {
            return false;
        }
        return java.util.Arrays.equals(this.b, ((defpackage.cwf) obj).b);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.b);
    }
}
