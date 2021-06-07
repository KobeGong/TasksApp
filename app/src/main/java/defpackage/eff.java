package defpackage;

/* renamed from: eff  reason: default package */
/* compiled from: PG */
public final class eff extends dlz {
    private efs[] a = efs.d();

    public eff() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null && this.a.length > 0) {
            for (int i = 0; i < this.a.length; i++) {
                efs efs = this.a[i];
                if (efs != null) {
                    dlx.a(1, efs);
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
                efs efs = this.a[i];
                if (efs != null) {
                    a2 += dlx.b(1, efs);
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
                    efs[] efsArr = new efs[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.a, 0, efsArr, 0, length);
                    }
                    while (length < efsArr.length - 1) {
                        efsArr[length] = new efs();
                        dlw.a(efsArr[length]);
                        dlw.a();
                        length++;
                    }
                    efsArr[length] = new efs();
                    dlw.a(efsArr[length]);
                    this.a = efsArr;
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
