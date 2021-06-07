package defpackage;

/* renamed from: eej  reason: default package */
/* compiled from: PG */
public final class eej extends dlz {
    public Integer a = null;
    public Integer b = null;
    public Integer c = null;
    public Integer d = null;
    public eee[] e = eee.d();
    public Integer f = null;

    public eej() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a.intValue());
        }
        if (this.b != null) {
            dlx.a(2, this.b.intValue());
        }
        if (this.c != null) {
            dlx.a(3, this.c.intValue());
        }
        if (this.d != null) {
            dlx.a(4, this.d.intValue());
        }
        if (this.e != null && this.e.length > 0) {
            for (int i = 0; i < this.e.length; i++) {
                eee eee = this.e[i];
                if (eee != null) {
                    dlx.a(5, eee);
                }
            }
        }
        if (this.f != null) {
            dlx.a(6, this.f.intValue());
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += dlx.c(1, this.a.intValue());
        }
        if (this.b != null) {
            a2 += dlx.c(2, this.b.intValue());
        }
        if (this.c != null) {
            a2 += dlx.c(3, this.c.intValue());
        }
        if (this.d != null) {
            a2 += dlx.c(4, this.d.intValue());
        }
        if (this.e != null && this.e.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.e.length; i2++) {
                eee eee = this.e[i2];
                if (eee != null) {
                    i += dlx.b(5, eee);
                }
            }
            a2 = i;
        }
        if (this.f != null) {
            return a2 + dlx.c(6, this.f.intValue());
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
                    this.a = Integer.valueOf(dlw.e());
                    break;
                case 16:
                    this.b = Integer.valueOf(dlw.e());
                    break;
                case 24:
                    this.c = Integer.valueOf(dlw.e());
                    break;
                case 32:
                    this.d = Integer.valueOf(dlw.e());
                    break;
                case 42:
                    int a3 = dmh.a(dlw, 42);
                    int length = this.e == null ? 0 : this.e.length;
                    eee[] eeeArr = new eee[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.e, 0, eeeArr, 0, length);
                    }
                    while (length < eeeArr.length - 1) {
                        eeeArr[length] = new eee();
                        dlw.a(eeeArr[length]);
                        dlw.a();
                        length++;
                    }
                    eeeArr[length] = new eee();
                    dlw.a(eeeArr[length]);
                    this.e = eeeArr;
                    break;
                case 48:
                    this.f = Integer.valueOf(dlw.e());
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
