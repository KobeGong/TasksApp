package defpackage;

/* access modifiers changed from: package-private */
@Deprecated
/* renamed from: ebu  reason: default package */
/* compiled from: PG */
public final class ebu extends ebz {
    private final eaj b = null;
    private final ecb c;
    private final long d;
    private final long e;
    private final long f;

    ebu(ecb ecb, long j, long j2, long j3) {
        this.c = ecb;
        this.d = j;
        this.e = j2;
        this.f = j3;
    }

    @Override // defpackage.ebz
    public final eaj a() {
        return null;
    }

    @Override // defpackage.ebz
    public final ecb b() {
        return this.c;
    }

    @Override // defpackage.ebz
    public final long c() {
        return this.d;
    }

    @Override // defpackage.ebz
    public final long d() {
        return this.e;
    }

    @Override // defpackage.ebz
    public final long e() {
        return this.f;
    }

    public final String toString() {
        String valueOf = String.valueOf((Object) null);
        String valueOf2 = String.valueOf(this.c);
        long j = this.d;
        long j2 = this.e;
        return new StringBuilder(String.valueOf(valueOf).length() + 159 + String.valueOf(valueOf2).length()).append("NetworkEvent{kernelTimestamp=").append(valueOf).append(", type=").append(valueOf2).append(", messageId=").append(j).append(", uncompressedMessageSize=").append(j2).append(", compressedMessageSize=").append(this.f).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ebz)) {
            return false;
        }
        ebz ebz = (ebz) obj;
        return ebz.a() == null && this.c.equals(ebz.b()) && this.d == ebz.c() && this.e == ebz.d() && this.f == ebz.e();
    }

    public final int hashCode() {
        return ((((((-721379959 ^ this.c.hashCode()) * 1000003) ^ ((int) ((this.d >>> 32) ^ this.d))) * 1000003) ^ ((int) ((this.e >>> 32) ^ this.e))) * 1000003) ^ ((int) ((this.f >>> 32) ^ this.f));
    }
}
