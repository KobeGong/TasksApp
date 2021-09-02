package defpackage;

/* renamed from: dlm reason: default package */
/* compiled from: PG */
final class dlm extends defpackage.dlj {
    dlm() {
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        if (defpackage.dlc.a(r12, r0) > -65) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0088, code lost:
        if (defpackage.dlc.a(r12, r2) > -65) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d9, code lost:
        if (defpackage.dlc.a(r12, r2) > -65) goto L_0x00db;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(int r11, byte[] r12, int r13, int r14) {
        /*
            r10 = this;
            r0 = r13 | r14
            int r1 = r12.length
            int r1 = r1 - r14
            r0 = r0 | r1
            if (r0 >= 0) goto L_0x002c
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.String r1 = "Array length=%d, index=%d, limit=%d"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            int r4 = r12.length
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r2[r3] = r4
            r3 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            r2[r3] = r4
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
        L_0x002c:
            long r0 = (long) r13
            long r6 = (long) r14
            if (r11 == 0) goto L_0x00de
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0035
        L_0x0034:
            return r11
        L_0x0035:
            byte r8 = (byte) r11
            r2 = -32
            if (r8 >= r2) goto L_0x004c
            r2 = -62
            if (r8 < r2) goto L_0x004a
            r2 = 1
            long r4 = r0 + r2
            byte r0 = defpackage.dlc.a(r12, r0)
            r1 = -65
            if (r0 <= r1) goto L_0x00df
        L_0x004a:
            r11 = -1
            goto L_0x0034
        L_0x004c:
            r2 = -16
            if (r8 >= r2) goto L_0x008c
            int r2 = r11 >> 8
            r2 = r2 ^ -1
            byte r2 = (byte) r2
            if (r2 != 0) goto L_0x0067
            r2 = 1
            long r2 = r2 + r0
            byte r0 = defpackage.dlc.a(r12, r0)
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x006a
            int r11 = defpackage.dli.a(r8, r0)
            goto L_0x0034
        L_0x0067:
            r9 = r2
            r2 = r0
            r0 = r9
        L_0x006a:
            r1 = -65
            if (r0 > r1) goto L_0x008a
            r1 = -32
            if (r8 != r1) goto L_0x0076
            r1 = -96
            if (r0 < r1) goto L_0x008a
        L_0x0076:
            r1 = -19
            if (r8 != r1) goto L_0x007e
            r1 = -96
            if (r0 >= r1) goto L_0x008a
        L_0x007e:
            r0 = 1
            long r4 = r2 + r0
            byte r0 = defpackage.dlc.a(r12, r2)
            r1 = -65
            if (r0 <= r1) goto L_0x00df
        L_0x008a:
            r11 = -1
            goto L_0x0034
        L_0x008c:
            int r2 = r11 >> 8
            r2 = r2 ^ -1
            byte r3 = (byte) r2
            r2 = 0
            if (r3 != 0) goto L_0x00a4
            r4 = 1
            long r4 = r4 + r0
            byte r0 = defpackage.dlc.a(r12, r0)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x01a6
            int r11 = defpackage.dli.a(r8, r0)
            goto L_0x0034
        L_0x00a4:
            int r2 = r11 >> 16
            byte r2 = (byte) r2
            r4 = r0
            r1 = r3
            r0 = r2
        L_0x00aa:
            if (r0 != 0) goto L_0x00bd
            r2 = 1
            long r2 = r2 + r4
            byte r0 = defpackage.dlc.a(r12, r4)
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x00be
            int r11 = defpackage.dli.a(r8, r1, r0)
            goto L_0x0034
        L_0x00bd:
            r2 = r4
        L_0x00be:
            r4 = -65
            if (r1 > r4) goto L_0x00db
            int r4 = r8 << 28
            int r1 = r1 + 112
            int r1 = r1 + r4
            int r1 = r1 >> 30
            if (r1 != 0) goto L_0x00db
            r1 = -65
            if (r0 > r1) goto L_0x00db
            r0 = 1
            long r4 = r2 + r0
            byte r0 = defpackage.dlc.a(r12, r2)
            r1 = -65
            if (r0 <= r1) goto L_0x00df
        L_0x00db:
            r11 = -1
            goto L_0x0034
        L_0x00de:
            r4 = r0
        L_0x00df:
            long r0 = r6 - r4
            int r1 = (int) r0
            r0 = 16
            if (r1 >= r0) goto L_0x00fd
            r0 = 0
        L_0x00e7:
            int r1 = r1 - r0
            long r2 = (long) r0
            long r2 = r2 + r4
            r0 = r1
        L_0x00eb:
            r11 = 0
            r6 = r0
        L_0x00ed:
            if (r6 <= 0) goto L_0x01a3
            r0 = 1
            long r0 = r0 + r2
            byte r11 = defpackage.dlc.a(r12, r2)
            if (r11 < 0) goto L_0x0110
            int r2 = r6 + -1
            r6 = r2
            r2 = r0
            goto L_0x00ed
        L_0x00fd:
            r0 = 0
            r2 = r4
        L_0x00ff:
            if (r0 >= r1) goto L_0x010e
            r6 = 1
            long r6 = r6 + r2
            byte r2 = defpackage.dlc.a(r12, r2)
            if (r2 < 0) goto L_0x00e7
            int r0 = r0 + 1
            r2 = r6
            goto L_0x00ff
        L_0x010e:
            r0 = r1
            goto L_0x00e7
        L_0x0110:
            r4 = r0
        L_0x0111:
            if (r6 != 0) goto L_0x0116
            r11 = 0
            goto L_0x0034
        L_0x0116:
            int r0 = r6 + -1
            r1 = -32
            if (r11 >= r1) goto L_0x0132
            if (r0 == 0) goto L_0x0034
            int r0 = r0 + -1
            r1 = -62
            if (r11 < r1) goto L_0x012f
            r2 = 1
            long r2 = r2 + r4
            byte r1 = defpackage.dlc.a(r12, r4)
            r4 = -65
            if (r1 <= r4) goto L_0x00eb
        L_0x012f:
            r11 = -1
            goto L_0x0034
        L_0x0132:
            r1 = -16
            if (r11 >= r1) goto L_0x016b
            r1 = 2
            if (r0 >= r1) goto L_0x013f
            int r11 = a(r12, r11, r4, r0)
            goto L_0x0034
        L_0x013f:
            int r0 = r0 + -2
            r2 = 1
            long r6 = r4 + r2
            byte r1 = defpackage.dlc.a(r12, r4)
            r2 = -65
            if (r1 > r2) goto L_0x0168
            r2 = -32
            if (r11 != r2) goto L_0x0155
            r2 = -96
            if (r1 < r2) goto L_0x0168
        L_0x0155:
            r2 = -19
            if (r11 != r2) goto L_0x015d
            r2 = -96
            if (r1 >= r2) goto L_0x0168
        L_0x015d:
            r2 = 1
            long r2 = r2 + r6
            byte r1 = defpackage.dlc.a(r12, r6)
            r4 = -65
            if (r1 <= r4) goto L_0x00eb
        L_0x0168:
            r11 = -1
            goto L_0x0034
        L_0x016b:
            r1 = 3
            if (r0 >= r1) goto L_0x0174
            int r11 = a(r12, r11, r4, r0)
            goto L_0x0034
        L_0x0174:
            int r0 = r0 + -3
            r2 = 1
            long r2 = r2 + r4
            byte r1 = defpackage.dlc.a(r12, r4)
            r4 = -65
            if (r1 > r4) goto L_0x01a0
            int r4 = r11 << 28
            int r1 = r1 + 112
            int r1 = r1 + r4
            int r1 = r1 >> 30
            if (r1 != 0) goto L_0x01a0
            r4 = 1
            long r4 = r4 + r2
            byte r1 = defpackage.dlc.a(r12, r2)
            r2 = -65
            if (r1 > r2) goto L_0x01a0
            r2 = 1
            long r2 = r2 + r4
            byte r1 = defpackage.dlc.a(r12, r4)
            r4 = -65
            if (r1 <= r4) goto L_0x00eb
        L_0x01a0:
            r11 = -1
            goto L_0x0034
        L_0x01a3:
            r4 = r2
            goto L_0x0111
        L_0x01a6:
            r1 = r0
            r0 = r2
            goto L_0x00aa
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlm.a(int, byte[], int, int):int");
    }

    /* access modifiers changed from: 0000 */
    public final int a(java.lang.CharSequence charSequence, byte[] bArr, int i, int i2) {
        long j;
        long j2 = (long) i;
        long j3 = j2 + ((long) i2);
        int length = charSequence.length();
        if (length > i2 || bArr.length - i2 < i) {
            throw new java.lang.ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i + i2));
        }
        int i3 = 0;
        while (i3 < length) {
            char charAt = charSequence.charAt(i3);
            if (charAt >= 128) {
                break;
            }
            long j4 = 1 + j2;
            defpackage.dlc.a(bArr, j2, (byte) charAt);
            i3++;
            j2 = j4;
        }
        if (i3 == length) {
            return (int) j2;
        }
        long j5 = j2;
        while (i3 < length) {
            char charAt2 = charSequence.charAt(i3);
            if (charAt2 < 128 && j5 < j3) {
                j = 1 + j5;
                defpackage.dlc.a(bArr, j5, (byte) charAt2);
            } else if (charAt2 < 2048 && j5 <= j3 - 2) {
                long j6 = j5 + 1;
                defpackage.dlc.a(bArr, j5, (byte) ((charAt2 >>> 6) | 960));
                j = 1 + j6;
                defpackage.dlc.a(bArr, j6, (byte) ((charAt2 & '?') | 128));
            } else if ((charAt2 < 55296 || 57343 < charAt2) && j5 <= j3 - 3) {
                long j7 = 1 + j5;
                defpackage.dlc.a(bArr, j5, (byte) ((charAt2 >>> 12) | 480));
                long j8 = 1 + j7;
                defpackage.dlc.a(bArr, j7, (byte) (((charAt2 >>> 6) & 63) | 128));
                j = 1 + j8;
                defpackage.dlc.a(bArr, j8, (byte) ((charAt2 & '?') | 128));
            } else if (j5 <= j3 - 4) {
                if (i3 + 1 != length) {
                    i3++;
                    char charAt3 = charSequence.charAt(i3);
                    if (java.lang.Character.isSurrogatePair(charAt2, charAt3)) {
                        int codePoint = java.lang.Character.toCodePoint(charAt2, charAt3);
                        long j9 = 1 + j5;
                        defpackage.dlc.a(bArr, j5, (byte) ((codePoint >>> 18) | 240));
                        long j10 = 1 + j9;
                        defpackage.dlc.a(bArr, j9, (byte) (((codePoint >>> 12) & 63) | 128));
                        long j11 = j10 + 1;
                        defpackage.dlc.a(bArr, j10, (byte) (((codePoint >>> 6) & 63) | 128));
                        j = 1 + j11;
                        defpackage.dlc.a(bArr, j11, (byte) ((codePoint & 63) | 128));
                    }
                }
                throw new defpackage.dll(i3 - 1, length);
            } else if (55296 > charAt2 || charAt2 > 57343 || (i3 + 1 != length && java.lang.Character.isSurrogatePair(charAt2, charSequence.charAt(i3 + 1)))) {
                throw new java.lang.ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j5);
            } else {
                throw new defpackage.dll(i3, length);
            }
            i3++;
            j5 = j;
        }
        return (int) j5;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0159, code lost:
        if (java.lang.Character.isSurrogatePair(r12, r17.charAt(r2 + 1)) == false) goto L_0x015b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.CharSequence r17, java.nio.ByteBuffer r18) {
        /*
            r16 = this;
            long r8 = defpackage.dlc.a(r18)
            int r2 = r18.position()
            long r2 = (long) r2
            long r4 = r8 + r2
            int r2 = r18.limit()
            long r2 = (long) r2
            long r10 = r8 + r2
            int r3 = r17.length()
            long r6 = (long) r3
            long r12 = r10 - r4
            int r2 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x004e
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            int r3 = r3 + -1
            r0 = r17
            char r3 = r0.charAt(r3)
            int r4 = r18.limit()
            r5 = 37
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "Failed writing "
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r5 = " at index "
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L_0x004e:
            r2 = 0
        L_0x004f:
            if (r2 >= r3) goto L_0x0066
            r0 = r17
            char r12 = r0.charAt(r2)
            r6 = 128(0x80, float:1.794E-43)
            if (r12 >= r6) goto L_0x0066
            r6 = 1
            long r6 = r6 + r4
            byte r12 = (byte) r12
            defpackage.dlc.a(r4, r12)
            int r2 = r2 + 1
            r4 = r6
            goto L_0x004f
        L_0x0066:
            if (r2 != r3) goto L_0x0190
            long r2 = r4 - r8
            int r2 = (int) r2
            r0 = r18
            r0.position(r2)
        L_0x0070:
            return
        L_0x0071:
            if (r2 >= r3) goto L_0x0186
            r0 = r17
            char r12 = r0.charAt(r2)
            r4 = 128(0x80, float:1.794E-43)
            if (r12 >= r4) goto L_0x008c
            int r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r4 >= 0) goto L_0x008c
            r4 = 1
            long r4 = r4 + r6
            byte r12 = (byte) r12
            defpackage.dlc.a(r6, r12)
        L_0x0088:
            int r2 = r2 + 1
            r6 = r4
            goto L_0x0071
        L_0x008c:
            r4 = 2048(0x800, float:2.87E-42)
            if (r12 >= r4) goto L_0x00b0
            r4 = 2
            long r4 = r10 - r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x00b0
            r4 = 1
            long r14 = r6 + r4
            int r4 = r12 >>> 6
            r4 = r4 | 960(0x3c0, float:1.345E-42)
            byte r4 = (byte) r4
            defpackage.dlc.a(r6, r4)
            r4 = 1
            long r4 = r4 + r14
            r6 = r12 & 63
            r6 = r6 | 128(0x80, float:1.794E-43)
            byte r6 = (byte) r6
            defpackage.dlc.a(r14, r6)
            goto L_0x0088
        L_0x00b0:
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r12 < r4) goto L_0x00ba
            r4 = 57343(0xdfff, float:8.0355E-41)
            if (r4 >= r12) goto L_0x00e6
        L_0x00ba:
            r4 = 3
            long r4 = r10 - r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x00e6
            r4 = 1
            long r4 = r4 + r6
            int r13 = r12 >>> 12
            r13 = r13 | 480(0x1e0, float:6.73E-43)
            byte r13 = (byte) r13
            defpackage.dlc.a(r6, r13)
            r6 = 1
            long r6 = r6 + r4
            int r13 = r12 >>> 6
            r13 = r13 & 63
            r13 = r13 | 128(0x80, float:1.794E-43)
            byte r13 = (byte) r13
            defpackage.dlc.a(r4, r13)
            r4 = 1
            long r4 = r4 + r6
            r12 = r12 & 63
            r12 = r12 | 128(0x80, float:1.794E-43)
            byte r12 = (byte) r12
            defpackage.dlc.a(r6, r12)
            goto L_0x0088
        L_0x00e6:
            r4 = 4
            long r4 = r10 - r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x013f
            int r4 = r2 + 1
            if (r4 == r3) goto L_0x0100
            int r2 = r2 + 1
            r0 = r17
            char r4 = r0.charAt(r2)
            boolean r5 = java.lang.Character.isSurrogatePair(r12, r4)
            if (r5 != 0) goto L_0x0108
        L_0x0100:
            dll r4 = new dll
            int r2 = r2 + -1
            r4.<init>(r2, r3)
            throw r4
        L_0x0108:
            int r12 = java.lang.Character.toCodePoint(r12, r4)
            r4 = 1
            long r4 = r4 + r6
            int r13 = r12 >>> 18
            r13 = r13 | 240(0xf0, float:3.36E-43)
            byte r13 = (byte) r13
            defpackage.dlc.a(r6, r13)
            r6 = 1
            long r6 = r6 + r4
            int r13 = r12 >>> 12
            r13 = r13 & 63
            r13 = r13 | 128(0x80, float:1.794E-43)
            byte r13 = (byte) r13
            defpackage.dlc.a(r4, r13)
            r4 = 1
            long r14 = r6 + r4
            int r4 = r12 >>> 6
            r4 = r4 & 63
            r4 = r4 | 128(0x80, float:1.794E-43)
            byte r4 = (byte) r4
            defpackage.dlc.a(r6, r4)
            r4 = 1
            long r4 = r4 + r14
            r6 = r12 & 63
            r6 = r6 | 128(0x80, float:1.794E-43)
            byte r6 = (byte) r6
            defpackage.dlc.a(r14, r6)
            goto L_0x0088
        L_0x013f:
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r4 > r12) goto L_0x0161
            r4 = 57343(0xdfff, float:8.0355E-41)
            if (r12 > r4) goto L_0x0161
            int r4 = r2 + 1
            if (r4 == r3) goto L_0x015b
            int r4 = r2 + 1
            r0 = r17
            char r4 = r0.charAt(r4)
            boolean r4 = java.lang.Character.isSurrogatePair(r12, r4)
            if (r4 != 0) goto L_0x0161
        L_0x015b:
            dll r4 = new dll
            r4.<init>(r2, r3)
            throw r4
        L_0x0161:
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r3 = 46
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Failed writing "
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.StringBuilder r3 = r3.append(r12)
            java.lang.String r4 = " at index "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L_0x0186:
            long r2 = r6 - r8
            int r2 = (int) r2
            r0 = r18
            r0.position(r2)
            goto L_0x0070
        L_0x0190:
            r6 = r4
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlm.a(java.lang.CharSequence, java.nio.ByteBuffer):void");
    }

    private static int a(byte[] bArr, int i, long j, int i2) {
        switch (i2) {
            case 0:
                return defpackage.dli.a(i);
            case 1:
                return defpackage.dli.a(i, (int) defpackage.dlc.a(bArr, j));
            case 2:
                return defpackage.dli.a(i, (int) defpackage.dlc.a(bArr, j), (int) defpackage.dlc.a(bArr, 1 + j));
            default:
                throw new java.lang.AssertionError();
        }
    }
}
