package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: dwd  reason: default package */
/* compiled from: PG */
public final class dwd {
    private static final AtomicLong b = new AtomicLong();
    public final long a;
    private final String c;

    public static dwd a(String str) {
        return new dwd(str, b.incrementAndGet());
    }

    private dwd(String str, long j) {
        this.c = str;
        this.a = j;
    }

    public final String toString() {
        String str = this.c;
        return new StringBuilder(String.valueOf(str).length() + 21).append(str).append("-").append(this.a).toString();
    }
}
