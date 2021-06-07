package defpackage;

/* renamed from: edb  reason: default package */
/* compiled from: PG */
public final class edb extends dlz {
    private Integer a = null;
    private Integer b = null;
    private Integer c = null;
    private edc[] d = edc.d();
    private int[] e = dmh.a;

    public edb() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
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
            for (int i = 0; i < this.d.length; i++) {
                edc edc = this.d[i];
                if (edc != null) {
                    dlx.a(4, edc);
                }
            }
        }
        if (this.e != null && this.e.length > 0) {
            for (int i2 = 0; i2 < this.e.length; i2++) {
                dlx.a(5, this.e[i2]);
            }
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += dlx.c(1, this.a.intValue());
        }
        if (this.b != null) {
            a2 += dlx.c(2, this.b.intValue());
        }
        if (this.c != null) {
            a2 += dlx.c(3, this.c.intValue());
        }
        if (this.d != null && this.d.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.d.length; i2++) {
                edc edc = this.d[i2];
                if (edc != null) {
                    i += dlx.b(4, edc);
                }
            }
            a2 = i;
        }
        if (this.e == null || this.e.length <= 0) {
            return a2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.e.length; i4++) {
            i3 += dlx.a(this.e[i4]);
        }
        return a2 + i3 + (this.e.length * 1);
    }

    @Override // defpackage.dmf
    public final /* synthetic */ dmf a(dlw dlw) {
        int length;
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    this.a = Integer.valueOf(dlw.e());
                    break;
                case 16:
                    this.b = Integer.valueOf(dlw.e());
                    break;
                case 24:
                    this.c = Integer.valueOf(dlw.e());
                    break;
                case 34:
                    int a3 = dmh.a(dlw, 34);
                    int length2 = this.d == null ? 0 : this.d.length;
                    edc[] edcArr = new edc[(a3 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.d, 0, edcArr, 0, length2);
                    }
                    while (length2 < edcArr.length - 1) {
                        edcArr[length2] = new edc();
                        dlw.a(edcArr[length2]);
                        dlw.a();
                        length2++;
                    }
                    edcArr[length2] = new edc();
                    dlw.a(edcArr[length2]);
                    this.d = edcArr;
                    break;
                case 40:
                    int a4 = dmh.a(dlw, 40);
                    if (this.e == null) {
                        length = 0;
                    } else {
                        length = this.e.length;
                    }
                    int[] iArr = new int[(a4 + length)];
                    if (length != 0) {
                        System.arraycopy(this.e, 0, iArr, 0, length);
                    }
                    while (length < iArr.length - 1) {
                        iArr[length] = dlw.e();
                        dlw.a();
                        length++;
                    }
                    iArr[length] = dlw.e();
                    this.e = iArr;
                    break;
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
                        System.arraycopy(this.e, 0, iArr2, 0, length3);
                    }
                    while (length3 < iArr2.length) {
                        iArr2[length3] = dlw.e();
                        length3++;
                    }
                    this.e = iArr2;
                    dlw.d(c2);
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
