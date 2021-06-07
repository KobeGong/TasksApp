package defpackage;

import java.util.Arrays;

/* renamed from: cst  reason: default package */
/* compiled from: PG */
public final class cst {
    public int a;
    private Object[] b;

    public cst() {
        this(4);
    }

    cst(int i) {
        this.b = new Object[(i * 2)];
        this.a = 0;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i) {
        if ((i << 1) > this.b.length) {
            this.b = Arrays.copyOf(this.b, cso.a(this.b.length, i << 1));
        }
    }

    public final cst a(Object obj, Object obj2) {
        a(this.a + 1);
        cky.c(obj, obj2);
        this.b[this.a * 2] = obj;
        this.b[(this.a * 2) + 1] = obj2;
        this.a++;
        return this;
    }

    public final css a() {
        return cta.a(this.a, this.b);
    }
}
