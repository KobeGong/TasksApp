package defpackage;

/* renamed from: cvf  reason: default package */
/* compiled from: PG */
public final class cvf {
    public final cvz a;
    public final String b;

    public cvf(cvz cvz, String str) {
        this.a = (cvz) cub.a(cvz, "parser");
        this.b = (String) cub.a(str, "message");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cvf)) {
            return false;
        }
        cvf cvf = (cvf) obj;
        if (!this.a.equals(cvf.a) || !this.b.equals(cvf.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
}
