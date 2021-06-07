package defpackage;

/* renamed from: ebt  reason: default package */
/* compiled from: PG */
public final class ebt extends ebx {
    private final eby b;
    private final long c;
    private final long d;
    private final long e;

    public ebt(eby eby, long j, long j2, long j3) {
        this.b = eby;
        this.c = j;
        this.d = j2;
        this.e = j3;
    }

    @Override // defpackage.ebx
    public final eby a() {
        return this.b;
    }

    @Override // defpackage.ebx
    public final long b() {
        return this.c;
    }

    @Override // defpackage.ebx
    public final long c() {
        return this.d;
    }

    @Override // defpackage.ebx
    public final long d() {
        return this.e;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        long j = this.c;
        long j2 = this.d;
        return new StringBuilder(String.valueOf(valueOf).length() + 141).append("MessageEvent{type=").append(valueOf).append(", messageId=").append(j).append(", uncompressedMessageSize=").append(j2).append(", compressedMessageSize=").append(this.e).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ebx)) {
            return false;
        }
        ebx ebx = (ebx) obj;
        return this.b.equals(ebx.a()) && this.c == ebx.b() && this.d == ebx.c() && this.e == ebx.d();
    }

    public final int hashCode() {
        return ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ ((int) ((this.c >>> 32) ^ this.c))) * 1000003) ^ ((int) ((this.d >>> 32) ^ this.d))) * 1000003) ^ ((int) ((this.e >>> 32) ^ this.e));
    }
}
