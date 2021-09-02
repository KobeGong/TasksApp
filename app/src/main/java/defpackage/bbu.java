package defpackage;

/* renamed from: bbu reason: default package */
/* compiled from: PG */
public final class bbu {
    public final defpackage.ayd a;
    private final int b = java.util.Arrays.hashCode(new java.lang.Object[]{this.a, this.c});
    private final defpackage.aye c;

    public bbu(defpackage.ayd ayd, defpackage.aye aye) {
        this.a = ayd;
        this.c = aye;
    }

    public final int hashCode() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.bbu)) {
            return false;
        }
        defpackage.bbu bbu = (defpackage.bbu) obj;
        if (!defpackage.azb.a((java.lang.Object) this.a, (java.lang.Object) bbu.a) || !defpackage.azb.a((java.lang.Object) this.c, (java.lang.Object) bbu.c)) {
            return false;
        }
        return true;
    }
}
