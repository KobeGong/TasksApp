package defpackage;

/* renamed from: ebt reason: default package */
/* compiled from: PG */
public final class ebt extends defpackage.ebx {
    private final defpackage.eby b;
    private final long c;
    private final long d;
    private final long e;

    public ebt(defpackage.eby eby, long j, long j2, long j3) {
        this.b = eby;
        this.c = j;
        this.d = j2;
        this.e = j3;
    }

    public final defpackage.eby a() {
        return this.b;
    }

    public final long b() {
        return this.c;
    }

    public final long c() {
        return this.d;
    }

    public final long d() {
        return this.e;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.b);
        long j = this.c;
        long j2 = this.d;
        return new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 141).append("MessageEvent{type=").append(valueOf).append(", messageId=").append(j).append(", uncompressedMessageSize=").append(j2).append(", compressedMessageSize=").append(this.e).append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.ebx)) {
            return false;
        }
        defpackage.ebx ebx = (defpackage.ebx) obj;
        if (this.b.equals(ebx.a()) && this.c == ebx.b() && this.d == ebx.c() && this.e == ebx.d()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ ((int) ((this.c >>> 32) ^ this.c))) * 1000003) ^ ((int) ((this.d >>> 32) ^ this.d))) * 1000003) ^ ((int) ((this.e >>> 32) ^ this.e));
    }
}
