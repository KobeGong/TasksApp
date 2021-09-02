package defpackage;

/* renamed from: csw reason: default package */
/* compiled from: PG */
final class csw implements java.io.Serializable {
    public static final long serialVersionUID = 0;
    private final java.lang.Object[] a;

    csw(java.lang.Object[] objArr) {
        this.a = objArr;
    }

    /* access modifiers changed from: 0000 */
    public final java.lang.Object readResolve() {
        return defpackage.csv.a(this.a);
    }
}
