package defpackage;

/* renamed from: dhs reason: default package */
/* compiled from: PG */
final class dhs extends defpackage.dhn {
    private final java.nio.ByteBuffer c;
    private final java.nio.ByteBuffer d;

    dhs(java.nio.ByteBuffer byteBuffer) {
        this.c = byteBuffer;
        this.d = byteBuffer.duplicate().order(java.nio.ByteOrder.LITTLE_ENDIAN);
        byteBuffer.position();
    }

    public final void a(int i, int i2) {
        c((i << 3) | i2);
    }

    public final void b(int i, int i2) {
        a(i, 0);
        b(i2);
    }

    public final void c(int i, int i2) {
        a(i, 0);
        c(i2);
    }

    public final void e(int i, int i2) {
        a(i, 5);
        e(i2);
    }

    public final void a(int i, long j) {
        a(i, 0);
        a(j);
    }

    public final void c(int i, long j) {
        a(i, 1);
        c(j);
    }

    public final void a(int i, boolean z) {
        int i2 = 0;
        a(i, 0);
        if (z) {
            i2 = 1;
        }
        a((byte) i2);
    }

    public final void a(int i, java.lang.String str) {
        a(i, 2);
        a(str);
    }

    public final void a(int i, defpackage.dha dha) {
        a(i, 2);
        a(dha);
    }

    public final void a(int i, defpackage.djo djo) {
        a(i, 2);
        a(djo);
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i, defpackage.djo djo, defpackage.dkh dkh) {
        a(i, 2);
        a(djo, dkh);
    }

    public final void b(int i, defpackage.djo djo) {
        a(1, 3);
        c(2, i);
        a(3, djo);
        a(1, 4);
    }

    public final void b(int i, defpackage.dha dha) {
        a(1, 3);
        c(2, i);
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
        try {
            this.d.put(b);
        } catch (java.nio.BufferOverflowException e) {
            throw new defpackage.dhr((java.lang.Throwable) e);
        }
    }

    public final void a(defpackage.dha dha) {
        c(dha.a());
        dha.a((defpackage.dgz) this);
    }

    public final void a(byte[] bArr, int i) {
        c(i);
        c(bArr, 0, i);
    }

    public final void b(int i) {
        if (i >= 0) {
            c(i);
        } else {
            a((long) i);
        }
    }

    public final void c(int i) {
        while ((i & -128) != 0) {
            this.d.put((byte) ((i & 127) | 128));
            i >>>= 7;
        }
        try {
            this.d.put((byte) i);
        } catch (java.nio.BufferOverflowException e) {
            throw new defpackage.dhr((java.lang.Throwable) e);
        }
    }

    public final void e(int i) {
        try {
            this.d.putInt(i);
        } catch (java.nio.BufferOverflowException e) {
            throw new defpackage.dhr((java.lang.Throwable) e);
        }
    }

    public final void a(long j) {
        while ((-128 & j) != 0) {
            this.d.put((byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
        try {
            this.d.put((byte) ((int) j));
        } catch (java.nio.BufferOverflowException e) {
            throw new defpackage.dhr((java.lang.Throwable) e);
        }
    }

    public final void c(long j) {
        try {
            this.d.putLong(j);
        } catch (java.nio.BufferOverflowException e) {
            throw new defpackage.dhr((java.lang.Throwable) e);
        }
    }

    public final void c(byte[] bArr, int i, int i2) {
        try {
            this.d.put(bArr, i, i2);
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new defpackage.dhr((java.lang.Throwable) e);
        } catch (java.nio.BufferOverflowException e2) {
            throw new defpackage.dhr((java.lang.Throwable) e2);
        }
    }

    public final void a(byte[] bArr, int i, int i2) {
        c(bArr, i, i2);
    }

    public final void a(java.lang.String str) {
        int position = this.d.position();
        try {
            int o = o(str.length() * 3);
            int o2 = o(str.length());
            if (o2 == o) {
                int position2 = this.d.position() + o2;
                this.d.position(position2);
                c(str);
                int position3 = this.d.position();
                this.d.position(position);
                c(position3 - position2);
                this.d.position(position3);
                return;
            }
            c(defpackage.dli.a((java.lang.CharSequence) str));
            c(str);
        } catch (defpackage.dll e) {
            this.d.position(position);
            a(str, e);
        } catch (java.lang.IllegalArgumentException e2) {
            throw new defpackage.dhr((java.lang.Throwable) e2);
        }
    }

    public final void h() {
        this.c.position(this.d.position());
    }

    public final int i() {
        return this.d.remaining();
    }

    private final void c(java.lang.String str) {
        try {
            defpackage.dli.a((java.lang.CharSequence) str, this.d);
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new defpackage.dhr((java.lang.Throwable) e);
        }
    }
}
