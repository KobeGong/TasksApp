package defpackage;

/* renamed from: cry reason: default package */
/* compiled from: PG */
final class cry extends defpackage.crv {
    public static final long serialVersionUID = 0;
    private final java.lang.Object a;

    cry(java.lang.Object obj) {
        this.a = obj;
    }

    public final boolean a() {
        return true;
    }

    public final java.lang.Object b() {
        return this.a;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        defpackage.cld.a(obj, (java.lang.Object) "use Optional.orNull() instead of Optional.or(null)");
        return this.a;
    }

    public final java.lang.Object c() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.cry)) {
            return false;
        }
        return this.a.equals(((defpackage.cry) obj).a);
    }

    public final int hashCode() {
        return 1502476572 + this.a.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.a);
        return new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 13).append("Optional.of(").append(valueOf).append(")").toString();
    }
}
