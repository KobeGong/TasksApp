package defpackage;

/* renamed from: csb reason: default package */
/* compiled from: PG */
public final class csb {
    public final defpackage.csf a;
    public boolean b;
    public long c;
    public long d;

    public csb() {
        this.a = defpackage.csf.a;
    }

    public csb(defpackage.csf csf) {
        this.a = (defpackage.csf) defpackage.cld.a((java.lang.Object) csf, (java.lang.Object) "ticker");
    }

    public final defpackage.csb a() {
        defpackage.cld.b(!this.b, (java.lang.Object) "This stopwatch is already running.");
        this.b = true;
        this.d = defpackage.csf.a();
        return this;
    }

    private final long b() {
        return this.b ? (defpackage.csf.a() - this.d) + this.c : this.c;
    }

    public final long a(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(b(), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public final java.lang.String toString() {
        java.util.concurrent.TimeUnit timeUnit;
        java.lang.String str;
        long b2 = b();
        if (java.util.concurrent.TimeUnit.DAYS.convert(b2, java.util.concurrent.TimeUnit.NANOSECONDS) > 0) {
            timeUnit = java.util.concurrent.TimeUnit.DAYS;
        } else if (java.util.concurrent.TimeUnit.HOURS.convert(b2, java.util.concurrent.TimeUnit.NANOSECONDS) > 0) {
            timeUnit = java.util.concurrent.TimeUnit.HOURS;
        } else if (java.util.concurrent.TimeUnit.MINUTES.convert(b2, java.util.concurrent.TimeUnit.NANOSECONDS) > 0) {
            timeUnit = java.util.concurrent.TimeUnit.MINUTES;
        } else if (java.util.concurrent.TimeUnit.SECONDS.convert(b2, java.util.concurrent.TimeUnit.NANOSECONDS) > 0) {
            timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        } else if (java.util.concurrent.TimeUnit.MILLISECONDS.convert(b2, java.util.concurrent.TimeUnit.NANOSECONDS) > 0) {
            timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        } else if (java.util.concurrent.TimeUnit.MICROSECONDS.convert(b2, java.util.concurrent.TimeUnit.NANOSECONDS) > 0) {
            timeUnit = java.util.concurrent.TimeUnit.MICROSECONDS;
        } else {
            timeUnit = java.util.concurrent.TimeUnit.NANOSECONDS;
        }
        java.lang.String a2 = defpackage.crx.a(((double) b2) / ((double) java.util.concurrent.TimeUnit.NANOSECONDS.convert(1, timeUnit)));
        switch (defpackage.csc.a[timeUnit.ordinal()]) {
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
                throw new java.lang.AssertionError();
        }
        return new java.lang.StringBuilder(java.lang.String.valueOf(a2).length() + 1 + java.lang.String.valueOf(str).length()).append(a2).append(" ").append(str).toString();
    }
}
