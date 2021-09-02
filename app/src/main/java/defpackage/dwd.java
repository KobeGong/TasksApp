package defpackage;

/* renamed from: dwd reason: default package */
/* compiled from: PG */
public final class dwd {
    private static final java.util.concurrent.atomic.AtomicLong b = new java.util.concurrent.atomic.AtomicLong();
    public final long a;
    private final java.lang.String c;

    public static defpackage.dwd a(java.lang.String str) {
        return new defpackage.dwd(str, b.incrementAndGet());
    }

    private dwd(java.lang.String str, long j) {
        this.c = str;
        this.a = j;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.c;
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 21).append(str).append("-").append(this.a).toString();
    }
}
