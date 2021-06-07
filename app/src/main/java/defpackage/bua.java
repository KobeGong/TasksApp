package defpackage;

import java.util.List;

/* renamed from: bua  reason: default package */
/* compiled from: PG */
public final class bua extends buc {
    private final String a;
    private final List b = null;
    private final List c = null;
    private final String d;
    private final bue e;
    private final buf f;
    private final String g;
    private final Long h;
    private final String i;
    private final String j;
    private final boolean k;
    private final Integer l;

    public bua(String str, String str2, bue bue, buf buf, String str3, Long l2, String str4, boolean z, Integer num) {
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

    @Override // defpackage.buc
    public final String a() {
        return this.a;
    }

    @Override // defpackage.buc
    public final List b() {
        return null;
    }

    @Override // defpackage.buc
    public final List c() {
        return null;
    }

    @Override // defpackage.buc
    public final String d() {
        return this.d;
    }

    @Override // defpackage.buc
    public final bue e() {
        return this.e;
    }

    @Override // defpackage.buc
    public final buf f() {
        return this.f;
    }

    @Override // defpackage.buc
    public final String g() {
        return this.g;
    }

    @Override // defpackage.buc
    public final Long h() {
        return this.h;
    }

    @Override // defpackage.buc
    public final String i() {
        return this.i;
    }

    @Override // defpackage.buc
    public final String j() {
        return null;
    }

    @Override // defpackage.buc
    public final boolean k() {
        return this.k;
    }

    @Override // defpackage.buc
    public final Integer l() {
        return this.l;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf((Object) null);
        String valueOf2 = String.valueOf((Object) null);
        String str2 = this.d;
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String str3 = this.g;
        String valueOf5 = String.valueOf(this.h);
        String str4 = this.i;
        boolean z = this.k;
        String valueOf6 = String.valueOf(this.l);
        return new StringBuilder(String.valueOf(str).length() + 242 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length() + String.valueOf(str2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(str3).length() + String.valueOf(valueOf5).length() + String.valueOf(str4).length() + String.valueOf((Object) null).length() + String.valueOf(valueOf6).length()).append("ChimeConfig{clientId=").append(str).append(", selectionTokens=").append(valueOf).append(", topics=").append(valueOf2).append(", gcmSenderProjectId=").append(str2).append(", environment=").append(valueOf3).append(", systemTrayNotificationConfig=").append(valueOf4).append(", deviceName=").append(str3).append(", registrationStalenessTimeMs=").append(valueOf5).append(", scheduledTaskService=").append(str4).append(", apiKey=").append((String) null).append(", tracingEnabled=").append(z).append(", jobSchedulerAllowedIDsRange=").append(valueOf6).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof buc)) {
            return false;
        }
        buc buc = (buc) obj;
        return this.a.equals(buc.a()) && buc.b() == null && buc.c() == null && this.d.equals(buc.d()) && this.e.equals(buc.e()) && (this.f != null ? this.f.equals(buc.f()) : buc.f() == null) && this.g.equals(buc.g()) && this.h.equals(buc.h()) && (this.i != null ? this.i.equals(buc.i()) : buc.i() == null) && buc.j() == null && this.k == buc.k() && this.l.equals(buc.l());
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
