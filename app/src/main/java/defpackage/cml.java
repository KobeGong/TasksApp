package defpackage;

/* renamed from: cml  reason: default package */
/* compiled from: PG */
public final class cml {
    public final egf a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final Integer f;
    public final String g;
    public final Boolean h;
    public final eeo i;

    public cml(egf egf, Long l, Long l2, Long l3, Long l4, Integer num, String str, Boolean bool, eeo eeo) {
        this.a = egf;
        this.b = l;
        this.c = l2;
        this.d = l3;
        this.e = l4;
        this.f = num;
        this.g = str;
        this.h = bool;
        this.i = eeo;
    }

    public final String toString() {
        return String.format("StatsRecord:\n  elapsed: %d\n  current: %d\n  Primes version: %d\n  version name #: %d\n  customName: %s\n", this.b, this.c, this.d, this.e, this.g);
    }
}
