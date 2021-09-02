package defpackage;

/* renamed from: chl reason: default package */
/* compiled from: PG */
final class chl {
    public final long a;
    public final long b;

    chl(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    static defpackage.chl a() {
        return new defpackage.chl(java.lang.System.nanoTime(), android.os.Debug.threadCpuTimeNanos());
    }
}
