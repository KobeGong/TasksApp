package defpackage;

/* renamed from: efk reason: default package */
/* compiled from: PG */
public final class efk extends defpackage.dlz {
    private static volatile defpackage.efk[] h;
    public java.lang.Long a;
    public java.lang.Long b;
    public java.lang.Long c;
    public java.lang.Long d;
    public java.lang.Long e;
    public java.lang.Long f;
    public defpackage.eed g;

    public static defpackage.efk[] d() {
        if (h == null) {
            synchronized (defpackage.dmd.b) {
                if (h == null) {
                    h = new defpackage.efk[0];
                }
            }
        }
        return h;
    }

    public efk() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a.longValue());
        }
        if (this.b != null) {
            dlx.a(2, this.b.longValue());
        }
        if (this.c != null) {
            dlx.a(3, this.c.longValue());
        }
        if (this.d != null) {
            dlx.a(4, this.d.longValue());
        }
        if (this.e != null) {
            dlx.a(5, this.e.longValue());
        }
        if (this.f != null) {
            dlx.a(6, this.f.longValue());
        }
        if (this.g != null) {
            dlx.a(7, (defpackage.dmf) this.g);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += defpackage.dlx.c(1, this.a.longValue());
        }
        if (this.b != null) {
            a2 += defpackage.dlx.c(2, this.b.longValue());
        }
        if (this.c != null) {
            a2 += defpackage.dlx.c(3, this.c.longValue());
        }
        if (this.d != null) {
            a2 += defpackage.dlx.c(4, this.d.longValue());
        }
        if (this.e != null) {
            a2 += defpackage.dlx.c(5, this.e.longValue());
        }
        if (this.f != null) {
            a2 += defpackage.dlx.c(6, this.f.longValue());
        }
        if (this.g != null) {
            return a2 + defpackage.dlx.b(7, (defpackage.dmf) this.g);
        }
        return a2;
    }

    public final /* synthetic */ defpackage.dmf a(defpackage.dlw dlw) {
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    this.a = java.lang.Long.valueOf(dlw.b());
                    continue;
                case 16:
                    this.b = java.lang.Long.valueOf(dlw.b());
                    continue;
                case 24:
                    this.c = java.lang.Long.valueOf(dlw.b());
                    continue;
                case 32:
                    this.d = java.lang.Long.valueOf(dlw.b());
                    continue;
                case 40:
                    this.e = java.lang.Long.valueOf(dlw.b());
                    continue;
                case 48:
                    this.f = java.lang.Long.valueOf(dlw.b());
                    continue;
                case 58:
                    if (this.g == null) {
                        this.g = new defpackage.eed();
                    }
                    dlw.a((defpackage.dmf) this.g);
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
