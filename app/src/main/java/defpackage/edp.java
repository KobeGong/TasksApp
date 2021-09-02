package defpackage;

/* renamed from: edp reason: default package */
/* compiled from: PG */
public final class edp extends defpackage.dlz {
    private int[] a;
    private int b;
    private java.lang.Integer c;
    private java.lang.Integer d;

    public edp() {
        this.a = defpackage.dmh.a;
        this.b = Integer.MIN_VALUE;
        this.c = null;
        this.d = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null && this.a.length > 0) {
            for (int a2 : this.a) {
                dlx.a(1, a2);
            }
        }
        if (this.b != Integer.MIN_VALUE) {
            dlx.a(2, this.b);
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
        int i;
        int a2 = super.a();
        if (this.a == null || this.a.length <= 0) {
            i = a2;
        } else {
            int i2 = 0;
            for (int a3 : this.a) {
                i2 += defpackage.dlx.a(a3);
            }
            i = a2 + i2 + (this.a.length * 1);
        }
        if (this.b != Integer.MIN_VALUE) {
            i += defpackage.dlx.c(2, this.b);
        }
        if (this.c != null) {
            i += defpackage.dlx.c(3, this.c.intValue());
        }
        if (this.d != null) {
            return i + defpackage.dlx.c(4, this.d.intValue());
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final defpackage.edp a(defpackage.dlw dlw) {
        int length;
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    int a3 = defpackage.dmh.a(dlw, 8);
                    if (this.a == null) {
                        length = 0;
                    } else {
                        length = this.a.length;
                    }
                    int[] iArr = new int[(a3 + length)];
                    if (length != 0) {
                        java.lang.System.arraycopy(this.a, 0, iArr, 0, length);
                    }
                    while (length < iArr.length - 1) {
                        iArr[length] = dlw.e();
                        dlw.a();
                        length++;
                    }
                    iArr[length] = dlw.e();
                    this.a = iArr;
                    continue;
                case 10:
                    int c2 = dlw.c(dlw.e());
                    int i = dlw.i();
                    int i2 = 0;
                    while (dlw.h() > 0) {
                        dlw.e();
                        i2++;
                    }
                    dlw.e(i);
                    int length2 = this.a == null ? 0 : this.a.length;
                    int[] iArr2 = new int[(i2 + length2)];
                    if (length2 != 0) {
                        java.lang.System.arraycopy(this.a, 0, iArr2, 0, length2);
                    }
                    while (length2 < iArr2.length) {
                        iArr2[length2] = dlw.e();
                        length2++;
                    }
                    this.a = iArr2;
                    dlw.d(c2);
                    continue;
                case 16:
                    int i3 = dlw.i();
                    try {
                        int e = dlw.e();
                        if (e < 0 || e > 3) {
                            throw new java.lang.IllegalArgumentException(e + " is not a valid enum ResultStatus");
                        }
                        this.b = e;
                        continue;
                    } catch (java.lang.IllegalArgumentException e2) {
                        dlw.e(i3);
                        a(dlw, a2);
                        break;
                    }
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
