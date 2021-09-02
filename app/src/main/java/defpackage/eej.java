package defpackage;

/* renamed from: eej reason: default package */
/* compiled from: PG */
public final class eej extends defpackage.dlz {
    public java.lang.Integer a;
    public java.lang.Integer b;
    public java.lang.Integer c;
    public java.lang.Integer d;
    public defpackage.eee[] e;
    public java.lang.Integer f;

    public eej() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = defpackage.eee.d();
        this.f = null;
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
        if (this.d != null) {
            dlx.a(4, this.d.intValue());
        }
        if (this.e != null && this.e.length > 0) {
            for (defpackage.eee eee : this.e) {
                if (eee != null) {
                    dlx.a(5, (defpackage.dmf) eee);
                }
            }
        }
        if (this.f != null) {
            dlx.a(6, this.f.intValue());
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
        if (this.d != null) {
            a2 += defpackage.dlx.c(4, this.d.intValue());
        }
        if (this.e != null && this.e.length > 0) {
            int i = a2;
            for (defpackage.eee eee : this.e) {
                if (eee != null) {
                    i += defpackage.dlx.b(5, (defpackage.dmf) eee);
                }
            }
            a2 = i;
        }
        if (this.f != null) {
            return a2 + defpackage.dlx.c(6, this.f.intValue());
        }
        return a2;
    }

    public final /* synthetic */ defpackage.dmf a(defpackage.dlw dlw) {
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
                case 32:
                    this.d = java.lang.Integer.valueOf(dlw.e());
                    continue;
                case 42:
                    int a3 = defpackage.dmh.a(dlw, 42);
                    int length = this.e == null ? 0 : this.e.length;
                    defpackage.eee[] eeeArr = new defpackage.eee[(a3 + length)];
                    if (length != 0) {
                        java.lang.System.arraycopy(this.e, 0, eeeArr, 0, length);
                    }
                    while (length < eeeArr.length - 1) {
                        eeeArr[length] = new defpackage.eee();
                        dlw.a((defpackage.dmf) eeeArr[length]);
                        dlw.a();
                        length++;
                    }
                    eeeArr[length] = new defpackage.eee();
                    dlw.a((defpackage.dmf) eeeArr[length]);
                    this.e = eeeArr;
                    continue;
                case 48:
                    this.f = java.lang.Integer.valueOf(dlw.e());
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
