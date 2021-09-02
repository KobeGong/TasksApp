package defpackage;

/* renamed from: cpz reason: default package */
/* compiled from: PG */
final class cpz {
    private static final char[] a = "http://".toCharArray();
    private static final char[] b = "https://".toCharArray();
    private static final char[] c = "lh".toCharArray();
    private static final char[] d = "ap".toCharArray();
    private static final char[] e = "sp".toCharArray();
    private static final char[] f = "bp".toCharArray();
    private static final char[] g = ".googleusercontent.com/".toCharArray();
    private static final char[] h = "www.google.com/visualsearch/lh/".toCharArray();
    private static final char[] i = ".google.com/".toCharArray();
    private static final char[] j = ".blogger.com/".toCharArray();
    private static final char[] k = ".bp.blogspot.com/".toCharArray();
    private static final char[] l = ".ggpht.com/".toCharArray();
    private static final char[] m = "image".toCharArray();
    private static final char[] n = "%3D".toCharArray();
    private static final char[] o = "%3d".toCharArray();
    private static final char[][] p = {new char[]{'O'}, new char[]{'J'}, new char[]{'U', 't'}, new char[]{'U'}, new char[]{'I'}};
    private boolean A;
    private boolean B = true;
    private int C;
    private int D;
    private int E;
    private int[] F = new int[8];
    private int[] G = new int[8];
    private char[] q = new char[2000];
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    cpz() {
    }

    /* access modifiers changed from: 0000 */
    public final synchronized boolean a(java.lang.String str) {
        b(str);
        return this.w;
    }

