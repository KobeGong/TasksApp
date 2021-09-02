package defpackage;

/* renamed from: dhk reason: default package */
/* compiled from: PG */
final class dhk extends defpackage.dhj {
    private final byte[] e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k = Integer.MAX_VALUE;

    dhk(byte[] bArr, int i2, int i3) {
        this.e = bArr;
        this.f = i2 + i3;
        this.h = i2;
        this.i = this.h;
    }

    public final int a() {
        if (t()) {
            this.j = 0;
            return 0;
        }
        this.j = v();
        if ((this.j >>> 3) != 0) {
            return this.j;
        }
        throw defpackage.dir.d();
    }

    public final void a(int i2) {
        if (this.j != i2) {
            throw defpackage.dir.e();
        }
    }

    public final boolean b(int i2) {
        int a;
        int i3 = 0;
        switch (i2 & 7) {
            case 0:
                if (this.f - this.h >= 10) {
                    while (i3 < 10) {
                        byte[] bArr = this.e;
                        int i4 = this.h;
                        this.h = i4 + 1;
                        if (bArr[i4] >= 0) {
                            return true;
                        }
                        i3++;
                    }
                    throw defpackage.dir.c();
                }
                while (i3 < 10) {
                    if (A() >= 0) {
                        return true;
                    }
                    i3++;
                }
                throw defpackage.dir.c();
            case 1:
                e(8);
                return true;
            case 2:
                e(v());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                e(4);
                return true;
            default:
                throw defpackage.dir.f();
        }
        do {
            a = a();
            if (a != 0) {
            }
            a(((i2 >>> 3) << 3) | 4);
            return true;
        } while (b(a));
        a(((i2 >>> 3) << 3) | 4);
        return true;
    }

    public final double b() {
        return java.lang.Double.longBitsToDouble(y());
    }

    public final float c() {
        return java.lang.Float.intBitsToFloat(x());
    }

    public final long d() {
        return w();
    }

    public final long e() {
        return w();
    }

    public final int f() {
        return v();
    }

    public final long g() {
        return y();
    }

    public final int h() {
        return x();
    }

    public final boolean i() {
        return w() != 0;
    }

    public final java.lang.String j() {
        int v = v();
        if (v > 0 && v <= this.f - this.h) {
            java.lang.String str = new java.lang.String(this.e, this.h, v, defpackage.dim.a);
            this.h = v + this.h;
            return str;
        } else if (v == 0) {
            return "";
        } else {
            if (v < 0) {
                throw defpackage.dir.b();
            }
            throw defpackage.dir.a();
        }
    }

    public final java.lang.String k() {
        int v = v();
        if (v <= 0 || v > this.f - this.h) {
            if (v == 0) {
                return "";
            }
            if (v <= 0) {
                throw defpackage.dir.b();
            }
            throw defpackage.dir.a();
        } else if (!defpackage.dli.a(this.e, this.h, this.h + v)) {
            throw defpackage.dir.j();
        } else {
            int i2 = this.h;
            this.h += v;
            return new java.lang.String(this.e, i2, v, defpackage.dim.a);
        }
    }

    public final defpackage.djo a(defpackage.djx djx, defpackage.dhw dhw) {
        int v = v();
        if (this.a >= this.b) {
            throw defpackage.dir.g();
        }
        int c = c(v);
        this.a++;
        defpackage.djo djo = (defpackage.djo) djx.b(this, dhw);
        a(0);
        this.a--;
        d(c);
        return djo;
    }

    public final defpackage.dha l() {
        byte[] bArr;
        int v = v();
        if (v > 0 && v <= this.f - this.h) {
            defpackage.dha a = defpackage.dha.a(this.e, this.h, v);
            this.h = v + this.h;
            return a;
        } else if (v == 0) {
            return defpackage.dha.a;
        } else {
            if (v > 0 && v <= this.f - this.h) {
                int i2 = this.h;
                this.h = v + this.h;
                bArr = java.util.Arrays.copyOfRange(this.e, i2, this.h);
            } else if (v > 0) {
                throw defpackage.dir.a();
            } else if (v == 0) {
                bArr = defpackage.dim.b;
            } else {
                throw defpackage.dir.b();
            }
            return defpackage.dha.a(bArr);
        }
    }

    public final int m() {
        return v();
    }

    public final int n() {
        return v();
    }

    public final int o() {
        return x();
    }

    public final long p() {
        return y();
    }

    public final int q() {
        return f(v());
    }

