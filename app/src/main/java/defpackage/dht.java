package defpackage;

/* renamed from: dht reason: default package */
/* compiled from: PG */
final class dht extends defpackage.dhn {
    private final java.nio.ByteBuffer c;
    private final java.nio.ByteBuffer d;
    private final long e;
    private final long f;
    private final long g;
    private final long h = (this.g - 10);
    private long i = this.f;

    dht(java.nio.ByteBuffer byteBuffer) {
        this.c = byteBuffer;
        this.d = byteBuffer.duplicate().order(java.nio.ByteOrder.LITTLE_ENDIAN);
        this.e = defpackage.dlc.a(byteBuffer);
        this.f = this.e + ((long) byteBuffer.position());
        this.g = this.e + ((long) byteBuffer.limit());
    }

    public final void a(int i2, int i3) {
        c((i2 << 3) | i3);
    }

    public final void b(int i2, int i3) {
        a(i2, 0);
        b(i3);
    }

    public final void c(int i2, int i3) {
        a(i2, 0);
        c(i3);
    }

    public final void e(int i2, int i3) {
        a(i2, 5);
        e(i3);
    }

    public final void a(int i2, long j) {
        a(i2, 0);
        a(j);
    }

    public final void c(int i2, long j) {
        a(i2, 1);
        c(j);
    }

    public final void a(int i2, boolean z) {
        int i3 = 0;
        a(i2, 0);
        if (z) {
            i3 = 1;
        }
        a((byte) i3);
    }

    public final void a(int i2, java.lang.String str) {
        a(i2, 2);
        a(str);
    }

    public final void a(int i2, defpackage.dha dha) {
        a(i2, 2);
        a(dha);
    }

    public final void a(int i2, defpackage.djo djo) {
        a(i2, 2);
        a(djo);
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, defpackage.djo djo, defpackage.dkh dkh) {
        a(i2, 2);
        a(djo, dkh);
    }

    public final void b(int i2, defpackage.djo djo) {
        a(1, 3);
        c(2, i2);
        a(3, djo);
        a(1, 4);
    }

    public final void b(int i2, defpackage.dha dha) {
        a(1, 3);
        c(2, i2);
        a(3, dha);
        a(1, 4);
    }

    public final void a(defpackage.djo djo) {
        c(djo.f());
        djo.a((defpackage.dhn) this);
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.djo djo, defpackage.dkh dkh) {
        defpackage.dgo dgo = (defpackage.dgo) djo;
        int c2 = dgo.c();
        if (c2 == -1) {
            c2 = dkh.b(dgo);
            dgo.b(c2);
        }
        c(c2);
        dkh.a((java.lang.Object) djo, this.b);
    }

    public final void a(byte b) {
        if (this.i >= this.g) {
            throw new defpackage.dhr(java.lang.String.format("Pos: %d, limit: %d, len: %d", new java.lang.Object[]{java.lang.Long.valueOf(this.i), java.lang.Long.valueOf(this.g), java.lang.Integer.valueOf(1)}));
        }
        long j = this.i;
        this.i = 1 + j;
        defpackage.dlc.a(j, b);
    }

    public final void a(defpackage.dha dha) {
        c(dha.a());
        dha.a((defpackage.dgz) this);
    }

    public final void a(byte[] bArr, int i2) {
        c(i2);
        c(bArr, 0, i2);
    }

    public final void b(int i2) {
        if (i2 >= 0) {
            c(i2);
        } else {
            a((long) i2);
        }
    }

