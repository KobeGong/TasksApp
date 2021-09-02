package defpackage;

/* renamed from: byo reason: default package */
/* compiled from: PG */
public final class byo extends defpackage.byq {
    private final java.lang.String a;
    private final java.lang.String b;
    private final defpackage.bul c;
    private final java.lang.Integer d;
    private final java.lang.Integer e;

    public byo(java.lang.String str, java.lang.String str2, defpackage.bul bul, java.lang.Integer num, java.lang.Integer num2) {
        this.a = str;
        this.b = str2;
        this.c = bul;
        this.d = num;
        this.e = num2;
    }

    public final java.lang.String a() {
        return this.a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final defpackage.bul c() {
        return this.c;
    }

    public final java.lang.Integer d() {
        return this.d;
    }

    public final java.lang.Integer e() {
        return this.e;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        java.lang.String str2 = this.b;
        java.lang.String valueOf = java.lang.String.valueOf(this.c);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.d);
        java.lang.String valueOf3 = java.lang.String.valueOf(this.e);
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 61 + java.lang.String.valueOf(str2).length() + java.lang.String.valueOf(valueOf).length() + java.lang.String.valueOf(valueOf2).length() + java.lang.String.valueOf(valueOf3).length()).append("ChimeMedia{originalUrl=").append(str).append(", fifeUrl=").append(str2).append(", account=").append(valueOf).append(", width=").append(valueOf2).append(", height=").append(valueOf3).append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.byq)) {
            return false;
        }
        defpackage.byq byq = (defpackage.byq) obj;
        if (this.a.equals(byq.a()) && (this.b != null ? this.b.equals(byq.b()) : byq.b() == null) && (this.c != null ? this.c.equals(byq.c()) : byq.c() == null) && (this.d != null ? this.d.equals(byq.d()) : byq.d() == null)) {
            if (this.e == null) {
                if (byq.e() == null) {
                    return true;
                }
            } else if (this.e.equals(byq.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.d == null ? 0 : this.d.hashCode()) ^ (((this.c == null ? 0 : this.c.hashCode()) ^ (((this.b == null ? 0 : this.b.hashCode()) ^ ((this.a.hashCode() ^ 1000003) * 1000003)) * 1000003)) * 1000003)) * 1000003;
        if (this.e != null) {
            i = this.e.hashCode();
        }
        return hashCode ^ i;
    }
}
