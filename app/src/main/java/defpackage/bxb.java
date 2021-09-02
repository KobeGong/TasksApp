package defpackage;

/* renamed from: bxb reason: default package */
/* compiled from: PG */
final class bxb extends defpackage.bxf {
    private final int a;
    private final java.lang.String b;
    private final byte[] c;
    private final java.util.Map d;
    private final java.lang.Throwable e;

    bxb(int i, java.lang.String str, byte[] bArr, java.util.Map map, java.lang.Throwable th) {
        this.a = i;
        this.b = str;
        this.c = bArr;
        this.d = map;
        this.e = th;
    }

    public final int a() {
        return this.a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final byte[] c() {
        return this.c;
    }

    public final java.util.Map d() {
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    public final java.lang.Throwable e() {
        return this.e;
    }

    public final java.lang.String toString() {
        int i = this.a;
        java.lang.String str = this.b;
        java.lang.String arrays = java.util.Arrays.toString(this.c);
        java.lang.String valueOf = java.lang.String.valueOf(this.d);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.e);
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 95 + java.lang.String.valueOf(arrays).length() + java.lang.String.valueOf(valueOf).length() + java.lang.String.valueOf(valueOf2).length()).append("ChimeHttpResponse{statusCode=").append(i).append(", statusMessage=").append(str).append(", bytes=").append(arrays).append(", responseHeaders=").append(valueOf).append(", exception=").append(valueOf2).append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.bxf)) {
            return false;
        }
        defpackage.bxf bxf = (defpackage.bxf) obj;
        if (this.a == bxf.a() && (this.b != null ? this.b.equals(bxf.b()) : bxf.b() == null)) {
            if (java.util.Arrays.equals(this.c, bxf instanceof defpackage.bxb ? ((defpackage.bxb) bxf).c : bxf.c()) && this.d.equals(bxf.d()) && (this.e != null ? this.e.equals(bxf.e()) : bxf.e() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((this.b == null ? 0 : this.b.hashCode()) ^ ((this.a ^ 1000003) * 1000003)) * 1000003) ^ java.util.Arrays.hashCode(this.c)) * 1000003) ^ this.d.hashCode()) * 1000003;
        if (this.e != null) {
            i = this.e.hashCode();
        }
        return hashCode ^ i;
    }
}
