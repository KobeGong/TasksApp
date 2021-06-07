package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: eal  reason: default package */
/* compiled from: PG */
public final class eal extends eao {
    private final String a;
    private final String b;
    private final String c;

    eal(String str, String str2, String str3) {
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

    @Override // defpackage.eao
    public final String a() {
        return this.a;
    }

    @Override // defpackage.eao
    public final String b() {
        return this.b;
    }

    @Override // defpackage.eao
    public final String c() {
        return this.c;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        return new StringBuilder(String.valueOf(str).length() + 41 + String.valueOf(str2).length() + String.valueOf(str3).length()).append("MeasureDouble{name=").append(str).append(", description=").append(str2).append(", unit=").append(str3).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eao)) {
            return false;
        }
        eao eao = (eao) obj;
        return this.a.equals(eao.a()) && this.b.equals(eao.b()) && this.c.equals(eao.c());
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
