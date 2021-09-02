package defpackage;

/* renamed from: cst reason: default package */
/* compiled from: PG */
public final class cst {
    public int a;
    private java.lang.Object[] b;

    public cst() {
        this(4);
    }

    cst(int i) {
        this.b = new java.lang.Object[(i * 2)];
        this.a = 0;
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i) {
        if ((i << 1) > this.b.length) {
            this.b = java.util.Arrays.copyOf(this.b, defpackage.cso.a(this.b.length, i << 1));
        }
    }

    public final defpackage.cst a(java.lang.Object obj, java.lang.Object obj2) {
        a(this.a + 1);
        defpackage.cky.c(obj, obj2);
        this.b[this.a * 2] = obj;
        this.b[(this.a * 2) + 1] = obj2;
        this.a++;
        return this;
    }

    public final defpackage.css a() {
        return defpackage.cta.a(this.a, this.b);
    }
}
