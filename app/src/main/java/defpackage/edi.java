package defpackage;

/* renamed from: edi  reason: default package */
/* compiled from: PG */
public final class edi extends dlz {
    private static volatile edi[] a;
    private Integer b = null;
    private int[] c = dmh.a;

    public static edi[] d() {
        if (a == null) {
            synchronized (dmd.b) {
                if (a == null) {
                    a = new edi[0];
                }
            }
        }
        return a;
    }

    public edi() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.b != null) {
            dlx.a(1, this.b.intValue());
        }
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                dlx.a(2, this.c[i]);
            }
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
        if (this.c == null || this.c.length <= 0) {
            return a2;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.c.length; i2++) {
            i += dlx.a(this.c[i2]);
        }
        return a2 + i + (this.c.length * 1);
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
                case 16:
                    int a3 = dmh.a(dlw, 16);
                    if (this.c == null) {
                        length = 0;
                    } else {
                        length = this.c.length;
                    }
                    int[] iArr = new int[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, iArr, 0, length);
                    }
                    while (length < iArr.length - 1) {
                        iArr[length] = dlw.e();
                        dlw.a();
                        length++;
                    }
                    iArr[length] = dlw.e();
                    this.c = iArr;
                    break;
                case 18:
                    int c2 = dlw.c(dlw.e());
                    int i = dlw.i();
                    int i2 = 0;
                    while (dlw.h() > 0) {
                        dlw.e();
                        i2++;
                    }
                    dlw.e(i);
                    int length2 = this.c == null ? 0 : this.c.length;
                    int[] iArr2 = new int[(i2 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.c, 0, iArr2, 0, length2);
                    }
                    while (length2 < iArr2.length) {
                        iArr2[length2] = dlw.e();
                        length2++;
                    }
                    this.c = iArr2;
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
