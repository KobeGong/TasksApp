package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: eam  reason: default package */
/* compiled from: PG */
public final class eam extends eap {
    private final String a;
    private final String b;
    private final String c;

    eam(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null description");
        }
        this.b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null unit");
        }
        this.c = str3;
    }

    @Override // defpackage.eap
    public final String a() {
        return this.a;
    }

    @Override // defpackage.eap
    public final String b() {
        return this.b;
    }

    @Override // defpackage.eap
    public final String c() {
        return this.c;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        return new StringBuilder(String.valueOf(str).length() + 39 + String.valueOf(str2).length() + String.valueOf(str3).length()).append("MeasureLong{name=").append(str).append(", description=").append(str2).append(", unit=").append(str3).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eap)) {
            return false;
        }
        eap eap = (eap) obj;
        return this.a.equals(eap.a()) && this.b.equals(eap.b()) && this.c.equals(eap.c());
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
