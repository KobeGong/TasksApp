package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* access modifiers changed from: package-private */
/* renamed from: dxg  reason: default package */
/* compiled from: PG */
public final class dxg extends FilterInputStream {
    private final int a;
    private final dzo b;
    private long c;
    private long d;
    private long e = -1;

    dxg(InputStream inputStream, int i, dzo dzo) {
        super(inputStream);
        this.a = i;
        this.b = dzo;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = this.in.read();
        if (read != -1) {
            this.d++;
        }
        b();
        a();
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            this.d += (long) read;
        }
        b();
        a();
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
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

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.e == -1) {
            throw new IOException("Mark not set");
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
            throw dpw.g.a(String.format("Compressed gRPC message exceeds maximum size %d: %d bytes read", Integer.valueOf(this.a), Long.valueOf(this.d))).b();
        }
    }
}
