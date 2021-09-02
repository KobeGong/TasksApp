package defpackage;

/* renamed from: dnr reason: default package */
/* compiled from: PG */
public final class dnr {
    public final defpackage.dnq a;
    public final defpackage.dpw b;

    public static defpackage.dnr a(defpackage.dnq dnq) {
        defpackage.cld.a(dnq != defpackage.dnq.TRANSIENT_FAILURE, (java.lang.Object) "state is TRANSIENT_ERROR. Use forError() instead");
        return new defpackage.dnr(dnq, defpackage.dpw.b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.dnr)) {
            return false;
        }
        defpackage.dnr dnr = (defpackage.dnr) obj;
        if (!this.a.equals(dnr.a) || !this.b.equals(dnr.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        if (this.b.a()) {
            return this.a.toString();
        }
        java.lang.String valueOf = java.lang.String.valueOf(this.a);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.b);
        return new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 2 + java.lang.String.valueOf(valueOf2).length()).append(valueOf).append("(").append(valueOf2).append(")").toString();
    }

    public dnr(defpackage.dnq dnq, defpackage.dpw dpw) {
        this.a = (defpackage.dnq) defpackage.cld.a((java.lang.Object) dnq, (java.lang.Object) "state is null");
        this.b = (defpackage.dpw) defpackage.cld.a((java.lang.Object) dpw, (java.lang.Object) "status is null");
    }
}
