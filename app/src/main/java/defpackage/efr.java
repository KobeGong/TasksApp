package defpackage;

/* renamed from: efr reason: default package */
/* compiled from: PG */
public final class efr extends defpackage.dlz {
    private java.lang.Integer a;
    private defpackage.efq[] b;
    private java.lang.Integer c;
    private java.lang.Integer d;

    public efr() {
        this.a = null;
        this.b = defpackage.efq.d();
        this.c = null;
        this.d = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a.intValue());
        }
        if (this.b != null && this.b.length > 0) {
            for (defpackage.efq efq : this.b) {
                if (efq != null) {
                    dlx.a(2, (defpackage.dmf) efq);
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
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += defpackage.dlx.c(1, this.a.intValue());
        }
        if (this.b != null && this.b.length > 0) {
            int i = a2;
            for (defpackage.efq efq : this.b) {
                if (efq != null) {
                    i += defpackage.dlx.b(2, (defpackage.dmf) efq);
                }
            }
            a2 = i;
        }
        if (this.c != null) {
            a2 += defpackage.dlx.c(3, this.c.intValue());
        }
        if (this.d != null) {
            return a2 + defpackage.dlx.c(4, this.d.intValue());
        }
        return a2;
    }

    public final /* synthetic */ defpackage.dmf a(defpackage.dlw dlw) {
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    this.a = java.lang.Integer.valueOf(dlw.e());
                    continue;
                case 18:
                    int a3 = defpackage.dmh.a(dlw, 18);
                    int length = this.b == null ? 0 : this.b.length;
                    defpackage.efq[] efqArr = new defpackage.efq[(a3 + length)];
                    if (length != 0) {
                        java.lang.System.arraycopy(this.b, 0, efqArr, 0, length);
                    }
                    while (length < efqArr.length - 1) {
                        efqArr[length] = new defpackage.efq();
                        dlw.a((defpackage.dmf) efqArr[length]);
                        dlw.a();
                        length++;
                    }
                    efqArr[length] = new defpackage.efq();
                    dlw.a((defpackage.dmf) efqArr[length]);
                    this.b = efqArr;
                    continue;
                case 24:
                    this.c = java.lang.Integer.valueOf(dlw.e());
                    continue;
                case 32:
                    this.d = java.lang.Integer.valueOf(dlw.e());
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
