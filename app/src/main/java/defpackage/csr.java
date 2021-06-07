package defpackage;

import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: csr  reason: default package */
/* compiled from: PG */
public final class csr extends csp {
    private final transient int a;
    private final transient int b;
    private final /* synthetic */ csp c;

    csr(csp csp, int i, int i2) {
        this.c = csp;
        this.a = i;
        this.b = i2;
    }

    public final int size() {
        return this.b;
    }

    @Override // java.util.List
    public final Object get(int i) {
        cld.a(i, this.b);
        return this.c.get(this.a + i);
    }

    @Override // defpackage.csp
    public final csp a(int i, int i2) {
        cld.a(i, i2, this.b);
        return (csp) this.c.subList(this.a + i, this.a + i2);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.csn
    public final boolean c() {
        return true;
    }

    @Override // defpackage.csp, java.util.List
    public final /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
