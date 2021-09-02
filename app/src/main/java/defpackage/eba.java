package defpackage;

/* renamed from: eba reason: default package */
/* compiled from: PG */
final class eba extends defpackage.ebl {
    private final java.lang.String a;

    eba(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null asString");
        }
        this.a = str;
    }

    public final java.lang.String a() {
        return this.a;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 19).append("TagValue{asString=").append(str).append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.ebl)) {
            return false;
        }
        return this.a.equals(((defpackage.ebl) obj).a());
    }

    public final int hashCode() {
        return 1000003 ^ this.a.hashCode();
    }
}
