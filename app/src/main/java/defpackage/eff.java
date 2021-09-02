package defpackage;

/* renamed from: eff reason: default package */
/* compiled from: PG */
public final class eff extends defpackage.dlz {
    private defpackage.efs[] a;

    public eff() {
        this.a = defpackage.efs.d();
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null && this.a.length > 0) {
            for (defpackage.efs efs : this.a) {
                if (efs != null) {
                    dlx.a(1, (defpackage.dmf) efs);
                }
            }
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null && this.a.length > 0) {
            for (defpackage.efs efs : this.a) {
                if (efs != null) {
                    a2 += defpackage.dlx.b(1, (defpackage.dmf) efs);
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
                    defpackage.efs[] efsArr = new defpackage.efs[(a3 + length)];
                    if (length != 0) {
                        java.lang.System.arraycopy(this.a, 0, efsArr, 0, length);
                    }
                    while (length < efsArr.length - 1) {
                        efsArr[length] = new defpackage.efs();
                        dlw.a((defpackage.dmf) efsArr[length]);
                        dlw.a();
                        length++;
                    }
                    efsArr[length] = new defpackage.efs();
                    dlw.a((defpackage.dmf) efsArr[length]);
                    this.a = efsArr;
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
