package defpackage;

import android.os.StrictMode;
import java.io.Closeable;

/* renamed from: egy  reason: default package */
/* compiled from: PG */
public final class egy implements Closeable {
    private final StrictMode.ThreadPolicy a;

    private egy(StrictMode.ThreadPolicy threadPolicy) {
        this.a = threadPolicy;
    }

    public egy(StrictMode.ThreadPolicy threadPolicy, byte b) {
        this(threadPolicy);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a != null) {
            StrictMode.setThreadPolicy(this.a);
        }
    }
}
