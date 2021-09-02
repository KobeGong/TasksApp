package defpackage;

/* renamed from: dlw reason: default package */
/* compiled from: PG */
public final class dlw {
    public final byte[] a;
    public final int b;
    public final int c;
    public int d;
    public int e;
    public int f;
    public int g = 64;
    public defpackage.dhj h;
    private int i;
    private int j;
    private int k = Integer.MAX_VALUE;

    public static defpackage.dlw a(byte[] bArr, int i2, int i3) {
        return new defpackage.dlw(bArr, i2, i3);
    }

    public final int a() {
        if (this.d == this.i) {
            this.e = 0;
            return 0;
        }
        this.e = e();
        if (this.e != 0) {
            return this.e;
        }
        throw new defpackage.dme("Protocol message contained an invalid tag (zero).");
    }

    public final void a(int i2) {
        if (this.e != i2) {
            throw new defpackage.dme("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final boolean b(int i2) {
        int a2;
        switch (i2 & 7) {
            case 0:
                e();
                return true;
            case 1:
                g();
                return true;
            case 2:
                f(e());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                f();
                return true;
            default:
                throw new defpackage.dme("Protocol message tag had invalid wire type.");
        }
        do {
            a2 = a();
            if (a2 != 0) {
            }
            a(((i2 >>> 3) << 3) | 4);
            return true;
        } while (b(a2));
        a(((i2 >>> 3) << 3) | 4);
        return true;
    }

    public final long b() {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte j3 = j();
            j2 |= ((long) (j3 & Byte.MAX_VALUE)) << i2;
            if ((j3 & 128) == 0) {
                return j2;
            }
        }
        throw defpackage.dme.c();
    }

    public final boolean c() {
        return e() != 0;
    }

    public final java.lang.String d() {
        int e2 = e();
        if (e2 < 0) {
            throw defpackage.dme.b();
        } else if (e2 > this.i - this.d) {
            throw defpackage.dme.a();
        } else {
            java.lang.String str = new java.lang.String(this.a, this.d, e2, defpackage.dmd.a);
            this.d = e2 + this.d;
            return str;
        }
    }

    public final void a(defpackage.dmf dmf) {
        int e2 = e();
        if (this.f >= this.g) {
            throw new defpackage.dme("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int c2 = c(e2);
        this.f++;
        dmf.a(this);
        a(0);
        this.f--;
        d(c2);
    }

    public final int e() {
        byte j2 = j();
        if (j2 >= 0) {
            return j2;
        }
        byte b2 = j2 & Byte.MAX_VALUE;
        byte j3 = j();
        if (j3 >= 0) {
            return b2 | (j3 << 7);
        }
        byte b3 = b2 | ((j3 & Byte.MAX_VALUE) << 7);
        byte j4 = j();
        if (j4 >= 0) {
            return b3 | (j4 << 14);
        }
        byte b4 = b3 | ((j4 & Byte.MAX_VALUE) << 14);
        byte j5 = j();
        if (j5 >= 0) {
            return b4 | (j5 << 21);
        }
        byte b5 = b4 | ((j5 & Byte.MAX_VALUE) << 21);
        byte j6 = j();
        byte b6 = b5 | (j6 << 28);
        if (j6 >= 0) {
            return b6;
        }
        for (int i2 = 0; i2 < 5; i2++) {
            if (j() >= 0) {
                return b6;
            }
        }
        throw defpackage.dme.c();
    }

    public final int f() {
        return (j() & 255) | ((j() & 255) << 8) | ((j() & 255) << 16) | ((j() & 255) << 24);
    }

    public final long g() {
        byte j2 = j();
        byte j3 = j();
        return ((((long) j3) & 255) << 8) | (((long) j2) & 255) | ((((long) j()) & 255) << 16) | ((((long) j()) & 255) << 24) | ((((long) j()) & 255) << 32) | ((((long) j()) & 255) << 40) | ((((long) j()) & 255) << 48) | ((((long) j()) & 255) << 56);
    }

    private dlw(byte[] bArr, int i2, int i3) {
        this.a = bArr;
        this.b = i2;
        int i4 = i2 + i3;
        this.i = i4;
        this.c = i4;
        this.d = i2;
    }

    public final int c(int i2) {
        if (i2 < 0) {
            throw defpackage.dme.b();
        }
        int i3 = this.d + i2;
        int i4 = this.k;
        if (i3 > i4) {
            throw defpackage.dme.a();
        }
        this.k = i3;
        k();
        return i4;
    }

    private final void k() {
        this.i += this.j;
        int i2 = this.i;
        if (i2 > this.k) {
            this.j = i2 - this.k;
            this.i -= this.j;
            return;
        }
        this.j = 0;
    }

    public final void d(int i2) {
        this.k = i2;
        k();
    }

    public final int h() {
        if (this.k == Integer.MAX_VALUE) {
            return -1;
        }
        return this.k - this.d;
    }

    public final int i() {
        return this.d - this.b;
    }

    public final void e(int i2) {
        a(i2, this.e);
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, int i3) {
        if (i2 > this.d - this.b) {
            throw new java.lang.IllegalArgumentException("Position " + i2 + " is beyond current " + (this.d - this.b));
        } else if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("Bad position " + i2);
        } else {
            this.d = this.b + i2;
            this.e = i3;
        }
    }

    public final byte j() {
        if (this.d == this.i) {
            throw defpackage.dme.a();
        }
        byte[] bArr = this.a;
        int i2 = this.d;
        this.d = i2 + 1;
        return bArr[i2];
    }

    private final void f(int i2) {
        if (i2 < 0) {
            throw defpackage.dme.b();
        } else if (this.d + i2 > this.k) {
            f(this.k - this.d);
            throw defpackage.dme.a();
        } else if (i2 <= this.i - this.d) {
            this.d += i2;
        } else {
            throw defpackage.dme.a();
        }
    }
}
