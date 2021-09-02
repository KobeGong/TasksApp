package defpackage;

/* renamed from: cvf reason: default package */
/* compiled from: PG */
public final class cvf {
    public final defpackage.cvz a;
    public final java.lang.String b;

    public cvf(defpackage.cvz cvz, java.lang.String str) {
        this.a = (defpackage.cvz) defpackage.cub.a((java.lang.Object) cvz, "parser");
        this.b = (java.lang.String) defpackage.cub.a((java.lang.Object) str, "message");
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.cvf)) {
            return false;
        }
        defpackage.cvf cvf = (defpackage.cvf) obj;
        if (!this.a.equals(cvf.a) || !this.b.equals(cvf.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
}
