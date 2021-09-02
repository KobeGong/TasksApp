package defpackage;

/* renamed from: cdr reason: default package */
/* compiled from: PG */
final class cdr extends defpackage.cdu {
    private final java.lang.String a;
    private final java.lang.String b;
    private final int c;

    cdr(java.lang.String str, java.lang.String str2, int i) {
        this.a = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null accountName");
        }
        this.b = str2;
        this.c = i;
    }

    public final java.lang.String a() {
        return this.a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        java.lang.String str2 = this.b;
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 68 + java.lang.String.valueOf(str2).length()).append("DeviceOwner{displayName=").append(str).append(", accountName=").append(str2).append(", isDasherAccount=").append(this.c).append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.cdu)) {
            return false;
        }
        defpackage.cdu cdu = (defpackage.cdu) obj;
        if (this.a != null ? this.a.equals(cdu.a()) : cdu.a() == null) {
            if (this.b.equals(cdu.b()) && this.c == cdu.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a == null ? 0 : this.a.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }
}
