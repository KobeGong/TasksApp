package defpackage;

/* renamed from: edc reason: default package */
/* compiled from: PG */
public final class edc extends defpackage.dlz {
    private static volatile defpackage.edc[] a;
    private java.lang.Integer b;
    private int c;

    public static defpackage.edc[] d() {
        if (a == null) {
            synchronized (defpackage.dmd.b) {
                if (a == null) {
                    a = new defpackage.edc[0];
                }
            }
        }
        return a;
    }

    public edc() {
        this.b = null;
        this.c = Integer.MIN_VALUE;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.b != null) {
            dlx.a(1, this.b.intValue());
        }
        if (this.c != Integer.MIN_VALUE) {
            dlx.a(2, this.c);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.b != null) {
            a2 += defpackage.dlx.c(1, this.b.intValue());
        }
        if (this.c != Integer.MIN_VALUE) {
            return a2 + defpackage.dlx.c(2, this.c);
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final defpackage.edc a(defpackage.dlw dlw) {
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    this.b = java.lang.Integer.valueOf(dlw.e());
                    continue;
                case 16:
                    int i = dlw.i();
                    try {
                        int e = dlw.e();
                        if (e < 0 || e > 2) {
                            throw new java.lang.IllegalArgumentException(e + " is not a valid enum VEAction");
                        }
                        this.c = e;
                        continue;
                    } catch (java.lang.IllegalArgumentException e2) {
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
