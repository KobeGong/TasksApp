package defpackage;

/* renamed from: edv reason: default package */
/* compiled from: PG */
public final class edv extends defpackage.dlz {
    public defpackage.efu[] a;

    public edv() {
        this.a = defpackage.efu.d();
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null && this.a.length > 0) {
            for (defpackage.efu efu : this.a) {
                if (efu != null) {
                    dlx.a(1, (defpackage.dmf) efu);
                }
            }
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null && this.a.length > 0) {
            for (defpackage.efu efu : this.a) {
                if (efu != null) {
                    a2 += defpackage.dlx.b(1, (defpackage.dmf) efu);
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
                    defpackage.efu[] efuArr = new defpackage.efu[(a3 + length)];
                    if (length != 0) {
                        java.lang.System.arraycopy(this.a, 0, efuArr, 0, length);
                    }
                    while (length < efuArr.length - 1) {
                        efuArr[length] = new defpackage.efu();
                        dlw.a((defpackage.dmf) efuArr[length]);
                        dlw.a();
                        length++;
                    }
                    efuArr[length] = new defpackage.efu();
                    dlw.a((defpackage.dmf) efuArr[length]);
                    this.a = efuArr;
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
