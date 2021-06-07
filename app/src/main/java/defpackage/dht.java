package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* access modifiers changed from: package-private */
/* renamed from: dht  reason: default package */
/* compiled from: PG */
public final class dht extends dhn {
    private final ByteBuffer c;
    private final ByteBuffer d;
    private final long e;
    private final long f;
    private final long g;
    private final long h = (this.g - 10);
    private long i = this.f;

    dht(ByteBuffer byteBuffer) {
        this.c = byteBuffer;
        this.d = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        this.e = dlc.a(byteBuffer);
        this.f = this.e + ((long) byteBuffer.position());
        this.g = this.e + ((long) byteBuffer.limit());
    }

    @Override // defpackage.dhn
    public final void a(int i2, int i3) {
        c((i2 << 3) | i3);
    }

    @Override // defpackage.dhn
    public final void b(int i2, int i3) {
        a(i2, 0);
        b(i3);
    }

    @Override // defpackage.dhn
    public final void c(int i2, int i3) {
        a(i2, 0);
        c(i3);
    }

    @Override // defpackage.dhn
    public final void e(int i2, int i3) {
        a(i2, 5);
        e(i3);
    }

    @Override // defpackage.dhn
    public final void a(int i2, long j) {
        a(i2, 0);
        a(j);
    }

    @Override // defpackage.dhn
    public final void c(int i2, long j) {
        a(i2, 1);
        c(j);
    }

    @Override // defpackage.dhn
    public final void a(int i2, boolean z) {
        int i3 = 0;
        a(i2, 0);
        if (z) {
            i3 = 1;
        }
        a((byte) i3);
    }

    @Override // defpackage.dhn
    public final void a(int i2, String str) {
        a(i2, 2);
        a(str);
    }

    @Override // defpackage.dhn
    public final void a(int i2, dha dha) {
        a(i2, 2);
        a(dha);
    }

    @Override // defpackage.dhn
    public final void a(int i2, djo djo) {
        a(i2, 2);
        a(djo);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.dhn
    public final void a(int i2, djo djo, dkh dkh) {
        a(i2, 2);
        a(djo, dkh);
    }

    @Override // defpackage.dhn
    public final void b(int i2, djo djo) {
        a(1, 3);
        c(2, i2);
        a(3, djo);
        a(1, 4);
    }

    @Override // defpackage.dhn
    public final void b(int i2, dha dha) {
        a(1, 3);
        c(2, i2);
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
        if (this.i >= this.g) {
            throw new dhr(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.i), Long.valueOf(this.g), 1));
        }
        long j = this.i;
        this.i = 1 + j;
        dlc.a(j, b);
    }

    @Override // defpackage.dhn
    public final void a(dha dha) {
        c(dha.a());
        dha.a(this);
    }

    @Override // defpackage.dhn
    public final void a(byte[] bArr, int i2) {
        c(i2);
        c(bArr, 0, i2);
    }

    @Override // defpackage.dhn
    public final void b(int i2) {
        if (i2 >= 0) {
            c(i2);
        } else {
            a((long) i2);
        }
    }

    @Override // defpackage.dhn
    public final void c(int i2) {
        if (this.i <= this.h) {
            while ((i2 & -128) != 0) {
                long j = this.i;
                this.i = j + 1;
                dlc.a(j, (byte) ((i2 & 127) | 128));
                i2 >>>= 7;
            }
            long j2 = this.i;
            this.i = j2 + 1;
            dlc.a(j2, (byte) i2);
            return;
        }
        while (this.i < this.g) {
            if ((i2 & -128) == 0) {
                long j3 = this.i;
                this.i = j3 + 1;
                dlc.a(j3, (byte) i2);
                return;
            }
            long j4 = this.i;
            this.i = j4 + 1;
            dlc.a(j4, (byte) ((i2 & 127) | 128));
            i2 >>>= 7;
        }
        throw new dhr(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.i), Long.valueOf(this.g), 1));
    }

    @Override // defpackage.dhn
    public final void e(int i2) {
        this.d.putInt((int) (this.i - this.e), i2);
        this.i += 4;
    }

    @Override // defpackage.dhn
    public final void a(long j) {
        if (this.i <= this.h) {
            while ((j & -128) != 0) {
                long j2 = this.i;
                this.i = j2 + 1;
                dlc.a(j2, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            long j3 = this.i;
            this.i = j3 + 1;
            dlc.a(j3, (byte) ((int) j));
            return;
        }
        while (this.i < this.g) {
            if ((j & -128) == 0) {
                long j4 = this.i;
                this.i = j4 + 1;
                dlc.a(j4, (byte) ((int) j));
                return;
            }
            long j5 = this.i;
            this.i = j5 + 1;
            dlc.a(j5, (byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
        throw new dhr(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.i), Long.valueOf(this.g), 1));
    }

    @Override // defpackage.dhn
    public final void c(long j) {
        this.d.putLong((int) (this.i - this.e), j);
        this.i += 8;
    }

    @Override // defpackage.dhn
    public final void c(byte[] bArr, int i2, int i3) {
        if (bArr != null && i2 >= 0 && i3 >= 0 && bArr.length - i3 >= i2 && this.g - ((long) i3) >= this.i) {
            dlc.a.a(bArr, (long) i2, this.i, (long) i3);
            this.i += (long) i3;
        } else if (bArr == null) {
            throw new NullPointerException("value");
        } else {
            throw new dhr(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.i), Long.valueOf(this.g), Integer.valueOf(i3)));
        }
    }

    @Override // defpackage.dgz
    public final void a(byte[] bArr, int i2, int i3) {
        c(bArr, i2, i3);
    }

    @Override // defpackage.dhn
    public final void a(String str) {
        long j = this.i;
        try {
            int o = o(str.length() * 3);
            int o2 = o(str.length());
            if (o2 == o) {
                int i2 = ((int) (this.i - this.e)) + o2;
                this.d.position(i2);
                dli.a(str, this.d);
                int position = this.d.position() - i2;
                c(position);
                this.i = ((long) position) + this.i;
                return;
            }
            int a = dli.a(str);
            c(a);
            g(this.i);
            dli.a(str, this.d);
            this.i = ((long) a) + this.i;
        } catch (dll e2) {
            this.i = j;
            g(this.i);
            a(str, e2);
        } catch (IllegalArgumentException e3) {
            throw new dhr(e3);
        } catch (IndexOutOfBoundsException e4) {
            throw new dhr(e4);
        }
    }

    @Override // defpackage.dhn
    public final void h() {
        this.c.position((int) (this.i - this.e));
    }

    @Override // defpackage.dhn
    public final int i() {
        return (int) (this.g - this.i);
    }

    private final void g(long j) {
        this.d.position((int) (j - this.e));
    }
}
