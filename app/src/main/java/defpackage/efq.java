package defpackage;

/* renamed from: efq reason: default package */
/* compiled from: PG */
public final class efq extends defpackage.dlz {
    private static volatile defpackage.efq[] a;
    private defpackage.efp[] b;
    private int c;

    public static defpackage.efq[] d() {
        if (a == null) {
            synchronized (defpackage.dmd.b) {
                if (a == null) {
                    a = new defpackage.efq[0];
                }
            }
        }
        return a;
    }

    public efq() {
        this.b = defpackage.efp.d();
        this.c = Integer.MIN_VALUE;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.b != null && this.b.length > 0) {
            for (defpackage.efp efp : this.b) {
                if (efp != null) {
                    dlx.a(1, (defpackage.dmf) efp);
                }
            }
        }
        if (this.c != Integer.MIN_VALUE) {
            dlx.a(2, this.c);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.b != null && this.b.length > 0) {
            for (defpackage.efp efp : this.b) {
                if (efp != null) {
                    a2 += defpackage.dlx.b(1, (defpackage.dmf) efp);
                }
            }
        }
        if (this.c != Integer.MIN_VALUE) {
            return a2 + defpackage.dlx.c(2, this.c);
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final defpackage.efq a(defpackage.dlw dlw) {
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 10:
                    int a3 = defpackage.dmh.a(dlw, 10);
                    int length = this.b == null ? 0 : this.b.length;
                    defpackage.efp[] efpArr = new defpackage.efp[(a3 + length)];
                    if (length != 0) {
                        java.lang.System.arraycopy(this.b, 0, efpArr, 0, length);
                    }
                    while (length < efpArr.length - 1) {
                        efpArr[length] = new defpackage.efp();
                        dlw.a((defpackage.dmf) efpArr[length]);
                        dlw.a();
                        length++;
                    }
                    efpArr[length] = new defpackage.efp();
                    dlw.a((defpackage.dmf) efpArr[length]);
                    this.b = efpArr;
                    continue;
                case 16:
                    int i = dlw.i();
                    try {
                        int e = dlw.e();
                        if (e < 0 || e > 1) {
                            throw new java.lang.IllegalArgumentException(e + " is not a valid enum ResizedByType");
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
