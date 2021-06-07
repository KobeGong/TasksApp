package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: ccp  reason: default package */
/* compiled from: PG */
public final class ccp extends ccr {
    private final djo a;
    private final Throwable b;
    private final boolean c;

    ccp(djo djo, Throwable th, boolean z) {
        this.a = djo;
        this.b = th;
        this.c = z;
    }

    @Override // defpackage.ccr
    public final djo a() {
        return this.a;
    }

    @Override // defpackage.ccr
    public final Throwable b() {
        return this.b;
    }

    @Override // defpackage.ccr
    public final boolean c() {
        return this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        return new StringBuilder(String.valueOf(valueOf).length() + 59 + String.valueOf(valueOf2).length()).append("ChimeRpcResponse{response=").append(valueOf).append(", error=").append(valueOf2).append(", isRetryableError=").append(this.c).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ccr)) {
            return false;
        }
        ccr ccr = (ccr) obj;
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
