package defpackage;

import java.util.Arrays;

/* access modifiers changed from: package-private */
/* renamed from: dhk  reason: default package */
/* compiled from: PG */
public final class dhk extends dhj {
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

    @Override // defpackage.dhj
    public final int a() {
        if (t()) {
            this.j = 0;
            return 0;
        }
        this.j = v();
        if ((this.j >>> 3) != 0) {
            return this.j;
        }
        throw dir.d();
    }

    @Override // defpackage.dhj
    public final void a(int i2) {
        if (this.j != i2) {
            throw dir.e();
        }
    }

    @Override // defpackage.dhj
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
                    throw dir.c();
                }
                while (i3 < 10) {
                    if (A() >= 0) {
                        return true;
                    }
                    i3++;
                }
                throw dir.c();
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
                throw dir.f();
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

    @Override // defpackage.dhj
    public final double b() {
        return Double.longBitsToDouble(y());
    }

    @Override // defpackage.dhj
    public final float c() {
        return Float.intBitsToFloat(x());
    }

    @Override // defpackage.dhj
    public final long d() {
        return w();
    }

    @Override // defpackage.dhj
    public final long e() {
        return w();
    }

    @Override // defpackage.dhj
    public final int f() {
        return v();
    }

    @Override // defpackage.dhj
    public final long g() {
        return y();
    }

    @Override // defpackage.dhj
    public final int h() {
        return x();
    }

    @Override // defpackage.dhj
    public final boolean i() {
        return w() != 0;
    }

    @Override // defpackage.dhj
    public final String j() {
        int v = v();
        if (v > 0 && v <= this.f - this.h) {
            String str = new String(this.e, this.h, v, dim.a);
            this.h = v + this.h;
            return str;
        } else if (v == 0) {
            return "";
        } else {
            if (v < 0) {
                throw dir.b();
            }
            throw dir.a();
        }
    }

    @Override // defpackage.dhj
    public final String k() {
        int v = v();
        if (v <= 0 || v > this.f - this.h) {
            if (v == 0) {
                return "";
            }
            if (v <= 0) {
                throw dir.b();
            }
            throw dir.a();
        } else if (!dli.a(this.e, this.h, this.h + v)) {
            throw dir.j();
        } else {
            int i2 = this.h;
            this.h += v;
            return new String(this.e, i2, v, dim.a);
        }
    }

    @Override // defpackage.dhj
    public final djo a(djx djx, dhw dhw) {
        int v = v();
        if (this.a >= this.b) {
            throw dir.g();
        }
        int c = c(v);
        this.a++;
        djo djo = (djo) djx.b(this, dhw);
        a(0);
        this.a--;
        d(c);
        return djo;
    }

    @Override // defpackage.dhj
    public final dha l() {
        byte[] bArr;
        int v = v();
        if (v > 0 && v <= this.f - this.h) {
            dha a = dha.a(this.e, this.h, v);
            this.h = v + this.h;
            return a;
        } else if (v == 0) {
            return dha.a;
        } else {
            if (v > 0 && v <= this.f - this.h) {
                int i2 = this.h;
                this.h = v + this.h;
                bArr = Arrays.copyOfRange(this.e, i2, this.h);
            } else if (v > 0) {
                throw dir.a();
            } else if (v == 0) {
                bArr = dim.b;
            } else {
                throw dir.b();
            }
            return dha.a(bArr);
        }
    }

    @Override // defpackage.dhj
    public final int m() {
        return v();
    }

    @Override // defpackage.dhj
    public final int n() {
        return v();
    }

    @Override // defpackage.dhj
    public final int o() {
        return x();
    }

    @Override // defpackage.dhj
    public final long p() {
        return y();
    }

    @Override // defpackage.dhj
    public final int q() {
        return f(v());
    }

    @Override // defpackage.dhj
    public final long r() {
        return a(w());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
        if (r3[r2] < 0) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int v() {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhk.v():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b2, code lost:
        if (((long) r4[r3]) < 0) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long w() {
        /*
        // Method dump skipped, instructions count: 189
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhk.w():long");
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.dhj
    public final long s() {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte A = A();
            j2 |= ((long) (A & Byte.MAX_VALUE)) << i2;
            if ((A & 128) == 0) {
                return j2;
            }
        }
        throw dir.c();
    }

    private final int x() {
        int i2 = this.h;
        if (this.f - i2 < 4) {
            throw dir.a();
        }
        byte[] bArr = this.e;
        this.h = i2 + 4;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    private final long y() {
        int i2 = this.h;
        if (this.f - i2 < 8) {
            throw dir.a();
        }
        byte[] bArr = this.e;
        this.h = i2 + 8;
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    @Override // defpackage.dhj
    public final int c(int i2) {
        if (i2 < 0) {
            throw dir.b();
        }
        int u = u() + i2;
        int i3 = this.k;
        if (u > i3) {
            throw dir.a();
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

    @Override // defpackage.dhj
    public final void d(int i2) {
        this.k = i2;
        z();
    }

    @Override // defpackage.dhj
    public final boolean t() {
        return this.h == this.f;
    }

    @Override // defpackage.dhj
    public final int u() {
        return this.h - this.i;
    }

    private final byte A() {
        if (this.h == this.f) {
            throw dir.a();
        }
        byte[] bArr = this.e;
        int i2 = this.h;
        this.h = i2 + 1;
        return bArr[i2];
    }

    @Override // defpackage.dhj
    public final void e(int i2) {
        if (i2 >= 0 && i2 <= this.f - this.h) {
            this.h += i2;
        } else if (i2 < 0) {
            throw dir.b();
        } else {
            throw dir.a();
        }
    }
}
