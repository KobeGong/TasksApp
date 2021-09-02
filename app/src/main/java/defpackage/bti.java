package defpackage;

/* renamed from: bti reason: default package */
/* compiled from: PG */
final class bti extends defpackage.btl {
    private final defpackage.btn b;
    private final java.lang.Throwable c;

    bti(defpackage.btn btn, java.lang.Throwable th) {
        this.b = btn;
        this.c = th;
    }

    public final defpackage.btn a() {
        return this.b;
    }

    public final java.lang.Throwable b() {
        return this.c;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.b);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.c);
        return new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 21 + java.lang.String.valueOf(valueOf2).length()).append("Result{code=").append(valueOf).append(", error=").append(valueOf2).append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.btl)) {
            return false;
        }
        defpackage.btl btl = (defpackage.btl) obj;
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
