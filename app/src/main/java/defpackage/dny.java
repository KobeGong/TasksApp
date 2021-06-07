package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: dny  reason: default package */
/* compiled from: PG */
public final class dny implements Comparable {
    private static final dnz b = new dnz((byte) 0);
    private static final long c;
    private static final long d;
    public final long a;
    private volatile boolean e;

    public static dny a(TimeUnit timeUnit) {
        dnz dnz = b;
        if (timeUnit != null) {
            return new dny(dnz, timeUnit.toNanos(30));
        }
        throw new NullPointerException(String.valueOf("units"));
    }

    private dny(dnz dnz, long j) {
        this(dnz, System.nanoTime(), j);
    }

    private dny(dnz dnz, long j, long j2) {
        long min = Math.min(c, Math.max(d, j2));
        this.a = j + min;
        this.e = min <= 0;
    }

    public final boolean a() {
        if (this.e) {
            return true;
        }
        if (this.a - System.nanoTime() > 0) {
            return false;
        }
        this.e = true;
        return true;
    }

    public final long b(TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        if (!this.e && this.a - nanoTime <= 0) {
            this.e = true;
        }
        return timeUnit.convert(this.a - nanoTime, TimeUnit.NANOSECONDS);
    }

    public final String toString() {
        return new StringBuilder(32).append(b(TimeUnit.NANOSECONDS)).append(" ns from now").toString();
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        long j = this.a - ((dny) obj).a;
        if (j < 0) {
            return -1;
        }
        if (j > 0) {
            return 1;
        }
        return 0;
    }

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500);
        c = nanos;
        d = -nanos;
    }
}
