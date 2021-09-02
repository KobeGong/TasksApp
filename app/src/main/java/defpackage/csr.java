package defpackage;

/* renamed from: csr reason: default package */
/* compiled from: PG */
final class csr extends defpackage.csp {
    private final transient int a;
    private final transient int b;
    private final /* synthetic */ defpackage.csp c;

    csr(defpackage.csp csp, int i, int i2) {
        this.c = csp;
        this.a = i;
        this.b = i2;
    }

    public final int size() {
        return this.b;
    }

    public final java.lang.Object get(int i) {
        defpackage.cld.a(i, this.b);
        return this.c.get(this.a + i);
    }

    public final defpackage.csp a(int i, int i2) {
        defpackage.cld.a(i, i2, this.b);
        return (defpackage.csp) this.c.subList(this.a + i, this.a + i2);
    }

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        return true;
    }

    public final /* synthetic */ java.util.List subList(int i, int i2) {
        return subList(i, i2);
    }
}
