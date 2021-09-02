package defpackage;

/* renamed from: edr reason: default package */
/* compiled from: PG */
public final class edr extends defpackage.dlz {
    private static volatile defpackage.edr[] a;
    private java.lang.Integer b;
    private java.lang.String c;
    private int[] d;
    private java.lang.Integer e;

    public static defpackage.edr[] d() {
        if (a == null) {
            synchronized (defpackage.dmd.b) {
                if (a == null) {
                    a = new defpackage.edr[0];
                }
            }
        }
        return a;
    }

    public edr() {
        this.b = null;
        this.c = null;
        this.d = defpackage.dmh.a;
        this.e = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.b != null) {
            dlx.a(1, this.b.intValue());
        }
        if (this.c != null) {
            dlx.a(2, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            for (int a2 : this.d) {
                dlx.a(5, a2);
            }
        }
        if (this.e != null) {
            dlx.a(6, this.e.intValue());
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.b != null) {
            a2 += defpackage.dlx.c(1, this.b.intValue());
        }
        if (this.c != null) {
            a2 += defpackage.dlx.b(2, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            int i = 0;
            for (int a3 : this.d) {
                i += defpackage.dlx.a(a3);
            }
            a2 = a2 + i + (this.d.length * 1);
        }
        if (this.e != null) {
            return a2 + defpackage.dlx.c(6, this.e.intValue());
        }
        return a2;
    }

    public final /* synthetic */ defpackage.dmf a(defpackage.dlw dlw) {
        int length;
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    this.b = java.lang.Integer.valueOf(dlw.e());
                    continue;
                case 18:
                    this.c = dlw.d();
                    continue;
                case 40:
                    int a3 = defpackage.dmh.a(dlw, 40);
                    if (this.d == null) {
                        length = 0;
                    } else {
                        length = this.d.length;
                    }
                    int[] iArr = new int[(a3 + length)];
                    if (length != 0) {
                        java.lang.System.arraycopy(this.d, 0, iArr, 0, length);
                    }
                    while (length < iArr.length - 1) {
                        iArr[length] = dlw.e();
                        dlw.a();
                        length++;
                    }
                    iArr[length] = dlw.e();
                    this.d = iArr;
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
                    int length2 = this.d == null ? 0 : this.d.length;
                    int[] iArr2 = new int[(i2 + length2)];
                    if (length2 != 0) {
                        java.lang.System.arraycopy(this.d, 0, iArr2, 0, length2);
                    }
                    while (length2 < iArr2.length) {
                        iArr2[length2] = dlw.e();
                        length2++;
                    }
                    this.d = iArr2;
                    dlw.d(c2);
                    continue;
                case 48:
                    this.e = java.lang.Integer.valueOf(dlw.e());
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
