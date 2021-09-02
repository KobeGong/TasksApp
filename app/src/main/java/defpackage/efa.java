package defpackage;

/* renamed from: efa reason: default package */
/* compiled from: PG */
public final class efa extends defpackage.dlz {
    public defpackage.efb[] a;

    public efa() {
        this.a = defpackage.efb.d();
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null && this.a.length > 0) {
            for (defpackage.efb efb : this.a) {
                if (efb != null) {
                    dlx.a(1, (defpackage.dmf) efb);
                }
            }
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null && this.a.length > 0) {
            for (defpackage.efb efb : this.a) {
                if (efb != null) {
                    a2 += defpackage.dlx.b(1, (defpackage.dmf) efb);
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
                    defpackage.efb[] efbArr = new defpackage.efb[(a3 + length)];
                    if (length != 0) {
                        java.lang.System.arraycopy(this.a, 0, efbArr, 0, length);
                    }
                    while (length < efbArr.length - 1) {
                        efbArr[length] = new defpackage.efb();
                        dlw.a((defpackage.dmf) efbArr[length]);
                        dlw.a();
                        length++;
                    }
                    efbArr[length] = new defpackage.efb();
                    dlw.a((defpackage.dmf) efbArr[length]);
                    this.a = efbArr;
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
