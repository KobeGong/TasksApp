package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: ctv  reason: default package */
/* compiled from: PG */
public final class ctv extends ctt {
    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private int f = 0;

    ctv(String str, String str2, int i, String str3) {
        this.b = (String) cub.a(str, "class name");
        this.c = (String) cub.a(str2, "method name");
        this.d = 105;
        this.e = str3;
    }

    @Override // defpackage.ctt
    public final String a() {
        return this.b.replace('/', '.');
    }

    @Override // defpackage.ctt
    public final String b() {
        return this.c;
    }

    @Override // defpackage.ctt
    public final int c() {
        return this.d & 65535;
    }

    @Override // defpackage.ctt
    public final String d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ctv)) {
            return false;
        }
        ctv ctv = (ctv) obj;
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
