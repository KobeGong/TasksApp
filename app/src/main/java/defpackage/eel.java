package defpackage;

/* renamed from: eel reason: default package */
/* compiled from: PG */
public final class eel extends defpackage.dlz {
    public defpackage.eet[] a;

    public eel() {
        this.a = defpackage.eet.d();
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null && this.a.length > 0) {
            for (defpackage.eet eet : this.a) {
                if (eet != null) {
                    dlx.a(1, (defpackage.dmf) eet);
                }
            }
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null && this.a.length > 0) {
            for (defpackage.eet eet : this.a) {
                if (eet != null) {
                    a2 += defpackage.dlx.b(1, (defpackage.dmf) eet);
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
                    defpackage.eet[] eetArr = new defpackage.eet[(a3 + length)];
                    if (length != 0) {
                        java.lang.System.arraycopy(this.a, 0, eetArr, 0, length);
                    }
                    while (length < eetArr.length - 1) {
                        eetArr[length] = new defpackage.eet();
                        dlw.a((defpackage.dmf) eetArr[length]);
                        dlw.a();
                        length++;
                    }
                    eetArr[length] = new defpackage.eet();
                    dlw.a((defpackage.dmf) eetArr[length]);
                    this.a = eetArr;
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
