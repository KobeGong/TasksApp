package defpackage;

/* renamed from: qw reason: default package */
/* compiled from: PG */
public final class qw extends java.io.Writer {
    private java.lang.StringBuilder a = new java.lang.StringBuilder(128);

    public final void close() {
        a();
    }

    public final void flush() {
        a();
    }

    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
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
