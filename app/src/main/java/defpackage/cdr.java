package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: cdr  reason: default package */
/* compiled from: PG */
public final class cdr extends cdu {
    private final String a;
    private final String b;
    private final int c;

    cdr(String str, String str2, int i) {
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null accountName");
        }
        this.b = str2;
        this.c = i;
    }

    @Override // defpackage.cdu
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cdu
    public final String b() {
        return this.b;
    }

    @Override // defpackage.cdu
    public final int c() {
        return this.c;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        return new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length()).append("DeviceOwner{displayName=").append(str).append(", accountName=").append(str2).append(", isDasherAccount=").append(this.c).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cdu)) {
            return false;
        }
        cdu cdu = (cdu) obj;
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
