package defpackage;

/* renamed from: cdn reason: default package */
/* compiled from: PG */
public final class cdn extends defpackage.cdh {
    private final defpackage.cdg a;
    private final defpackage.cdg b;
    private final defpackage.cdg c;
    private final defpackage.cdg d;
    private final defpackage.cdg e;

    public cdn(defpackage.cdg cdg, defpackage.cdg cdg2, defpackage.cdg cdg3, defpackage.cdg cdg4, defpackage.cdg cdg5) {
        this.a = cdg;
        this.b = cdg2;
        this.c = cdg3;
        this.d = cdg4;
        this.e = cdg5;
    }

    public final defpackage.cdg a() {
        return this.a;
    }

    public final defpackage.cdg b() {
        return this.b;
    }

    public final defpackage.cdg c() {
        return this.c;
    }

    public final defpackage.cdg d() {
        return this.d;
    }

    public final defpackage.cdg e() {
        return this.e;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.a);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.b);
        java.lang.String valueOf3 = java.lang.String.valueOf(this.c);
        java.lang.String valueOf4 = java.lang.String.valueOf(this.d);
        java.lang.String valueOf5 = java.lang.String.valueOf(this.e);
        return new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 172 + java.lang.String.valueOf(valueOf2).length() + java.lang.String.valueOf(valueOf3).length() + java.lang.String.valueOf(valueOf4).length() + java.lang.String.valueOf(valueOf5).length()).append("AccountMenuClickListeners{myAccountClickListener=").append(valueOf).append(", privacyPolicyClickListener=").append(valueOf2).append(", termsOfServiceClickListener=").append(valueOf3).append(", useAnotherAccountClickListener=").append(valueOf4).append(", manageAccountsClickListener=").append(valueOf5).append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.cdh)) {
            return false;
        }
        defpackage.cdh cdh = (defpackage.cdh) obj;
        if (!this.a.equals(cdh.a()) || !this.b.equals(cdh.b()) || !this.c.equals(cdh.c()) || !this.d.equals(cdh.d()) || !this.e.equals(cdh.e())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }
}
