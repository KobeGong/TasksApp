package defpackage;

/* renamed from: dny reason: default package */
/* compiled from: PG */
public final class dny implements java.lang.Comparable {
    private static final defpackage.dnz b = new defpackage.dnz(0);
    private static final long c;
    private static final long d;
    public final long a;
    private volatile boolean e;

    public static defpackage.dny a(java.util.concurrent.TimeUnit timeUnit) {
        defpackage.dnz dnz = b;
        java.lang.String str = "units";
        if (timeUnit != null) {
            return new defpackage.dny(dnz, timeUnit.toNanos(30));
        }
        throw new java.lang.NullPointerException(java.lang.String.valueOf(str));
    }

    private dny(defpackage.dnz dnz, long j) {
        this(dnz, java.lang.System.nanoTime(), j);
    }

    private dny(defpackage.dnz dnz, long j, long j2) {
        long min = java.lang.Math.min(c, java.lang.Math.max(d, j2));
        this.a = j + min;
        this.e = min <= 0;
    }

    public final boolean a() {
        if (this.e) {
            return true;
        }
        if (this.a - java.lang.System.nanoTime() > 0) {
            return false;
        }
        this.e = true;
        return true;
    }

    public final long b(java.util.concurrent.TimeUnit timeUnit) {
        long nanoTime = java.lang.System.nanoTime();
        if (!this.e && this.a - nanoTime <= 0) {
            this.e = true;
        }
        return timeUnit.convert(this.a - nanoTime, java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public final java.lang.String toString() {
        return b(java.util.concurrent.TimeUnit.NANOSECONDS) + " ns from now";
    }

    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        long j = this.a - ((defpackage.dny) obj).a;
        if (j < 0) {
            return -1;
        }
        if (j > 0) {
            return 1;
        }
        return 0;
    }

    static {
        long nanos = java.util.concurrent.TimeUnit.DAYS.toNanos(36500);
        c = nanos;
        d = -nanos;
    }
}
