package defpackage;

/* renamed from: crk reason: default package */
/* compiled from: PG */
public final class crk extends defpackage.crv {
    public static final defpackage.crk a = new defpackage.crk();
    public static final long serialVersionUID = 0;

    private crk() {
    }

    public final boolean a() {
        return false;
    }

    public final java.lang.Object b() {
        throw new java.lang.IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final java.lang.Object a(java.lang.Object obj) {
        return defpackage.cld.a(obj, (java.lang.Object) "use Optional.orNull() instead of Optional.or(null)");
    }

    public final java.lang.Object c() {
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final java.lang.String toString() {
        return "Optional.absent()";
    }

    private final java.lang.Object readResolve() {
        return a;
    }
}
