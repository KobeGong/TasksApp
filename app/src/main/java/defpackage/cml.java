package defpackage;

/* renamed from: cml reason: default package */
/* compiled from: PG */
public final class cml {
    public final defpackage.egf a;
    public final java.lang.Long b;
    public final java.lang.Long c;
    public final java.lang.Long d;
    public final java.lang.Long e;
    public final java.lang.Integer f;
    public final java.lang.String g;
    public final java.lang.Boolean h;
    public final defpackage.eeo i;

    public cml(defpackage.egf egf, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Long l4, java.lang.Integer num, java.lang.String str, java.lang.Boolean bool, defpackage.eeo eeo) {
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

    public final java.lang.String toString() {
        return java.lang.String.format("StatsRecord:\n  elapsed: %d\n  current: %d\n  Primes version: %d\n  version name #: %d\n  customName: %s\n", new java.lang.Object[]{this.b, this.c, this.d, this.e, this.g});
    }
}
