package defpackage;

/* renamed from: dxg reason: default package */
/* compiled from: PG */
final class dxg extends java.io.FilterInputStream {
    private final int a;
    private final defpackage.dzo b;
    private long c;
    private long d;
    private long e = -1;

    dxg(java.io.InputStream inputStream, int i, defpackage.dzo dzo) {
        super(inputStream);
        this.a = i;
        this.b = dzo;
    }

    public final int read() {
        int read = this.in.read();
        if (read != -1) {
            this.d++;
        }
        b();
        a();
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            this.d += (long) read;
        }
        b();
        a();
        return read;
    }

    public final long skip(long j) {
        long skip = this.in.skip(j);
        this.d += skip;
        b();
        a();
        return skip;
    }

    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.e = this.d;
    }

    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new java.io.IOException("Mark not supported");
        } else if (this.e == -1) {
            throw new java.io.IOException("Mark not set");
        } else {
            this.in.reset();
            this.d = this.e;
        }
    }

    private final void a() {
        if (this.d > this.c) {
            this.b.c(this.d - this.c);
            this.c = this.d;
        }
    }

    private final void b() {
        if (this.d > ((long) this.a)) {
            throw defpackage.dpw.g.a(java.lang.String.format("Compressed gRPC message exceeds maximum size %d: %d bytes read", new java.lang.Object[]{java.lang.Integer.valueOf(this.a), java.lang.Long.valueOf(this.d)})).b();
        }
    }
}
