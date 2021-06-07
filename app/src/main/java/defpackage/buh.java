package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: buh  reason: default package */
/* compiled from: PG */
public final class buh extends bul {
    private final Long a;
    private final String b;
    private final String c;
    private final Long d;
    private final Long e;
    private final btk f;
    private final Long g;
    private final int h;

    buh(Long l, String str, String str2, Long l2, Long l3, btk btk, Long l4, int i) {
        this.a = l;
        this.b = str;
        this.c = str2;
        this.d = l2;
        this.e = l3;
        this.f = btk;
        this.g = l4;
        this.h = i;
    }

    @Override // defpackage.bul
    public final Long a() {
        return this.a;
    }

    @Override // defpackage.bul
    public final String b() {
        return this.b;
    }

    @Override // defpackage.bul
    public final String c() {
        return this.c;
    }

    @Override // defpackage.bul
    public final Long d() {
        return this.d;
    }

    @Override // defpackage.bul
    public final Long e() {
        return this.e;
    }

    @Override // defpackage.bul
    public final btk f() {
        return this.f;
    }

    @Override // defpackage.bul
    public final Long g() {
        return this.g;
    }

    @Override // defpackage.bul
    public final int h() {
        return this.h;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String str2 = this.c;
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        return new StringBuilder(String.valueOf(valueOf).length() + 165 + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length()).append("ChimeAccount{id=").append(valueOf).append(", accountName=").append(str).append(", obfuscatedGaiaId=").append(str2).append(", syncVersion=").append(valueOf2).append(", pageVersion=").append(valueOf3).append(", registrationStatus=").append(valueOf4).append(", lastRegistrationTimeMs=").append(valueOf5).append(", lastRegistrationRequestHash=").append(this.h).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bul)) {
            return false;
        }
        bul bul = (bul) obj;
        if (this.a != null ? this.a.equals(bul.a()) : bul.a() == null) {
            if (this.b.equals(bul.b()) && (this.c != null ? this.c.equals(bul.c()) : bul.c() == null) && this.d.equals(bul.d()) && this.e.equals(bul.e()) && this.f.equals(bul.f()) && this.g.equals(bul.g()) && this.h == bul.h()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((this.a == null ? 0 : this.a.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        if (this.c != null) {
            i = this.c.hashCode();
        }
        return ((((((((((hashCode ^ i) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h;
    }

    @Override // defpackage.bul
    public final bum i() {
        return new bum(this);
    }
}
