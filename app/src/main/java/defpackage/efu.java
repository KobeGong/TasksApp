package defpackage;

/* renamed from: efu reason: default package */
/* compiled from: PG */
public final class efu extends defpackage.dlz {
    private static volatile defpackage.efu[] b;
    public defpackage.eft[] a;

    public static defpackage.efu[] d() {
        if (b == null) {
            synchronized (defpackage.dmd.b) {
                if (b == null) {
                    b = new defpackage.efu[0];
                }
            }
        }
        return b;
    }

    public efu() {
        this.a = defpackage.eft.d();
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null && this.a.length > 0) {
            for (defpackage.eft eft : this.a) {
                if (eft != null) {
                    dlx.a(1, (defpackage.dmf) eft);
                }
            }
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null && this.a.length > 0) {
            for (defpackage.eft eft : this.a) {
                if (eft != null) {
                    a2 += defpackage.dlx.b(1, (defpackage.dmf) eft);
                }
            }
        }
        return a2;
    }

    public final /* synthetic */ defpackage.dmf a(defpackage.dlw dlw) {
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 10:
                    int a3 = defpackage.dmh.a(dlw, 10);
                    int length = this.a == null ? 0 : this.a.length;
                    defpackage.eft[] eftArr = new defpackage.eft[(a3 + length)];
                    if (length != 0) {
                        java.lang.System.arraycopy(this.a, 0, eftArr, 0, length);
                    }
                    while (length < eftArr.length - 1) {
                        eftArr[length] = new defpackage.eft();
                        dlw.a((defpackage.dmf) eftArr[length]);
                        dlw.a();
                        length++;
                    }
                    eftArr[length] = new defpackage.eft();
                    dlw.a((defpackage.dmf) eftArr[length]);
                    this.a = eftArr;
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
