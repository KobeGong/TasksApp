package defpackage;

/* renamed from: cwm  reason: default package */
/* compiled from: PG */
public final class cwm extends cwn {
    public cwm() {
        super(2000, 2.0d, 3);
    }

    public final String toString() {
        return new crs("exponentialBackoff").a("firstDelayMs", this.b).a("multiplier", String.valueOf(this.c)).a("tries", this.a).toString();
    }
}