    public final void c(int i2) {
        if (this.i <= this.h) {
            while ((i2 & -128) != 0) {
                long j = this.i;
                this.i = j + 1;
                defpackage.dlc.a(j, (byte) ((i2 & 127) | 128));
                i2 >>>= 7;
            }
            long j2 = this.i;
            this.i = j2 + 1;
            defpackage.dlc.a(j2, (byte) i2);
            return;
        }
        while (this.i < this.g) {
            if ((i2 & -128) == 0) {
                long j3 = this.i;
                this.i = j3 + 1;
                defpackage.dlc.a(j3, (byte) i2);
                return;
            }
            long j4 = this.i;
            this.i = j4 + 1;
            defpackage.dlc.a(j4, (byte) ((i2 & 127) | 128));
            i2 >>>= 7;
        }
        throw new defpackage.dhr(java.lang.String.format("Pos: %d, limit: %d, len: %d", new java.lang.Object[]{java.lang.Long.valueOf(this.i), java.lang.Long.valueOf(this.g), java.lang.Integer.valueOf(1)}));
    }

    public final void e(int i2) {
        this.d.putInt((int) (this.i - this.e), i2);
        this.i += 4;
    }

    public final void a(long j) {
        if (this.i <= this.h) {
            while ((j & -128) != 0) {
                long j2 = this.i;
                this.i = j2 + 1;
                defpackage.dlc.a(j2, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            long j3 = this.i;
            this.i = j3 + 1;
            defpackage.dlc.a(j3, (byte) ((int) j));
            return;
        }
        while (this.i < this.g) {
            if ((j & -128) == 0) {
                long j4 = this.i;
                this.i = j4 + 1;
                defpackage.dlc.a(j4, (byte) ((int) j));
                return;
            }
            long j5 = this.i;
            this.i = j5 + 1;
            defpackage.dlc.a(j5, (byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
        throw new defpackage.dhr(java.lang.String.format("Pos: %d, limit: %d, len: %d", new java.lang.Object[]{java.lang.Long.valueOf(this.i), java.lang.Long.valueOf(this.g), java.lang.Integer.valueOf(1)}));
    }

    public final void c(long j) {
        this.d.putLong((int) (this.i - this.e), j);
        this.i += 8;
    }

    public final void c(byte[] bArr, int i2, int i3) {
        if (bArr != null && i2 >= 0 && i3 >= 0 && bArr.length - i3 >= i2 && this.g - ((long) i3) >= this.i) {
            defpackage.dlc.a.a(bArr, (long) i2, this.i, (long) i3);
            this.i += (long) i3;
        } else if (bArr == null) {
            throw new java.lang.NullPointerException("value");
        } else {
            throw new defpackage.dhr(java.lang.String.format("Pos: %d, limit: %d, len: %d", new java.lang.Object[]{java.lang.Long.valueOf(this.i), java.lang.Long.valueOf(this.g), java.lang.Integer.valueOf(i3)}));
        }
    }

    public final void a(byte[] bArr, int i2, int i3) {
        c(bArr, i2, i3);
    }

    public final void a(java.lang.String str) {
        long j = this.i;
        try {
            int o = o(str.length() * 3);
            int o2 = o(str.length());
            if (o2 == o) {
                int i2 = ((int) (this.i - this.e)) + o2;
                this.d.position(i2);
                defpackage.dli.a((java.lang.CharSequence) str, this.d);
                int position = this.d.position() - i2;
                c(position);
                this.i = ((long) position) + this.i;
                return;
            }
            int a = defpackage.dli.a((java.lang.CharSequence) str);
            c(a);
            g(this.i);
            defpackage.dli.a((java.lang.CharSequence) str, this.d);
            this.i = ((long) a) + this.i;
        } catch (defpackage.dll e2) {
            this.i = j;
            g(this.i);
            a(str, e2);
        } catch (java.lang.IllegalArgumentException e3) {
            throw new defpackage.dhr((java.lang.Throwable) e3);
        } catch (java.lang.IndexOutOfBoundsException e4) {
            throw new defpackage.dhr((java.lang.Throwable) e4);
        }
    }

    public final void h() {
        this.c.position((int) (this.i - this.e));
    }

    public final int i() {
        return (int) (this.g - this.i);
    }

    private final void g(long j) {
        this.d.position((int) (j - this.e));
    }
}
