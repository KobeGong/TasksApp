package defpackage;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
/* renamed from: drn  reason: default package */
/* compiled from: PG */
public final class drn {
    private Random a = new Random();
    private long b = TimeUnit.SECONDS.toNanos(1);
    private long c = TimeUnit.MINUTES.toNanos(2);
    private double d = 1.6d;
    private double e = 0.2d;
    private long f = this.b;

    public final long a() {
        long j = this.f;
        this.f = Math.min((long) (((double) j) * this.d), this.c);
        double d2 = ((double) j) * (-this.e);
        double d3 = ((double) j) * this.e;
        cld.a(d3 >= d2);
        return ((long) (((d3 - d2) * this.a.nextDouble()) + d2)) + j;
    }

    drn() {
    }
}
