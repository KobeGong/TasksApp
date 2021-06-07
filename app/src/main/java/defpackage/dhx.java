package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: dhx  reason: default package */
/* compiled from: PG */
public final class dhx {
    private final Object a;
    private final int b;

    dhx(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dhx)) {
            return false;
        }
        dhx dhx = (dhx) obj;
        if (this.a == dhx.a && this.b == dhx.b) {
            return true;
        }
        return false;
    }
}
