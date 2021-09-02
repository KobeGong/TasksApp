package defpackage;

/* renamed from: buh reason: default package */
/* compiled from: PG */
final class buh extends defpackage.bul {
    private final java.lang.Long a;
    private final java.lang.String b;
    private final java.lang.String c;
    private final java.lang.Long d;
    private final java.lang.Long e;
    private final defpackage.btk f;
    private final java.lang.Long g;
    private final int h;

    buh(java.lang.Long l, java.lang.String str, java.lang.String str2, java.lang.Long l2, java.lang.Long l3, defpackage.btk btk, java.lang.Long l4, int i) {
        this.a = l;
        this.b = str;
        this.c = str2;
        this.d = l2;
        this.e = l3;
        this.f = btk;
        this.g = l4;
        this.h = i;
    }

    public final java.lang.Long a() {
        return this.a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final java.lang.String c() {
        return this.c;
    }

    public final java.lang.Long d() {
        return this.d;
    }

    public final java.lang.Long e() {
        return this.e;
    }

    public final defpackage.btk f() {
        return this.f;
    }

    public final java.lang.Long g() {
        return this.g;
    }

    public final int h() {
        return this.h;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.a);
        java.lang.String str = this.b;
        java.lang.String str2 = this.c;
        java.lang.String valueOf2 = java.lang.String.valueOf(this.d);
        java.lang.String valueOf3 = java.lang.String.valueOf(this.e);
        java.lang.String valueOf4 = java.lang.String.valueOf(this.f);
        java.lang.String valueOf5 = java.lang.String.valueOf(this.g);
        return new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 165 + java.lang.String.valueOf(str).length() + java.lang.String.valueOf(str2).length() + java.lang.String.valueOf(valueOf2).length() + java.lang.String.valueOf(valueOf3).length() + java.lang.String.valueOf(valueOf4).length() + java.lang.String.valueOf(valueOf5).length()).append("ChimeAccount{id=").append(valueOf).append(", accountName=").append(str).append(", obfuscatedGaiaId=").append(str2).append(", syncVersion=").append(valueOf2).append(", pageVersion=").append(valueOf3).append(", registrationStatus=").append(valueOf4).append(", lastRegistrationTimeMs=").append(valueOf5).append(", lastRegistrationRequestHash=").append(this.h).append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.bul)) {
            return false;
        }
        defpackage.bul bul = (defpackage.bul) obj;
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

    public final defpackage.bum i() {
        return new defpackage.bum(this);
    }
}
