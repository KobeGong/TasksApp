package defpackage;

/* renamed from: efu  reason: default package */
/* compiled from: PG */
public final class efu extends dlz {
    private static volatile efu[] b;
    public eft[] a = eft.d();

    public static efu[] d() {
        if (b == null) {
            synchronized (dmd.b) {
                if (b == null) {
                    b = new efu[0];
                }
            }
        }
        return b;
    }

    public efu() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null && this.a.length > 0) {
            for (int i = 0; i < this.a.length; i++) {
                eft eft = this.a[i];
                if (eft != null) {
                    dlx.a(1, eft);
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
                eft eft = this.a[i];
                if (eft != null) {
                    a2 += dlx.b(1, eft);
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
                    eft[] eftArr = new eft[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.a, 0, eftArr, 0, length);
                    }
                    while (length < eftArr.length - 1) {
                        eftArr[length] = new eft();
                        dlw.a(eftArr[length]);
                        dlw.a();
                        length++;
                    }
                    eftArr[length] = new eft();
                    dlw.a(eftArr[length]);
                    this.a = eftArr;
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
