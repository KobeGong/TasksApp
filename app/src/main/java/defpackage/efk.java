package defpackage;

/* renamed from: efk  reason: default package */
/* compiled from: PG */
public final class efk extends dlz {
    private static volatile efk[] h;
    public Long a = null;
    public Long b = null;
    public Long c = null;
    public Long d = null;
    public Long e = null;
    public Long f = null;
    public eed g = null;

    public static efk[] d() {
        if (h == null) {
            synchronized (dmd.b) {
                if (h == null) {
                    h = new efk[0];
                }
            }
        }
        return h;
    }

    public efk() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
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
            dlx.a(7, this.g);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += dlx.c(1, this.a.longValue());
        }
        if (this.b != null) {
            a2 += dlx.c(2, this.b.longValue());
        }
        if (this.c != null) {
            a2 += dlx.c(3, this.c.longValue());
        }
        if (this.d != null) {
            a2 += dlx.c(4, this.d.longValue());
        }
        if (this.e != null) {
            a2 += dlx.c(5, this.e.longValue());
        }
        if (this.f != null) {
            a2 += dlx.c(6, this.f.longValue());
        }
        if (this.g != null) {
            return a2 + dlx.b(7, this.g);
        }
        return a2;
    }

    @Override // defpackage.dmf
    public final /* synthetic */ dmf a(dlw dlw) {
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    this.a = Long.valueOf(dlw.b());
                    break;
                case 16:
                    this.b = Long.valueOf(dlw.b());
                    break;
                case 24:
                    this.c = Long.valueOf(dlw.b());
                    break;
                case 32:
                    this.d = Long.valueOf(dlw.b());
                    break;
                case 40:
                    this.e = Long.valueOf(dlw.b());
                    break;
                case 48:
                    this.f = Long.valueOf(dlw.b());
                    break;
                case by.bc:
                    if (this.g == null) {
                        this.g = new eed();
                    }
                    dlw.a(this.g);
                    break;
                default:
                    if (super.a(dlw, a2)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }
}
