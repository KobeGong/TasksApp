package defpackage;

/* renamed from: dho reason: default package */
/* compiled from: PG */
final class dho extends defpackage.dhn {
    private final byte[] c;
    private final int d;
    private int e;
    private int f;
    private final java.io.OutputStream g;

    private dho(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("bufferSize must be >= 0");
        }
        this.c = new byte[java.lang.Math.max(i, 20)];
        this.d = this.c.length;
    }

    public final int i() {
        throw new java.lang.UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
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
        if (defpackage.dhn.a) {
            long j = (long) this.e;
            while ((i & -128) != 0) {
                byte[] bArr = this.c;
                int i2 = this.e;
                this.e = i2 + 1;
                defpackage.dlc.a(bArr, (long) i2, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            byte[] bArr2 = this.c;
            int i3 = this.e;
            this.e = i3 + 1;
            defpackage.dlc.a(bArr2, (long) i3, (byte) i);
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
        if (defpackage.dhn.a) {
            long j2 = (long) this.e;
            while ((j & -128) != 0) {
                byte[] bArr = this.c;
                int i = this.e;
                this.e = i + 1;
                defpackage.dlc.a(bArr, (long) i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.c;
            int i2 = this.e;
            this.e = i2 + 1;
            defpackage.dlc.a(bArr2, (long) i2, (byte) ((int) j));
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

    /* JADX WARNING: type inference failed for: r0v3, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r2v9, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r0v3, types: [byte[]] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=null, for r2v9, types: [byte, int] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void t(int r4) {
        /*
            r3 = this;
            byte[] r0 = r3.c
            int r1 = r3.e
            int r2 = r1 + 1
            r3.e = r2
            byte r2 = (byte) r4
            r0[r1] = r2
            byte[] r0 = r3.c
            int r1 = r3.e
            int r2 = r1 + 1
            r3.e = r2
            int r2 = r4 >> 8
            byte r2 = (byte) r2
            r0[r1] = r2
            byte[] r0 = r3.c
            int r1 = r3.e
            int r2 = r1 + 1
            r3.e = r2
            int r2 = r4 >> 16
            byte r2 = (byte) r2
            r0[r1] = r2
            byte[] r0 = r3.c
            int r1 = r3.e
            int r2 = r1 + 1
            r3.e = r2
            int r2 = r4 >> 24
            r0[r1] = r2
            int r0 = r3.f
            int r0 = r0 + 4
            r3.f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dho.t(int):void");
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

    dho(java.io.OutputStream outputStream, int i) {
        this(i);
        if (outputStream == null) {
            throw new java.lang.NullPointerException("out");
        }
        this.g = outputStream;
    }

    public final void a(int i, int i2) {
        c((i << 3) | i2);
    }

    public final void b(int i, int i2) {
        u(20);
        j(i, 0);
        if (i2 >= 0) {
            s(i2);
        } else {
            g((long) i2);
        }
    }

    public final void c(int i, int i2) {
        u(20);
        j(i, 0);
        s(i2);
    }

    public final void e(int i, int i2) {
        u(14);
        j(i, 5);
        t(i2);
    }

    public final void a(int i, long j) {
        u(20);
        j(i, 0);
        g(j);
    }

    public final void c(int i, long j) {
        u(18);
        j(i, 1);
        h(j);
    }

    public final void a(int i, boolean z) {
        int i2 = 0;
        u(11);
        j(i, 0);
        if (z) {
            i2 = 1;
        }
        b((byte) i2);
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
        if (this.e == this.d) {
            k();
        }
        b(b);
    }

    public final void b(int i) {
        if (i >= 0) {
            c(i);
        } else {
            a((long) i);
        }
    }

    public final void c(int i) {
        u(10);
        s(i);
    }

    public final void e(int i) {
        u(4);
        t(i);
    }

    public final void a(long j) {
        u(10);
        g(j);
    }

    public final void c(long j) {
        u(8);
        h(j);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = r7.length()     // Catch:{ dll -> 0x0064 }
            int r0 = r0 * 3
            int r1 = o(r0)     // Catch:{ dll -> 0x0064 }
            int r2 = r1 + r0
            int r3 = r6.d     // Catch:{ dll -> 0x0064 }
            if (r2 <= r3) goto L_0x001f
            byte[] r1 = new byte[r0]     // Catch:{ dll -> 0x0064 }
            r2 = 0
            int r0 = defpackage.dli.a(r7, r1, r2, r0)     // Catch:{ dll -> 0x0064 }
            r6.c(r0)     // Catch:{ dll -> 0x0064 }
            r2 = 0
            r6.a(r1, r2, r0)     // Catch:{ dll -> 0x0064 }
        L_0x001e:
            return
        L_0x001f:
            int r0 = r0 + r1
            int r2 = r6.d     // Catch:{ dll -> 0x0064 }
            int r3 = r6.e     // Catch:{ dll -> 0x0064 }
            int r2 = r2 - r3
            if (r0 <= r2) goto L_0x002a
            r6.k()     // Catch:{ dll -> 0x0064 }
        L_0x002a:
            int r0 = r7.length()     // Catch:{ dll -> 0x0064 }
            int r0 = o(r0)     // Catch:{ dll -> 0x0064 }
            int r2 = r6.e     // Catch:{ dll -> 0x0064 }
            if (r0 != r1) goto L_0x0069
            int r1 = r2 + r0
            r6.e = r1     // Catch:{ dll -> 0x0058, ArrayIndexOutOfBoundsException -> 0x007b }
            byte[] r1 = r6.c     // Catch:{ dll -> 0x0058, ArrayIndexOutOfBoundsException -> 0x007b }
            int r3 = r6.e     // Catch:{ dll -> 0x0058, ArrayIndexOutOfBoundsException -> 0x007b }
            int r4 = r6.d     // Catch:{ dll -> 0x0058, ArrayIndexOutOfBoundsException -> 0x007b }
            int r5 = r6.e     // Catch:{ dll -> 0x0058, ArrayIndexOutOfBoundsException -> 0x007b }
            int r4 = r4 - r5
            int r1 = defpackage.dli.a(r7, r1, r3, r4)     // Catch:{ dll -> 0x0058, ArrayIndexOutOfBoundsException -> 0x007b }
            r6.e = r2     // Catch:{ dll -> 0x0058, ArrayIndexOutOfBoundsException -> 0x007b }
            int r3 = r1 - r2
            int r0 = r3 - r0
            r6.s(r0)     // Catch:{ dll -> 0x0058, ArrayIndexOutOfBoundsException -> 0x007b }
            r6.e = r1     // Catch:{ dll -> 0x0058, ArrayIndexOutOfBoundsException -> 0x007b }
        L_0x0052:
            int r1 = r6.f     // Catch:{ dll -> 0x0058, ArrayIndexOutOfBoundsException -> 0x007b }
            int r0 = r0 + r1
            r6.f = r0     // Catch:{ dll -> 0x0058, ArrayIndexOutOfBoundsException -> 0x007b }
            goto L_0x001e
        L_0x0058:
            r0 = move-exception
            int r1 = r6.f     // Catch:{ dll -> 0x0064 }
            int r3 = r6.e     // Catch:{ dll -> 0x0064 }
            int r3 = r3 - r2
            int r1 = r1 - r3
            r6.f = r1     // Catch:{ dll -> 0x0064 }
            r6.e = r2     // Catch:{ dll -> 0x0064 }
            throw r0     // Catch:{ dll -> 0x0064 }
        L_0x0064:
            r0 = move-exception
            r6.a(r7, r0)
            goto L_0x001e
        L_0x0069:
            int r0 = defpackage.dli.a(r7)     // Catch:{ dll -> 0x0058, ArrayIndexOutOfBoundsException -> 0x007b }
            r6.s(r0)     // Catch:{ dll -> 0x0058, ArrayIndexOutOfBoundsException -> 0x007b }
            byte[] r1 = r6.c     // Catch:{ dll -> 0x0058, ArrayIndexOutOfBoundsException -> 0x007b }
            int r3 = r6.e     // Catch:{ dll -> 0x0058, ArrayIndexOutOfBoundsException -> 0x007b }
            int r1 = defpackage.dli.a(r7, r1, r3, r0)     // Catch:{ dll -> 0x0058, ArrayIndexOutOfBoundsException -> 0x007b }
            r6.e = r1     // Catch:{ dll -> 0x0058, ArrayIndexOutOfBoundsException -> 0x007b }
            goto L_0x0052
        L_0x007b:
            r0 = move-exception
            dhr r1 = new dhr     // Catch:{ dll -> 0x0064 }
            r1.<init>(r0)     // Catch:{ dll -> 0x0064 }
            throw r1     // Catch:{ dll -> 0x0064 }
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dho.a(java.lang.String):void");
    }

    public final void h() {
        if (this.e > 0) {
            k();
        }
    }

    public final void c(byte[] bArr, int i, int i2) {
        if (this.d - this.e >= i2) {
            java.lang.System.arraycopy(bArr, i, this.c, this.e, i2);
            this.e += i2;
        } else {
            int i3 = this.d - this.e;
            java.lang.System.arraycopy(bArr, i, this.c, this.e, i3);
            int i4 = i + i3;
            i2 -= i3;
            this.e = this.d;
            this.f = i3 + this.f;
            k();
            if (i2 <= this.d) {
                java.lang.System.arraycopy(bArr, i4, this.c, 0, i2);
                this.e = i2;
            } else {
                this.g.write(bArr, i4, i2);
            }
        }
        this.f += i2;
    }

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
