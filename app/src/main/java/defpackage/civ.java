package defpackage;

/* renamed from: civ reason: default package */
/* compiled from: PG */
public final class civ {
    private final java.lang.String a;

    civ(java.lang.String str) {
        this.a = str;
    }

    public final java.lang.String toString() {
        return this.a;
    }

    public static java.lang.String a(defpackage.civ civ) {
        if (civ == null) {
            return null;
        }
        return civ.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.civ)) {
            return false;
        }
        return this.a.equals(((defpackage.civ) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
