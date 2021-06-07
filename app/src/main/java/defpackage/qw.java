package defpackage;

import java.io.Writer;

/* renamed from: qw  reason: default package */
/* compiled from: PG */
public final class qw extends Writer {
    private StringBuilder a = new StringBuilder(128);

    @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                a();
            } else {
                this.a.append(c);
            }
        }
    }

    private final void a() {
        if (this.a.length() > 0) {
            this.a.delete(0, this.a.length());
        }
    }
}
