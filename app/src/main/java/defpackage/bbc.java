package defpackage;

/* renamed from: bbc reason: default package */
/* compiled from: PG */
public final class bbc {
    private final java.lang.Object a;
    private final java.lang.String b;

    bbc(java.lang.Object obj, java.lang.String str) {
        this.a = obj;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.bbc)) {
            return false;
        }
        defpackage.bbc bbc = (defpackage.bbc) obj;
        if (this.a != bbc.a || !this.b.equals(bbc.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (java.lang.System.identityHashCode(this.a) * 31) + this.b.hashCode();
    }
}
