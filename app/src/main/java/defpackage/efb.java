package defpackage;

/* renamed from: efb reason: default package */
/* compiled from: PG */
public final class efb extends defpackage.dlz {
    private static volatile defpackage.efb[] c;
    public int a;
    public defpackage.eep b;

    public static defpackage.efb[] d() {
        if (c == null) {
            synchronized (defpackage.dmd.b) {
                if (c == null) {
                    c = new defpackage.efb[0];
                }
            }
        }
        return c;
    }

    public efb() {
        this.a = Integer.MIN_VALUE;
        this.b = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != Integer.MIN_VALUE) {
            dlx.a(1, this.a);
        }
        if (this.b != null) {
            dlx.a(2, (defpackage.dmf) this.b);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != Integer.MIN_VALUE) {
            a2 += defpackage.dlx.c(1, this.a);
        }
        if (this.b != null) {
            return a2 + defpackage.dlx.b(2, (defpackage.dmf) this.b);
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final defpackage.efb a(defpackage.dlw dlw) {
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    int i = dlw.i();
                    try {
                        int e = dlw.e();
                        if (e < 0 || e > 4) {
                            throw new java.lang.IllegalArgumentException(e + " is not a valid enum PrimesForPrimesEvent");
                        }
                        this.a = e;
                        continue;
                    } catch (java.lang.IllegalArgumentException e2) {
                        dlw.e(i);
                        a(dlw, a2);
                        break;
                    }
                case 18:
                    if (this.b == null) {
                        this.b = new defpackage.eep();
                    }
                    dlw.a((defpackage.dmf) this.b);
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
