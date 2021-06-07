package defpackage;

/* renamed from: bui  reason: default package */
/* compiled from: PG */
public final class bui extends buq {
    private final String a;
    private final int b;
    private final String c;
    private final dgm d;
    private final dgu e;

    public bui(String str, int i, String str2, dgm dgm, dgu dgu) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = dgm;
        this.e = dgu;
    }

    @Override // defpackage.buq
    public final String a() {
        return this.a;
    }

    @Override // defpackage.buq
    public final int b() {
        return this.b;
    }

    @Override // defpackage.buq
    public final String c() {
        return this.c;
    }

    @Override // defpackage.buq
    public final dgm d() {
        return this.d;
    }

    @Override // defpackage.buq
    public final dgu e() {
        return this.e;
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        String str2 = this.c;
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        return new StringBuilder(String.valueOf(str).length() + 99 + String.valueOf(str2).length() + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length()).append("ChimeNotificationAction{actionId=").append(str).append(", iconResourceId=").append(i).append(", text=").append(str2).append(", threadStateUpdate=").append(valueOf).append(", payload=").append(valueOf2).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof buq)) {
            return false;
        }
        buq buq = (buq) obj;
        if (this.a.equals(buq.a()) && this.b == buq.b() && this.c.equals(buq.c()) && this.d.equals(buq.d())) {
            if (this.e == null) {
                if (buq.e() == null) {
                    return true;
                }
            } else if (this.e.equals(buq.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.e == null ? 0 : this.e.hashCode()) ^ ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003);
    }
}
