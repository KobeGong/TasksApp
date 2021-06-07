package defpackage;

import java.io.OutputStream;

/* access modifiers changed from: package-private */
/* renamed from: dho  reason: default package */
/* compiled from: PG */
public final class dho extends dhn {
    private final byte[] c;
    private final int d;
    private int e;
    private int f;
    private final OutputStream g;

    private dho(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        this.c = new byte[Math.max(i, 20)];
        this.d = this.c.length;
    }

    @Override // defpackage.dhn
    public final int i() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    private final void b(byte b) {
        byte[] bArr = this.c;
        int i = this.e;
        this.e = i + 1;
        bArr[i] = b;
        this.f++;
    }

    private final void j(int i, int i2) {
        s((i << 3) | i2);
    }

    private final void s(int i) {
        if (dhn.a) {
            long j = (long) this.e;
            while ((i & -128) != 0) {
                byte[] bArr = this.c;
                int i2 = this.e;
                this.e = i2 + 1;
                dlc.a(bArr, (long) i2, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            byte[] bArr2 = this.c;
            int i3 = this.e;
            this.e = i3 + 1;
            dlc.a(bArr2, (long) i3, (byte) i);
            this.f = ((int) (((long) this.e) - j)) + this.f;
            return;
        }
        while ((i & -128) != 0) {
            byte[] bArr3 = this.c;
            int i4 = this.e;
            this.e = i4 + 1;
            bArr3[i4] = (byte) ((i & 127) | 128);
            this.f++;
            i >>>= 7;
        }
        byte[] bArr4 = this.c;
        int i5 = this.e;
        this.e = i5 + 1;
        bArr4[i5] = (byte) i;
        this.f++;
    }

    private final void g(long j) {
        if (dhn.a) {
            long j2 = (long) this.e;
            while ((j & -128) != 0) {
                byte[] bArr = this.c;
                int i = this.e;
                this.e = i + 1;
                dlc.a(bArr, (long) i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.c;
            int i2 = this.e;
            this.e = i2 + 1;
            dlc.a(bArr2, (long) i2, (byte) ((int) j));
            this.f = ((int) (((long) this.e) - j2)) + this.f;
            return;
        }
        while ((j & -128) != 0) {
            byte[] bArr3 = this.c;
            int i3 = this.e;
            this.e = i3 + 1;
            bArr3[i3] = (byte) ((((int) j) & 127) | 128);
            this.f++;
            j >>>= 7;
        }
        byte[] bArr4 = this.c;
        int i4 = this.e;
        this.e = i4 + 1;
        bArr4[i4] = (byte) ((int) j);
        this.f++;
    }

    private final void t(int i) {
        byte[] bArr = this.c;
        int i2 = this.e;
        this.e = i2 + 1;
        bArr[i2] = (byte) i;
        byte[] bArr2 = this.c;
        int i3 = this.e;
        this.e = i3 + 1;
        bArr2[i3] = (byte) (i >> 8);
        byte[] bArr3 = this.c;
        int i4 = this.e;
        this.e = i4 + 1;
        bArr3[i4] = (byte) (i >> 16);
        byte[] bArr4 = this.c;
        int i5 = this.e;
        this.e = i5 + 1;
        bArr4[i5] = i >> 24;
        this.f += 4;
    }

    private final void h(long j) {
        byte[] bArr = this.c;
        int i = this.e;
        this.e = i + 1;
        bArr[i] = (byte) ((int) (j & 255));
        byte[] bArr2 = this.c;
        int i2 = this.e;
        this.e = i2 + 1;
        bArr2[i2] = (byte) ((int) ((j >> 8) & 255));
        byte[] bArr3 = this.c;
        int i3 = this.e;
        this.e = i3 + 1;
        bArr3[i3] = (byte) ((int) ((j >> 16) & 255));
        byte[] bArr4 = this.c;
        int i4 = this.e;
        this.e = i4 + 1;
        bArr4[i4] = (byte) ((int) ((j >> 24) & 255));
        byte[] bArr5 = this.c;
        int i5 = this.e;
        this.e = i5 + 1;
        bArr5[i5] = (byte) ((int) (j >> 32));
        byte[] bArr6 = this.c;
        int i6 = this.e;
        this.e = i6 + 1;
        bArr6[i6] = (byte) ((int) (j >> 40));
        byte[] bArr7 = this.c;
        int i7 = this.e;
        this.e = i7 + 1;
        bArr7[i7] = (byte) ((int) (j >> 48));
        byte[] bArr8 = this.c;
        int i8 = this.e;
        this.e = i8 + 1;
        bArr8[i8] = (byte) ((int) (j >> 56));
        this.f += 8;
    }

    dho(OutputStream outputStream, int i) {
        this(i);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.g = outputStream;
    }

    @Override // defpackage.dhn
    public final void a(int i, int i2) {
        c((i << 3) | i2);
    }

    @Override // defpackage.dhn
    public final void b(int i, int i2) {
        u(20);
        j(i, 0);
        if (i2 >= 0) {
            s(i2);
        } else {
            g((long) i2);
        }
    }

    @Override // defpackage.dhn
    public final void c(int i, int i2) {
        u(20);
        j(i, 0);
        s(i2);
    }

    @Override // defpackage.dhn
    public final void e(int i, int i2) {
        u(14);
        j(i, 5);
        t(i2);
    }

    @Override // defpackage.dhn
    public final void a(int i, long j) {
        u(20);
        j(i, 0);
        g(j);
    }

    @Override // defpackage.dhn
    public final void c(int i, long j) {
        u(18);
        j(i, 1);
        h(j);
    }

    @Override // defpackage.dhn
    public final void a(int i, boolean z) {
        int i2 = 0;
        u(11);
        j(i, 0);
        if (z) {
            i2 = 1;
        }
        b((byte) i2);
    }

    @Override // defpackage.dhn
    public final void a(int i, String str) {
        a(i, 2);
        a(str);
    }

    @Override // defpackage.dhn
    public final void a(int i, dha dha) {
        a(i, 2);
        a(dha);
    }

    @Override // defpackage.dhn
    public final void a(dha dha) {
        c(dha.a());
        dha.a(this);
    }

    @Override // defpackage.dhn
    public final void a(byte[] bArr, int i) {
        c(i);
        c(bArr, 0, i);
    }

    @Override // defpackage.dhn
    public final void a(int i, djo djo) {
        a(i, 2);
        a(djo);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.dhn
    public final void a(int i, djo djo, dkh dkh) {
        a(i, 2);
        a(djo, dkh);
    }

    @Override // defpackage.dhn
    public final void b(int i, djo djo) {
        a(1, 3);
        c(2, i);
        a(3, djo);
        a(1, 4);
    }

    @Override // defpackage.dhn
    public final void b(int i, dha dha) {
        a(1, 3);
        c(2, i);
        a(3, dha);
        a(1, 4);
    }

    @Override // defpackage.dhn
    public final void a(djo djo) {
        c(djo.f());
        djo.a(this);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.dhn
    public final void a(djo djo, dkh dkh) {
        dgo dgo = (dgo) djo;
        int c2 = dgo.c();
        if (c2 == -1) {
            c2 = dkh.b(dgo);
            dgo.b(c2);
        }
        c(c2);
        dkh.a((Object) djo, this.b);
    }

    @Override // defpackage.dhn
    public final void a(byte b) {
        if (this.e == this.d) {
            k();
        }
        b(b);
    }

    @Override // defpackage.dhn
    public final void b(int i) {
        if (i >= 0) {
            c(i);
        } else {
            a((long) i);
        }
    }

    @Override // defpackage.dhn
    public final void c(int i) {
        u(10);
        s(i);
    }

    @Override // defpackage.dhn
    public final void e(int i) {
        u(4);
        t(i);
    }

    @Override // defpackage.dhn
    public final void a(long j) {
        u(10);
        g(j);
    }

    @Override // defpackage.dhn
    public final void c(long j) {
        u(8);
        h(j);
    }

    @Override // defpackage.dhn
    public final void a(String str) {
        int a;
        try {
            int length = str.length() * 3;
            int o = o(length);
            if (o + length > this.d) {
                byte[] bArr = new byte[length];
                int a2 = dli.a(str, bArr, 0, length);
                c(a2);
                a(bArr, 0, a2);
                return;
            }
            if (length + o > this.d - this.e) {
                k();
            }
            int o2 = o(str.length());
            int i = this.e;
            if (o2 == o) {
                try {
                    this.e = i + o2;
                    int a3 = dli.a(str, this.c, this.e, this.d - this.e);
                    this.e = i;
                    a = (a3 - i) - o2;
                    s(a);
                    this.e = a3;
                } catch (dll e2) {
                    this.f -= this.e - i;
                    this.e = i;
                    throw e2;
                } catch (ArrayIndexOutOfBoundsException e3) {
                    throw new dhr(e3);
                }
            } else {
                a = dli.a(str);
                s(a);
                this.e = dli.a(str, this.c, this.e, a);
            }
            this.f = a + this.f;
        } catch (dll e4) {
            a(str, e4);
        }
    }

    @Override // defpackage.dhn
    public final void h() {
        if (this.e > 0) {
            k();
        }
    }

    @Override // defpackage.dhn
    public final void c(byte[] bArr, int i, int i2) {
        if (this.d - this.e >= i2) {
            System.arraycopy(bArr, i, this.c, this.e, i2);
            this.e += i2;
        } else {
            int i3 = this.d - this.e;
            System.arraycopy(bArr, i, this.c, this.e, i3);
            int i4 = i + i3;
            i2 -= i3;
            this.e = this.d;
            this.f = i3 + this.f;
            k();
            if (i2 <= this.d) {
                System.arraycopy(bArr, i4, this.c, 0, i2);
                this.e = i2;
            } else {
                this.g.write(bArr, i4, i2);
            }
        }
        this.f += i2;
    }

    @Override // defpackage.dgz
    public final void a(byte[] bArr, int i, int i2) {
        c(bArr, i, i2);
    }

    private final void u(int i) {
        if (this.d - this.e < i) {
            k();
        }
    }

    private final void k() {
        this.g.write(this.c, 0, this.e);
        this.e = 0;
    }
}
