package defpackage;

/* renamed from: csq reason: default package */
/* compiled from: PG */
final class csq implements java.io.Serializable {
    public static final long serialVersionUID = 0;
    private final java.lang.Object[] a;

    csq(java.lang.Object[] objArr) {
        this.a = objArr;
    }

    /* access modifiers changed from: 0000 */
    public final java.lang.Object readResolve() {
        return defpackage.csp.a(this.a);
    }
}
