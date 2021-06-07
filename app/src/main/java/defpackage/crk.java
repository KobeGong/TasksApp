package defpackage;

/* renamed from: crk  reason: default package */
/* compiled from: PG */
public final class crk extends crv {
    public static final crk a = new crk();
    public static final long serialVersionUID = 0;

    private crk() {
    }

    @Override // defpackage.crv
    public final boolean a() {
        return false;
    }

    @Override // defpackage.crv
    public final Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.crv
    public final Object a(Object obj) {
        return cld.a(obj, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Override // defpackage.crv
    public final Object c() {
        return null;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    private final Object readResolve() {
        return a;
    }
}
