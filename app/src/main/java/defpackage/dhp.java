package defpackage;

/* renamed from: dhp reason: default package */
/* compiled from: PG */
class dhp extends defpackage.dhn {
    public final int c;
    public int d;
    private final byte[] e;
    private final int f;

    dhp(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new java.lang.NullPointerException("buffer");
        } else if ((i | i2 | (bArr.length - (i + i2))) < 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new java.lang.Object[]{java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)}));
        } else {
            this.e = bArr;
            this.c = i;
            this.d = i;
            this.f = i + i2;
        }
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

    public final void a(defpackage.dha dha) {
        c(dha.a());
        dha.a((defpackage.dgz) this);
    }

    public final void a(byte[] bArr, int i) {
        c(i);
        c(bArr, 0, i);
    }

    public final void a(int i, defpackage.djo djo) {
        a(i, 2);
        a(djo);
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i, defpackage.djo djo, defpackage.dkh dkh) {
        a(i, 2);
        defpackage.dgo dgo = (defpackage.dgo) djo;
        int c2 = dgo.c();
        if (c2 == -1) {
            c2 = dkh.b(dgo);
            dgo.b(c2);
        }
        c(c2);
        dkh.a((java.lang.Object) djo, this.b);
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
            byte[] bArr = this.e;
            int i = this.d;
            this.d = i + 1;
            bArr[i] = b;
        } catch (java.lang.IndexOutOfBoundsException e2) {
            throw new defpackage.dhr(java.lang.String.format("Pos: %d, limit: %d, len: %d", new java.lang.Object[]{java.lang.Integer.valueOf(this.d), java.lang.Integer.valueOf(this.f), java.lang.Integer.valueOf(1)}), e2);
        }
    }

    public final void b(int i) {
        if (i >= 0) {
            c(i);
        } else {
            a((long) i);
        }
    }

    public final void c(int i) {
        if (!defpackage.dhn.a || i() < 10) {
            while ((i & -128) != 0) {
                try {
                    byte[] bArr = this.e;
                    int i2 = this.d;
                    this.d = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (java.lang.IndexOutOfBoundsException e2) {
                    throw new defpackage.dhr(java.lang.String.format("Pos: %d, limit: %d, len: %d", new java.lang.Object[]{java.lang.Integer.valueOf(this.d), java.lang.Integer.valueOf(this.f), java.lang.Integer.valueOf(1)}), e2);
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
            defpackage.dlc.a(bArr3, (long) i4, (byte) ((i & 127) | 128));
            i >>>= 7;
        }
        byte[] bArr4 = this.e;
        int i5 = this.d;
        this.d = i5 + 1;
        defpackage.dlc.a(bArr4, (long) i5, (byte) i);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r2v11, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r0v4, types: [byte[]] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=null, for r2v11, types: [byte, int] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(int r8) {
        /*
            r7 = this;
            r6 = 1
            byte[] r0 = r7.e     // Catch:{ IndexOutOfBoundsException -> 0x0033 }
            int r1 = r7.d     // Catch:{ IndexOutOfBoundsException -> 0x0033 }
            int r2 = r1 + 1
            r7.d = r2     // Catch:{ IndexOutOfBoundsException -> 0x0033 }
            byte r2 = (byte) r8     // Catch:{ IndexOutOfBoundsException -> 0x0033 }
            r0[r1] = r2     // Catch:{ IndexOutOfBoundsException -> 0x0033 }
            byte[] r0 = r7.e     // Catch:{ IndexOutOfBoundsException -> 0x0033 }
            int r1 = r7.d     // Catch:{ IndexOutOfBoundsException -> 0x0033 }
            int r2 = r1 + 1
            r7.d = r2     // Catch:{ IndexOutOfBoundsException -> 0x0033 }
            int r2 = r8 >> 8
            byte r2 = (byte) r2     // Catch:{ IndexOutOfBoundsException -> 0x0033 }
            r0[r1] = r2     // Catch:{ IndexOutOfBoundsException -> 0x0033 }
            byte[] r0 = r7.e     // Catch:{ IndexOutOfBoundsException -> 0x0033 }
            int r1 = r7.d     // Catch:{ IndexOutOfBoundsException -> 0x0033 }
            int r2 = r1 + 1
            r7.d = r2     // Catch:{ IndexOutOfBoundsException -> 0x0033 }
            int r2 = r8 >> 16
            byte r2 = (byte) r2     // Catch:{ IndexOutOfBoundsException -> 0x0033 }
            r0[r1] = r2     // Catch:{ IndexOutOfBoundsException -> 0x0033 }
            byte[] r0 = r7.e     // Catch:{ IndexOutOfBoundsException -> 0x0033 }
            int r1 = r7.d     // Catch:{ IndexOutOfBoundsException -> 0x0033 }
            int r2 = r1 + 1
            r7.d = r2     // Catch:{ IndexOutOfBoundsException -> 0x0033 }
            int r2 = r8 >> 24
            r0[r1] = r2     // Catch:{ IndexOutOfBoundsException -> 0x0033 }
            return
        L_0x0033:
            r0 = move-exception
            dhr r1 = new dhr
            java.lang.String r2 = "Pos: %d, limit: %d, len: %d"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            int r5 = r7.d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r4] = r5
            int r4 = r7.f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r6] = r4
            r4 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r3[r4] = r5
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhp.e(int):void");
    }

    public final void a(long j) {
        if (!defpackage.dhn.a || i() < 10) {
            while ((j & -128) != 0) {
                try {
                    byte[] bArr = this.e;
                    int i = this.d;
                    this.d = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (java.lang.IndexOutOfBoundsException e2) {
                    throw new defpackage.dhr(java.lang.String.format("Pos: %d, limit: %d, len: %d", new java.lang.Object[]{java.lang.Integer.valueOf(this.d), java.lang.Integer.valueOf(this.f), java.lang.Integer.valueOf(1)}), e2);
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
            defpackage.dlc.a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
        byte[] bArr4 = this.e;
        int i4 = this.d;
        this.d = i4 + 1;
        defpackage.dlc.a(bArr4, (long) i4, (byte) ((int) j));
    }

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
        } catch (java.lang.IndexOutOfBoundsException e2) {
            throw new defpackage.dhr(java.lang.String.format("Pos: %d, limit: %d, len: %d", new java.lang.Object[]{java.lang.Integer.valueOf(this.d), java.lang.Integer.valueOf(this.f), java.lang.Integer.valueOf(1)}), e2);
        }
    }

    public final void c(byte[] bArr, int i, int i2) {
        try {
            java.lang.System.arraycopy(bArr, i, this.e, this.d, i2);
            this.d += i2;
        } catch (java.lang.IndexOutOfBoundsException e2) {
            throw new defpackage.dhr(java.lang.String.format("Pos: %d, limit: %d, len: %d", new java.lang.Object[]{java.lang.Integer.valueOf(this.d), java.lang.Integer.valueOf(this.f), java.lang.Integer.valueOf(i2)}), e2);
        }
    }

    public final void a(byte[] bArr, int i, int i2) {
        c(bArr, i, i2);
    }

    public final void a(java.lang.String str) {
        int i = this.d;
        try {
            int o = o(str.length() * 3);
            int o2 = o(str.length());
            if (o2 == o) {
                this.d = i + o2;
                int a = defpackage.dli.a(str, this.e, this.d, i());
                this.d = i;
                c((a - i) - o2);
                this.d = a;
                return;
            }
            c(defpackage.dli.a((java.lang.CharSequence) str));
            this.d = defpackage.dli.a(str, this.e, this.d, i());
        } catch (defpackage.dll e2) {
            this.d = i;
            a(str, e2);
        } catch (java.lang.IndexOutOfBoundsException e3) {
            throw new defpackage.dhr((java.lang.Throwable) e3);
        }
    }

    public void h() {
    }

    public final int i() {
        return this.f - this.d;
    }
}
