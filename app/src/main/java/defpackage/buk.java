package defpackage;

/* renamed from: buk reason: default package */
/* compiled from: PG */
final class buk extends defpackage.buv {
    private final java.lang.String a;
    private final defpackage.dge b;
    private final defpackage.dfu c;
    private final defpackage.dgj d;
    private final java.lang.Long e;
    private final java.lang.Long f;
    private final defpackage.dfn g;
    private final java.util.List h;
    private final defpackage.dgu i;
    private final java.lang.String j;
    private final java.lang.String k;
    private final java.lang.Long l;

    buk(java.lang.String str, defpackage.dge dge, defpackage.dfu dfu, defpackage.dgj dgj, java.lang.Long l2, java.lang.Long l3, defpackage.dfn dfn, java.util.List list, defpackage.dgu dgu, java.lang.String str2, java.lang.String str3, java.lang.Long l4) {
        this.a = str;
        this.b = dge;
        this.c = dfu;
        this.d = dgj;
        this.e = l2;
        this.f = l3;
        this.g = dfn;
        this.h = list;
        this.i = dgu;
        this.j = str2;
        this.k = str3;
        this.l = l4;
    }

    public final java.lang.String a() {
        return this.a;
    }

    public final defpackage.dge b() {
        return this.b;
    }

    public final defpackage.dfu c() {
        return this.c;
    }

    public final defpackage.dgj d() {
        return this.d;
    }

    public final java.lang.Long e() {
        return this.e;
    }

    public final java.lang.Long f() {
        return this.f;
    }

    public final defpackage.dfn g() {
        return this.g;
    }

    public final java.util.List h() {
        return this.h;
    }

    public final defpackage.dgu i() {
        return this.i;
    }

    public final java.lang.String j() {
        return this.j;
    }

    public final java.lang.String k() {
        return this.k;
    }

    public final java.lang.Long l() {
        return this.l;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        java.lang.String valueOf = java.lang.String.valueOf(this.b);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.c);
        java.lang.String valueOf3 = java.lang.String.valueOf(this.d);
        java.lang.String valueOf4 = java.lang.String.valueOf(this.e);
        java.lang.String valueOf5 = java.lang.String.valueOf(this.f);
        java.lang.String valueOf6 = java.lang.String.valueOf(this.g);
        java.lang.String valueOf7 = java.lang.String.valueOf(this.h);
        java.lang.String valueOf8 = java.lang.String.valueOf(this.i);
        java.lang.String str2 = this.j;
        java.lang.String str3 = this.k;
        java.lang.String valueOf9 = java.lang.String.valueOf(this.l);
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 230 + java.lang.String.valueOf(valueOf).length() + java.lang.String.valueOf(valueOf2).length() + java.lang.String.valueOf(valueOf3).length() + java.lang.String.valueOf(valueOf4).length() + java.lang.String.valueOf(valueOf5).length() + java.lang.String.valueOf(valueOf6).length() + java.lang.String.valueOf(valueOf7).length() + java.lang.String.valueOf(valueOf8).length() + java.lang.String.valueOf(str2).length() + java.lang.String.valueOf(str3).length() + java.lang.String.valueOf(valueOf9).length()).append("ChimeThread{id=").append(str).append(", readState=").append(valueOf).append(", countBehavior=").append(valueOf2).append(", systemTrayBehavior=").append(valueOf3).append(", lastUpdatedVersion=").append(valueOf4).append(", lastNotificationVersion=").append(valueOf5).append(", androidSdkMessage=").append(valueOf6).append(", notificationMetadataList=").append(valueOf7).append(", payload=").append(valueOf8).append(", updateThreadStateToken=").append(str2).append(", groupId=").append(str3).append(", expirationTimestampUsec=").append(valueOf9).append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.buv)) {
            return false;
        }
        defpackage.buv buv = (defpackage.buv) obj;
        if (!this.a.equals(buv.a()) || !this.b.equals(buv.b()) || !this.c.equals(buv.c()) || !this.d.equals(buv.d()) || !this.e.equals(buv.e()) || !this.f.equals(buv.f()) || !this.g.equals(buv.g()) || (this.h != null ? !this.h.equals(buv.h()) : buv.h() != null) || (this.i != null ? !this.i.equals(buv.i()) : buv.i() != null) || (this.j != null ? !this.j.equals(buv.j()) : buv.j() != null) || !this.k.equals(buv.k()) || !this.l.equals(buv.l())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 0;
        int hashCode = ((this.i == null ? 0 : this.i.hashCode()) ^ (((this.h == null ? 0 : this.h.hashCode()) ^ ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003)) * 1000003)) * 1000003;
        if (this.j != null) {
            i2 = this.j.hashCode();
        }
        return ((((hashCode ^ i2) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode();
    }
}
