package defpackage;

/* renamed from: edw reason: default package */
/* compiled from: PG */
public final class edw extends defpackage.dlz {
    public java.lang.Boolean a;
    public defpackage.efl b;
    public java.lang.String c;
    public java.lang.String d;
    public int e;
    public java.lang.Long f;
    public java.lang.String g;

    public edw() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = Integer.MIN_VALUE;
        this.f = null;
        this.g = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a.booleanValue());
        }
        if (this.b != null) {
            dlx.a(2, (defpackage.dmf) this.b);
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
        if (this.f != null) {
            dlx.b(6, this.f.longValue());
        }
        if (this.g != null) {
            dlx.a(7, this.g);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            this.a.booleanValue();
            a2 += defpackage.dlx.c(8) + 1;
        }
        if (this.b != null) {
            a2 += defpackage.dlx.b(2, (defpackage.dmf) this.b);
        }
        if (this.c != null) {
            a2 += defpackage.dlx.b(3, this.c);
        }
        if (this.d != null) {
            a2 += defpackage.dlx.b(4, this.d);
        }
        if (this.e != Integer.MIN_VALUE) {
            a2 += defpackage.dlx.c(5, this.e);
        }
        if (this.f != null) {
            this.f.longValue();
            a2 += defpackage.dlx.c(48) + 8;
        }
        if (this.g != null) {
            return a2 + defpackage.dlx.b(7, this.g);
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final defpackage.edw a(defpackage.dlw dlw) {
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    this.a = java.lang.Boolean.valueOf(dlw.c());
                    continue;
                case 18:
                    if (this.b == null) {
                        this.b = new defpackage.efl();
                    }
                    dlw.a((defpackage.dmf) this.b);
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
                        if (e2 < 0 || e2 > 4) {
                            throw new java.lang.IllegalArgumentException(e2 + " is not a valid enum CrashType");
                        }
                        this.e = e2;
                        continue;
                    } catch (java.lang.IllegalArgumentException e3) {
                        dlw.e(i);
                        a(dlw, a2);
                        break;
                    }
                    break;
                case 49:
                    this.f = java.lang.Long.valueOf(dlw.g());
                    continue;
                case 58:
                    this.g = dlw.d();
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
