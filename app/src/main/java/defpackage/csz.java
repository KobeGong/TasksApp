package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: csz  reason: default package */
/* compiled from: PG */
public final class csz extends csp {
    public static final csp a = new csz(new Object[0], 0);
    private final transient Object[] b;
    private final transient int c;

    csz(Object[] objArr, int i) {
        this.b = objArr;
        this.c = i;
    }

    public final int size() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.csn
    public final boolean c() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.csp, defpackage.csn
    public final int a(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, i, this.c);
        return this.c + i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        cld.a(i, this.c);
        return this.b[i];
    }
}
