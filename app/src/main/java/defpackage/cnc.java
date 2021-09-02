package defpackage;

/* renamed from: cnc reason: default package */
/* compiled from: PG */
public final class cnc {
    public final java.nio.ByteBuffer a;
    public final int b;
    public final defpackage.cne c;
    private final int[] d;
    private final java.nio.ByteBuffer e;

    private cnc(java.nio.ByteBuffer byteBuffer) {
        byteBuffer.rewind();
        byteBuffer.order(java.nio.ByteOrder.BIG_ENDIAN);
        this.a = byteBuffer;
        this.e = byteBuffer.duplicate();
        do {
        } while (byteBuffer.get() != 0);
        this.b = byteBuffer.getInt();
        defpackage.cky.b(this.b > 0);
        byteBuffer.getLong();
        int[] iArr = new int[12];
        iArr[2] = this.b;
        iArr[4] = 1;
        iArr[5] = 2;
        iArr[6] = 4;
        iArr[7] = 8;
        iArr[8] = 1;
        iArr[9] = 2;
        iArr[10] = 4;
        iArr[11] = 8;
        this.d = iArr;
        this.c = new defpackage.cne();
        int i = this.b;
        defpackage.cnb cnb = new defpackage.cnb(this);
        cnb.a(137, i);
        cnb.a(255, i);
        cnb.a(139, i);
        cnb.a(144, i);
        cnb.a(138, i);
        cnb.a(5, i);
        cnb.a(7, i);
        cnb.a(140, i);
        cnb.a(141, i);
        cnb.a(1, i + i);
        cnb.a(3, i + 8);
        cnb.a(2, i + 8);
        cnb.a(8, i + 8);
        cnb.a(142, i + 8);
        cnb.a(4, i + 4);
        cnb.a(6, i + 4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.cnc a(java.io.File r8) {
        /*
            r1 = 0
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ all -> 0x0024 }
            r6.<init>(r8)     // Catch:{ all -> 0x0024 }
            java.nio.channels.FileChannel r0 = r6.getChannel()     // Catch:{ all -> 0x0031 }
            java.nio.channels.FileChannel$MapMode r1 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0034 }
            r2 = 0
            long r4 = r0.size()     // Catch:{ all -> 0x0034 }
            java.nio.MappedByteBuffer r1 = r0.map(r1, r2, r4)     // Catch:{ all -> 0x0034 }
            cnc r2 = new cnc     // Catch:{ all -> 0x0034 }
            r2.<init>(r1)     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0020
            r0.close()
        L_0x0020:
            r6.close()
            return r2
        L_0x0024:
            r0 = move-exception
            r2 = r1
        L_0x0026:
            if (r1 == 0) goto L_0x002b
            r1.close()
        L_0x002b:
            if (r2 == 0) goto L_0x0030
            r2.close()
        L_0x0030:
            throw r0
        L_0x0031:
            r0 = move-exception
            r2 = r6
            goto L_0x0026
        L_0x0034:
            r1 = move-exception
            r2 = r6
            r7 = r0
            r0 = r1
            r1 = r7
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnc.a(java.io.File):cnc");
    }

    public final java.lang.String a(int i) {
        defpackage.cky.a(i >= 0);
        byte[] bArr = new byte[(this.e.getInt(i) - this.b)];
        this.e.position(i + 4 + this.b);
        this.e.get(bArr);
        return new java.lang.String(bArr, java.nio.charset.Charset.defaultCharset());
    }

    public final int b(int i) {
        int i2 = this.d[i];
        defpackage.cky.b(i2 > 0);
        return i2;
    }

    public final void c(int i) {
        defpackage.cky.a(i >= 0);
        int position = this.a.position() + i;
        if (position > this.a.limit()) {
            throw new java.nio.BufferUnderflowException();
        }
        this.a.position(position);
    }

    public final int a() {
        switch (this.b) {
            case 1:
                return this.a.get();
            case 2:
                return this.a.getShort();
            case 4:
                return this.a.getInt();
            default:
                throw new java.lang.IllegalStateException();
        }
    }

    public final int d(int i) {
        switch (this.b) {
            case 1:
                return this.a.get(i);
            case 2:
                return this.a.getShort(i);
            case 4:
                return this.a.getInt(i);
            default:
                throw new java.lang.IllegalStateException();
        }
    }

    public static boolean e(int i) {
        return i == 2;
    }
}
