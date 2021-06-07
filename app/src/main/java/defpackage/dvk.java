package defpackage;

import java.io.Closeable;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;

/* renamed from: dvk  reason: default package */
/* compiled from: PG */
public final class dvk implements Closeable {
    public final dtd a = new dtd();
    public final CRC32 b = new CRC32();
    public final dvl c = new dvl(this);
    public final byte[] d = new byte[512];
    public int e;
    public int f;
    public Inflater g;
    public dvm h = dvm.HEADER;
    public boolean i = false;
    public int j;
    public int k;
    public int l = 0;
    public int m = 0;
    public boolean n = true;
    private long o;

    @Override // java.io.Closeable, java.lang.AutoCloseable
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

    /* access modifiers changed from: package-private */
    public final int a(byte[] bArr, int i2, int i3) {
        cld.b(this.g != null, "inflater is null");
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
                this.h = dvm.TRAILER;
            } else if (this.g.needsInput()) {
                this.h = dvm.INFLATER_NEEDS_INPUT;
            }
            return inflate;
        } catch (DataFormatException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            throw new DataFormatException(valueOf.length() != 0 ? "Inflater data format exception: ".concat(valueOf) : new String("Inflater data format exception: "));
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        if (this.g != null && this.c.b() <= 18) {
            this.g.end();
            this.g = null;
        }
        if (this.c.b() < 8) {
            return false;
        }
        long value = this.b.getValue();
        dvl dvl = this.c;
        if (value == ((((long) dvl.c()) << 16) | ((long) dvl.c()))) {
            long j2 = this.o;
            dvl dvl2 = this.c;
            if (j2 == ((((long) dvl2.c()) << 16) | ((long) dvl2.c()))) {
                this.b.reset();
                this.h = dvm.HEADER;
                return true;
            }
        }
        throw new ZipException("Corrupt GZIP trailer");
    }

    static /* synthetic */ int a(dvk dvk, int i2) {
        int i3 = dvk.e + i2;
        dvk.e = i3;
        return i3;
    }

    static /* synthetic */ int b(dvk dvk, int i2) {
        int i3 = dvk.l + i2;
        dvk.l = i3;
        return i3;
    }
}
