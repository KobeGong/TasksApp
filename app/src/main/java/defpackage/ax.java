package defpackage;

/* renamed from: ax reason: default package */
/* compiled from: PG */
final class ax extends defpackage.ay {
    public static final long serialVersionUID = 7766999779862263523L;

    ax(defpackage.az azVar, defpackage.az azVar2) {
        super(azVar, azVar2);
    }

    public final boolean a(defpackage.bb bbVar) {
        return this.a.a(bbVar) && this.b.a(bbVar);
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.a.toString();
        java.lang.String obj2 = this.b.toString();
        return new java.lang.StringBuilder(java.lang.String.valueOf(obj).length() + 5 + java.lang.String.valueOf(obj2).length()).append(obj).append(" and ").append(obj2).toString();
    }
}
