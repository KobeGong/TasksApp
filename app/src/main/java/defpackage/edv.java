package defpackage;

/* renamed from: edv  reason: default package */
/* compiled from: PG */
public final class edv extends dlz {
    public efu[] a = efu.d();

    public edv() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null && this.a.length > 0) {
            for (int i = 0; i < this.a.length; i++) {
                efu efu = this.a[i];
                if (efu != null) {
                    dlx.a(1, efu);
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
                efu efu = this.a[i];
                if (efu != null) {
                    a2 += dlx.b(1, efu);
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
                    efu[] efuArr = new efu[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.a, 0, efuArr, 0, length);
                    }
                    while (length < efuArr.length - 1) {
                        efuArr[length] = new efu();
                        dlw.a(efuArr[length]);
                        dlw.a();
                        length++;
                    }
                    efuArr[length] = new efu();
                    dlw.a(efuArr[length]);
                    this.a = efuArr;
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
