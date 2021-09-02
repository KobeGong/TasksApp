package defpackage;

/* renamed from: eam reason: default package */
/* compiled from: PG */
final class eam extends defpackage.eap {
    private final java.lang.String a;
    private final java.lang.String b;
    private final java.lang.String c;

    eam(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null name");
        }
        this.a = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null description");
        }
        this.b = str2;
        if (str3 == null) {
            throw new java.lang.NullPointerException("Null unit");
        }
        this.c = str3;
    }

    public final java.lang.String a() {
        return this.a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final java.lang.String c() {
        return this.c;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        java.lang.String str2 = this.b;
        java.lang.String str3 = this.c;
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 39 + java.lang.String.valueOf(str2).length() + java.lang.String.valueOf(str3).length()).append("MeasureLong{name=").append(str).append(", description=").append(str2).append(", unit=").append(str3).append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.eap)) {
            return false;
        }
        defpackage.eap eap = (defpackage.eap) obj;
        if (!this.a.equals(eap.a()) || !this.b.equals(eap.b()) || !this.c.equals(eap.c())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
