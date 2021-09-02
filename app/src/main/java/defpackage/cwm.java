package defpackage;

/* renamed from: cwm reason: default package */
/* compiled from: PG */
public final class cwm extends defpackage.cwn {
    public cwm() {
        super(2000, 2.0d, 3);
    }

    public final java.lang.String toString() {
        return new defpackage.crs("exponentialBackoff").a("firstDelayMs", this.b).a("multiplier", (java.lang.Object) java.lang.String.valueOf(this.c)).a("tries", this.a).toString();
    }
}
