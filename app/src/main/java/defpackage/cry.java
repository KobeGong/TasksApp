package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: cry  reason: default package */
/* compiled from: PG */
public final class cry extends crv {
    public static final long serialVersionUID = 0;
    private final Object a;

    cry(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.crv
    public final boolean a() {
        return true;
    }

    @Override // defpackage.crv
    public final Object b() {
        return this.a;
    }

    @Override // defpackage.crv
    public final Object a(Object obj) {
        cld.a(obj, "use Optional.orNull() instead of Optional.or(null)");
        return this.a;
    }

    @Override // defpackage.crv
    public final Object c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cry) {
            return this.a.equals(((cry) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return 1502476572 + this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        return new StringBuilder(String.valueOf(valueOf).length() + 13).append("Optional.of(").append(valueOf).append(")").toString();
    }
}
