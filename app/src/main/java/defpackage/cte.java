package defpackage;

/* renamed from: cte reason: default package */
/* compiled from: PG */
final class cte extends defpackage.csp {
    private final transient java.lang.Object[] a;
    private final transient int b;
    private final transient int c;

    cte(java.lang.Object[] objArr, int i, int i2) {
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    public final java.lang.Object get(int i) {
        defpackage.cld.a(i, this.c);
        return this.a[(i * 2) + this.b];
    }

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        return true;
    }

    public final int size() {
        return this.c;
    }
}
