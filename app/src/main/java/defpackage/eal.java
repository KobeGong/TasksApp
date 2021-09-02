package defpackage;

/* renamed from: eal reason: default package */
/* compiled from: PG */
final class eal extends defpackage.eao {
    private final java.lang.String a;
    private final java.lang.String b;
    private final java.lang.String c;

    eal(java.lang.String str, java.lang.String str2, java.lang.String str3) {
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
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 41 + java.lang.String.valueOf(str2).length() + java.lang.String.valueOf(str3).length()).append("MeasureDouble{name=").append(str).append(", description=").append(str2).append(", unit=").append(str3).append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.eao)) {
            return false;
        }
        defpackage.eao eao = (defpackage.eao) obj;
        if (!this.a.equals(eao.a()) || !this.b.equals(eao.b()) || !this.c.equals(eao.c())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
