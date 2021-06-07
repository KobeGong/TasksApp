package defpackage;

/* renamed from: ees  reason: default package */
/* compiled from: PG */
public final class ees extends dlz {
    public eer[] a = eer.d();
    private edf b = null;

    public ees() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null && this.a.length > 0) {
            for (int i = 0; i < this.a.length; i++) {
                eer eer = this.a[i];
                if (eer != null) {
                    dlx.a(1, eer);
                }
            }
        }
        if (this.b != null) {
            dlx.a(2, this.b);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int a2 = super.a();
        if (this.a != null && this.a.length > 0) {
            for (int i = 0; i < this.a.length; i++) {
                eer eer = this.a[i];
                if (eer != null) {
                    a2 += dlx.b(1, eer);
                }
            }
        }
        if (this.b != null) {
            return a2 + dlx.b(2, this.b);
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
                    eer[] eerArr = new eer[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.a, 0, eerArr, 0, length);
                    }
                    while (length < eerArr.length - 1) {
                        eerArr[length] = new eer();
                        dlw.a(eerArr[length]);
                        dlw.a();
                        length++;
                    }
                    eerArr[length] = new eer();
                    dlw.a(eerArr[length]);
                    this.a = eerArr;
                    break;
                case 18:
                    if (this.b == null) {
                        this.b = new edf();
                    }
                    dlw.a(this.b);
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
