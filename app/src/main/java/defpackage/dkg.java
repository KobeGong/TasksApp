package defpackage;

import java.io.InputStream;

/* renamed from: dkg  reason: default package */
/* compiled from: PG */
final class dkg extends InputStream {
    private dkf a;
    private dhg b;
    private int c;
    private int d;
    private int e;
    private int f;
    private final /* synthetic */ dkd g;

    public dkg(dkd dkd) {
        this.g = dkd;
        a();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException();
        } else if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
            return a(bArr, i, i2);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        return (long) a(null, 0, (int) j);
    }

    private final int a(byte[] bArr, int i, int i2) {
        int i3 = i2;
        int i4 = i;
        while (true) {
            if (i3 <= 0) {
                break;
            }
            b();
            if (this.b != null) {
                int min = Math.min(this.c - this.d, i3);
                if (bArr != null) {
                    this.b.a(bArr, this.d, i4, min);
                    i4 += min;
                }
                this.d += min;
                i3 -= min;
            } else if (i3 == i2) {
                return -1;
            }
        }
        return i2 - i3;
    }

    @Override // java.io.InputStream
    public final int read() {
        b();
        if (this.b == null) {
            return -1;
        }
        dhg dhg = this.b;
        int i = this.d;
        this.d = i + 1;
        return dhg.a(i) & 255;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.g.a() - (this.e + this.d);
    }

    public final boolean markSupported() {
        return true;
    }

    public final void mark(int i) {
        this.f = this.e + this.d;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        a();
        a(null, 0, this.f);
    }

    private final void a() {
        this.a = new dkf(this.g);
        this.b = (dhg) this.a.next();
        this.c = this.b.a();
        this.d = 0;
        this.e = 0;
    }

    private final void b() {
        if (this.b != null && this.d == this.c) {
            this.e += this.c;
            this.d = 0;
            if (this.a.hasNext()) {
                this.b = (dhg) this.a.next();
                this.c = this.b.a();
                return;
            }
            this.b = null;
            this.c = 0;
        }
    }
}
