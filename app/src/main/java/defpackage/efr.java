package defpackage;

/* renamed from: efr  reason: default package */
/* compiled from: PG */
public final class efr extends dlz {
    private Integer a = null;
    private efq[] b = efq.d();
    private Integer c = null;
    private Integer d = null;

    public efr() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a.intValue());
        }
        if (this.b != null && this.b.length > 0) {
            for (int i = 0; i < this.b.length; i++) {
                efq efq = this.b[i];
                if (efq != null) {
                    dlx.a(2, efq);
                }
            }
        }
        if (this.c != null) {
            dlx.a(3, this.c.intValue());
        }
        if (this.d != null) {
            dlx.a(4, this.d.intValue());
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
        if (this.b != null && this.b.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.b.length; i2++) {
                efq efq = this.b[i2];
                if (efq != null) {
                    i += dlx.b(2, efq);
                }
            }
            a2 = i;
        }
        if (this.c != null) {
            a2 += dlx.c(3, this.c.intValue());
        }
        if (this.d != null) {
            return a2 + dlx.c(4, this.d.intValue());
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
                case 18:
                    int a3 = dmh.a(dlw, 18);
                    int length = this.b == null ? 0 : this.b.length;
                    efq[] efqArr = new efq[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.b, 0, efqArr, 0, length);
                    }
                    while (length < efqArr.length - 1) {
                        efqArr[length] = new efq();
                        dlw.a(efqArr[length]);
                        dlw.a();
                        length++;
                    }
                    efqArr[length] = new efq();
                    dlw.a(efqArr[length]);
                    this.b = efqArr;
                    break;
                case 24:
                    this.c = Integer.valueOf(dlw.e());
                    break;
                case 32:
                    this.d = Integer.valueOf(dlw.e());
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
