package defpackage;

/* renamed from: buj reason: default package */
/* compiled from: PG */
final class buj extends defpackage.bus {
    private final java.lang.Long a;
    private final java.lang.Integer b;
    private final byte[] c;

    buj(java.lang.Long l, java.lang.Integer num, byte[] bArr) {
        this.a = l;
        this.b = num;
        this.c = bArr;
    }

    public final java.lang.Long a() {
        return this.a;
    }

    public final java.lang.Integer b() {
        return this.b;
    }

    public final byte[] c() {
        return this.c;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.a);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.b);
        java.lang.String arrays = java.util.Arrays.toString(this.c);
        return new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 38 + java.lang.String.valueOf(valueOf2).length() + java.lang.String.valueOf(arrays).length()).append("ChimeTaskData{id=").append(valueOf).append(", jobType=").append(valueOf2).append(", payload=").append(arrays).append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.bus)) {
            return false;
        }
        defpackage.bus bus = (defpackage.bus) obj;
        if (this.a.equals(bus.a()) && this.b.equals(bus.b())) {
            if (java.util.Arrays.equals(this.c, bus instanceof defpackage.buj ? ((defpackage.buj) bus).c : bus.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ java.util.Arrays.hashCode(this.c);
    }
}
