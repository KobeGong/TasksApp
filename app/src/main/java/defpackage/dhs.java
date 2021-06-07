package defpackage;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* access modifiers changed from: package-private */
/* renamed from: dhs  reason: default package */
/* compiled from: PG */
public final class dhs extends dhn {
    private final ByteBuffer c;
    private final ByteBuffer d;

    dhs(ByteBuffer byteBuffer) {
        this.c = byteBuffer;
        this.d = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.position();
    }

    @Override // defpackage.dhn
    public final void a(int i, int i2) {
        c((i << 3) | i2);
    }

    @Override // defpackage.dhn
    public final void b(int i, int i2) {
        a(i, 0);
        b(i2);
    }

    @Override // defpackage.dhn
    public final void c(int i, int i2) {
        a(i, 0);
        c(i2);
    }

    @Override // defpackage.dhn
    public final void e(int i, int i2) {
        a(i, 5);
        e(i2);
    }

    @Override // defpackage.dhn
    public final void a(int i, long j) {
        a(i, 0);
        a(j);
    }

    @Override // defpackage.dhn
    public final void c(int i, long j) {
        a(i, 1);
        c(j);
    }

    @Override // defpackage.dhn
    public final void a(int i, boolean z) {
        int i2 = 0;
        a(i, 0);
        if (z) {
            i2 = 1;
        }
        a((byte) i2);
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
        try {
            this.d.put(b);
        } catch (BufferOverflowException e) {
            throw new dhr(e);
        }
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
    public final void b(int i) {
        if (i >= 0) {
            c(i);
        } else {
            a((long) i);
        }
    }

    @Override // defpackage.dhn
    public final void c(int i) {
        while ((i & -128) != 0) {
            this.d.put((byte) ((i & 127) | 128));
            i >>>= 7;
        }
        try {
            this.d.put((byte) i);
        } catch (BufferOverflowException e) {
            throw new dhr(e);
        }
    }

    @Override // defpackage.dhn
    public final void e(int i) {
        try {
            this.d.putInt(i);
        } catch (BufferOverflowException e) {
            throw new dhr(e);
        }
    }

    @Override // defpackage.dhn
    public final void a(long j) {
        while ((-128 & j) != 0) {
            this.d.put((byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
        try {
            this.d.put((byte) ((int) j));
        } catch (BufferOverflowException e) {
            throw new dhr(e);
        }
    }

    @Override // defpackage.dhn
    public final void c(long j) {
        try {
            this.d.putLong(j);
        } catch (BufferOverflowException e) {
            throw new dhr(e);
        }
    }

    @Override // defpackage.dhn
    public final void c(byte[] bArr, int i, int i2) {
        try {
            this.d.put(bArr, i, i2);
        } catch (IndexOutOfBoundsException e) {
            throw new dhr(e);
        } catch (BufferOverflowException e2) {
            throw new dhr(e2);
        }
    }

    @Override // defpackage.dgz
    public final void a(byte[] bArr, int i, int i2) {
        c(bArr, i, i2);
    }

    @Override // defpackage.dhn
    public final void a(String str) {
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
            c(dli.a(str));
            c(str);
        } catch (dll e) {
            this.d.position(position);
            a(str, e);
        } catch (IllegalArgumentException e2) {
            throw new dhr(e2);
        }
    }

    @Override // defpackage.dhn
    public final void h() {
        this.c.position(this.d.position());
    }

    @Override // defpackage.dhn
    public final int i() {
        return this.d.remaining();
    }

    private final void c(String str) {
        try {
            dli.a(str, this.d);
        } catch (IndexOutOfBoundsException e) {
            throw new dhr(e);
        }
    }
}
