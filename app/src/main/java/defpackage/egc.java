package defpackage;

/* renamed from: egc reason: default package */
/* compiled from: PG */
public final class egc extends defpackage.dlz {
    public java.lang.Long a;
    public int b;

    public egc() {
        this.a = null;
        this.b = Integer.MIN_VALUE;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a.longValue());
        }
        if (this.b != Integer.MIN_VALUE) {
            dlx.a(2, this.b);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += defpackage.dlx.c(1, this.a.longValue());
        }
        if (this.b != Integer.MIN_VALUE) {
            return a2 + defpackage.dlx.c(2, this.b);
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final defpackage.egc a(defpackage.dlw dlw) {
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    this.a = java.lang.Long.valueOf(dlw.b());
                    continue;
                case 16:
                    int i = dlw.i();
                    try {
                        int e = dlw.e();
                        if (e < 0 || e > 3) {
                            throw new java.lang.IllegalArgumentException(e + " is not a valid enum EndStatus");
                        }
                        this.b = e;
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
