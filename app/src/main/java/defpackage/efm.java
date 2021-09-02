package defpackage;

/* renamed from: efm reason: default package */
/* compiled from: PG */
public final class efm extends defpackage.dlz {
    private static volatile defpackage.efm[] a;
    private int b;
    private int[] c;

    public static defpackage.efm[] d() {
        if (a == null) {
            synchronized (defpackage.dmd.b) {
                if (a == null) {
                    a = new defpackage.efm[0];
                }
            }
        }
        return a;
    }

    public efm() {
        this.b = Integer.MIN_VALUE;
        this.c = defpackage.dmh.a;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.b != Integer.MIN_VALUE) {
            dlx.a(1, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            for (int a2 : this.c) {
                dlx.a(2, a2);
            }
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.b != Integer.MIN_VALUE) {
            a2 += defpackage.dlx.c(1, this.b);
        }
        if (this.c == null || this.c.length <= 0) {
            return a2;
        }
        int i = 0;
        for (int a3 : this.c) {
            i += defpackage.dlx.a(a3);
        }
        return a2 + i + (this.c.length * 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final defpackage.efm a(defpackage.dlw dlw) {
        int length;
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    int i = dlw.i();
                    try {
                        int e = dlw.e();
                        if ((e < 0 || e > 8) && ((e < 137 || e > 142) && ((e < 144 || e > 144) && (e < 255 || e > 255)))) {
                            throw new java.lang.IllegalArgumentException(e + " is not a valid enum RootTag");
                        }
                        this.b = e;
                        continue;
                    } catch (java.lang.IllegalArgumentException e2) {
                        dlw.e(i);
                        a(dlw, a2);
                        break;
                    }
                case 16:
                    int a3 = defpackage.dmh.a(dlw, 16);
                    if (this.c == null) {
                        length = 0;
                    } else {
                        length = this.c.length;
                    }
                    int[] iArr = new int[(a3 + length)];
                    if (length != 0) {
                        java.lang.System.arraycopy(this.c, 0, iArr, 0, length);
                    }
                    while (length < iArr.length - 1) {
                        iArr[length] = dlw.e();
                        dlw.a();
                        length++;
                    }
                    iArr[length] = dlw.e();
                    this.c = iArr;
                    continue;
                case 18:
                    int c2 = dlw.c(dlw.e());
                    int i2 = dlw.i();
                    int i3 = 0;
                    while (dlw.h() > 0) {
                        dlw.e();
                        i3++;
                    }
                    dlw.e(i2);
                    int length2 = this.c == null ? 0 : this.c.length;
                    int[] iArr2 = new int[(i3 + length2)];
                    if (length2 != 0) {
                        java.lang.System.arraycopy(this.c, 0, iArr2, 0, length2);
                    }
                    while (length2 < iArr2.length) {
                        iArr2[length2] = dlw.e();
                        length2++;
                    }
                    this.c = iArr2;
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
