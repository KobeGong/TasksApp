package defpackage;

/* renamed from: eev reason: default package */
/* compiled from: PG */
public final class eev extends defpackage.dlz {
    public java.lang.Long a;
    public java.lang.Long b;
    public java.lang.Long c;
    public java.lang.Long d;
    public java.lang.Long e;
    public java.lang.Long f;
    public java.lang.Long g;
    public java.lang.Long h;
    public defpackage.eew[] i;
    private java.lang.String l;
    private java.lang.Long m;

    public eev() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.l = null;
        this.i = defpackage.eew.d();
        this.m = null;
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
            dlx.a(7, this.g.longValue());
        }
        if (this.h != null) {
            dlx.a(8, this.h.longValue());
        }
        if (this.l != null) {
            dlx.a(9, this.l);
        }
        if (this.i != null && this.i.length > 0) {
            for (defpackage.eew eew : this.i) {
                if (eew != null) {
                    dlx.a(10, (defpackage.dmf) eew);
                }
            }
        }
        if (this.m != null) {
            dlx.a(11, this.m.longValue());
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
            a2 += defpackage.dlx.c(7, this.g.longValue());
        }
        if (this.h != null) {
            a2 += defpackage.dlx.c(8, this.h.longValue());
        }
        if (this.l != null) {
            a2 += defpackage.dlx.b(9, this.l);
        }
        if (this.i != null && this.i.length > 0) {
            int i2 = a2;
            for (defpackage.eew eew : this.i) {
                if (eew != null) {
                    i2 += defpackage.dlx.b(10, (defpackage.dmf) eew);
                }
            }
            a2 = i2;
        }
        if (this.m != null) {
            return a2 + defpackage.dlx.c(11, this.m.longValue());
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
                case 56:
                    this.g = java.lang.Long.valueOf(dlw.b());
                    continue;
                case 64:
                    this.h = java.lang.Long.valueOf(dlw.b());
                    continue;
                case 74:
                    this.l = dlw.d();
                    continue;
                case 82:
                    int a3 = defpackage.dmh.a(dlw, 82);
                    int length = this.i == null ? 0 : this.i.length;
                    defpackage.eew[] eewArr = new defpackage.eew[(a3 + length)];
                    if (length != 0) {
                        java.lang.System.arraycopy(this.i, 0, eewArr, 0, length);
                    }
                    while (length < eewArr.length - 1) {
                        eewArr[length] = new defpackage.eew();
                        dlw.a((defpackage.dmf) eewArr[length]);
                        dlw.a();
                        length++;
                    }
                    eewArr[length] = new defpackage.eew();
                    dlw.a((defpackage.dmf) eewArr[length]);
                    this.i = eewArr;
                    continue;
                case 88:
                    this.m = java.lang.Long.valueOf(dlw.b());
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
