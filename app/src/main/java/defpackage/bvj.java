package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: bvj  reason: default package */
/* compiled from: PG */
public final class bvj extends bvo {
    private final Long a;
    private final long b;

    bvj(Long l, long j) {
        this.a = l;
        this.b = j;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.bvo
    public final Long a() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.bvo
    public final long b() {
        return this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        return new StringBuilder(String.valueOf(valueOf).length() + 47).append("Timeout{value=").append(valueOf).append(", startTime=").append(this.b).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bvo)) {
            return false;
        }
        bvo bvo = (bvo) obj;
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
