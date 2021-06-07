package defpackage;

/* renamed from: eev  reason: default package */
/* compiled from: PG */
public final class eev extends dlz {
    public Long a = null;
    public Long b = null;
    public Long c = null;
    public Long d = null;
    public Long e = null;
    public Long f = null;
    public Long g = null;
    public Long h = null;
    public eew[] i = eew.d();
    private String l = null;
    private Long m = null;

    public eev() {
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
            dlx.a(7, this.g.longValue());
        }
        if (this.h != null) {
            dlx.a(8, this.h.longValue());
        }
        if (this.l != null) {
            dlx.a(9, this.l);
        }
        if (this.i != null && this.i.length > 0) {
            for (int i2 = 0; i2 < this.i.length; i2++) {
                eew eew = this.i[i2];
                if (eew != null) {
                    dlx.a(10, eew);
                }
            }
        }
        if (this.m != null) {
            dlx.a(11, this.m.longValue());
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
            a2 += dlx.c(7, this.g.longValue());
        }
        if (this.h != null) {
            a2 += dlx.c(8, this.h.longValue());
        }
        if (this.l != null) {
            a2 += dlx.b(9, this.l);
        }
        if (this.i != null && this.i.length > 0) {
            int i2 = a2;
            for (int i3 = 0; i3 < this.i.length; i3++) {
                eew eew = this.i[i3];
                if (eew != null) {
                    i2 += dlx.b(10, eew);
                }
            }
            a2 = i2;
        }
        if (this.m != null) {
            return a2 + dlx.c(11, this.m.longValue());
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
                case by.ba:
                    this.g = Long.valueOf(dlw.b());
                    break;
                case 64:
                    this.h = Long.valueOf(dlw.b());
                    break;
                case 74:
                    this.l = dlw.d();
                    break;
                case 82:
                    int a3 = dmh.a(dlw, 82);
                    int length = this.i == null ? 0 : this.i.length;
                    eew[] eewArr = new eew[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.i, 0, eewArr, 0, length);
                    }
                    while (length < eewArr.length - 1) {
                        eewArr[length] = new eew();
                        dlw.a(eewArr[length]);
                        dlw.a();
                        length++;
                    }
                    eewArr[length] = new eew();
                    dlw.a(eewArr[length]);
                    this.i = eewArr;
                    break;
                case 88:
                    this.m = Long.valueOf(dlw.b());
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
