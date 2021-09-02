package defpackage;

/* renamed from: edo reason: default package */
/* compiled from: PG */
public final class edo extends defpackage.dlz {
    private java.lang.Integer a;
    private java.lang.Integer b;
    private java.lang.String c;
    private java.lang.String d;
    private int e;

    public edo() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = Integer.MIN_VALUE;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a.intValue());
        }
        if (this.b != null) {
            dlx.a(2, this.b.intValue());
        }
        if (this.c != null) {
            dlx.a(3, this.c);
        }
        if (this.d != null) {
            dlx.a(4, this.d);
        }
        if (this.e != Integer.MIN_VALUE) {
            dlx.a(5, this.e);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += defpackage.dlx.c(1, this.a.intValue());
        }
        if (this.b != null) {
            a2 += defpackage.dlx.c(2, this.b.intValue());
        }
        if (this.c != null) {
            a2 += defpackage.dlx.b(3, this.c);
        }
        if (this.d != null) {
            a2 += defpackage.dlx.b(4, this.d);
        }
        if (this.e != Integer.MIN_VALUE) {
            return a2 + defpackage.dlx.c(5, this.e);
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final defpackage.edo a(defpackage.dlw dlw) {
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    this.a = java.lang.Integer.valueOf(dlw.e());
                    continue;
                case 16:
                    this.b = java.lang.Integer.valueOf(dlw.e());
                    continue;
                case 26:
                    this.c = dlw.d();
                    continue;
                case 34:
                    this.d = dlw.d();
                    continue;
                case 40:
                    int i = dlw.i();
                    try {
                        int e2 = dlw.e();
                        if (e2 < 0 || e2 > 1) {
                            throw new java.lang.IllegalArgumentException(e2 + " is not a valid enum Mvno");
                        }
                        this.e = e2;
                        continue;
                    } catch (java.lang.IllegalArgumentException e3) {
                        dlw.e(i);
                        a(dlw, a2);
                        break;
                    }
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
