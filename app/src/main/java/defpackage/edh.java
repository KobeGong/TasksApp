package defpackage;

/* renamed from: edh reason: default package */
/* compiled from: PG */
public final class edh extends defpackage.dlz {
    public java.lang.String a;
    public java.lang.String b;
    public int c;
    public java.lang.Long d;
    public java.lang.String e;

    public edh() {
        this.a = null;
        this.b = null;
        this.c = Integer.MIN_VALUE;
        this.d = null;
        this.e = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a);
        }
        if (this.b != null) {
            dlx.a(2, this.b);
        }
        if (this.c != Integer.MIN_VALUE) {
            dlx.a(3, this.c);
        }
        if (this.d != null) {
            dlx.a(4, this.d.longValue());
        }
        if (this.e != null) {
            dlx.a(5, this.e);
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
        if (this.c != Integer.MIN_VALUE) {
            a2 += defpackage.dlx.c(3, this.c);
        }
        if (this.d != null) {
            a2 += defpackage.dlx.c(4, this.d.longValue());
        }
        if (this.e != null) {
            return a2 + defpackage.dlx.b(5, this.e);
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final defpackage.edh a(defpackage.dlw dlw) {
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
                    int i = dlw.i();
                    try {
                        int e2 = dlw.e();
                        if (e2 < 0 || e2 > 3) {
                            throw new java.lang.IllegalArgumentException(e2 + " is not a valid enum HardwareVariant");
                        }
                        this.c = e2;
                        continue;
                    } catch (java.lang.IllegalArgumentException e3) {
                        dlw.e(i);
                        a(dlw, a2);
                        break;
                    }
                case 32:
                    this.d = java.lang.Long.valueOf(dlw.b());
                    continue;
                case 42:
                    this.e = dlw.d();
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
