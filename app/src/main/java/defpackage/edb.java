package defpackage;

/* renamed from: edb reason: default package */
/* compiled from: PG */
public final class edb extends defpackage.dlz {
    private java.lang.Integer a;
    private java.lang.Integer b;
    private java.lang.Integer c;
    private defpackage.edc[] d;
    private int[] e;

    public edb() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = defpackage.edc.d();
        this.e = defpackage.dmh.a;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a.intValue());
        }
        if (this.b != null) {
            dlx.a(2, this.b.intValue());
        }
        if (this.c != null) {
            dlx.a(3, this.c.intValue());
        }
        if (this.d != null && this.d.length > 0) {
            for (defpackage.edc edc : this.d) {
                if (edc != null) {
                    dlx.a(4, (defpackage.dmf) edc);
                }
            }
        }
        if (this.e != null && this.e.length > 0) {
            for (int a2 : this.e) {
                dlx.a(5, a2);
            }
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += defpackage.dlx.c(1, this.a.intValue());
        }
        if (this.b != null) {
            a2 += defpackage.dlx.c(2, this.b.intValue());
        }
        if (this.c != null) {
            a2 += defpackage.dlx.c(3, this.c.intValue());
        }
        if (this.d != null && this.d.length > 0) {
            int i = a2;
            for (defpackage.edc edc : this.d) {
                if (edc != null) {
                    i += defpackage.dlx.b(4, (defpackage.dmf) edc);
                }
            }
            a2 = i;
        }
        if (this.e == null || this.e.length <= 0) {
            return a2;
        }
        int i2 = 0;
        for (int a3 : this.e) {
            i2 += defpackage.dlx.a(a3);
        }
        return a2 + i2 + (this.e.length * 1);
    }

    public final /* synthetic */ defpackage.dmf a(defpackage.dlw dlw) {
        int length;
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    this.a = java.lang.Integer.valueOf(dlw.e());
                    continue;
                case 16:
                    this.b = java.lang.Integer.valueOf(dlw.e());
                    continue;
                case 24:
                    this.c = java.lang.Integer.valueOf(dlw.e());
                    continue;
                case 34:
                    int a3 = defpackage.dmh.a(dlw, 34);
                    int length2 = this.d == null ? 0 : this.d.length;
                    defpackage.edc[] edcArr = new defpackage.edc[(a3 + length2)];
                    if (length2 != 0) {
                        java.lang.System.arraycopy(this.d, 0, edcArr, 0, length2);
                    }
                    while (length2 < edcArr.length - 1) {
                        edcArr[length2] = new defpackage.edc();
                        dlw.a((defpackage.dmf) edcArr[length2]);
                        dlw.a();
                        length2++;
                    }
                    edcArr[length2] = new defpackage.edc();
                    dlw.a((defpackage.dmf) edcArr[length2]);
                    this.d = edcArr;
                    continue;
                case 40:
                    int a4 = defpackage.dmh.a(dlw, 40);
                    if (this.e == null) {
                        length = 0;
                    } else {
                        length = this.e.length;
                    }
                    int[] iArr = new int[(a4 + length)];
                    if (length != 0) {
                        java.lang.System.arraycopy(this.e, 0, iArr, 0, length);
                    }
                    while (length < iArr.length - 1) {
                        iArr[length] = dlw.e();
                        dlw.a();
                        length++;
                    }
                    iArr[length] = dlw.e();
                    this.e = iArr;
                    continue;
                case 42:
                    int c2 = dlw.c(dlw.e());
                    int i = dlw.i();
                    int i2 = 0;
                    while (dlw.h() > 0) {
                        dlw.e();
                        i2++;
                    }
                    dlw.e(i);
                    int length3 = this.e == null ? 0 : this.e.length;
                    int[] iArr2 = new int[(i2 + length3)];
                    if (length3 != 0) {
                        java.lang.System.arraycopy(this.e, 0, iArr2, 0, length3);
                    }
                    while (length3 < iArr2.length) {
                        iArr2[length3] = dlw.e();
                        length3++;
                    }
                    this.e = iArr2;
                    dlw.d(c2);
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
