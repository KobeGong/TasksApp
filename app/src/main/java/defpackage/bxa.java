package defpackage;

/* renamed from: bxa reason: default package */
/* compiled from: PG */
final class bxa extends defpackage.bxd {
    private final java.lang.String a;
    private final byte[] b;
    private final java.lang.String c;
    private final java.util.Map d;

    bxa(java.lang.String str, byte[] bArr, java.lang.String str2, java.util.Map map) {
        this.a = str;
        this.b = bArr;
        this.c = str2;
        this.d = map;
    }

    public final java.lang.String a() {
        return this.a;
    }

    public final byte[] b() {
        return this.b;
    }

    public final java.lang.String c() {
        return this.c;
    }

    public final java.util.Map d() {
        return this.d;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        java.lang.String arrays = java.util.Arrays.toString(this.b);
        java.lang.String str2 = this.c;
        java.lang.String valueOf = java.lang.String.valueOf(this.d);
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 53 + java.lang.String.valueOf(arrays).length() + java.lang.String.valueOf(str2).length() + java.lang.String.valueOf(valueOf).length()).append("ChimeHttpRequest{url=").append(str).append(", body=").append(arrays).append(", contentType=").append(str2).append(", headers=").append(valueOf).append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.bxd)) {
            return false;
        }
        defpackage.bxd bxd = (defpackage.bxd) obj;
        if (this.a.equals(bxd.a())) {
            if (java.util.Arrays.equals(this.b, bxd instanceof defpackage.bxa ? ((defpackage.bxa) bxd).b : bxd.b()) && this.c.equals(bxd.c()) && (this.d != null ? this.d.equals(bxd.d()) : bxd.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d == null ? 0 : this.d.hashCode()) ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ java.util.Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode()) * 1000003);
    }
}
