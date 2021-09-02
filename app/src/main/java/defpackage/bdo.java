package defpackage;

/* renamed from: bdo reason: default package */
/* compiled from: PG */
public final class bdo {
    public final java.lang.String a;
    public final android.content.ComponentName b;
    public final int c;
    private final java.lang.String d;

    public bdo(java.lang.String str, java.lang.String str2, int i) {
        this.d = defpackage.azb.b(str);
        this.a = defpackage.azb.b(str2);
        this.b = null;
        this.c = i;
    }

    public bdo(android.content.ComponentName componentName) {
        this.d = null;
        this.a = null;
        this.b = (android.content.ComponentName) defpackage.azb.b((java.lang.Object) componentName);
        this.c = 129;
    }

    public final java.lang.String toString() {
        return this.d == null ? this.b.flattenToString() : this.d;
    }

    public final android.content.Intent a() {
        if (this.d != null) {
            return new android.content.Intent(this.d).setPackage(this.a);
        }
        return new android.content.Intent().setComponent(this.b);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.d, this.a, this.b, java.lang.Integer.valueOf(this.c)});
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.bdo)) {
            return false;
        }
        defpackage.bdo bdo = (defpackage.bdo) obj;
        if (!defpackage.azb.a((java.lang.Object) this.d, (java.lang.Object) bdo.d) || !defpackage.azb.a((java.lang.Object) this.a, (java.lang.Object) bdo.a) || !defpackage.azb.a((java.lang.Object) this.b, (java.lang.Object) bdo.b) || this.c != bdo.c) {
            return false;
        }
        return true;
    }
}
