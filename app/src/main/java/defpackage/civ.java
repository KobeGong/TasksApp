package defpackage;

/* renamed from: civ  reason: default package */
/* compiled from: PG */
public final class civ {
    private final String a;

    civ(String str) {
        this.a = str;
    }

    public final String toString() {
        return this.a;
    }

    public static String a(civ civ) {
        if (civ == null) {
            return null;
        }
        return civ.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof civ) {
            return this.a.equals(((civ) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
