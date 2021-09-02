package defpackage;

/* renamed from: ccp reason: default package */
/* compiled from: PG */
final class ccp extends defpackage.ccr {
    private final defpackage.djo a;
    private final java.lang.Throwable b;
    private final boolean c;

    ccp(defpackage.djo djo, java.lang.Throwable th, boolean z) {
        this.a = djo;
        this.b = th;
        this.c = z;
    }

    public final defpackage.djo a() {
        return this.a;
    }

    public final java.lang.Throwable b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.a);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.b);
        return new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 59 + java.lang.String.valueOf(valueOf2).length()).append("ChimeRpcResponse{response=").append(valueOf).append(", error=").append(valueOf2).append(", isRetryableError=").append(this.c).append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.ccr)) {
            return false;
        }
        defpackage.ccr ccr = (defpackage.ccr) obj;
        if (this.a != null ? this.a.equals(ccr.a()) : ccr.a() == null) {
            if (this.b != null ? this.b.equals(ccr.b()) : ccr.b() == null) {
                if (this.c == ccr.c()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.a == null ? 0 : this.a.hashCode()) ^ 1000003) * 1000003;
        if (this.b != null) {
            i = this.b.hashCode();
        }
        return (this.c ? 1231 : 1237) ^ ((hashCode ^ i) * 1000003);
    }
}
