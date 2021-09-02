package defpackage;

/* renamed from: eef reason: default package */
/* compiled from: PG */
public final class eef extends defpackage.dlz {
    private java.lang.Long a;
    private java.lang.Integer b;
    private java.lang.String[] c;

    public eef() {
        this.a = null;
        this.b = null;
        this.c = defpackage.dmh.c;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a.longValue());
        }
        if (this.b != null) {
            dlx.b(2, this.b.intValue());
        }
        if (this.c != null && this.c.length > 0) {
            for (java.lang.String str : this.c) {
                if (str != null) {
                    dlx.a(3, str);
                }
            }
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += defpackage.dlx.c(1, this.a.longValue());
        }
        if (this.b != null) {
            a2 += defpackage.dlx.d(2, this.b.intValue());
        }
        if (this.c == null || this.c.length <= 0) {
            return a2;
        }
        int i = 0;
        int i2 = 0;
        for (java.lang.String str : this.c) {
            if (str != null) {
                i2++;
                i += defpackage.dlx.a(str);
            }
        }
        return a2 + i + (i2 * 1);
    }

    public final /* synthetic */ defpackage.dmf a(defpackage.dlw dlw) {
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    this.a = java.lang.Long.valueOf(dlw.b());
                    continue;
                case 16:
                    this.b = java.lang.Integer.valueOf(dlw.e());
                    continue;
                case 26:
                    int a3 = defpackage.dmh.a(dlw, 26);
                    int length = this.c == null ? 0 : this.c.length;
                    java.lang.String[] strArr = new java.lang.String[(a3 + length)];
                    if (length != 0) {
                        java.lang.System.arraycopy(this.c, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = dlw.d();
                        dlw.a();
                        length++;
                    }
                    strArr[length] = dlw.d();
                    this.c = strArr;
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
