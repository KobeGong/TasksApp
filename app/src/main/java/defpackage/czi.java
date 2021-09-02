package defpackage;

/* renamed from: czi reason: default package */
/* compiled from: PG */
public final class czi implements java.io.Closeable {
    public final char[] a = new char[1024];
    public int b = 0;
    public int c = 0;
    public long d;
    public int e;
    public java.lang.String f;
    public int g = 0;
    public java.lang.String[] h;
    public int[] i;
    private final java.io.Reader j;
    private int k = 0;
    private int l = 0;
    private int m = 0;
    private int[] n = new int[32];

    public czi(java.io.Reader reader) {
        int[] iArr = this.n;
        int i2 = this.g;
        this.g = i2 + 1;
        iArr[i2] = 6;
        this.h = new java.lang.String[32];
        this.i = new int[32];
        this.j = reader;
    }

    public final boolean a() {
        int i2 = this.c;
        if (i2 == 0) {
            i2 = c();
        }
        return (i2 == 2 || i2 == 4) ? false : true;
    }

    public final defpackage.czj b() {
        int i2 = this.c;
        if (i2 == 0) {
            i2 = c();
        }
        switch (i2) {
            case 1:
                return defpackage.czj.BEGIN_OBJECT;
            case 2:
                return defpackage.czj.END_OBJECT;
            case 3:
                return defpackage.czj.BEGIN_ARRAY;
            case 4:
                return defpackage.czj.END_ARRAY;
            case 5:
            case 6:
                return defpackage.czj.BOOLEAN;
            case 7:
                return defpackage.czj.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return defpackage.czj.STRING;
            case 12:
            case 13:
            case 14:
                return defpackage.czj.NAME;
            case 15:
            case 16:
                return defpackage.czj.NUMBER;
            case 17:
                return defpackage.czj.END_DOCUMENT;
            default:
                throw new java.lang.AssertionError();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01e0, code lost:
        if (b(r2) != false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01e2, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01e3, code lost:
        if (r0 != 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01ef, code lost:
        if (b(r15.a[r15.b]) != false) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01f7, code lost:
        throw a("Expected value");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x027c, code lost:
        if (r3 != 2) goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x027e, code lost:
        if (r4 == false) goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0284, code lost:
        if (r6 != Long.MIN_VALUE) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0286, code lost:
        if (r5 == false) goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0288, code lost:
        if (r5 == false) goto L_0x0297;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x028a, code lost:
        r15.d = r6;
        r15.b += r10;
        r0 = 15;
        r15.c = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0297, code lost:
        r6 = -r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x029a, code lost:
        if (r3 == 2) goto L_0x02a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x029d, code lost:
        if (r3 == 4) goto L_0x02a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x02a0, code lost:
        if (r3 != 7) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x02a2, code lost:
        r15.e = r10;
        r0 = 16;
        r15.c = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x02b0, code lost:
        throw a("Use JsonReader.setLenient(true) to accept malformed JSON");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:?, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:226:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c() {
        /*
            r15 = this;
            int[] r0 = r15.n
            int r1 = r15.g
            int r1 = r1 + -1
            r0 = r0[r1]
            r1 = 1
            if (r0 != r1) goto L_0x004f
            int[] r1 = r15.n
            int r2 = r15.g
            int r2 = r2 + -1
            r3 = 2
            r1[r2] = r3
        L_0x0014:
            r1 = 1
            int r1 = r15.a(r1)
            switch(r1) {
                case 34: goto L_0x0138;
                case 39: goto L_0x0131;
                case 44: goto L_0x011d;
                case 59: goto L_0x011d;
                case 91: goto L_0x013e;
                case 93: goto L_0x0115;
                case 123: goto L_0x0143;
                default: goto L_0x001c;
            }
        L_0x001c:
            int r0 = r15.b
            int r0 = r0 + -1
            r15.b = r0
            char[] r0 = r15.a
            int r1 = r15.b
            char r0 = r0[r1]
            r1 = 116(0x74, float:1.63E-43)
            if (r0 == r1) goto L_0x0030
            r1 = 84
            if (r0 != r1) goto L_0x0148
        L_0x0030:
            java.lang.String r2 = "true"
            java.lang.String r1 = "TRUE"
            r0 = 5
        L_0x0035:
            int r4 = r2.length()
            r3 = 1
        L_0x003a:
            if (r3 >= r4) goto L_0x0183
            int r5 = r15.b
            int r5 = r5 + r3
            int r6 = r15.k
            if (r5 < r6) goto L_0x0169
            int r5 = r3 + 1
            boolean r5 = r15.b(r5)
            if (r5 != 0) goto L_0x0169
            r0 = 0
        L_0x004c:
            if (r0 == 0) goto L_0x01ab
        L_0x004e:
            return r0
        L_0x004f:
            r1 = 2
            if (r0 != r1) goto L_0x006c
            r1 = 1
            int r1 = r15.a(r1)
            switch(r1) {
                case 44: goto L_0x0014;
                case 59: goto L_0x0065;
                case 93: goto L_0x0061;
                default: goto L_0x005a;
            }
        L_0x005a:
            java.lang.String r0 = "Unterminated array"
            java.io.IOException r0 = r15.a(r0)
            throw r0
        L_0x0061:
            r0 = 4
            r15.c = r0
            goto L_0x004e
        L_0x0065:
            java.lang.String r0 = "Use JsonReader.setLenient(true) to accept malformed JSON"
            java.io.IOException r0 = r15.a(r0)
            throw r0
        L_0x006c:
            r1 = 3
            if (r0 == r1) goto L_0x0072
            r1 = 5
            if (r0 != r1) goto L_0x00c1
        L_0x0072:
            int[] r1 = r15.n
            int r2 = r15.g
            int r2 = r2 + -1
            r3 = 4
            r1[r2] = r3
            r1 = 5
            if (r0 != r1) goto L_0x0098
            r1 = 1
            int r1 = r15.a(r1)
            switch(r1) {
                case 44: goto L_0x0098;
                case 59: goto L_0x0091;
                case 125: goto L_0x008d;
                default: goto L_0x0086;
            }
        L_0x0086:
            java.lang.String r0 = "Unterminated object"
            java.io.IOException r0 = r15.a(r0)
            throw r0
        L_0x008d:
            r0 = 2
            r15.c = r0
            goto L_0x004e
        L_0x0091:
            java.lang.String r0 = "Use JsonReader.setLenient(true) to accept malformed JSON"
            java.io.IOException r0 = r15.a(r0)
            throw r0
        L_0x0098:
            r1 = 1
            int r1 = r15.a(r1)
            switch(r1) {
                case 34: goto L_0x00a7;
                case 39: goto L_0x00ac;
                case 125: goto L_0x00b3;
                default: goto L_0x00a0;
            }
        L_0x00a0:
            java.lang.String r0 = "Use JsonReader.setLenient(true) to accept malformed JSON"
            java.io.IOException r0 = r15.a(r0)
            throw r0
        L_0x00a7:
            r0 = 13
            r15.c = r0
            goto L_0x004e
        L_0x00ac:
            java.lang.String r0 = "Use JsonReader.setLenient(true) to accept malformed JSON"
            java.io.IOException r0 = r15.a(r0)
            throw r0
        L_0x00b3:
            r1 = 5
            if (r0 == r1) goto L_0x00ba
            r0 = 2
            r15.c = r0
            goto L_0x004e
        L_0x00ba:
            java.lang.String r0 = "Expected name"
            java.io.IOException r0 = r15.a(r0)
            throw r0
        L_0x00c1:
            r1 = 4
            if (r0 != r1) goto L_0x00e3
            int[] r1 = r15.n
            int r2 = r15.g
            int r2 = r2 + -1
            r3 = 5
            r1[r2] = r3
            r1 = 1
            int r1 = r15.a(r1)
            switch(r1) {
                case 58: goto L_0x0014;
                case 59: goto L_0x00d5;
                case 60: goto L_0x00d5;
                case 61: goto L_0x00dc;
                default: goto L_0x00d5;
            }
        L_0x00d5:
            java.lang.String r0 = "Expected ':'"
            java.io.IOException r0 = r15.a(r0)
            throw r0
        L_0x00dc:
            java.lang.String r0 = "Use JsonReader.setLenient(true) to accept malformed JSON"
            java.io.IOException r0 = r15.a(r0)
            throw r0
        L_0x00e3:
            r1 = 6
            if (r0 != r1) goto L_0x00f1
            int[] r1 = r15.n
            int r2 = r15.g
            int r2 = r2 + -1
            r3 = 7
            r1[r2] = r3
            goto L_0x0014
        L_0x00f1:
            r1 = 7
            if (r0 != r1) goto L_0x0109
            r0 = 0
            int r0 = r15.a(r0)
            r1 = -1
            if (r0 != r1) goto L_0x0102
            r0 = 17
            r15.c = r0
            goto L_0x004e
        L_0x0102:
            java.lang.String r0 = "Use JsonReader.setLenient(true) to accept malformed JSON"
            java.io.IOException r0 = r15.a(r0)
            throw r0
        L_0x0109:
            r1 = 8
            if (r0 != r1) goto L_0x0014
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "JsonReader is closed"
            r0.<init>(r1)
            throw r0
        L_0x0115:
            r1 = 1
            if (r0 != r1) goto L_0x011d
            r0 = 4
            r15.c = r0
            goto L_0x004e
        L_0x011d:
            r1 = 1
            if (r0 == r1) goto L_0x0123
            r1 = 2
            if (r0 != r1) goto L_0x012a
        L_0x0123:
            java.lang.String r0 = "Use JsonReader.setLenient(true) to accept malformed JSON"
            java.io.IOException r0 = r15.a(r0)
            throw r0
        L_0x012a:
            java.lang.String r0 = "Unexpected value"
            java.io.IOException r0 = r15.a(r0)
            throw r0
        L_0x0131:
            java.lang.String r0 = "Use JsonReader.setLenient(true) to accept malformed JSON"
            java.io.IOException r0 = r15.a(r0)
            throw r0
        L_0x0138:
            r0 = 9
            r15.c = r0
            goto L_0x004e
        L_0x013e:
            r0 = 3
            r15.c = r0
            goto L_0x004e
        L_0x0143:
            r0 = 1
            r15.c = r0
            goto L_0x004e
        L_0x0148:
            r1 = 102(0x66, float:1.43E-43)
            if (r0 == r1) goto L_0x0150
            r1 = 70
            if (r0 != r1) goto L_0x0157
        L_0x0150:
            java.lang.String r2 = "false"
            java.lang.String r1 = "FALSE"
            r0 = 6
            goto L_0x0035
        L_0x0157:
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 == r1) goto L_0x015f
            r1 = 78
            if (r0 != r1) goto L_0x0166
        L_0x015f:
            java.lang.String r2 = "null"
            java.lang.String r1 = "NULL"
            r0 = 7
            goto L_0x0035
        L_0x0166:
            r0 = 0
            goto L_0x004c
        L_0x0169:
            char[] r5 = r15.a
            int r6 = r15.b
            int r6 = r6 + r3
            char r5 = r5[r6]
            char r6 = r2.charAt(r3)
            if (r5 == r6) goto L_0x017f
            char r6 = r1.charAt(r3)
            if (r5 == r6) goto L_0x017f
            r0 = 0
            goto L_0x004c
        L_0x017f:
            int r3 = r3 + 1
            goto L_0x003a
        L_0x0183:
            int r1 = r15.b
            int r1 = r1 + r4
            int r2 = r15.k
            if (r1 < r2) goto L_0x0192
            int r1 = r4 + 1
            boolean r1 = r15.b(r1)
            if (r1 == 0) goto L_0x01a2
        L_0x0192:
            char[] r1 = r15.a
            int r2 = r15.b
            int r2 = r2 + r4
            char r1 = r1[r2]
            boolean r1 = r15.b(r1)
            if (r1 == 0) goto L_0x01a2
            r0 = 0
            goto L_0x004c
        L_0x01a2:
            int r1 = r15.b
            int r1 = r1 + r4
            r15.b = r1
            r15.c = r0
            goto L_0x004c
        L_0x01ab:
            char[] r11 = r15.a
            int r2 = r15.b
            int r1 = r15.k
            r6 = 0
            r5 = 0
            r4 = 1
            r3 = 0
            r0 = 0
            r10 = r0
            r0 = r1
            r1 = r2
        L_0x01ba:
            int r2 = r1 + r10
            if (r2 != r0) goto L_0x01cd
            int r0 = r11.length
            if (r10 == r0) goto L_0x01e2
            int r0 = r10 + 1
            boolean r0 = r15.b(r0)
            if (r0 == 0) goto L_0x027b
            int r1 = r15.b
            int r0 = r15.k
        L_0x01cd:
            int r2 = r1 + r10
            char r2 = r11[r2]
            switch(r2) {
                case 43: goto L_0x020f;
                case 45: goto L_0x01f8;
                case 46: goto L_0x0224;
                case 69: goto L_0x0218;
                case 101: goto L_0x0218;
                default: goto L_0x01d4;
            }
        L_0x01d4:
            r8 = 48
            if (r2 < r8) goto L_0x01dc
            r8 = 57
            if (r2 <= r8) goto L_0x022d
        L_0x01dc:
            boolean r0 = r15.b(r2)
            if (r0 == 0) goto L_0x027b
        L_0x01e2:
            r0 = 0
        L_0x01e3:
            if (r0 != 0) goto L_0x004e
            char[] r0 = r15.a
            int r1 = r15.b
            char r0 = r0[r1]
            boolean r0 = r15.b(r0)
            if (r0 != 0) goto L_0x02aa
            java.lang.String r0 = "Expected value"
            java.io.IOException r0 = r15.a(r0)
            throw r0
        L_0x01f8:
            if (r3 != 0) goto L_0x0206
            r3 = 1
            r2 = 1
            r14 = r4
            r4 = r3
            r3 = r14
        L_0x01ff:
            int r5 = r10 + 1
            r10 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            goto L_0x01ba
        L_0x0206:
            r2 = 5
            if (r3 != r2) goto L_0x020d
            r2 = 6
            r3 = r4
            r4 = r5
            goto L_0x01ff
        L_0x020d:
            r0 = 0
            goto L_0x01e3
        L_0x020f:
            r2 = 5
            if (r3 != r2) goto L_0x0216
            r2 = 6
            r3 = r4
            r4 = r5
            goto L_0x01ff
        L_0x0216:
            r0 = 0
            goto L_0x01e3
        L_0x0218:
            r2 = 2
            if (r3 == r2) goto L_0x021e
            r2 = 4
            if (r3 != r2) goto L_0x0222
        L_0x021e:
            r2 = 5
            r3 = r4
            r4 = r5
            goto L_0x01ff
        L_0x0222:
            r0 = 0
            goto L_0x01e3
        L_0x0224:
            r2 = 2
            if (r3 != r2) goto L_0x022b
            r2 = 3
            r3 = r4
            r4 = r5
            goto L_0x01ff
        L_0x022b:
            r0 = 0
            goto L_0x01e3
        L_0x022d:
            r8 = 1
            if (r3 == r8) goto L_0x0232
            if (r3 != 0) goto L_0x023a
        L_0x0232:
            int r2 = r2 + -48
            int r2 = -r2
            long r6 = (long) r2
            r2 = 2
            r3 = r4
            r4 = r5
            goto L_0x01ff
        L_0x023a:
            r8 = 2
            if (r3 != r8) goto L_0x026a
            r8 = 0
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x01e2
            r8 = 10
            long r8 = r8 * r6
            int r2 = r2 + -48
            long r12 = (long) r2
            long r8 = r8 - r12
            r12 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r2 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r2 > 0) goto L_0x0260
            r12 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r2 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0268
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0268
        L_0x0260:
            r2 = 1
        L_0x0261:
            r2 = r2 & r4
            r4 = r5
            r6 = r8
            r14 = r3
            r3 = r2
            r2 = r14
            goto L_0x01ff
        L_0x0268:
            r2 = 0
            goto L_0x0261
        L_0x026a:
            r2 = 3
            if (r3 != r2) goto L_0x0271
            r2 = 4
            r3 = r4
            r4 = r5
            goto L_0x01ff
        L_0x0271:
            r2 = 5
            if (r3 == r2) goto L_0x0277
            r2 = 6
            if (r3 != r2) goto L_0x02b1
        L_0x0277:
            r2 = 7
            r3 = r4
            r4 = r5
            goto L_0x01ff
        L_0x027b:
            r0 = 2
            if (r3 != r0) goto L_0x0299
            if (r4 == 0) goto L_0x0299
            r0 = -9223372036854775808
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0288
            if (r5 == 0) goto L_0x0299
        L_0x0288:
            if (r5 == 0) goto L_0x0297
        L_0x028a:
            r15.d = r6
            int r0 = r15.b
            int r0 = r0 + r10
            r15.b = r0
            r0 = 15
            r15.c = r0
            goto L_0x01e3
        L_0x0297:
            long r6 = -r6
            goto L_0x028a
        L_0x0299:
            r0 = 2
            if (r3 == r0) goto L_0x02a2
            r0 = 4
            if (r3 == r0) goto L_0x02a2
            r0 = 7
            if (r3 != r0) goto L_0x01e2
        L_0x02a2:
            r15.e = r10
            r0 = 16
            r15.c = r0
            goto L_0x01e3
        L_0x02aa:
            java.lang.String r0 = "Use JsonReader.setLenient(true) to accept malformed JSON"
            java.io.IOException r0 = r15.a(r0)
            throw r0
        L_0x02b1:
            r2 = r3
            r3 = r4
            r4 = r5
            goto L_0x01ff
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czi.c():int");
    }

    private final boolean b(char c2) {
        switch (c2) {
            case 9:
            case 10:
            case 12:
            case 13:
            case ' ':
            case ',':
            case ':':
            case '[':
            case ']':
            case '{':
            case '}':
                return false;
            case '#':
            case '/':
            case ';':
            case '=':
            case '\\':
                throw a("Use JsonReader.setLenient(true) to accept malformed JSON");
            default:
                return true;
        }
    }

    public final java.lang.String a(char c2) {
        int i2;
        char[] cArr = this.a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (true) {
            int i3 = this.b;
            int i4 = this.k;
            int i5 = i3;
            while (true) {
                if (i5 < i4) {
                    int i6 = i5 + 1;
                    char c3 = cArr[i5];
                    if (c3 == c2) {
                        this.b = i6;
                        sb.append(cArr, i3, (i6 - i3) - 1);
                        return sb.toString();
                    } else if (c3 == '\\') {
                        this.b = i6;
                        sb.append(cArr, i3, (i6 - i3) - 1);
                        if (this.b != this.k || b(1)) {
                            char[] cArr2 = this.a;
                            int i7 = this.b;
                            this.b = i7 + 1;
                            char c4 = cArr2[i7];
                            switch (c4) {
                                case 10:
                                    this.l++;
                                    this.m = this.b;
                                    break;
                                case '\"':
                                case '\'':
                                case '/':
                                case '\\':
                                    break;
                                case 'b':
                                    c4 = 8;
                                    break;
                                case 'f':
                                    c4 = 12;
                                    break;
                                case 'n':
                                    c4 = 10;
                                    break;
                                case 'r':
                                    c4 = 13;
                                    break;
                                case 't':
                                    c4 = 9;
                                    break;
                                case 'u':
                                    if (this.b + 4 <= this.k || b(4)) {
                                        int i8 = this.b;
                                        int i9 = i8 + 4;
                                        int i10 = i8;
                                        c4 = 0;
                                        for (int i11 = i10; i11 < i9; i11++) {
                                            char c5 = this.a[i11];
                                            char c6 = (char) (c4 << 4);
                                            if (c5 >= '0' && c5 <= '9') {
                                                i2 = c5 - '0';
                                            } else if (c5 >= 'a' && c5 <= 'f') {
                                                i2 = (c5 - 'a') + 10;
                                            } else if (c5 < 'A' || c5 > 'F') {
                                                break;
                                            } else {
                                                i2 = (c5 - 'A') + 10;
                                            }
                                            c4 = (char) (c6 + i2);
                                        }
                                        this.b += 4;
                                        break;
                                    } else {
                                        throw a("Unterminated escape sequence");
                                    }
                                    break;
                                default:
                                    throw a("Invalid escape sequence");
                            }
                            sb.append(c4);
                        } else {
                            throw a("Unterminated escape sequence");
                        }
                    } else {
                        if (c3 == 10) {
                            this.l++;
                            this.m = i6;
                        }
                        i5 = i6;
                    }
                } else {
                    sb.append(cArr, i3, i5 - i3);
                    this.b = i5;
                    if (!b(1)) {
                        throw a("Unterminated string");
                    }
                }
            }
        }
        throw new java.lang.NumberFormatException("\\u" + new java.lang.String(this.a, this.b, 4));
    }

    public final java.lang.String d() {
        java.lang.String sb;
        java.lang.StringBuilder sb2 = null;
        int i2 = 0;
        while (true) {
            if (this.b + i2 < this.k) {
                switch (this.a[this.b + i2]) {
                    case 9:
                    case 10:
                    case 12:
                    case 13:
                    case ' ':
                    case ',':
                    case ':':
                    case '[':
                    case ']':
                    case '{':
                    case '}':
                        break;
                    case '#':
                    case '/':
                    case ';':
                    case '=':
                    case '\\':
                        throw a("Use JsonReader.setLenient(true) to accept malformed JSON");
                    default:
                        i2++;
                        continue;
                }
            } else if (i2 >= this.a.length) {
                if (sb2 == null) {
                    sb2 = new java.lang.StringBuilder();
                }
                sb2.append(this.a, this.b, i2);
                this.b = i2 + this.b;
                if (!b(1)) {
                    i2 = 0;
                } else {
                    i2 = 0;
                }
            } else if (!b(i2 + 1)) {
            }
        }
        if (sb2 == null) {
            sb = new java.lang.String(this.a, this.b, i2);
        } else {
            sb2.append(this.a, this.b, i2);
            sb = sb2.toString();
        }
        this.b = i2 + this.b;
        return sb;
    }

    public final void close() {
        this.c = 0;
        this.n[0] = 8;
        this.g = 1;
        this.j.close();
    }

    public final void a(int i2) {
        if (this.g == this.n.length) {
            int[] iArr = new int[(this.g << 1)];
            int[] iArr2 = new int[(this.g << 1)];
            java.lang.String[] strArr = new java.lang.String[(this.g << 1)];
            java.lang.System.arraycopy(this.n, 0, iArr, 0, this.g);
            java.lang.System.arraycopy(this.i, 0, iArr2, 0, this.g);
            java.lang.System.arraycopy(this.h, 0, strArr, 0, this.g);
            this.n = iArr;
            this.i = iArr2;
            this.h = strArr;
        }
        int[] iArr3 = this.n;
        int i3 = this.g;
        this.g = i3 + 1;
        iArr3[i3] = i2;
    }

    private final boolean b(int i2) {
        char[] cArr = this.a;
        this.m -= this.b;
        if (this.k != this.b) {
            this.k -= this.b;
            java.lang.System.arraycopy(cArr, this.b, cArr, 0, this.k);
        } else {
            this.k = 0;
        }
        this.b = 0;
        do {
            int read = this.j.read(cArr, this.k, cArr.length - this.k);
            if (read == -1) {
                return false;
            }
            this.k = read + this.k;
            if (this.l == 0 && this.m == 0 && this.k > 0 && cArr[0] == 65279) {
                this.b++;
                this.m++;
                i2++;
            }
        } while (this.k < i2);
        return true;
    }

    private final int a(boolean z) {
        char[] cArr = this.a;
        int i2 = this.b;
        int i3 = this.k;
        while (true) {
            if (i2 == i3) {
                this.b = i2;
                if (b(1)) {
                    i2 = this.b;
                    i3 = this.k;
                } else if (!z) {
                    return -1;
                } else {
                    throw new java.io.EOFException("End of input" + e());
                }
            }
            int i4 = i2 + 1;
            char c2 = cArr[i2];
            if (c2 == 10) {
                this.l++;
                this.m = i4;
                i2 = i4;
            } else if (c2 == ' ' || c2 == 13 || c2 == 9) {
                i2 = i4;
            } else if (c2 == '/') {
                this.b = i4;
                if (i4 == i3) {
                    this.b--;
                    boolean b2 = b(2);
                    this.b++;
                    if (!b2) {
                        return c2;
                    }
                }
                throw a("Use JsonReader.setLenient(true) to accept malformed JSON");
            } else if (c2 == '#') {
                this.b = i4;
                throw a("Use JsonReader.setLenient(true) to accept malformed JSON");
            } else {
                this.b = i4;
                return c2;
            }
        }
    }

    public final java.lang.String toString() {
        return getClass().getSimpleName() + e();
    }

    public final java.lang.String e() {
        return " at line " + (this.l + 1) + " column " + ((this.b - this.m) + 1) + " path " + f();
    }

    public final java.lang.String f() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("$");
        int i2 = this.g;
        for (int i3 = 0; i3 < i2; i3++) {
            switch (this.n[i3]) {
                case 1:
                case 2:
                    sb.append('[').append(this.i[i3]).append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    if (this.h[i3] == null) {
                        break;
                    } else {
                        sb.append(this.h[i3]);
                        break;
                    }
            }
        }
        return sb.toString();
    }

    private final java.io.IOException a(java.lang.String str) {
        throw new defpackage.bkv(str + e());
    }

    static {
        ")]}'\n".toCharArray();
        new defpackage.czh(0);
    }
}
