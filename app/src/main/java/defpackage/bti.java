package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: bti  reason: default package */
/* compiled from: PG */
public final class bti extends btl {
    private final btn b;
    private final Throwable c;

    bti(btn btn, Throwable th) {
        this.b = btn;
        this.c = th;
    }

    @Override // defpackage.btl
    public final btn a() {
        return this.b;
    }

    @Override // defpackage.btl
    public final Throwable b() {
        return this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        return new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(valueOf2).length()).append("Result{code=").append(valueOf).append(", error=").append(valueOf2).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof btl)) {
            return false;
        }
        btl btl = (btl) obj;
        if (this.b.equals(btl.a())) {
            if (this.c == null) {
                if (btl.b() == null) {
                    return true;
                }
            } else if (this.c.equals(btl.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.c == null ? 0 : this.c.hashCode()) ^ (1000003 * (this.b.hashCode() ^ 1000003));
    }
}
