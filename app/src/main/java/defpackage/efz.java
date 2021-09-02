package defpackage;

/* renamed from: efz reason: default package */
/* compiled from: PG */
public final class efz extends defpackage.dlz {
    public java.lang.String a;
    public int b;
    private java.lang.String c;

    public efz() {
        this.a = null;
        this.b = Integer.MIN_VALUE;
        this.c = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a);
        }
        if (this.b != Integer.MIN_VALUE) {
            dlx.a(2, this.b);
        }
        if (this.c != null) {
            dlx.a(3, this.c);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += defpackage.dlx.b(1, this.a);
        }
        if (this.b != Integer.MIN_VALUE) {
            a2 += defpackage.dlx.c(2, this.b);
        }
        if (this.c != null) {
            return a2 + defpackage.dlx.b(3, this.c);
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final defpackage.efz a(defpackage.dlw dlw) {
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 10:
                    this.a = dlw.d();
                    continue;
                case 16:
                    int i = dlw.i();
                    try {
                        int e = dlw.e();
                        if (e < 0 || e > 5) {
                            throw new java.lang.IllegalArgumentException(e + " is not a valid enum Metric");
                        }
                        this.b = e;
                        continue;
                    } catch (java.lang.IllegalArgumentException e2) {
                        dlw.e(i);
                        a(dlw, a2);
                        break;
                    }
                case 26:
                    this.c = dlw.d();
                    continue;
                default:
                    if (!super.a(dlw, a2)) {
                        break;
                    } else {
                        continue;
                    }
            }
        }
        return this;
    }
}
