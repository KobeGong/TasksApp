package defpackage;

/* renamed from: cdo  reason: default package */
/* compiled from: PG */
public final class cdo extends cdj {
    private final cdl a;
    private final cdf b;
    private final cdh c;
    private final cdp d;
    private final cqo e;

    public cdo(cdl cdl, cdf cdf, cdh cdh, cdp cdp, cqo cqo) {
        this.a = cdl;
        this.b = cdf;
        this.c = cdh;
        this.d = cdp;
        this.e = cqo;
    }

    @Override // defpackage.cdj
    public final cdl a() {
        return this.a;
    }

    @Override // defpackage.cdj
    public final cdf b() {
        return this.b;
    }

    @Override // defpackage.cdj
    public final cdh c() {
        return this.c;
    }

    @Override // defpackage.cdj
    public final cdp d() {
        return this.d;
    }

    @Override // defpackage.cdj
    public final cqo e() {
        return this.e;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        return new StringBuilder(String.valueOf(valueOf).length() + 107 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length()).append("AccountMenuManager{accountsModel=").append(valueOf).append(", accountConverter=").append(valueOf2).append(", clickListeners=").append(valueOf3).append(", avatarRetriever=").append(valueOf4).append(", monogramRenderer=").append(valueOf5).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cdj)) {
            return false;
        }
        cdj cdj = (cdj) obj;
        return this.a.equals(cdj.a()) && this.b.equals(cdj.b()) && this.c.equals(cdj.c()) && this.d.equals(cdj.d()) && this.e.equals(cdj.e());
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }
}
