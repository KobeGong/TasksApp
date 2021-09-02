package defpackage;

/* renamed from: crg reason: default package */
/* compiled from: PG */
public final class crg implements java.io.Serializable {
    public static final long serialVersionUID = -8514239465808977353L;
    public final java.lang.String a;

    public crg(java.lang.String str) {
        this.a = str;
    }

    public final int hashCode() {
        return java.util.Objects.hash(new java.lang.Object[]{this.a, null});
    }

    public final java.lang.String toString() {
        return defpackage.cky.b((java.lang.Object) this).a("tokenValue", (java.lang.Object) this.a).a("expirationTimeMillis", (java.lang.Object) null).toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.crg)) {
            return false;
        }
        if (!java.util.Objects.equals(this.a, ((defpackage.crg) obj).a) || !java.util.Objects.equals(null, null)) {
            return false;
        }
        return true;
    }
}
