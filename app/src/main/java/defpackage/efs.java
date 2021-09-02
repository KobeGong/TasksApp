package defpackage;

/* renamed from: efs reason: default package */
/* compiled from: PG */
public final class efs extends defpackage.dlz {
    private static volatile defpackage.efs[] f;
    public java.lang.String a;
    public java.lang.Long b;
    public java.lang.Long c;
    public java.lang.Long d;
    public java.lang.Long e;
    private java.lang.Long g;
    private int h;

    public static defpackage.efs[] d() {
        if (f == null) {
            synchronized (defpackage.dmd.b) {
                if (f == null) {
                    f = new defpackage.efs[0];
                }
            }
        }
        return f;
    }

    public efs() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.g = null;
        this.h = Integer.MIN_VALUE;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a);
        }
        if (this.b != null) {
            dlx.b(2, this.b.longValue());
        }
        if (this.c != null) {
            dlx.b(3, this.c.longValue());
        }
        if (this.d != null) {
            dlx.a(4, this.d.longValue());
        }
        if (this.e != null) {
            dlx.a(5, this.e.longValue());
        }
        if (this.g != null) {
            dlx.a(6, this.g.longValue());
        }
        if (this.h != Integer.MIN_VALUE) {
            dlx.a(7, this.h);
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
            this.b.longValue();
            a2 += defpackage.dlx.c(16) + 8;
        }
        if (this.c != null) {
            this.c.longValue();
            a2 += defpackage.dlx.c(24) + 8;
        }
        if (this.d != null) {
            a2 += defpackage.dlx.c(4, this.d.longValue());
        }
        if (this.e != null) {
            a2 += defpackage.dlx.c(5, this.e.longValue());
        }
        if (this.g != null) {
            a2 += defpackage.dlx.c(6, this.g.longValue());
        }
        if (this.h != Integer.MIN_VALUE) {
            return a2 + defpackage.dlx.c(7, this.h);
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final defpackage.efs a(defpackage.dlw dlw) {
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 10:
                    this.a = dlw.d();
                    continue;
                case 17:
                    this.b = java.lang.Long.valueOf(dlw.g());
                    continue;
                case 25:
                    this.c = java.lang.Long.valueOf(dlw.g());
                    continue;
                case 32:
                    this.d = java.lang.Long.valueOf(dlw.b());
                    continue;
                case 40:
                    this.e = java.lang.Long.valueOf(dlw.b());
                    continue;
                case 48:
                    this.g = java.lang.Long.valueOf(dlw.b());
                    continue;
                case 56:
                    int i = dlw.i();
                    try {
                        int e2 = dlw.e();
                        if (e2 < 0 || e2 > 3) {
                            throw new java.lang.IllegalArgumentException(e2 + " is not a valid enum SpanType");
                        }
                        this.h = e2;
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
