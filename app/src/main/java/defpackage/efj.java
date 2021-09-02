package defpackage;

/* renamed from: efj reason: default package */
/* compiled from: PG */
public final class efj extends defpackage.dlz {
    private static volatile defpackage.efj[] a;
    private int b;
    private java.lang.Integer c;

    public static defpackage.efj[] d() {
        if (a == null) {
            synchronized (defpackage.dmd.b) {
                if (a == null) {
                    a = new defpackage.efj[0];
                }
            }
        }
        return a;
    }

    public efj() {
        this.b = Integer.MIN_VALUE;
        this.c = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.b != Integer.MIN_VALUE) {
            dlx.a(1, this.b);
        }
        if (this.c != null) {
            dlx.a(2, this.c.intValue());
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.b != Integer.MIN_VALUE) {
            a2 += defpackage.dlx.c(1, this.b);
        }
        if (this.c != null) {
            return a2 + defpackage.dlx.c(2, this.c.intValue());
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final defpackage.efj a(defpackage.dlw dlw) {
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    int i = dlw.i();
                    try {
                        int e = dlw.e();
                        if (e < 4 || e > 11) {
                            throw new java.lang.IllegalArgumentException(e + " is not a valid enum PrimitiveType");
                        }
                        this.b = e;
                        continue;
                    } catch (java.lang.IllegalArgumentException e2) {
                        dlw.e(i);
                        a(dlw, a2);
                        break;
                    }
                case 16:
                    this.c = java.lang.Integer.valueOf(dlw.e());
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
