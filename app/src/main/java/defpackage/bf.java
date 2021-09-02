package defpackage;

/* renamed from: bf reason: default package */
/* compiled from: PG */
final class bf extends defpackage.ay {
    public static final long serialVersionUID = 1405488568664762222L;

    bf(defpackage.az azVar, defpackage.az azVar2) {
        super(azVar, azVar2);
    }

    public final boolean a(defpackage.bb bbVar) {
        return this.a.a(bbVar) || this.b.a(bbVar);
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.a.toString();
        java.lang.String obj2 = this.b.toString();
        return new java.lang.StringBuilder(java.lang.String.valueOf(obj).length() + 4 + java.lang.String.valueOf(obj2).length()).append(obj).append(" or ").append(obj2).toString();
    }
}
