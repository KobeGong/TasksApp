package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: dhl  reason: default package */
/* compiled from: PG */
public final class dhl extends dhj {
    private final InputStream e;
    private final byte[] f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l = Integer.MAX_VALUE;

    dhl(InputStream inputStream) {
        dim.a((Object) inputStream, "input");
        this.e = inputStream;
        this.f = new byte[4096];
        this.g = 0;
        this.i = 0;
        this.k = 0;
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
        if (v > 0 && v <= this.g - this.i) {
            String str = new String(this.f, this.i, v, dim.a);
            this.i = v + this.i;
            return str;
        } else if (v == 0) {
            return "";
        } else {
            if (v > this.g) {
                return new String(i(v), dim.a);
            }
            g(v);
            String str2 = new String(this.f, this.i, v, dim.a);
            this.i = v + this.i;
            return str2;
        }
    }

    @Override // defpackage.dhj
    public final String k() {
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
        if (dli.a(i2, i3, i3 + v)) {
            return new String(i2, i3, v, dim.a);
        }
        throw dir.j();
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
        int v = v();
        if (v <= this.g - this.i && v > 0) {
            dha a = dha.a(this.f, this.i, v);
            this.i = v + this.i;
            return a;
        } else if (v == 0) {
            return dha.a;
        } else {
            byte[] j2 = j(v);
            if (j2 != null) {
                return dha.a(j2);
            }
            int i2 = this.i;
            int i3 = this.g - this.i;
            this.k += this.g;
            this.i = 0;
            this.g = 0;
            List<byte[]> k2 = k(v - i3);
            ArrayList arrayList = new ArrayList(k2.size() + 1);
            arrayList.add(dha.a(this.f, i2, i3));
            for (byte[] bArr : k2) {
                arrayList.add(dha.a(bArr));
            }
            return dha.a(arrayList);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhl.v():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b2, code lost:
        if (((long) r4[r3]) < 0) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long w() {
        /*
        // Method dump skipped, instructions count: 189
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhl.w():long");
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

    @Override // defpackage.dhj
    public final int c(int i2) {
        if (i2 < 0) {
            throw dir.b();
        }
        int i3 = this.k + this.i + i2;
        int i4 = this.l;
        if (i3 > i4) {
            throw dir.a();
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

    @Override // defpackage.dhj
    public final void d(int i2) {
        this.l = i2;
        z();
    }

    @Override // defpackage.dhj
    public final boolean t() {
        return this.i == this.g && !h(1);
    }

    @Override // defpackage.dhj
    public final int u() {
        return this.k + this.i;
    }

    private final void g(int i2) {
        if (h(i2)) {
            return;
        }
        if (i2 > (this.c - this.k) - this.i) {
            throw dir.h();
        }
        throw dir.a();
    }

    private final boolean h(int i2) {
        while (this.i + i2 > this.g) {
            if (i2 > (this.c - this.k) - this.i || this.k + this.i + i2 > this.l) {
                return false;
            }
            int i3 = this.i;
            if (i3 > 0) {
                if (this.g > i3) {
                    System.arraycopy(this.f, i3, this.f, 0, this.g - i3);
                }
                this.k += i3;
                this.g -= i3;
                this.i = 0;
            }
            int read = this.e.read(this.f, this.g, Math.min(this.f.length - this.g, (this.c - this.k) - this.g));
            if (read == 0 || read < -1 || read > this.f.length) {
                throw new IllegalStateException(new StringBuilder(102).append("InputStream#read(byte[]) returned invalid result: ").append(read).append("\nThe InputStream implementation is buggy.").toString());
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
        throw new IllegalStateException(new StringBuilder(77).append("refillBuffer() called when ").append(i2).append(" bytes were already available in buffer").toString());
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
        List<byte[]> k2 = k(i2 - i4);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f, i3, bArr, 0, i4);
        for (byte[] bArr2 : k2) {
            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 = bArr2.length + i4;
        }
        return bArr;
    }

    private final byte[] j(int i2) {
        if (i2 == 0) {
            return dim.b;
        }
        if (i2 < 0) {
            throw dir.b();
        }
        int i3 = this.k + this.i + i2;
        if (i3 - this.c > 0) {
            throw dir.h();
        } else if (i3 > this.l) {
            e((this.l - this.k) - this.i);
            throw dir.a();
        } else {
            int i4 = this.g - this.i;
            int i5 = i2 - i4;
            if (i5 >= 4096 && i5 > this.e.available()) {
                return null;
            }
            byte[] bArr = new byte[i2];
            System.arraycopy(this.f, this.i, bArr, 0, i4);
            this.k += this.g;
            this.i = 0;
            this.g = 0;
            while (i4 < bArr.length) {
                int read = this.e.read(bArr, i4, i2 - i4);
                if (read == -1) {
                    throw dir.a();
                }
                this.k += read;
                i4 += read;
            }
            return bArr;
        }
    }

    private final List k(int i2) {
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            byte[] bArr = new byte[Math.min(i2, 4096)];
            int i3 = 0;
            while (i3 < bArr.length) {
                int read = this.e.read(bArr, i3, bArr.length - i3);
                if (read == -1) {
                    throw dir.a();
                }
                this.k += read;
                i3 += read;
            }
            i2 -= bArr.length;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // defpackage.dhj
    public final void e(int i2) {
        if (i2 <= this.g - this.i && i2 >= 0) {
            this.i += i2;
        } else if (i2 < 0) {
            throw dir.b();
        } else if (this.k + this.i + i2 > this.l) {
            e((this.l - this.k) - this.i);
            throw dir.a();
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
