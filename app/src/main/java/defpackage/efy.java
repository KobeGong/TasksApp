package defpackage;

/* renamed from: efy reason: default package */
/* compiled from: PG */
public final class efy extends defpackage.dlz {
    private int a;
    private java.lang.Integer b;

    public efy() {
        this.a = Integer.MIN_VALUE;
        this.b = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != Integer.MIN_VALUE) {
            dlx.a(1, this.a);
        }
        if (this.b != null) {
            dlx.a(2, this.b.intValue());
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
            return a2 + defpackage.dlx.c(2, this.b.intValue());
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final defpackage.efy a(defpackage.dlw dlw) {
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    int i = dlw.i();
                    try {
                        int e = dlw.e();
                        if (e < 0 || e > 7) {
                            throw new java.lang.IllegalArgumentException(e + " is not a valid enum TaskFailureReason");
                        }
                        this.a = e;
                        continue;
                    } catch (java.lang.IllegalArgumentException e2) {
                        dlw.e(i);
                        a(dlw, a2);
                        break;
                    }
                case 16:
                    this.b = java.lang.Integer.valueOf(dlw.e());
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
