package defpackage;

/* renamed from: efa  reason: default package */
/* compiled from: PG */
public final class efa extends dlz {
    public efb[] a = efb.d();

    public efa() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null && this.a.length > 0) {
            for (int i = 0; i < this.a.length; i++) {
                efb efb = this.a[i];
                if (efb != null) {
                    dlx.a(1, efb);
                }
            }
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int a2 = super.a();
        if (this.a != null && this.a.length > 0) {
            for (int i = 0; i < this.a.length; i++) {
                efb efb = this.a[i];
                if (efb != null) {
                    a2 += dlx.b(1, efb);
                }
            }
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
                case 10:
                    int a3 = dmh.a(dlw, 10);
                    int length = this.a == null ? 0 : this.a.length;
                    efb[] efbArr = new efb[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.a, 0, efbArr, 0, length);
                    }
                    while (length < efbArr.length - 1) {
                        efbArr[length] = new efb();
                        dlw.a(efbArr[length]);
                        dlw.a();
                        length++;
                    }
                    efbArr[length] = new efb();
                    dlw.a(efbArr[length]);
                    this.a = efbArr;
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
