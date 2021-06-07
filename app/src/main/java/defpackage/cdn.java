package defpackage;

/* renamed from: cdn  reason: default package */
/* compiled from: PG */
public final class cdn extends cdh {
    private final cdg a;
    private final cdg b;
    private final cdg c;
    private final cdg d;
    private final cdg e;

    public cdn(cdg cdg, cdg cdg2, cdg cdg3, cdg cdg4, cdg cdg5) {
        this.a = cdg;
        this.b = cdg2;
        this.c = cdg3;
        this.d = cdg4;
        this.e = cdg5;
    }

    @Override // defpackage.cdh
    public final cdg a() {
        return this.a;
    }

    @Override // defpackage.cdh
    public final cdg b() {
        return this.b;
    }

    @Override // defpackage.cdh
    public final cdg c() {
        return this.c;
    }

    @Override // defpackage.cdh
    public final cdg d() {
        return this.d;
    }

    @Override // defpackage.cdh
    public final cdg e() {
        return this.e;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        return new StringBuilder(String.valueOf(valueOf).length() + 172 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length()).append("AccountMenuClickListeners{myAccountClickListener=").append(valueOf).append(", privacyPolicyClickListener=").append(valueOf2).append(", termsOfServiceClickListener=").append(valueOf3).append(", useAnotherAccountClickListener=").append(valueOf4).append(", manageAccountsClickListener=").append(valueOf5).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cdh)) {
            return false;
        }
        cdh cdh = (cdh) obj;
        return this.a.equals(cdh.a()) && this.b.equals(cdh.b()) && this.c.equals(cdh.c()) && this.d.equals(cdh.d()) && this.e.equals(cdh.e());
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }
}
