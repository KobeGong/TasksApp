package defpackage;

/* renamed from: dyu reason: default package */
/* compiled from: PG */
final class dyu {
    public static final defpackage.dyu f = new defpackage.dyu(1, 0.0d, 0.0d, 1.0d, java.util.Collections.emptyList());
    public final int a;
    public final double b;
    public final double c;
    public final double d;
    public final java.util.Collection e;

    dyu(int i, double d2, double d3, double d4, java.util.Collection collection) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        defpackage.cld.a(i > 0, (java.lang.Object) "maxAttempts");
        this.a = i;
        if (d2 >= 0.0d) {
            z = true;
        } else {
            z = false;
        }
        defpackage.cld.a(z, (java.lang.Object) "initialBackoffInSeconds");
        this.b = d2;
        if (d3 >= d2) {
            z2 = true;
        } else {
            z2 = false;
        }
        defpackage.cld.a(z2, (java.lang.Object) "maxBackoffInSeconds should be at least initialBackoffInSeconds");
        this.c = d3;
        if (d4 <= 0.0d) {
            z3 = false;
        }
        defpackage.cld.a(z3, (java.lang.Object) "backoffMultiplier");
        this.d = d4;
        this.e = java.util.Collections.unmodifiableSet(new java.util.HashSet((java.util.Collection) defpackage.cld.a((java.lang.Object) collection, (java.lang.Object) "retryableStatusCodes")));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dyu)) {
            return false;
        }
        defpackage.dyu dyu = (defpackage.dyu) obj;
        if (this.a == dyu.a && java.lang.Double.compare(this.d, dyu.d) == 0 && java.lang.Double.compare(this.b, dyu.b) == 0 && java.lang.Double.compare(this.c, dyu.c) == 0 && defpackage.cru.equals(this.e, dyu.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), java.lang.Double.valueOf(this.b), java.lang.Double.valueOf(this.c), java.lang.Double.valueOf(this.d), this.e});
    }
}
