package defpackage;

/* renamed from: ege reason: default package */
/* compiled from: PG */
public final class ege extends defpackage.dlz {
    private java.lang.String a;
    private java.lang.String b;
    private java.lang.Integer c;
    private int d;
    private int e;
    private java.lang.String f;

    public ege() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = Integer.MIN_VALUE;
        this.e = Integer.MIN_VALUE;
        this.f = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a);
        }
        if (this.b != null) {
            dlx.a(2, this.b);
        }
        if (this.c != null) {
            dlx.a(3, this.c.intValue());
        }
        if (this.d != Integer.MIN_VALUE) {
            dlx.a(4, this.d);
        }
        if (this.e != Integer.MIN_VALUE) {
            dlx.a(5, this.e);
        }
        if (this.f != null) {
            dlx.a(6, this.f);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += defpackage.dlx.b(1, this.a);
        }
        if (this.b != null) {
            a2 += defpackage.dlx.b(2, this.b);
        }
        if (this.c != null) {
            a2 += defpackage.dlx.c(3, this.c.intValue());
        }
        if (this.d != Integer.MIN_VALUE) {
            a2 += defpackage.dlx.c(4, this.d);
        }
        if (this.e != Integer.MIN_VALUE) {
            a2 += defpackage.dlx.c(5, this.e);
        }
        if (this.f != null) {
            return a2 + defpackage.dlx.b(6, this.f);
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final defpackage.ege a(defpackage.dlw dlw) {
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 10:
                    this.a = dlw.d();
                    continue;
                case 18:
                    this.b = dlw.d();
                    continue;
                case 24:
                    this.c = java.lang.Integer.valueOf(dlw.e());
                    continue;
                case 32:
                    int i = dlw.i();
                    try {
                        int e2 = dlw.e();
                        if (e2 < 0 || e2 > 2) {
                            throw new java.lang.IllegalArgumentException(e2 + " is not a valid enum TranslationEngine");
                        }
                        this.d = e2;
                        continue;
                    } catch (java.lang.IllegalArgumentException e3) {
                        dlw.e(i);
                        a(dlw, a2);
                        break;
                    }
                case 40:
                    int i2 = dlw.i();
                    try {
                        int e4 = dlw.e();
                        if (e4 < 0 || e4 > 4) {
                            throw new java.lang.IllegalArgumentException(e4 + " is not a valid enum Source");
                        }
                        this.e = e4;
                        continue;
                    } catch (java.lang.IllegalArgumentException e5) {
                        dlw.e(i2);
                        a(dlw, a2);
                        break;
                    }
                case 50:
                    this.f = dlw.d();
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
