package defpackage;

/* renamed from: bvj reason: default package */
/* compiled from: PG */
final class bvj extends defpackage.bvo {
    private final java.lang.Long a;
    private final long b;

    bvj(java.lang.Long l, long j) {
        this.a = l;
        this.b = j;
    }

    /* access modifiers changed from: 0000 */
    public final java.lang.Long a() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public final long b() {
        return this.b;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.a);
        return new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 47).append("Timeout{value=").append(valueOf).append(", startTime=").append(this.b).append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.bvo)) {
            return false;
        }
        defpackage.bvo bvo = (defpackage.bvo) obj;
        if (this.a != null ? this.a.equals(bvo.a()) : bvo.a() == null) {
            if (this.b == bvo.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a == null ? 0 : this.a.hashCode()) ^ 1000003) * 1000003) ^ ((int) ((this.b >>> 32) ^ this.b));
    }
}
