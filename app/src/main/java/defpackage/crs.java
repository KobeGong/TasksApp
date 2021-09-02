package defpackage;

/* renamed from: crs reason: default package */
/* compiled from: PG */
public final class crs {
    public boolean a = false;
    private final java.lang.String b;
    private final defpackage.crt c = new defpackage.crt();
    private defpackage.crt d = this.c;

    public crs(java.lang.String str) {
        this.b = (java.lang.String) defpackage.cld.a((java.lang.Object) str);
    }

    public final defpackage.crs a(java.lang.String str, boolean z) {
        return a(str, (java.lang.Object) java.lang.String.valueOf(z));
    }

    public final defpackage.crs a(java.lang.String str, int i) {
        return a(str, (java.lang.Object) java.lang.String.valueOf(i));
    }

    public final java.lang.String toString() {
        boolean z = this.a;
        java.lang.StringBuilder append = new java.lang.StringBuilder(32).append(this.b).append('{');
        java.lang.String str = "";
        for (defpackage.crt crt = this.c.c; crt != null; crt = crt.c) {
            java.lang.Object obj = crt.b;
            if (!z || obj != null) {
                append.append(str);
                str = ", ";
                if (crt.a != null) {
                    append.append(crt.a).append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    append.append(obj);
                } else {
                    java.lang.String deepToString = java.util.Arrays.deepToString(new java.lang.Object[]{obj});
                    append.append(deepToString, 1, deepToString.length() - 1);
                }
            }
        }
        return append.append('}').toString();
    }

    public final defpackage.crt a() {
        defpackage.crt crt = new defpackage.crt();
        this.d.c = crt;
        this.d = crt;
        return crt;
    }

    public final defpackage.crs a(java.lang.String str, java.lang.Object obj) {
        defpackage.crt a2 = a();
        a2.b = obj;
        a2.a = (java.lang.String) defpackage.cld.a((java.lang.Object) str);
        return this;
    }
}
