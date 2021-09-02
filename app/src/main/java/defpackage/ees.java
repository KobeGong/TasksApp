package defpackage;

/* renamed from: ees reason: default package */
/* compiled from: PG */
public final class ees extends defpackage.dlz {
    public defpackage.eer[] a;
    private defpackage.edf b;

    public ees() {
        this.a = defpackage.eer.d();
        this.b = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null && this.a.length > 0) {
            for (defpackage.eer eer : this.a) {
                if (eer != null) {
                    dlx.a(1, (defpackage.dmf) eer);
                }
            }
        }
        if (this.b != null) {
            dlx.a(2, (defpackage.dmf) this.b);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null && this.a.length > 0) {
            for (defpackage.eer eer : this.a) {
                if (eer != null) {
                    a2 += defpackage.dlx.b(1, (defpackage.dmf) eer);
                }
            }
        }
        if (this.b != null) {
            return a2 + defpackage.dlx.b(2, (defpackage.dmf) this.b);
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
                    defpackage.eer[] eerArr = new defpackage.eer[(a3 + length)];
                    if (length != 0) {
                        java.lang.System.arraycopy(this.a, 0, eerArr, 0, length);
                    }
                    while (length < eerArr.length - 1) {
                        eerArr[length] = new defpackage.eer();
                        dlw.a((defpackage.dmf) eerArr[length]);
                        dlw.a();
                        length++;
                    }
                    eerArr[length] = new defpackage.eer();
                    dlw.a((defpackage.dmf) eerArr[length]);
                    this.a = eerArr;
                    continue;
                case 18:
                    if (this.b == null) {
                        this.b = new defpackage.edf();
                    }
                    dlw.a((defpackage.dmf) this.b);
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
