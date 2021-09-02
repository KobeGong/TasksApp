package defpackage;

/* renamed from: egy reason: default package */
/* compiled from: PG */
public final class egy implements java.io.Closeable {
    private final android.os.StrictMode.ThreadPolicy a;

    private egy(android.os.StrictMode.ThreadPolicy threadPolicy) {
        this.a = threadPolicy;
    }

    public egy(android.os.StrictMode.ThreadPolicy threadPolicy, byte b) {
        this(threadPolicy);
    }

    public final void close() {
        if (this.a != null) {
            android.os.StrictMode.setThreadPolicy(this.a);
        }
    }
}
