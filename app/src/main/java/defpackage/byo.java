package defpackage;

/* renamed from: byo  reason: default package */
/* compiled from: PG */
public final class byo extends byq {
    private final String a;
    private final String b;
    private final bul c;
    private final Integer d;
    private final Integer e;

    public byo(String str, String str2, bul bul, Integer num, Integer num2) {
        this.a = str;
        this.b = str2;
        this.c = bul;
        this.d = num;
        this.e = num2;
    }

    @Override // defpackage.byq
    public final String a() {
        return this.a;
    }

    @Override // defpackage.byq
    public final String b() {
        return this.b;
    }

    @Override // defpackage.byq
    public final bul c() {
        return this.c;
    }

    @Override // defpackage.byq
    public final Integer d() {
        return this.d;
    }

    @Override // defpackage.byq
    public final Integer e() {
        return this.e;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        return new StringBuilder(String.valueOf(str).length() + 61 + String.valueOf(str2).length() + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length()).append("ChimeMedia{originalUrl=").append(str).append(", fifeUrl=").append(str2).append(", account=").append(valueOf).append(", width=").append(valueOf2).append(", height=").append(valueOf3).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof byq)) {
            return false;
        }
        byq byq = (byq) obj;
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
