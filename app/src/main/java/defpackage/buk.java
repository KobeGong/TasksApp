package defpackage;

import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: buk  reason: default package */
/* compiled from: PG */
public final class buk extends buv {
    private final String a;
    private final dge b;
    private final dfu c;
    private final dgj d;
    private final Long e;
    private final Long f;
    private final dfn g;
    private final List h;
    private final dgu i;
    private final String j;
    private final String k;
    private final Long l;

    buk(String str, dge dge, dfu dfu, dgj dgj, Long l2, Long l3, dfn dfn, List list, dgu dgu, String str2, String str3, Long l4) {
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

    @Override // defpackage.buv
    public final String a() {
        return this.a;
    }

    @Override // defpackage.buv
    public final dge b() {
        return this.b;
    }

    @Override // defpackage.buv
    public final dfu c() {
        return this.c;
    }

    @Override // defpackage.buv
    public final dgj d() {
        return this.d;
    }

    @Override // defpackage.buv
    public final Long e() {
        return this.e;
    }

    @Override // defpackage.buv
    public final Long f() {
        return this.f;
    }

    @Override // defpackage.buv
    public final dfn g() {
        return this.g;
    }

    @Override // defpackage.buv
    public final List h() {
        return this.h;
    }

    @Override // defpackage.buv
    public final dgu i() {
        return this.i;
    }

    @Override // defpackage.buv
    public final String j() {
        return this.j;
    }

    @Override // defpackage.buv
    public final String k() {
        return this.k;
    }

    @Override // defpackage.buv
    public final Long l() {
        return this.l;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        String valueOf6 = String.valueOf(this.g);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.i);
        String str2 = this.j;
        String str3 = this.k;
        String valueOf9 = String.valueOf(this.l);
        return new StringBuilder(String.valueOf(str).length() + 230 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length() + String.valueOf(valueOf8).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(valueOf9).length()).append("ChimeThread{id=").append(str).append(", readState=").append(valueOf).append(", countBehavior=").append(valueOf2).append(", systemTrayBehavior=").append(valueOf3).append(", lastUpdatedVersion=").append(valueOf4).append(", lastNotificationVersion=").append(valueOf5).append(", androidSdkMessage=").append(valueOf6).append(", notificationMetadataList=").append(valueOf7).append(", payload=").append(valueOf8).append(", updateThreadStateToken=").append(str2).append(", groupId=").append(str3).append(", expirationTimestampUsec=").append(valueOf9).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof buv)) {
            return false;
        }
        buv buv = (buv) obj;
        return this.a.equals(buv.a()) && this.b.equals(buv.b()) && this.c.equals(buv.c()) && this.d.equals(buv.d()) && this.e.equals(buv.e()) && this.f.equals(buv.f()) && this.g.equals(buv.g()) && (this.h != null ? this.h.equals(buv.h()) : buv.h() == null) && (this.i != null ? this.i.equals(buv.i()) : buv.i() == null) && (this.j != null ? this.j.equals(buv.j()) : buv.j() == null) && this.k.equals(buv.k()) && this.l.equals(buv.l());
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
