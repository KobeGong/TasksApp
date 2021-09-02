package defpackage;

/* renamed from: dvk reason: default package */
/* compiled from: PG */
public final class dvk implements java.io.Closeable {
    public final defpackage.dtd a = new defpackage.dtd();
    public final java.util.zip.CRC32 b = new java.util.zip.CRC32();
    public final defpackage.dvl c = new defpackage.dvl(this);
    public final byte[] d = new byte[512];
    public int e;
    public int f;
    public java.util.zip.Inflater g;
    public defpackage.dvm h = defpackage.dvm.HEADER;
    public boolean i = false;
    public int j;
    public int k;
    public int l = 0;
    public int m = 0;
    public boolean n = true;
    private long o;

    public final void close() {
        if (!this.i) {
            this.i = true;
            this.a.close();
            if (this.g != null) {
                this.g.end();
                this.g = null;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final int a(byte[] bArr, int i2, int i3) {
        defpackage.cld.b(this.g != null, (java.lang.Object) "inflater is null");
        try {
            int totalIn = this.g.getTotalIn();
            int inflate = this.g.inflate(bArr, i2, i3);
            int totalIn2 = this.g.getTotalIn() - totalIn;
            this.l += totalIn2;
            this.m += totalIn2;
            this.e = totalIn2 + this.e;
            this.b.update(bArr, i2, inflate);
            if (this.g.finished()) {
                this.o = this.g.getBytesWritten() & 4294967295L;
                this.h = defpackage.dvm.TRAILER;
            } else if (this.g.needsInput()) {
                this.h = defpackage.dvm.INFLATER_NEEDS_INPUT;
            }
            return inflate;
        } catch (java.util.zip.DataFormatException e2) {
            java.lang.String str = "Inflater data format exception: ";
            java.lang.String valueOf = java.lang.String.valueOf(e2.getMessage());
            throw new java.util.zip.DataFormatException(valueOf.length() != 0 ? str.concat(valueOf) : new java.lang.String(str));
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean a() {
        if (this.g != null && this.c.b() <= 18) {
            this.g.end();
            this.g = null;
        }
        if (this.c.b() < 8) {
            return false;
        }
        long value = this.b.getValue();
        defpackage.dvl dvl = this.c;
        if (value == ((((long) dvl.c()) << 16) | ((long) dvl.c()))) {
            long j2 = this.o;
            defpackage.dvl dvl2 = this.c;
            if (j2 == ((((long) dvl2.c()) << 16) | ((long) dvl2.c()))) {
                this.b.reset();
                this.h = defpackage.dvm.HEADER;
                return true;
            }
        }
        throw new java.util.zip.ZipException("Corrupt GZIP trailer");
    }

    static /* synthetic */ int a(defpackage.dvk dvk, int i2) {
        int i3 = dvk.e + i2;
        dvk.e = i3;
        return i3;
    }

    static /* synthetic */ int b(defpackage.dvk dvk, int i2) {
        int i3 = dvk.l + i2;
        dvk.l = i3;
        return i3;
    }
}
