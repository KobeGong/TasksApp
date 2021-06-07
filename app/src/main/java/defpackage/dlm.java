package defpackage;

import java.nio.ByteBuffer;

/* renamed from: dlm  reason: default package */
/* compiled from: PG */
final class dlm extends dlj {
    dlm() {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0168, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        if (defpackage.dlc.a(r12, r0) > -65) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0088, code lost:
        if (defpackage.dlc.a(r12, r2) > -65) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d9, code lost:
        if (defpackage.dlc.a(r12, r2) > -65) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x012f, code lost:
        return -1;
     */
    @Override // defpackage.dlj
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(int r11, byte[] r12, int r13, int r14) {
        /*
        // Method dump skipped, instructions count: 426
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlm.a(int, byte[], int, int):int");
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.dlj
    public final int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        long j;
        long j2 = (long) i;
        long j3 = j2 + ((long) i2);
        int length = charSequence.length();
        if (length > i2 || bArr.length - i2 < i) {
            throw new ArrayIndexOutOfBoundsException(new StringBuilder(37).append("Failed writing ").append(charSequence.charAt(length - 1)).append(" at index ").append(i + i2).toString());
        }
        int i3 = 0;
        while (i3 < length) {
            char charAt = charSequence.charAt(i3);
            if (charAt >= 128) {
                break;
            }
            dlc.a(bArr, j2, (byte) charAt);
            i3++;
            j2 = 1 + j2;
        }
        if (i3 == length) {
            return (int) j2;
        }
        long j4 = j2;
        while (i3 < length) {
            char charAt2 = charSequence.charAt(i3);
            if (charAt2 < 128 && j4 < j3) {
                j = 1 + j4;
                dlc.a(bArr, j4, (byte) charAt2);
            } else if (charAt2 < 2048 && j4 <= j3 - 2) {
                long j5 = j4 + 1;
                dlc.a(bArr, j4, (byte) ((charAt2 >>> 6) | 960));
                j = 1 + j5;
                dlc.a(bArr, j5, (byte) ((charAt2 & '?') | 128));
            } else if ((charAt2 < 55296 || 57343 < charAt2) && j4 <= j3 - 3) {
                long j6 = 1 + j4;
                dlc.a(bArr, j4, (byte) ((charAt2 >>> '\f') | 480));
                long j7 = 1 + j6;
                dlc.a(bArr, j6, (byte) (((charAt2 >>> 6) & 63) | 128));
                j = 1 + j7;
                dlc.a(bArr, j7, (byte) ((charAt2 & '?') | 128));
            } else if (j4 <= j3 - 4) {
                if (i3 + 1 != length) {
                    i3++;
                    char charAt3 = charSequence.charAt(i3);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                        long j8 = 1 + j4;
                        dlc.a(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                        long j9 = 1 + j8;
                        dlc.a(bArr, j8, (byte) (((codePoint >>> 12) & 63) | 128));
                        long j10 = j9 + 1;
                        dlc.a(bArr, j9, (byte) (((codePoint >>> 6) & 63) | 128));
                        j = 1 + j10;
                        dlc.a(bArr, j10, (byte) ((codePoint & 63) | 128));
                    }
                }
                throw new dll(i3 - 1, length);
            } else if (55296 > charAt2 || charAt2 > 57343 || (i3 + 1 != length && Character.isSurrogatePair(charAt2, charSequence.charAt(i3 + 1)))) {
                throw new ArrayIndexOutOfBoundsException(new StringBuilder(46).append("Failed writing ").append(charAt2).append(" at index ").append(j4).toString());
            } else {
                throw new dll(i3, length);
            }
            i3++;
            j4 = j;
        }
        return (int) j4;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.dlj
    public final void a(CharSequence charSequence, ByteBuffer byteBuffer) {
        long j;
        long a = dlc.a(byteBuffer);
        long position = a + ((long) byteBuffer.position());
        long limit = a + ((long) byteBuffer.limit());
        int length = charSequence.length();
        if (((long) length) > limit - position) {
            char charAt = charSequence.charAt(length - 1);
            throw new ArrayIndexOutOfBoundsException(new StringBuilder(37).append("Failed writing ").append(charAt).append(" at index ").append(byteBuffer.limit()).toString());
        }
        int i = 0;
        while (i < length) {
            char charAt2 = charSequence.charAt(i);
            if (charAt2 >= 128) {
                break;
            }
            dlc.a(position, (byte) charAt2);
            i++;
            position = 1 + position;
        }
        if (i == length) {
            byteBuffer.position((int) (position - a));
            return;
        }
        long j2 = position;
        while (i < length) {
            char charAt3 = charSequence.charAt(i);
            if (charAt3 < 128 && j2 < limit) {
                j = 1 + j2;
                dlc.a(j2, (byte) charAt3);
            } else if (charAt3 < 2048 && j2 <= limit - 2) {
                long j3 = j2 + 1;
                dlc.a(j2, (byte) ((charAt3 >>> 6) | 960));
                j = 1 + j3;
                dlc.a(j3, (byte) ((charAt3 & '?') | 128));
            } else if ((charAt3 < 55296 || 57343 < charAt3) && j2 <= limit - 3) {
                long j4 = 1 + j2;
                dlc.a(j2, (byte) ((charAt3 >>> '\f') | 480));
                long j5 = 1 + j4;
                dlc.a(j4, (byte) (((charAt3 >>> 6) & 63) | 128));
                j = 1 + j5;
                dlc.a(j5, (byte) ((charAt3 & '?') | 128));
            } else if (j2 <= limit - 4) {
                if (i + 1 != length) {
                    i++;
                    char charAt4 = charSequence.charAt(i);
                    if (Character.isSurrogatePair(charAt3, charAt4)) {
                        int codePoint = Character.toCodePoint(charAt3, charAt4);
                        long j6 = 1 + j2;
                        dlc.a(j2, (byte) ((codePoint >>> 18) | 240));
                        long j7 = 1 + j6;
                        dlc.a(j6, (byte) (((codePoint >>> 12) & 63) | 128));
                        long j8 = j7 + 1;
                        dlc.a(j7, (byte) (((codePoint >>> 6) & 63) | 128));
                        j = 1 + j8;
                        dlc.a(j8, (byte) ((codePoint & 63) | 128));
                    }
                }
                throw new dll(i - 1, length);
            } else if (55296 > charAt3 || charAt3 > 57343 || (i + 1 != length && Character.isSurrogatePair(charAt3, charSequence.charAt(i + 1)))) {
                throw new ArrayIndexOutOfBoundsException(new StringBuilder(46).append("Failed writing ").append(charAt3).append(" at index ").append(j2).toString());
            } else {
                throw new dll(i, length);
            }
            i++;
            j2 = j;
        }
        byteBuffer.position((int) (j2 - a));
    }

    private static int a(byte[] bArr, int i, long j, int i2) {
        switch (i2) {
            case 0:
                return dli.a(i);
            case 1:
                return dli.a(i, dlc.a(bArr, j));
            case 2:
                return dli.a(i, dlc.a(bArr, j), dlc.a(bArr, 1 + j));
            default:
                throw new AssertionError();
        }
    }
}
