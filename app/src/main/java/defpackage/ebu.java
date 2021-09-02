package defpackage;

@java.lang.Deprecated
/* renamed from: ebu reason: default package */
/* compiled from: PG */
final class ebu extends defpackage.ebz {
    private final defpackage.eaj b = null;
    private final defpackage.ecb c;
    private final long d;
    private final long e;
    private final long f;

    ebu(defpackage.ecb ecb, long j, long j2, long j3) {
        this.c = ecb;
        this.d = j;
        this.e = j2;
        this.f = j3;
    }

    public final defpackage.eaj a() {
        return null;
    }

    public final defpackage.ecb b() {
        return this.c;
    }

    public final long c() {
        return this.d;
    }

    public final long d() {
        return this.e;
    }

    public final long e() {
        return this.f;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(null);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.c);
        long j = this.d;
        long j2 = this.e;
        return new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 159 + java.lang.String.valueOf(valueOf2).length()).append("NetworkEvent{kernelTimestamp=").append(valueOf).append(", type=").append(valueOf2).append(", messageId=").append(j).append(", uncompressedMessageSize=").append(j2).append(", compressedMessageSize=").append(this.f).append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.ebz)) {
            return false;
        }
        defpackage.ebz ebz = (defpackage.ebz) obj;
        if (ebz.a() == null && this.c.equals(ebz.b()) && this.d == ebz.c() && this.e == ebz.d() && this.f == ebz.e()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((-721379959 ^ this.c.hashCode()) * 1000003) ^ ((int) ((this.d >>> 32) ^ this.d))) * 1000003) ^ ((int) ((this.e >>> 32) ^ this.e))) * 1000003) ^ ((int) ((this.f >>> 32) ^ this.f));
    }
}
