package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: dhp  reason: default package */
/* compiled from: PG */
public class dhp extends dhn {
    public final int c;
    public int d;
    private final byte[] e;
    private final int f;

    dhp(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        } else if ((i | i2 | (bArr.length - (i + i2))) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        } else {
            this.e = bArr;
            this.c = i;
            this.d = i;
            this.f = i + i2;
        }
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
            byte[] bArr = this.e;
            int i = this.d;
            this.d = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e2) {
            throw new dhr(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.f), 1), e2);
        }
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
        if (!dhn.a || i() < 10) {
            while ((i & -128) != 0) {
                try {
                    byte[] bArr = this.e;
                    int i2 = this.d;
                    this.d = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new dhr(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.f), 1), e2);
                }
            }
            byte[] bArr2 = this.e;
            int i3 = this.d;
            this.d = i3 + 1;
            bArr2[i3] = (byte) i;
            return;
        }
        while ((i & -128) != 0) {
            byte[] bArr3 = this.e;
            int i4 = this.d;
            this.d = i4 + 1;
            dlc.a(bArr3, (long) i4, (byte) ((i & 127) | 128));
            i >>>= 7;
        }
        byte[] bArr4 = this.e;
        int i5 = this.d;
        this.d = i5 + 1;
        dlc.a(bArr4, (long) i5, (byte) i);
    }

    @Override // defpackage.dhn
    public final void e(int i) {
        try {
            byte[] bArr = this.e;
            int i2 = this.d;
            this.d = i2 + 1;
            bArr[i2] = (byte) i;
            byte[] bArr2 = this.e;
            int i3 = this.d;
            this.d = i3 + 1;
            bArr2[i3] = (byte) (i >> 8);
            byte[] bArr3 = this.e;
            int i4 = this.d;
            this.d = i4 + 1;
            bArr3[i4] = (byte) (i >> 16);
            byte[] bArr4 = this.e;
            int i5 = this.d;
            this.d = i5 + 1;
            bArr4[i5] = i >> 24;
        } catch (IndexOutOfBoundsException e2) {
            throw new dhr(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.f), 1), e2);
        }
    }

    @Override // defpackage.dhn
    public final void a(long j) {
        if (!dhn.a || i() < 10) {
            while ((j & -128) != 0) {
                try {
                    byte[] bArr = this.e;
                    int i = this.d;
                    this.d = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new dhr(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.f), 1), e2);
                }
            }
            byte[] bArr2 = this.e;
            int i2 = this.d;
            this.d = i2 + 1;
            bArr2[i2] = (byte) ((int) j);
            return;
        }
        while ((j & -128) != 0) {
            byte[] bArr3 = this.e;
            int i3 = this.d;
            this.d = i3 + 1;
            dlc.a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
        byte[] bArr4 = this.e;
        int i4 = this.d;
        this.d = i4 + 1;
        dlc.a(bArr4, (long) i4, (byte) ((int) j));
    }

    @Override // defpackage.dhn
    public final void c(long j) {
        try {
            byte[] bArr = this.e;
            int i = this.d;
            this.d = i + 1;
            bArr[i] = (byte) ((int) j);
            byte[] bArr2 = this.e;
            int i2 = this.d;
            this.d = i2 + 1;
            bArr2[i2] = (byte) ((int) (j >> 8));
            byte[] bArr3 = this.e;
            int i3 = this.d;
            this.d = i3 + 1;
            bArr3[i3] = (byte) ((int) (j >> 16));
            byte[] bArr4 = this.e;
            int i4 = this.d;
            this.d = i4 + 1;
            bArr4[i4] = (byte) ((int) (j >> 24));
            byte[] bArr5 = this.e;
            int i5 = this.d;
            this.d = i5 + 1;
            bArr5[i5] = (byte) ((int) (j >> 32));
            byte[] bArr6 = this.e;
            int i6 = this.d;
            this.d = i6 + 1;
            bArr6[i6] = (byte) ((int) (j >> 40));
            byte[] bArr7 = this.e;
            int i7 = this.d;
            this.d = i7 + 1;
            bArr7[i7] = (byte) ((int) (j >> 48));
            byte[] bArr8 = this.e;
            int i8 = this.d;
            this.d = i8 + 1;
            bArr8[i8] = (byte) ((int) (j >> 56));
        } catch (IndexOutOfBoundsException e2) {
            throw new dhr(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.f), 1), e2);
        }
    }

    @Override // defpackage.dhn
    public final void c(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.e, this.d, i2);
            this.d += i2;
        } catch (IndexOutOfBoundsException e2) {
            throw new dhr(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.f), Integer.valueOf(i2)), e2);
        }
    }

    @Override // defpackage.dgz
    public final void a(byte[] bArr, int i, int i2) {
        c(bArr, i, i2);
    }

    @Override // defpackage.dhn
    public final void a(String str) {
        int i = this.d;
        try {
            int o = o(str.length() * 3);
            int o2 = o(str.length());
            if (o2 == o) {
                this.d = i + o2;
                int a = dli.a(str, this.e, this.d, i());
                this.d = i;
                c((a - i) - o2);
                this.d = a;
                return;
            }
            c(dli.a(str));
            this.d = dli.a(str, this.e, this.d, i());
        } catch (dll e2) {
            this.d = i;
            a(str, e2);
        } catch (IndexOutOfBoundsException e3) {
            throw new dhr(e3);
        }
    }

    @Override // defpackage.dhn
    public void h() {
    }

    @Override // defpackage.dhn
    public final int i() {
        return this.f - this.d;
    }
}
