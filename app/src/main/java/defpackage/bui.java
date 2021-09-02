package defpackage;

/* renamed from: bui reason: default package */
/* compiled from: PG */
public final class bui extends defpackage.buq {
    private final java.lang.String a;
    private final int b;
    private final java.lang.String c;
    private final defpackage.dgm d;
    private final defpackage.dgu e;

    public bui(java.lang.String str, int i, java.lang.String str2, defpackage.dgm dgm, defpackage.dgu dgu) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = dgm;
        this.e = dgu;
    }

    public final java.lang.String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final java.lang.String c() {
        return this.c;
    }

    public final defpackage.dgm d() {
        return this.d;
    }

    public final defpackage.dgu e() {
        return this.e;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        int i = this.b;
        java.lang.String str2 = this.c;
        java.lang.String valueOf = java.lang.String.valueOf(this.d);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.e);
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 99 + java.lang.String.valueOf(str2).length() + java.lang.String.valueOf(valueOf).length() + java.lang.String.valueOf(valueOf2).length()).append("ChimeNotificationAction{actionId=").append(str).append(", iconResourceId=").append(i).append(", text=").append(str2).append(", threadStateUpdate=").append(valueOf).append(", payload=").append(valueOf2).append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.buq)) {
            return false;
        }
        defpackage.buq buq = (defpackage.buq) obj;
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
