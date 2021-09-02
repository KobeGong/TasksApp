package defpackage;

/* renamed from: ctr reason: default package */
/* compiled from: PG */
final class ctr {
    private final defpackage.ctt a;
    private final java.lang.String b;

    ctr(defpackage.ctt ctt, java.lang.String str) {
        this.a = (defpackage.ctt) defpackage.cub.a((java.lang.Object) ctt, "log site");
        this.b = (java.lang.String) defpackage.cub.a((java.lang.Object) str, "log site key");
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ctr)) {
            return false;
        }
        defpackage.ctr ctr = (defpackage.ctr) obj;
        if (!this.a.equals(ctr.a) || !this.b.equals(ctr.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.a);
        java.lang.String str = this.b;
        return new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 46 + java.lang.String.valueOf(str).length()).append("SpecializedLogSiteKey{ logSite=").append(valueOf).append(", extraKey='").append(str).append("' }").toString();
    }
}
