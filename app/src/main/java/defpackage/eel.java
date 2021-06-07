package defpackage;

/* renamed from: eel  reason: default package */
/* compiled from: PG */
public final class eel extends dlz {
    public eet[] a = eet.d();

    public eel() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null && this.a.length > 0) {
            for (int i = 0; i < this.a.length; i++) {
                eet eet = this.a[i];
                if (eet != null) {
                    dlx.a(1, eet);
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
                eet eet = this.a[i];
                if (eet != null) {
                    a2 += dlx.b(1, eet);
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
                    eet[] eetArr = new eet[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.a, 0, eetArr, 0, length);
                    }
                    while (length < eetArr.length - 1) {
                        eetArr[length] = new eet();
                        dlw.a(eetArr[length]);
                        dlw.a();
                        length++;
                    }
                    eetArr[length] = new eet();
                    dlw.a(eetArr[length]);
                    this.a = eetArr;
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