    /* access modifiers changed from: 0000 */
    public final synchronized java.lang.String a(java.lang.String str, int i2, int i3, int i4, int i5) {
        java.lang.String sb;
        boolean z2;
        b(str);
        if (!this.B) {
            sb = null;
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(this.r + 50);
            int i6 = 0;
            boolean z3 = (i2 & 8192) != 0;
            boolean z4 = (i2 & 128) != 0;
            if (this.y && (i5 > 0 || z3 || z4)) {
                sb2.append(this.q, 0, this.t);
                if (!this.z && z4 && !this.x) {
                    sb2.append(e);
                    sb2.append((char) ((i5 % 3) + 49));
                } else if (!z3 || this.x) {
                    sb2.append(c);
                    sb2.append((char) ((i5 % 4) + 51));
                } else {
                    sb2.append(d).append('2');
                }
                int i7 = this.t + 3;
                sb2.append(this.q, i7, this.D - i7);
                i6 = this.D;
            }
            if (this.A) {
                sb2.append(this.q, i6, this.u - i6);
            } else {
                sb2.append(this.q, i6, this.v - i6);
                sb2.append('=');
            }
            int length = sb2.length();
            if (i3 == 0 && i4 == 0) {
                sb2.append('s').append(0).append('-');
            }
            if (i3 != 0) {
                sb2.append('w').append(i3).append('-');
            }
            if (i4 != 0) {
                sb2.append('h').append(i4).append('-');
            }
            if ((i2 & 32) != 0) {
                sb2.append("rw-");
            }
            if ((524288 & i2) != 0) {
                sb2.append("mo-");
            }
            if ((1048576 & i2) != 0) {
                sb2.append("pa-");
            }
            if ((i2 & 16384) != 0) {
                sb2.append("rwa-");
            }
            if ((i2 & 1) != 0) {
                sb2.append("c-");
            }
            if ((4194304 & i2) != 0) {
                sb2.append("cc-c0-");
            }
            if ((33554432 & i2) != 0) {
                sb2.append("n-");
            }
            if ((i2 & 2) != 0) {
                sb2.append("d-");
            }
            if ((i2 & 16) != 0) {
                sb2.append("k-");
            }
            if ((i2 & 4) != 0) {
                sb2.append("no-");
            }
            if ((i2 & 64) != 0) {
                sb2.append("nu-");
            }
            if ((i2 & 8) != 0) {
                sb2.append("p-");
            }
            if ((i2 & 4096) != 0) {
                sb2.append("lf-");
            }
            if ((i2 & 256) != 0) {
                sb2.append("fSoften=0,25,0-");
            }
            if ((i2 & 512) != 0) {
                sb2.append("ip-");
            }
            if ((i2 & 2048) != 0) {
                sb2.append("rj-");
            }
            if ((32768 & i2) != 0) {
                sb2.append("fBoxBlur=2,24,24-");
            }
            if ((65536 & i2) != 0) {
                sb2.append("al-");
            }
            if ((131072 & i2) != 0) {
                sb2.append("rh-");
            }
            if ((2097152 & i2) != 0) {
                sb2.append("m18-");
            }
            if ((262144 & i2) != 0) {
                sb2.append("ns-");
            }
            if ((8388608 & i2) != 0) {
                sb2.append("sg-");
            }
            if ((16777216 & i2) != 0) {
                sb2.append("gd-");
            }
            sb2.append('v');
            sb2.append(1).append('-');
            int i8 = this.u;
            int i9 = this.u + this.C;
            while (i8 < i9) {
                int i10 = 0;
                while (true) {
                    if (i10 >= p.length) {
                        break;
                    }
                    char[] cArr = p[i10];
                    int i11 = 0;
                    int i12 = i8;
                    while (true) {
                        if (i11 >= cArr.length || i12 >= i9) {
                            z2 = true;
                        } else {
                            int i13 = i11 + 1;
                            char c2 = cArr[i11];
                            int i14 = i12 + 1;
                            if (c2 != this.q[i12]) {
                                int i15 = i13;
                                z2 = false;
                                i12 = i14;
                                i11 = i15;
                                break;
                            }
                            i12 = i14;
                            i11 = i13;
                        }
                    }
                    z2 = true;
                    if (z2 && !(i11 == cArr.length && (i12 == i9 || this.q[i12] == '-'))) {
                        z2 = false;
                    }
                    if (z2) {
                        sb2.append(p[i10]).append('-');
                        break;
                    }
                    i10++;
                }
                while (i8 < i9 && this.q[i8] != '-') {
                    i8++;
                }
                i8++;
            }
            int i16 = this.u;
            int i17 = this.C + this.u;
            while (i16 < i17) {
                boolean z5 = this.q[i16] == 'f';
                while (i16 < i17 && this.q[i16] != '-') {
                    if (z5) {
                        sb2.append(this.q[i16]);
                    }
                    i16++;
                }
                if (z5) {
                    sb2.append('-');
                }
                i16++;
            }
            int i18 = this.u;
            int i19 = this.C + this.u;
            while (i18 < i19) {
                boolean z6 = this.q[i18] == 'i' && this.q[i18 + 1] == 'v';
                while (i18 < i19 && this.q[i18] != '-') {
                    if (z6) {
                        sb2.append(this.q[i18]);
                    }
                    i18++;
                }
                if (z6) {
                    sb2.append('-');
                }
                i18++;
            }
            if (sb2.length() > length) {
                sb2.setLength(sb2.length() - 1);
            }
            if (this.A && this.C == 0) {
                sb2.append('/');
            }
            sb2.append(this.q, this.u + this.C, this.r - (this.u + this.C));
            sb = sb2.toString();
        }
        return sb;
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x028d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(java.lang.String r10) {
        /*
            r9 = this;
            r8 = 2
            r7 = 5
            r5 = -1
            r2 = 1
            r1 = 0
            int r0 = r10.length()
            r9.r = r0
            int r0 = r9.r
            r3 = 2000(0x7d0, float:2.803E-42)
            if (r0 < r3) goto L_0x0014
            r9.B = r1
        L_0x0013:
            return
        L_0x0014:
            int r0 = r9.r
            char[] r3 = r9.q
            r10.getChars(r1, r0, r3, r1)
            r9.s = r1
            r9.y = r1
            r9.z = r1
            r9.A = r1
            char[] r0 = a
            boolean r0 = r9.a(r0)
            if (r0 != 0) goto L_0x003d
            char[] r0 = b
            boolean r0 = r9.a(r0)
            if (r0 != 0) goto L_0x003d
            r0 = r1
        L_0x0034:
            r9.w = r0
            boolean r0 = r9.w
            if (r0 != 0) goto L_0x01dd
            r9.B = r1
            goto L_0x0013
        L_0x003d:
            int r0 = r9.s
            r9.t = r0
            char[] r0 = c
            boolean r0 = r9.a(r0)
            if (r0 == 0) goto L_0x0111
            r9.y = r2
            char[] r0 = r9.q
            int r3 = r9.s
            char r0 = r0[r3]
            r3 = 51
            if (r0 < r3) goto L_0x010e
            char[] r0 = r9.q
            int r3 = r9.s
            char r0 = r0[r3]
            r3 = 54
            if (r0 > r3) goto L_0x010e
            int r0 = r9.s
            int r0 = r0 + 1
            r9.s = r0
            char[] r0 = r9.q
            int r3 = r9.s
            char r0 = r0[r3]
            r3 = 45
            if (r0 != r3) goto L_0x00b3
            char[] r0 = r9.q
            int r3 = r9.s
            int r3 = r3 + 1
            char r0 = r0[r3]
            r3 = 100
            if (r0 != r3) goto L_0x00b3
            r9.x = r2
            int r0 = r9.s
            int r0 = r0 + 2
            r9.s = r0
            char[] r0 = r9.q
            int r3 = r9.s
            char r0 = r0[r3]
            r3 = 97
            if (r0 < r3) goto L_0x0097
            char[] r0 = r9.q
            int r3 = r9.s
            char r0 = r0[r3]
            r3 = 103(0x67, float:1.44E-43)
            if (r0 <= r3) goto L_0x00a1
        L_0x0097:
            char[] r0 = r9.q
            int r3 = r9.s
            char r0 = r0[r3]
            r3 = 122(0x7a, float:1.71E-43)
            if (r0 != r3) goto L_0x00b1
        L_0x00a1:
            int r0 = r9.s
            int r0 = r0 + 1
            r9.s = r0
            char[] r0 = g
            boolean r0 = r9.a(r0)
            if (r0 != 0) goto L_0x00f2
            r0 = r1
            goto L_0x0034
        L_0x00b1:
            r0 = r1
            goto L_0x0034
        L_0x00b3:
            char[] r0 = r9.q
            int r3 = r9.s
            char r0 = r0[r3]
            r3 = 45
            if (r0 != r3) goto L_0x00e8
            char[] r0 = r9.q
            int r3 = r9.s
            int r3 = r3 + 1
            char r0 = r0[r3]
            r3 = 116(0x74, float:1.63E-43)
            if (r0 != r3) goto L_0x00e8
            char[] r0 = r9.q
            int r3 = r9.s
            int r3 = r3 + 2
            char r0 = r0[r3]
            r3 = 116(0x74, float:1.63E-43)
            if (r0 != r3) goto L_0x00e8
            r9.x = r2
            int r0 = r9.s
            int r0 = r0 + 3
            r9.s = r0
            char[] r0 = g
            boolean r0 = r9.a(r0)
            if (r0 != 0) goto L_0x00f2
            r0 = r1
            goto L_0x0034
        L_0x00e8:
            char[] r0 = i
            boolean r0 = r9.a(r0)
            if (r0 == 0) goto L_0x00fb
            r9.z = r2
        L_0x00f2:
            int r0 = r9.s
            int r0 = r0 + -1
            r9.D = r0
            r0 = r2
            goto L_0x0034
        L_0x00fb:
            char[] r0 = g
            boolean r0 = r9.a(r0)
            if (r0 != 0) goto L_0x00f2
            char[] r0 = l
            boolean r0 = r9.a(r0)
            if (r0 != 0) goto L_0x00f2
            r0 = r1
            goto L_0x0034
        L_0x010e:
            r0 = r1
            goto L_0x0034
        L_0x0111:
            char[] r0 = e
            boolean r0 = r9.a(r0)
            if (r0 == 0) goto L_0x014b
            r9.y = r2
            char[] r0 = r9.q
            int r3 = r9.s
            char r0 = r0[r3]
            r3 = 49
            if (r0 < r3) goto L_0x0148
            char[] r0 = r9.q
            int r3 = r9.s
            char r0 = r0[r3]
            r3 = 51
            if (r0 > r3) goto L_0x0148
            int r0 = r9.s
            int r0 = r0 + 1
            r9.s = r0
            char[] r0 = g
            boolean r0 = r9.a(r0)
            if (r0 != 0) goto L_0x00f2
            char[] r0 = l
            boolean r0 = r9.a(r0)
            if (r0 != 0) goto L_0x00f2
            r0 = r1
            goto L_0x0034
        L_0x0148:
            r0 = r1
            goto L_0x0034
        L_0x014b:
            char[] r0 = d
            boolean r0 = r9.a(r0)
            if (r0 == 0) goto L_0x017b
            r9.y = r2
            char[] r0 = r9.q
            int r3 = r9.s
            char r0 = r0[r3]
            r3 = 50
            if (r0 != r3) goto L_0x0178
            int r0 = r9.s
            int r0 = r0 + 1
            r9.s = r0
            char[] r0 = g
            boolean r0 = r9.a(r0)
            if (r0 != 0) goto L_0x00f2
            char[] r0 = l
            boolean r0 = r9.a(r0)
            if (r0 != 0) goto L_0x00f2
            r0 = r1
            goto L_0x0034
        L_0x0178:
            r0 = r1
            goto L_0x0034
        L_0x017b:
            r9.y = r1
            char[] r0 = f
            boolean r0 = r9.a(r0)
            if (r0 == 0) goto L_0x01ad
            char[] r0 = r9.q
            int r3 = r9.s
            char r0 = r0[r3]
            r3 = 48
            if (r0 < r3) goto L_0x01aa
            char[] r0 = r9.q
            int r3 = r9.s
            char r0 = r0[r3]
            r3 = 51
            if (r0 > r3) goto L_0x01aa
            int r0 = r9.s
            int r0 = r0 + 1
            r9.s = r0
            char[] r0 = j
            boolean r0 = r9.a(r0)
            if (r0 != 0) goto L_0x00f2
            r0 = r1
            goto L_0x0034
        L_0x01aa:
            r0 = r1
            goto L_0x0034
        L_0x01ad:
            char[] r0 = h
            boolean r0 = r9.a(r0)
            if (r0 != 0) goto L_0x00f2
            char[] r0 = r9.q
            int r3 = r9.s
            char r0 = r0[r3]
            r3 = 49
            if (r0 < r3) goto L_0x01da
            char[] r0 = r9.q
            int r3 = r9.s
            char r0 = r0[r3]
            r3 = 52
            if (r0 > r3) goto L_0x01da
            int r0 = r9.s
            int r0 = r0 + 1
            r9.s = r0
            char[] r0 = k
            boolean r0 = r9.a(r0)
            if (r0 != 0) goto L_0x00f2
            r0 = r1
            goto L_0x0034
        L_0x01da:
            r0 = r1
            goto L_0x0034
        L_0x01dd:
            int r3 = r9.s
            int r0 = r9.s
            r9.E = r1
        L_0x01e3:
            int r4 = r9.r
            if (r3 == r4) goto L_0x01ef
            char[] r4 = r9.q
            char r4 = r4[r3]
            r6 = 47
            if (r4 != r6) goto L_0x01f7
        L_0x01ef:
            if (r3 != r0) goto L_0x01fe
            int r4 = r9.r
            if (r3 == r4) goto L_0x01fe
            int r0 = r3 + 1
        L_0x01f7:
            int r4 = r9.r
            if (r3 == r4) goto L_0x021f
            int r3 = r3 + 1
            goto L_0x01e3
        L_0x01fe:
            int r4 = r9.E
            r6 = 8
            if (r4 < r6) goto L_0x0208
            r9.B = r1
            goto L_0x0013
        L_0x0208:
            int[] r4 = r9.F
            int r6 = r9.E
            r4[r6] = r0
            int[] r4 = r9.G
            int r6 = r9.E
            int r0 = r3 - r0
            r4[r6] = r0
            int r0 = r3 + 1
            int r4 = r9.E
            int r4 = r4 + 1
            r9.E = r4
            goto L_0x01f7
        L_0x021f:
            int r0 = r9.E
            if (r0 <= r2) goto L_0x0338
            int[] r0 = r9.G
            r0 = r0[r1]
            char[] r3 = m
            int r3 = r3.length
            if (r0 != r3) goto L_0x0338
            int[] r0 = r9.F
            r0 = r0[r1]
            char[] r3 = m
            boolean r0 = r9.a(r0, r3)
            if (r0 == 0) goto L_0x0338
            r0 = r2
        L_0x0239:
            if (r0 != 0) goto L_0x0251
            int r3 = r9.E
            if (r3 != r7) goto L_0x0251
            int[] r0 = r9.F
            r3 = 4
            r0 = r0[r3]
            r9.u = r0
            r9.C = r1
        L_0x0248:
            r0 = r2
        L_0x0249:
            if (r0 == 0) goto L_0x028d
            r9.A = r2
            r9.B = r2
            goto L_0x0013
        L_0x0251:
            if (r0 == 0) goto L_0x0261
            int r3 = r9.E
            r4 = 6
            if (r3 != r4) goto L_0x0261
            int[] r0 = r9.F
            r0 = r0[r7]
            r9.u = r0
            r9.C = r1
            goto L_0x0248
        L_0x0261:
            if (r0 != 0) goto L_0x0277
            int r3 = r9.E
            r4 = 6
            if (r3 != r4) goto L_0x0277
            int[] r0 = r9.F
            r3 = 4
            r0 = r0[r3]
            r9.u = r0
            int[] r0 = r9.G
            r3 = 4
            r0 = r0[r3]
            r9.C = r0
            goto L_0x0248
        L_0x0277:
            if (r0 == 0) goto L_0x028b
            int r0 = r9.E
            r3 = 7
            if (r0 != r3) goto L_0x028b
            int[] r0 = r9.F
            r0 = r0[r7]
            r9.u = r0
            int[] r0 = r9.G
            r0 = r0[r7]
            r9.C = r0
            goto L_0x0248
        L_0x028b:
            r0 = r1
            goto L_0x0249
        L_0x028d:
            int r0 = r9.E
            if (r0 > 0) goto L_0x029a
            r0 = r1
        L_0x0292:
            if (r0 == 0) goto L_0x0331
            r9.A = r1
            r9.B = r2
            goto L_0x0013
        L_0x029a:
            int[] r0 = r9.G
            r0 = r0[r1]
            char[] r3 = m
            int r3 = r3.length
            if (r0 != r3) goto L_0x0335
            int[] r0 = r9.F
            r0 = r0[r1]
            char[] r3 = m
            boolean r0 = r9.a(r0, r3)
            if (r0 == 0) goto L_0x0335
            r0 = r2
        L_0x02b0:
            int r3 = r9.E
            if (r3 != r2) goto L_0x02e4
            if (r0 != 0) goto L_0x02e4
            int[] r0 = r9.F
            r3 = r0[r1]
            int[] r0 = r9.G
            r0 = r0[r1]
        L_0x02be:
            r4 = r3
        L_0x02bf:
            int r6 = r9.r
            if (r4 >= r6) goto L_0x0306
            char[] r6 = r9.q
            char r6 = r6[r4]
            r7 = 61
            if (r6 != r7) goto L_0x0303
        L_0x02cb:
            r9.v = r4
            int r4 = r9.v
            if (r4 == r5) goto L_0x0308
            int r4 = r9.v
            int r4 = r4 + 1
            r9.u = r4
        L_0x02d7:
            int r4 = r9.v
            if (r4 == r5) goto L_0x0327
            int r4 = r9.u
            int r3 = r4 - r3
            int r0 = r0 - r3
            r9.C = r0
        L_0x02e2:
            r0 = r2
            goto L_0x0292
        L_0x02e4:
            int r3 = r9.E
            if (r3 != r8) goto L_0x02f1
            int[] r0 = r9.F
            r3 = r0[r2]
            int[] r0 = r9.G
            r0 = r0[r2]
            goto L_0x02be
        L_0x02f1:
            int r3 = r9.E
            r4 = 3
            if (r3 != r4) goto L_0x0301
            if (r0 == 0) goto L_0x0301
            int[] r0 = r9.F
            r3 = r0[r8]
            int[] r0 = r9.G
            r0 = r0[r8]
            goto L_0x02be
        L_0x0301:
            r0 = r1
            goto L_0x0292
        L_0x0303:
            int r4 = r4 + 1
            goto L_0x02bf
        L_0x0306:
            r4 = r5
            goto L_0x02cb
        L_0x0308:
            char[] r4 = n
            int r4 = r9.b(r3, r4)
            r9.v = r4
            int r4 = r9.v
            if (r4 != r5) goto L_0x031c
            char[] r4 = o
            int r4 = r9.b(r3, r4)
            r9.v = r4
        L_0x031c:
            int r4 = r9.v
            if (r4 == r5) goto L_0x02d7
            int r4 = r9.v
            int r4 = r4 + 3
            r9.u = r4
            goto L_0x02d7
        L_0x0327:
            int r0 = r0 + r3
            r9.v = r0
            int r0 = r9.v
            r9.u = r0
            r9.C = r1
            goto L_0x02e2
        L_0x0331:
            r9.B = r1
            goto L_0x0013
        L_0x0335:
            r0 = r1
            goto L_0x02b0
        L_0x0338:
            r0 = r1
            goto L_0x0239
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpz.b(java.lang.String):void");
    }

    private final boolean a(char[] cArr) {
        int i2 = this.s;
        int length = cArr.length;
        if (i2 + length > this.r) {
            return false;
        }
        int i3 = i2;
        int i4 = 0;
        while (i4 < length) {
            int i5 = i3 + 1;
            char c2 = this.q[i3];
            int i6 = i4 + 1;
            if (c2 != cArr[i4]) {
                return false;
            }
            i4 = i6;
            i3 = i5;
        }
        this.s = i3;
        return true;
    }

    private final boolean a(int i2, char[] cArr) {
        int length = cArr.length;
        if (i2 + length > this.r) {
            return false;
        }
        for (int i3 = 0; i3 < length; i3++) {
            if (this.q[i2 + i3] != cArr[i3]) {
                return false;
            }
        }
        return true;
    }

    private final int b(int i2, char[] cArr) {
        int length = cArr.length;
        int i3 = this.r - length;
        int i4 = i2;
        while (i4 <= i3) {
            int i5 = 0;
            while (i5 < length) {
                if (this.q[i4 + i5] == cArr[i5]) {
                    i5++;
                } else {
                    i4++;
                }
            }
            return i4;
        }
        return -1;
    }
}
