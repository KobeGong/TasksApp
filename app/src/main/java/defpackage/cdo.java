package defpackage;

/* renamed from: cdo reason: default package */
/* compiled from: PG */
public final class cdo extends defpackage.cdj {
    private final defpackage.cdl a;
    private final defpackage.cdf b;
    private final defpackage.cdh c;
    private final defpackage.cdp d;
    private final defpackage.cqo e;

    public cdo(defpackage.cdl cdl, defpackage.cdf cdf, defpackage.cdh cdh, defpackage.cdp cdp, defpackage.cqo cqo) {
        this.a = cdl;
        this.b = cdf;
        this.c = cdh;
        this.d = cdp;
        this.e = cqo;
    }

    public final defpackage.cdl a() {
        return this.a;
    }

    public final defpackage.cdf b() {
        return this.b;
    }

    public final defpackage.cdh c() {
        return this.c;
    }

    public final defpackage.cdp d() {
        return this.d;
    }

    public final defpackage.cqo e() {
        return this.e;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.a);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.b);
        java.lang.String valueOf3 = java.lang.String.valueOf(this.c);
        java.lang.String valueOf4 = java.lang.String.valueOf(this.d);
        java.lang.String valueOf5 = java.lang.String.valueOf(this.e);
        return new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 107 + java.lang.String.valueOf(valueOf2).length() + java.lang.String.valueOf(valueOf3).length() + java.lang.String.valueOf(valueOf4).length() + java.lang.String.valueOf(valueOf5).length()).append("AccountMenuManager{accountsModel=").append(valueOf).append(", accountConverter=").append(valueOf2).append(", clickListeners=").append(valueOf3).append(", avatarRetriever=").append(valueOf4).append(", monogramRenderer=").append(valueOf5).append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.cdj)) {
            return false;
        }
        defpackage.cdj cdj = (defpackage.cdj) obj;
        if (!this.a.equals(cdj.a()) || !this.b.equals(cdj.b()) || !this.c.equals(cdj.c()) || !this.d.equals(cdj.d()) || !this.e.equals(cdj.e())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }
}
