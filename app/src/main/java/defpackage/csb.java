package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: csb  reason: default package */
/* compiled from: PG */
public final class csb {
    public final csf a;
    public boolean b;
    public long c;
    public long d;

    public csb() {
        this.a = csf.a;
    }

    public csb(csf csf) {
        this.a = (csf) cld.a(csf, "ticker");
    }

    public final csb a() {
        cld.b(!this.b, "This stopwatch is already running.");
        this.b = true;
        this.d = csf.a();
        return this;
    }

    private final long b() {
        return this.b ? (csf.a() - this.d) + this.c : this.c;
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(b(), TimeUnit.NANOSECONDS);
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long b2 = b();
        if (TimeUnit.DAYS.convert(b2, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (TimeUnit.HOURS.convert(b2, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (TimeUnit.MINUTES.convert(b2, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (TimeUnit.SECONDS.convert(b2, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (TimeUnit.MILLISECONDS.convert(b2, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else if (TimeUnit.MICROSECONDS.convert(b2, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MICROSECONDS;
        } else {
            timeUnit = TimeUnit.NANOSECONDS;
        }
        String a2 = crx.a(((double) b2) / ((double) TimeUnit.NANOSECONDS.convert(1, timeUnit)));
        switch (csc.a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return new StringBuilder(String.valueOf(a2).length() + 1 + String.valueOf(str).length()).append(a2).append(" ").append(str).toString();
    }
}
