package defpackage;

/* renamed from: dli reason: default package */
/* compiled from: PG */
final class dli {
    public static final defpackage.dlj a = (defpackage.dlc.c && defpackage.dlc.b ? new defpackage.dlm() : new defpackage.dlk());

    public static boolean a(byte[] bArr, int i, int i2) {
        return a.a(bArr, i, i2);
    }

    static int a(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    static int a(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return (i2 << 8) ^ i;
    }

    static int a(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return ((i2 << 8) ^ i) ^ (i3 << 16);
    }

    static int b(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        switch (i2 - i) {
            case 0:
                return a((int) b);
            case 1:
                return a((int) b, (int) bArr[i]);
            case 2:
                return a((int) b, (int) bArr[i], (int) bArr[i + 1]);
            default:
                throw new java.lang.AssertionError();
        }
    }

    static int a(java.lang.CharSequence charSequence) {
        int i;
        int i2 = 0;
        int length = charSequence.length();
        int i3 = 0;
        while (i3 < length && charSequence.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (true) {
            if (i3 >= length) {
                i = i4;
                break;
            }
            char charAt = charSequence.charAt(i3);
            if (charAt < 2048) {
                i4 += (127 - charAt) >>> 31;
                i3++;
            } else {
                int length2 = charSequence.length();
                while (i3 < length2) {
                    char charAt2 = charSequence.charAt(i3);
                    if (charAt2 < 2048) {
                        i2 += (127 - charAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (java.lang.Character.codePointAt(charSequence, i3) < 65536) {
                                throw new defpackage.dll(i3, length2);
                            }
                            i3++;
                        }
                    }
                    i3++;
                }
                i = i4 + i2;
            }
        }
        if (i >= length) {
            return i;
        }
        throw new java.lang.IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i) + 4294967296L));
    }

    static int a(java.lang.CharSequence charSequence, byte[] bArr, int i, int i2) {
        return a.a(charSequence, bArr, i, i2);
    }

    static void a(java.lang.CharSequence charSequence, java.nio.ByteBuffer byteBuffer) {
        defpackage.dlj dlj = a;
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(a(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else if (byteBuffer.isDirect()) {
            dlj.a(charSequence, byteBuffer);
        } else {
            defpackage.dlj.b(charSequence, byteBuffer);
        }
    }
}
