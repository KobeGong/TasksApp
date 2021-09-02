package defpackage;

/* renamed from: dlk reason: default package */
/* compiled from: PG */
final class dlk extends defpackage.dlj {
    dlk() {
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: CFG modification limit reached, blocks count: 198 */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        if (r12[r3] > -65) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x007d, code lost:
        if (r12[r3] > -65) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x009d, code lost:
        if (r11 >= -32) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x009f, code lost:
        if (r3 >= r14) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00a3, code lost:
        if (r11 < -62) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00a5, code lost:
        r0 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00a9, code lost:
        if (r12[r3] <= -65) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ab, code lost:
        r11 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00b0, code lost:
        if (r11 >= -16) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00b4, code lost:
        if (r3 < (r14 - 1)) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00b6, code lost:
        r11 = defpackage.dli.b(r12, r3, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00bc, code lost:
        r4 = r3 + 1;
        r0 = r12[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00c0, code lost:
        if (r0 > -65) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00c2, code lost:
        if (r11 != -32) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00c4, code lost:
        if (r0 < -96) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00c8, code lost:
        if (r11 != -19) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00ca, code lost:
        if (r0 >= -96) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00cc, code lost:
        r0 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00d0, code lost:
        if (r12[r4] <= -65) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00d2, code lost:
        r11 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x00d7, code lost:
        if (r3 < (r14 - 2)) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00d9, code lost:
        r11 = defpackage.dli.b(r12, r3, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x00df, code lost:
        r0 = r3 + 1;
        r3 = r12[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x00e3, code lost:
        if (r3 > -65) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x00ec, code lost:
        if ((((r3 + 112) + (r11 << 28)) >> 30) != 0) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x00ee, code lost:
        r3 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x00f2, code lost:
        if (r12[r0] > -65) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x00f4, code lost:
        r0 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x00f8, code lost:
        if (r12[r3] <= -65) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x00fa, code lost:
        r11 = -1;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r11v2, types: [byte, int] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(int r11, byte[] r12, int r13, int r14) {
        /*
            r10 = this;
            r2 = 0
            r9 = -32
            r8 = -96
            r1 = -1
            r7 = -65
            if (r11 == 0) goto L_0x0082
            if (r13 < r14) goto L_0x000d
        L_0x000c:
            return r11
        L_0x000d:
            byte r6 = (byte) r11
            if (r6 >= r9) goto L_0x001c
            r0 = -62
            if (r6 < r0) goto L_0x001a
            int r0 = r13 + 1
            byte r3 = r12[r13]
            if (r3 <= r7) goto L_0x0081
        L_0x001a:
            r11 = r1
            goto L_0x000c
        L_0x001c:
            r0 = -16
            if (r6 >= r0) goto L_0x0047
            int r0 = r11 >> 8
            r0 = r0 ^ -1
            byte r0 = (byte) r0
            if (r0 != 0) goto L_0x0032
            int r3 = r13 + 1
            byte r0 = r12[r13]
            if (r3 < r14) goto L_0x0033
            int r11 = defpackage.dli.a(r6, r0)
            goto L_0x000c
        L_0x0032:
            r3 = r13
        L_0x0033:
            if (r0 > r7) goto L_0x0045
            if (r6 != r9) goto L_0x0039
            if (r0 < r8) goto L_0x0045
        L_0x0039:
            r4 = -19
            if (r6 != r4) goto L_0x003f
            if (r0 >= r8) goto L_0x0045
        L_0x003f:
            int r13 = r3 + 1
            byte r0 = r12[r3]
            if (r0 <= r7) goto L_0x0082
        L_0x0045:
            r11 = r1
            goto L_0x000c
        L_0x0047:
            int r0 = r11 >> 8
            r0 = r0 ^ -1
            byte r3 = (byte) r0
            if (r3 != 0) goto L_0x0059
            int r4 = r13 + 1
            byte r0 = r12[r13]
            if (r4 < r14) goto L_0x00fd
            int r11 = defpackage.dli.a(r6, r0)
            goto L_0x000c
        L_0x0059:
            int r0 = r11 >> 16
            byte r0 = (byte) r0
            r5 = r3
            r4 = r13
        L_0x005e:
            if (r0 != 0) goto L_0x006b
            int r3 = r4 + 1
            byte r0 = r12[r4]
            if (r3 < r14) goto L_0x006c
            int r11 = defpackage.dli.a(r6, r5, r0)
            goto L_0x000c
        L_0x006b:
            r3 = r4
        L_0x006c:
            if (r5 > r7) goto L_0x007f
            int r4 = r6 << 28
            int r5 = r5 + 112
            int r4 = r4 + r5
            int r4 = r4 >> 30
            if (r4 != 0) goto L_0x007f
            if (r0 > r7) goto L_0x007f
            int r13 = r3 + 1
            byte r0 = r12[r3]
            if (r0 <= r7) goto L_0x0082
        L_0x007f:
            r11 = r1
            goto L_0x000c
        L_0x0081:
            r13 = r0
        L_0x0082:
            r0 = r13
        L_0x0083:
            if (r0 >= r14) goto L_0x008c
            byte r3 = r12[r0]
            if (r3 < 0) goto L_0x008c
            int r0 = r0 + 1
            goto L_0x0083
        L_0x008c:
            if (r0 < r14) goto L_0x0092
            r11 = r2
            goto L_0x000c
        L_0x0091:
            r0 = r3
        L_0x0092:
            if (r0 < r14) goto L_0x0097
            r11 = r2
            goto L_0x000c
        L_0x0097:
            int r3 = r0 + 1
            byte r11 = r12[r0]
            if (r11 >= 0) goto L_0x0091
            if (r11 >= r9) goto L_0x00ae
            if (r3 >= r14) goto L_0x000c
            r0 = -62
            if (r11 < r0) goto L_0x00ab
            int r0 = r3 + 1
            byte r3 = r12[r3]
            if (r3 <= r7) goto L_0x0092
        L_0x00ab:
            r11 = r1
            goto L_0x000c
        L_0x00ae:
            r0 = -16
            if (r11 >= r0) goto L_0x00d5
            int r0 = r14 + -1
            if (r3 < r0) goto L_0x00bc
            int r11 = defpackage.dli.b(r12, r3, r14)
            goto L_0x000c
        L_0x00bc:
            int r4 = r3 + 1
            byte r0 = r12[r3]
            if (r0 > r7) goto L_0x00d2
            if (r11 != r9) goto L_0x00c6
            if (r0 < r8) goto L_0x00d2
        L_0x00c6:
            r3 = -19
            if (r11 != r3) goto L_0x00cc
            if (r0 >= r8) goto L_0x00d2
        L_0x00cc:
            int r0 = r4 + 1
            byte r3 = r12[r4]
            if (r3 <= r7) goto L_0x0092
        L_0x00d2:
            r11 = r1
            goto L_0x000c
        L_0x00d5:
            int r0 = r14 + -2
            if (r3 < r0) goto L_0x00df
            int r11 = defpackage.dli.b(r12, r3, r14)
            goto L_0x000c
        L_0x00df:
            int r0 = r3 + 1
            byte r3 = r12[r3]
            if (r3 > r7) goto L_0x00fa
            int r4 = r11 << 28
            int r3 = r3 + 112
            int r3 = r3 + r4
            int r3 = r3 >> 30
            if (r3 != 0) goto L_0x00fa
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 > r7) goto L_0x00fa
            int r0 = r3 + 1
            byte r3 = r12[r3]
            if (r3 <= r7) goto L_0x0092
        L_0x00fa:
            r11 = r1
            goto L_0x000c
        L_0x00fd:
            r5 = r0
            r0 = r2
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlk.a(int, byte[], int, int):int");
    }

    /* access modifiers changed from: 0000 */
    public final int a(java.lang.CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int length = charSequence.length();
        int i4 = 0;
        int i5 = i + i2;
        while (i4 < length && i4 + i < i5) {
            char charAt = charSequence.charAt(i4);
            if (charAt >= 128) {
                break;
            }
            bArr[i + i4] = (byte) charAt;
            i4++;
        }
        if (i4 == length) {
            return i + length;
        }
        int i6 = i + i4;
        while (i4 < length) {
            char charAt2 = charSequence.charAt(i4);
            if (charAt2 < 128 && i6 < i5) {
                i3 = i6 + 1;
                bArr[i6] = (byte) charAt2;
            } else if (charAt2 < 2048 && i6 <= i5 - 2) {
                int i7 = i6 + 1;
                bArr[i6] = (byte) ((charAt2 >>> 6) | 960);
                i3 = i7 + 1;
                bArr[i7] = (byte) ((charAt2 & '?') | 128);
            } else if ((charAt2 < 55296 || 57343 < charAt2) && i6 <= i5 - 3) {
                int i8 = i6 + 1;
                bArr[i6] = (byte) ((charAt2 >>> 12) | 480);
                int i9 = i8 + 1;
                bArr[i8] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i3 = i9 + 1;
                bArr[i9] = (byte) ((charAt2 & '?') | 128);
            } else if (i6 <= i5 - 4) {
                if (i4 + 1 != charSequence.length()) {
                    i4++;
                    char charAt3 = charSequence.charAt(i4);
                    if (java.lang.Character.isSurrogatePair(charAt2, charAt3)) {
                        int codePoint = java.lang.Character.toCodePoint(charAt2, charAt3);
                        int i10 = i6 + 1;
                        bArr[i6] = (byte) ((codePoint >>> 18) | 240);
                        int i11 = i10 + 1;
                        bArr[i10] = (byte) (((codePoint >>> 12) & 63) | 128);
                        int i12 = i11 + 1;
                        bArr[i11] = (byte) (((codePoint >>> 6) & 63) | 128);
                        i3 = i12 + 1;
                        bArr[i12] = (byte) ((codePoint & 63) | 128);
                    }
                }
                throw new defpackage.dll(i4 - 1, length);
            } else if (55296 > charAt2 || charAt2 > 57343 || (i4 + 1 != charSequence.length() && java.lang.Character.isSurrogatePair(charAt2, charSequence.charAt(i4 + 1)))) {
                throw new java.lang.ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i6);
            } else {
                throw new defpackage.dll(i4, length);
            }
            i4++;
            i6 = i3;
        }
        return i6;
    }

    /* access modifiers changed from: 0000 */
    public final void a(java.lang.CharSequence charSequence, java.nio.ByteBuffer byteBuffer) {
        b(charSequence, byteBuffer);
    }
}
