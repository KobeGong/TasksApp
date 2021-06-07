package defpackage;

/* renamed from: eef  reason: default package */
/* compiled from: PG */
public final class eef extends dlz {
    private Long a = null;
    private Integer b = null;
    private String[] c = dmh.c;

    public eef() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a.longValue());
        }
        if (this.b != null) {
            dlx.b(2, this.b.intValue());
        }
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                String str = this.c[i];
                if (str != null) {
                    dlx.a(3, str);
                }
            }
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += dlx.c(1, this.a.longValue());
        }
        if (this.b != null) {
            a2 += dlx.d(2, this.b.intValue());
        }
        if (this.c == null || this.c.length <= 0) {
            return a2;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.c.length; i3++) {
            String str = this.c[i3];
            if (str != null) {
                i2++;
                i += dlx.a(str);
            }
        }
        return a2 + i + (i2 * 1);
    }

    @Override // defpackage.dmf
    public final /* synthetic */ dmf a(dlw dlw) {
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    this.a = Long.valueOf(dlw.b());
                    break;
                case 16:
                    this.b = Integer.valueOf(dlw.e());
                    break;
                case 26:
                    int a3 = dmh.a(dlw, 26);
                    int length = this.c == null ? 0 : this.c.length;
                    String[] strArr = new String[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = dlw.d();
                        dlw.a();
                        length++;
                    }
                    strArr[length] = dlw.d();
                    this.c = strArr;
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
