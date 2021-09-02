package defpackage;

/* renamed from: dhl reason: default package */
/* compiled from: PG */
final class dhl extends defpackage.dhj {
    private final java.io.InputStream e;
    private final byte[] f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l = Integer.MAX_VALUE;

    dhl(java.io.InputStream inputStream) {
        defpackage.dim.a((java.lang.Object) inputStream, "input");
        this.e = inputStream;
        this.f = new byte[4096];
        this.g = 0;
        this.i = 0;
        this.k = 0;
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
                if (this.g - this.i >= 10) {
                    while (i3 < 10) {
                        byte[] bArr = this.f;
                        int i4 = this.i;
                        this.i = i4 + 1;
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
        if (v > 0 && v <= this.g - this.i) {
            java.lang.String str = new java.lang.String(this.f, this.i, v, defpackage.dim.a);
            this.i = v + this.i;
            return str;
        } else if (v == 0) {
            return "";
        } else {
            if (v > this.g) {
                return new java.lang.String(i(v), defpackage.dim.a);
            }
            g(v);
            java.lang.String str2 = new java.lang.String(this.f, this.i, v, defpackage.dim.a);
            this.i = v + this.i;
            return str2;
        }
    }

    public final java.lang.String k() {
        byte[] i2;
        int v = v();
        int i3 = this.i;
        if (v <= this.g - i3 && v > 0) {
            i2 = this.f;
            this.i = i3 + v;
        } else if (v == 0) {
            return "";
        } else {
            if (v <= this.g) {
                g(v);
                byte[] bArr = this.f;
                this.i = v;
                i2 = bArr;
                i3 = 0;
            } else {
                i2 = i(v);
                i3 = 0;
            }
        }
        if (defpackage.dli.a(i2, i3, i3 + v)) {
            return new java.lang.String(i2, i3, v, defpackage.dim.a);
        }
        throw defpackage.dir.j();
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
        int v = v();
        if (v <= this.g - this.i && v > 0) {
            defpackage.dha a = defpackage.dha.a(this.f, this.i, v);
            this.i = v + this.i;
            return a;
        } else if (v == 0) {
            return defpackage.dha.a;
        } else {
            byte[] j2 = j(v);
            if (j2 != null) {
                return defpackage.dha.a(j2);
            }
            int i2 = this.i;
            int i3 = this.g - this.i;
            this.k += this.g;
            this.i = 0;
            this.g = 0;
            java.util.List<byte[]> k2 = k(v - i3);
            java.util.ArrayList arrayList = new java.util.ArrayList(k2.size() + 1);
            arrayList.add(defpackage.dha.a(this.f, i2, i3));
            for (byte[] a2 : k2) {
                arrayList.add(defpackage.dha.a(a2));
            }
            return defpackage.dha.a((java.lang.Iterable) arrayList);
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
            int r0 = r5.i
            int r1 = r5.g
            if (r1 == r0) goto L_0x006c
            byte[] r3 = r5.f
            int r2 = r0 + 1
            byte r0 = r3[r0]
            if (r0 < 0) goto L_0x0011
            r5.i = r2
        L_0x0010:
            return r0
        L_0x0011:
            int r1 = r5.g
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
            r5.i = r1
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhl.v():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b2, code lost:
        if (((long) r4[r3]) < 0) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long w() {
        /*
            r10 = this;
            r8 = 0
            int r0 = r10.i
            int r1 = r10.g
            if (r1 == r0) goto L_0x00b4
            byte[] r4 = r10.f
            int r1 = r0 + 1
            byte r0 = r4[r0]
            if (r0 < 0) goto L_0x0014
            r10.i = r1
            long r0 = (long) r0
        L_0x0013:
            return r0
        L_0x0014:
            int r2 = r10.g
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
            r10.i = r2
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhl.w():long");
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
        int i2 = this.i;
        if (this.g - i2 < 4) {
            g(4);
            i2 = this.i;
        }
        byte[] bArr = this.f;
        this.i = i2 + 4;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    private final long y() {
        int i2 = this.i;
        if (this.g - i2 < 8) {
            g(8);
            i2 = this.i;
        }
        byte[] bArr = this.f;
        this.i = i2 + 8;
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    public final int c(int i2) {
        if (i2 < 0) {
            throw defpackage.dir.b();
        }
        int i3 = this.k + this.i + i2;
        int i4 = this.l;
        if (i3 > i4) {
            throw defpackage.dir.a();
        }
        this.l = i3;
        z();
        return i4;
    }

    private final void z() {
        this.g += this.h;
        int i2 = this.k + this.g;
        if (i2 > this.l) {
            this.h = i2 - this.l;
            this.g -= this.h;
            return;
        }
        this.h = 0;
    }

    public final void d(int i2) {
        this.l = i2;
        z();
    }

    public final boolean t() {
        return this.i == this.g && !h(1);
    }

    public final int u() {
        return this.k + this.i;
    }

    private final void g(int i2) {
        if (h(i2)) {
            return;
        }
        if (i2 > (this.c - this.k) - this.i) {
            throw defpackage.dir.h();
        }
        throw defpackage.dir.a();
    }

    private final boolean h(int i2) {
        while (this.i + i2 > this.g) {
            if (i2 > (this.c - this.k) - this.i || this.k + this.i + i2 > this.l) {
                return false;
            }
            int i3 = this.i;
            if (i3 > 0) {
                if (this.g > i3) {
                    java.lang.System.arraycopy(this.f, i3, this.f, 0, this.g - i3);
                }
                this.k += i3;
                this.g -= i3;
                this.i = 0;
            }
            int read = this.e.read(this.f, this.g, java.lang.Math.min(this.f.length - this.g, (this.c - this.k) - this.g));
            if (read == 0 || read < -1 || read > this.f.length) {
                throw new java.lang.IllegalStateException("InputStream#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            } else if (read <= 0) {
                return false;
            } else {
                this.g = read + this.g;
                z();
                if (this.g >= i2) {
                    return true;
                }
            }
        }
        throw new java.lang.IllegalStateException("refillBuffer() called when " + i2 + " bytes were already available in buffer");
    }

    private final byte A() {
        if (this.i == this.g) {
            g(1);
        }
        byte[] bArr = this.f;
        int i2 = this.i;
        this.i = i2 + 1;
        return bArr[i2];
    }

    private final byte[] i(int i2) {
        byte[] j2 = j(i2);
        if (j2 != null) {
            return j2;
        }
        int i3 = this.i;
        int i4 = this.g - this.i;
        this.k += this.g;
        this.i = 0;
        this.g = 0;
        java.util.List k2 = k(i2 - i4);
        byte[] bArr = new byte[i2];
        java.lang.System.arraycopy(this.f, i3, bArr, 0, i4);
        java.util.Iterator it = k2.iterator();
        while (true) {
            int i5 = i4;
            if (!it.hasNext()) {
                return bArr;
            }
            byte[] bArr2 = (byte[]) it.next();
            java.lang.System.arraycopy(bArr2, 0, bArr, i5, bArr2.length);
            i4 = bArr2.length + i5;
        }
    }

    private final byte[] j(int i2) {
        if (i2 == 0) {
            return defpackage.dim.b;
        }
        if (i2 < 0) {
            throw defpackage.dir.b();
        }
        int i3 = this.k + this.i + i2;
        if (i3 - this.c > 0) {
            throw defpackage.dir.h();
        } else if (i3 > this.l) {
            e((this.l - this.k) - this.i);
            throw defpackage.dir.a();
        } else {
            int i4 = this.g - this.i;
            int i5 = i2 - i4;
            if (i5 >= 4096 && i5 > this.e.available()) {
                return null;
            }
            byte[] bArr = new byte[i2];
            java.lang.System.arraycopy(this.f, this.i, bArr, 0, i4);
            this.k += this.g;
            this.i = 0;
            this.g = 0;
            while (i4 < bArr.length) {
                int read = this.e.read(bArr, i4, i2 - i4);
                if (read == -1) {
                    throw defpackage.dir.a();
                }
                this.k += read;
                i4 += read;
            }
            return bArr;
        }
    }

    private final java.util.List k(int i2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (i2 > 0) {
            byte[] bArr = new byte[java.lang.Math.min(i2, 4096)];
            int i3 = 0;
            while (i3 < bArr.length) {
                int read = this.e.read(bArr, i3, bArr.length - i3);
                if (read == -1) {
                    throw defpackage.dir.a();
                }
                this.k += read;
                i3 += read;
            }
            i2 -= bArr.length;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final void e(int i2) {
        if (i2 <= this.g - this.i && i2 >= 0) {
            this.i += i2;
        } else if (i2 < 0) {
            throw defpackage.dir.b();
        } else if (this.k + this.i + i2 > this.l) {
            e((this.l - this.k) - this.i);
            throw defpackage.dir.a();
        } else {
            int i3 = this.g - this.i;
            this.i = this.g;
            g(1);
            while (i2 - i3 > this.g) {
                i3 += this.g;
                this.i = this.g;
                g(1);
            }
            this.i = i2 - i3;
        }
    }
}
