package defpackage;

/* renamed from: bub reason: default package */
/* compiled from: PG */
public final class bub extends defpackage.buf {
    private final java.lang.Integer a;
    private final java.lang.Integer b;
    private final java.lang.Integer c = null;
    private final boolean d;
    private final android.net.Uri e;
    private final boolean f;
    private final boolean g;
    private final java.lang.Integer h;
    private final java.lang.String i;
    private final java.lang.String j;
    private final java.lang.String k;

    public bub(java.lang.Integer num, java.lang.Integer num2, boolean z, boolean z2, boolean z3, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.a = num;
        this.b = num2;
        this.d = z;
        this.e = null;
        this.f = z2;
        this.g = z3;
        this.h = null;
        this.i = str;
        this.j = str2;
        this.k = str3;
    }

    public final java.lang.Integer a() {
        return this.a;
    }

    public final java.lang.Integer b() {
        return this.b;
    }

    public final java.lang.Integer c() {
        return null;
    }

    public final boolean d() {
        return this.d;
    }

    public final android.net.Uri e() {
        return null;
    }

    public final boolean f() {
        return this.f;
    }

    public final boolean g() {
        return this.g;
    }

    public final java.lang.Integer h() {
        return null;
    }

    public final java.lang.String i() {
        return this.i;
    }

    public final java.lang.String j() {
        return this.j;
    }

    public final java.lang.String k() {
        return this.k;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.a);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.b);
        java.lang.String valueOf3 = java.lang.String.valueOf(null);
        boolean z = this.d;
        java.lang.String valueOf4 = java.lang.String.valueOf(null);
        boolean z2 = this.f;
        boolean z3 = this.g;
        java.lang.String valueOf5 = java.lang.String.valueOf(null);
        java.lang.String str = this.i;
        java.lang.String str2 = this.j;
        java.lang.String str3 = this.k;
        return new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 249 + java.lang.String.valueOf(valueOf2).length() + java.lang.String.valueOf(valueOf3).length() + java.lang.String.valueOf(valueOf4).length() + java.lang.String.valueOf(valueOf5).length() + java.lang.String.valueOf(str).length() + java.lang.String.valueOf(str2).length() + java.lang.String.valueOf(str3).length()).append("SystemTrayNotificationConfig{iconResourceId=").append(valueOf).append(", appNameResourceId=").append(valueOf2).append(", colorResourceId=").append(valueOf3).append(", soundEnabled=").append(z).append(", ringtone=").append(valueOf4).append(", vibrationEnabled=").append(z2).append(", lightsEnabled=").append(z3).append(", ledColor=").append(valueOf5).append(", notificationClickedActivity=").append(str).append(", notificationRemovedReceiver=").append(str2).append(", defaultChannelId=").append(str3).append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.buf)) {
            return false;
        }
        defpackage.buf buf = (defpackage.buf) obj;
        if (this.a.equals(buf.a()) && this.b.equals(buf.b()) && buf.c() == null && this.d == buf.d() && buf.e() == null && this.f == buf.f() && this.g == buf.g() && buf.h() == null && (this.i != null ? this.i.equals(buf.i()) : buf.i() == null) && (this.j != null ? this.j.equals(buf.j()) : buf.j() == null)) {
            if (this.k == null) {
                if (buf.k() == null) {
                    return true;
                }
            } else if (this.k.equals(buf.k())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i3 = 1231;
        int i4 = 0;
        int hashCode = ((this.d ? 1231 : 1237) ^ (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) * 1000003)) * 1000003 * 1000003;
        if (this.f) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        int i5 = (i2 ^ hashCode) * 1000003;
        if (!this.g) {
            i3 = 1237;
        }
        int hashCode2 = ((this.j == null ? 0 : this.j.hashCode()) ^ (((this.i == null ? 0 : this.i.hashCode()) ^ (((i5 ^ i3) * 1000003) * 1000003)) * 1000003)) * 1000003;
        if (this.k != null) {
            i4 = this.k.hashCode();
        }
        return hashCode2 ^ i4;
    }
}
