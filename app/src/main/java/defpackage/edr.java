package defpackage;

/* renamed from: edr  reason: default package */
/* compiled from: PG */
public final class edr extends dlz {
    private static volatile edr[] a;
    private Integer b = null;
    private String c = null;
    private int[] d = dmh.a;
    private Integer e = null;

    public static edr[] d() {
        if (a == null) {
            synchronized (dmd.b) {
                if (a == null) {
                    a = new edr[0];
                }
            }
        }
        return a;
    }

    public edr() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.b != null) {
            dlx.a(1, this.b.intValue());
        }
        if (this.c != null) {
            dlx.a(2, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            for (int i = 0; i < this.d.length; i++) {
                dlx.a(5, this.d[i]);
            }
        }
        if (this.e != null) {
            dlx.a(6, this.e.intValue());
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int a2 = super.a();
        if (this.b != null) {
            a2 += dlx.c(1, this.b.intValue());
        }
        if (this.c != null) {
            a2 += dlx.b(2, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.d.length; i2++) {
                i += dlx.a(this.d[i2]);
            }
            a2 = a2 + i + (this.d.length * 1);
        }
        if (this.e != null) {
            return a2 + dlx.c(6, this.e.intValue());
        }
        return a2;
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
                    this.b = Integer.valueOf(dlw.e());
                    break;
                case 18:
                    this.c = dlw.d();
                    break;
                case 40:
                    int a3 = dmh.a(dlw, 40);
                    if (this.d == null) {
                        length = 0;
                    } else {
                        length = this.d.length;
                    }
                    int[] iArr = new int[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.d, 0, iArr, 0, length);
                    }
                    while (length < iArr.length - 1) {
                        iArr[length] = dlw.e();
                        dlw.a();
                        length++;
                    }
                    iArr[length] = dlw.e();
                    this.d = iArr;
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
                    int length2 = this.d == null ? 0 : this.d.length;
                    int[] iArr2 = new int[(i2 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.d, 0, iArr2, 0, length2);
                    }
                    while (length2 < iArr2.length) {
                        iArr2[length2] = dlw.e();
                        length2++;
                    }
                    this.d = iArr2;
                    dlw.d(c2);
                    break;
                case 48:
                    this.e = Integer.valueOf(dlw.e());
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
