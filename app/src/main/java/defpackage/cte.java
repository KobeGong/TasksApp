package defpackage;

/* renamed from: cte  reason: default package */
/* compiled from: PG */
final class cte extends csp {
    private final transient Object[] a;
    private final transient int b;
    private final transient int c;

    cte(Object[] objArr, int i, int i2) {
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        cld.a(i, this.c);
        return this.a[(i * 2) + this.b];
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.csn
    public final boolean c() {
        return true;
    }

    public final int size() {
        return this.c;
    }
}
