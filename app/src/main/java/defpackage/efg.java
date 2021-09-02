package defpackage;

/* renamed from: efg reason: default package */
/* compiled from: PG */
public final class efg extends defpackage.dlz {
    public int a;
    public java.lang.Integer b;
    public defpackage.efh c;

    public efg() {
        this.a = Integer.MIN_VALUE;
        this.b = null;
        this.c = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != Integer.MIN_VALUE) {
            dlx.a(1, this.a);
        }
        if (this.b != null) {
            dlx.a(2, this.b.intValue());
        }
        if (this.c != null) {
            dlx.a(3, (defpackage.dmf) this.c);
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
            a2 += defpackage.dlx.c(2, this.b.intValue());
        }
        if (this.c != null) {
            return a2 + defpackage.dlx.b(3, (defpackage.dmf) this.c);
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final defpackage.efg a(defpackage.dlw dlw) {
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    int i = dlw.i();
                    try {
                        int e = dlw.e();
                        if (e < 0 || e > 3) {
                            throw new java.lang.IllegalArgumentException(e + " is not a valid enum PrimesEvent");
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
                case 26:
                    if (this.c == null) {
                        this.c = new defpackage.efh();
                    }
                    dlw.a((defpackage.dmf) this.c);
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
