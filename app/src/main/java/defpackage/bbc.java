package defpackage;

/* renamed from: bbc  reason: default package */
/* compiled from: PG */
public final class bbc {
    private final Object a;
    private final String b;

    bbc(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbc)) {
            return false;
        }
        bbc bbc = (bbc) obj;
        return this.a == bbc.a && this.b.equals(bbc.b);
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
    }
}
