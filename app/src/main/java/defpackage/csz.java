package defpackage;

/* renamed from: csz reason: default package */
/* compiled from: PG */
final class csz extends defpackage.csp {
    public static final defpackage.csp a = new defpackage.csz(new java.lang.Object[0], 0);
    private final transient java.lang.Object[] b;
    private final transient int c;

    csz(java.lang.Object[] objArr, int i) {
        this.b = objArr;
        this.c = i;
    }

    public final int size() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final int a(java.lang.Object[] objArr, int i) {
        java.lang.System.arraycopy(this.b, 0, objArr, i, this.c);
        return this.c + i;
    }

    public final java.lang.Object get(int i) {
        defpackage.cld.a(i, this.c);
        return this.b[i];
    }
}
