package defpackage;

/* renamed from: ctv reason: default package */
/* compiled from: PG */
final class ctv extends defpackage.ctt {
    private final java.lang.String b;
    private final java.lang.String c;
    private final int d;
    private final java.lang.String e;
    private int f = 0;

    ctv(java.lang.String str, java.lang.String str2, int i, java.lang.String str3) {
        this.b = (java.lang.String) defpackage.cub.a((java.lang.Object) str, "class name");
        this.c = (java.lang.String) defpackage.cub.a((java.lang.Object) str2, "method name");
        this.d = 105;
        this.e = str3;
    }

    public final java.lang.String a() {
        return this.b.replace('/', '.');
    }

    public final java.lang.String b() {
        return this.c;
    }

    public final int c() {
        return this.d & 65535;
    }

    public final java.lang.String d() {
        return this.e;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ctv)) {
            return false;
        }
        defpackage.ctv ctv = (defpackage.ctv) obj;
        if (!this.b.equals(ctv.b) || !this.c.equals(ctv.c) || this.d != ctv.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = ((((this.b.hashCode() + 4867) * 31) + this.c.hashCode()) * 31) + this.d;
        }
        return this.f;
    }
}