    public final long r() {
        return a(w());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
        if (r3[r2] < 0) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int v() {
        /*
            r5 = this;
            int r0 = r5.h
            int r1 = r5.f
            if (r1 == r0) goto L_0x006c
            byte[] r3 = r5.e
            int r2 = r0 + 1
            byte r0 = r3[r0]
            if (r0 < 0) goto L_0x0011
            r5.h = r2
        L_0x0010:
            return r0
        L_0x0011:
            int r1 = r5.f
            int r1 = r1 - r2
            r4 = 9
            if (r1 < r4) goto L_0x006c
            int r1 = r2 + 1
            byte r2 = r3[r2]
            int r2 = r2 << 7
            r0 = r0 ^ r2
            if (r0 >= 0) goto L_0x0026
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x0023:
            r5.h = r1
            goto L_0x0010
        L_0x0026:
            int r2 = r1 + 1
            byte r1 = r3[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0033
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            r1 = r2
            goto L_0x0023
        L_0x0033:
            int r1 = r2 + 1
            byte r2 = r3[r2]
            int r2 = r2 << 21
            r0 = r0 ^ r2
            if (r0 >= 0) goto L_0x0041
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0023
        L_0x0041:
            int r2 = r1 + 1
            byte r1 = r3[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x0072
            int r1 = r2 + 1
            byte r2 = r3[r2]
            if (r2 >= 0) goto L_0x0023
            int r2 = r1 + 1
            byte r1 = r3[r1]
            if (r1 >= 0) goto L_0x0072
            int r1 = r2 + 1
            byte r2 = r3[r2]
            if (r2 >= 0) goto L_0x0023
            int r2 = r1 + 1
            byte r1 = r3[r1]
            if (r1 >= 0) goto L_0x0072
            int r1 = r2 + 1
            byte r2 = r3[r2]
            if (r2 >= 0) goto L_0x0023
        L_0x006c:
            long r0 = r5.s()
            int r0 = (int) r0
            goto L_0x0010
        L_0x0072:
            r1 = r2
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhk.v():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b2, code lost:
        if (((long) r4[r3]) < 0) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long w() {
        /*
            r10 = this;
            r8 = 0
            int r0 = r10.h
            int r1 = r10.f
            if (r1 == r0) goto L_0x00b4
            byte[] r4 = r10.e
            int r1 = r0 + 1
            byte r0 = r4[r0]
            if (r0 < 0) goto L_0x0014
            r10.h = r1
            long r0 = (long) r0
        L_0x0013:
            return r0
        L_0x0014:
            int r2 = r10.f
            int r2 = r2 - r1
            r3 = 9
            if (r2 < r3) goto L_0x00b4
            int r2 = r1 + 1
            byte r1 = r4[r1]
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L_0x002a
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            long r0 = (long) r0
        L_0x0027:
            r10.h = r2
            goto L_0x0013
        L_0x002a:
            int r3 = r2 + 1
            byte r1 = r4[r2]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0038
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            long r0 = (long) r0
            r2 = r3
            goto L_0x0027
        L_0x0038:
            int r2 = r3 + 1
            byte r1 = r4[r3]
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L_0x0047
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            long r0 = (long) r0
            goto L_0x0027
        L_0x0047:
            long r0 = (long) r0
            int r3 = r2 + 1
            byte r2 = r4[r2]
            long r6 = (long) r2
            r2 = 28
            long r6 = r6 << r2
            long r0 = r0 ^ r6
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 < 0) goto L_0x005b
            r4 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r0 = r0 ^ r4
            r2 = r3
            goto L_0x0027
        L_0x005b:
            int r2 = r3 + 1
            byte r3 = r4[r3]
            long r6 = (long) r3
            r3 = 35
            long r6 = r6 << r3
            long r0 = r0 ^ r6
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x006f
            r4 = -34093383808(0xfffffff80fe03f80, double:NaN)
            long r0 = r0 ^ r4
            goto L_0x0027
        L_0x006f:
            int r3 = r2 + 1
            byte r2 = r4[r2]
            long r6 = (long) r2
            r2 = 42
            long r6 = r6 << r2
            long r0 = r0 ^ r6
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 < 0) goto L_0x0084
            r4 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            long r0 = r0 ^ r4
            r2 = r3
            goto L_0x0027
        L_0x0084:
            int r2 = r3 + 1
            byte r3 = r4[r3]
            long r6 = (long) r3
            r3 = 49
            long r6 = r6 << r3
            long r0 = r0 ^ r6
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x0098
            r4 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            long r0 = r0 ^ r4
            goto L_0x0027
        L_0x0098:
            int r3 = r2 + 1
            byte r2 = r4[r2]
            long r6 = (long) r2
            r2 = 56
            long r6 = r6 << r2
            long r0 = r0 ^ r6
            r6 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r0 = r0 ^ r6
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x00ba
            int r2 = r3 + 1
            byte r3 = r4[r3]
            long r4 = (long) r3
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x0027
        L_0x00b4:
            long r0 = r10.s()
            goto L_0x0013
        L_0x00ba:
            r2 = r3
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhk.w():long");
    }

    /* access modifiers changed from: 0000 */
    public final long s() {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte A = A();
            j2 |= ((long) (A & Byte.MAX_VALUE)) << i2;
            if ((A & 128) == 0) {
                return j2;
            }
        }
        throw defpackage.dir.c();
    }

    private final int x() {
        int i2 = this.h;
        if (this.f - i2 < 4) {
            throw defpackage.dir.a();
        }
        byte[] bArr = this.e;
        this.h = i2 + 4;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    private final long y() {
        int i2 = this.h;
        if (this.f - i2 < 8) {
            throw defpackage.dir.a();
        }
        byte[] bArr = this.e;
        this.h = i2 + 8;
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    public final int c(int i2) {
        if (i2 < 0) {
            throw defpackage.dir.b();
        }
        int u = u() + i2;
        int i3 = this.k;
        if (u > i3) {
            throw defpackage.dir.a();
        }
        this.k = u;
        z();
        return i3;
    }

    private final void z() {
        this.f += this.g;
        int i2 = this.f - this.i;
        if (i2 > this.k) {
            this.g = i2 - this.k;
            this.f -= this.g;
            return;
        }
        this.g = 0;
    }

    public final void d(int i2) {
        this.k = i2;
        z();
    }

    public final boolean t() {
        return this.h == this.f;
    }

    public final int u() {
        return this.h - this.i;
    }

    private final byte A() {
        if (this.h == this.f) {
            throw defpackage.dir.a();
        }
        byte[] bArr = this.e;
        int i2 = this.h;
        this.h = i2 + 1;
        return bArr[i2];
    }

    public final void e(int i2) {
        if (i2 >= 0 && i2 <= this.f - this.h) {
            this.h += i2;
        } else if (i2 < 0) {
            throw defpackage.dir.b();
        } else {
            throw defpackage.dir.a();
        }
    }
}
