package defpackage;

/* renamed from: eew  reason: default package */
/* compiled from: PG */
public final class eew extends dlz {
    private static volatile eew[] d;
    public String a = null;
    public long[] b = dmh.b;
    public Long c = null;

    public static eew[] d() {
        if (d == null) {
            synchronized (dmd.b) {
                if (d == null) {
                    d = new eew[0];
                }
            }
        }
        return d;
    }

    public eew() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a);
        }
        if (this.c != null) {
            dlx.a(2, this.c.longValue());
        }
        if (this.b != null && this.b.length > 0) {
            for (int i = 0; i < this.b.length; i++) {
                dlx.b(3, this.b[i]);
            }
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += dlx.b(1, this.a);
        }
        if (this.c != null) {
            a2 += dlx.c(2, this.c.longValue());
        }
        if (this.b == null || this.b.length <= 0) {
            return a2;
        }
        return a2 + (this.b.length * 8) + (this.b.length * 1);
    }

    @Override // defpackage.dmf
    public final /* synthetic */ dmf a(dlw dlw) {
        int length;
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 10:
                    this.a = dlw.d();
                    break;
                case 16:
                    this.c = Long.valueOf(dlw.b());
                    break;
                case 25:
                    int a3 = dmh.a(dlw, 25);
                    if (this.b == null) {
                        length = 0;
                    } else {
                        length = this.b.length;
                    }
                    long[] jArr = new long[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.b, 0, jArr, 0, length);
                    }
                    while (length < jArr.length - 1) {
                        jArr[length] = dlw.g();
                        dlw.a();
                        length++;
                    }
                    jArr[length] = dlw.g();
                    this.b = jArr;
                    break;
                case 26:
                    int e = dlw.e();
                    int c2 = dlw.c(e);
                    int i = e / 8;
                    int length2 = this.b == null ? 0 : this.b.length;
                    long[] jArr2 = new long[(i + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.b, 0, jArr2, 0, length2);
                    }
                    while (length2 < jArr2.length) {
                        jArr2[length2] = dlw.g();
                        length2++;
                    }
                    this.b = jArr2;
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
