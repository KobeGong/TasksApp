package defpackage;

import android.net.Uri;

/* renamed from: bub  reason: default package */
/* compiled from: PG */
public final class bub extends buf {
    private final Integer a;
    private final Integer b;
    private final Integer c = null;
    private final boolean d;
    private final Uri e;
    private final boolean f;
    private final boolean g;
    private final Integer h;
    private final String i;
    private final String j;
    private final String k;

    public bub(Integer num, Integer num2, boolean z, boolean z2, boolean z3, String str, String str2, String str3) {
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

    @Override // defpackage.buf
    public final Integer a() {
        return this.a;
    }

    @Override // defpackage.buf
    public final Integer b() {
        return this.b;
    }

    @Override // defpackage.buf
    public final Integer c() {
        return null;
    }

    @Override // defpackage.buf
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.buf
    public final Uri e() {
        return null;
    }

    @Override // defpackage.buf
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.buf
    public final boolean g() {
        return this.g;
    }

    @Override // defpackage.buf
    public final Integer h() {
        return null;
    }

    @Override // defpackage.buf
    public final String i() {
        return this.i;
    }

    @Override // defpackage.buf
    public final String j() {
        return this.j;
    }

    @Override // defpackage.buf
    public final String k() {
        return this.k;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf((Object) null);
        boolean z = this.d;
        String valueOf4 = String.valueOf((Object) null);
        boolean z2 = this.f;
        boolean z3 = this.g;
        String valueOf5 = String.valueOf((Object) null);
        String str = this.i;
        String str2 = this.j;
        String str3 = this.k;
        return new StringBuilder(String.valueOf(valueOf).length() + 249 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length() + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length()).append("SystemTrayNotificationConfig{iconResourceId=").append(valueOf).append(", appNameResourceId=").append(valueOf2).append(", colorResourceId=").append(valueOf3).append(", soundEnabled=").append(z).append(", ringtone=").append(valueOf4).append(", vibrationEnabled=").append(z2).append(", lightsEnabled=").append(z3).append(", ledColor=").append(valueOf5).append(", notificationClickedActivity=").append(str).append(", notificationRemovedReceiver=").append(str2).append(", defaultChannelId=").append(str3).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof buf)) {
            return false;
        }
        buf buf = (buf) obj;
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
