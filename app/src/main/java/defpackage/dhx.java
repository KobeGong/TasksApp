package defpackage;

/* renamed from: dhx reason: default package */
/* compiled from: PG */
final class dhx {
    private final java.lang.Object a;
    private final int b;

    dhx(java.lang.Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final int hashCode() {
        return (java.lang.System.identityHashCode(this.a) * 65535) + this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.dhx)) {
            return false;
        }
        defpackage.dhx dhx = (defpackage.dhx) obj;
        if (this.a == dhx.a && this.b == dhx.b) {
            return true;
        }
        return false;
    }
}
