package defpackage;

/* renamed from: eaz reason: default package */
/* compiled from: PG */
final class eaz extends defpackage.ebk {
    private final java.lang.String a;

    eaz(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null name");
        }
        this.a = str;
    }

    public final java.lang.String a() {
        return this.a;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 13).append("TagKey{name=").append(str).append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.ebk)) {
            return false;
        }
        return this.a.equals(((defpackage.ebk) obj).a());
    }

    public final int hashCode() {
        return 1000003 ^ this.a.hashCode();
    }
}
