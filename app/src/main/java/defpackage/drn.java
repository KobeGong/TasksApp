package defpackage;

/* renamed from: drn reason: default package */
/* compiled from: PG */
final class drn {
    private java.util.Random a = new java.util.Random();
    private long b = java.util.concurrent.TimeUnit.SECONDS.toNanos(1);
    private long c = java.util.concurrent.TimeUnit.MINUTES.toNanos(2);
    private double d = 1.6d;
    private double e = 0.2d;
    private long f = this.b;

    public final long a() {
        long j = this.f;
        this.f = java.lang.Math.min((long) (((double) j) * this.d), this.c);
        double d2 = ((double) j) * (-this.e);
        double d3 = ((double) j) * this.e;
        defpackage.cld.a(d3 >= d2);
        return ((long) (((d3 - d2) * this.a.nextDouble()) + d2)) + j;
    }

    drn() {
    }
}
