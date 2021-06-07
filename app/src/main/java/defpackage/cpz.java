package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: cpz  reason: default package */
/* compiled from: PG */
public final class cpz {
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

    /* access modifiers changed from: package-private */
    public final synchronized boolean a(String str) {
        b(str);
        return this.w;
    }

    /* access modifiers changed from: package-private */
    public final synchronized String a(String str, int i2, int i3, int i4, int i5) {
        String sb;
        boolean z2;
        b(str);
        if (!this.B) {
            sb = null;
        } else {
            StringBuilder sb2 = new StringBuilder(this.r + 50);
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
                                z2 = false;
                                i12 = i14;
                                i11 = i13;
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
            int i15 = this.u;
            int i16 = this.C + this.u;
            while (i15 < i16) {
                boolean z5 = this.q[i15] == 'f';
                while (i15 < i16 && this.q[i15] != '-') {
                    if (z5) {
                        sb2.append(this.q[i15]);
                    }
                    i15++;
                }
                if (z5) {
                    sb2.append('-');
                }
                i15++;
            }
            int i17 = this.u;
            int i18 = this.C + this.u;
            while (i17 < i18) {
                boolean z6 = this.q[i17] == 'i' && this.q[i17 + 1] == 'v';
                while (i17 < i18 && this.q[i17] != '-') {
                    if (z6) {
                        sb2.append(this.q[i17]);
                    }
                    i17++;
                }
                if (z6) {
                    sb2.append('-');
                }
                i17++;
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
        // Method dump skipped, instructions count: 827
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
        for (int i4 = i2; i4 <= i3; i4++) {
            for (int i5 = 0; i5 < length; i5++) {
                if (this.q[i4 + i5] == cArr[i5]) {
                }
            }
            return i4;
        }
        return -1;
    }
}
