package defpackage;

/* renamed from: bua reason: default package */
/* compiled from: PG */
public final class bua extends defpackage.buc {
    private final java.lang.String a;
    private final java.util.List b = null;
    private final java.util.List c = null;
    private final java.lang.String d;
    private final defpackage.bue e;
    private final defpackage.buf f;
    private final java.lang.String g;
    private final java.lang.Long h;
    private final java.lang.String i;
    private final java.lang.String j;
    private final boolean k;
    private final java.lang.Integer l;

    public bua(java.lang.String str, java.lang.String str2, defpackage.bue bue, defpackage.buf buf, java.lang.String str3, java.lang.Long l2, java.lang.String str4, boolean z, java.lang.Integer num) {
        this.a = str;
        this.d = str2;
        this.e = bue;
        this.f = buf;
        this.g = str3;
        this.h = l2;
        this.i = str4;
        this.j = null;
        this.k = z;
        this.l = num;
    }

    public final java.lang.String a() {
        return this.a;
    }

    public final java.util.List b() {
        return null;
    }

    public final java.util.List c() {
        return null;
    }

    public final java.lang.String d() {
        return this.d;
    }

    public final defpackage.bue e() {
        return this.e;
    }

    public final defpackage.buf f() {
        return this.f;
    }

    public final java.lang.String g() {
        return this.g;
    }

    public final java.lang.Long h() {
        return this.h;
    }

    public final java.lang.String i() {
        return this.i;
    }

    public final java.lang.String j() {
        return null;
    }

    public final boolean k() {
        return this.k;
    }

    public final java.lang.Integer l() {
        return this.l;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        java.lang.String valueOf = java.lang.String.valueOf(null);
        java.lang.String valueOf2 = java.lang.String.valueOf(null);
        java.lang.String str2 = this.d;
        java.lang.String valueOf3 = java.lang.String.valueOf(this.e);
        java.lang.String valueOf4 = java.lang.String.valueOf(this.f);
        java.lang.String str3 = this.g;
        java.lang.String valueOf5 = java.lang.String.valueOf(this.h);
        java.lang.String str4 = this.i;
        boolean z = this.k;
        java.lang.String valueOf6 = java.lang.String.valueOf(this.l);
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 242 + java.lang.String.valueOf(valueOf).length() + java.lang.String.valueOf(valueOf2).length() + java.lang.String.valueOf(str2).length() + java.lang.String.valueOf(valueOf3).length() + java.lang.String.valueOf(valueOf4).length() + java.lang.String.valueOf(str3).length() + java.lang.String.valueOf(valueOf5).length() + java.lang.String.valueOf(str4).length() + java.lang.String.valueOf(null).length() + java.lang.String.valueOf(valueOf6).length()).append("ChimeConfig{clientId=").append(str).append(", selectionTokens=").append(valueOf).append(", topics=").append(valueOf2).append(", gcmSenderProjectId=").append(str2).append(", environment=").append(valueOf3).append(", systemTrayNotificationConfig=").append(valueOf4).append(", deviceName=").append(str3).append(", registrationStalenessTimeMs=").append(valueOf5).append(", scheduledTaskService=").append(str4).append(", apiKey=").append(null).append(", tracingEnabled=").append(z).append(", jobSchedulerAllowedIDsRange=").append(valueOf6).append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.buc)) {
            return false;
        }
        defpackage.buc buc = (defpackage.buc) obj;
        if (!this.a.equals(buc.a()) || buc.b() != null || buc.c() != null || !this.d.equals(buc.d()) || !this.e.equals(buc.e()) || (this.f != null ? !this.f.equals(buc.f()) : buc.f() != null) || !this.g.equals(buc.g()) || !this.h.equals(buc.h()) || (this.i != null ? !this.i.equals(buc.i()) : buc.i() != null) || buc.j() != null || this.k != buc.k() || !this.l.equals(buc.l())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 0;
        int hashCode = ((((((this.f == null ? 0 : this.f.hashCode()) ^ ((((((((this.a.hashCode() ^ 1000003) * 1000003) * 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003)) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003;
        if (this.i != null) {
            i2 = this.i.hashCode();
        }
        return (((this.k ? 1231 : 1237) ^ (((hashCode ^ i2) * 1000003) * 1000003)) * 1000003) ^ this.l.hashCode();
    }
}
