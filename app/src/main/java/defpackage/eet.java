package defpackage;

/* renamed from: eet reason: default package */
/* compiled from: PG */
public final class eet extends defpackage.dlz {
    private static volatile defpackage.eet[] e;
    public java.lang.String a;
    public java.lang.Integer b;
    public java.lang.Integer c;
    public java.lang.String d;

    public static defpackage.eet[] d() {
        if (e == null) {
            synchronized (defpackage.dmd.b) {
                if (e == null) {
                    e = new defpackage.eet[0];
                }
            }
        }
        return e;
    }

    public eet() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a);
        }
        if (this.b != null) {
            dlx.a(2, this.b.intValue());
        }
        if (this.c != null) {
            dlx.a(3, this.c.intValue());
        }
        if (this.d != null) {
            dlx.a(4, this.d);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += defpackage.dlx.b(1, this.a);
        }
        if (this.b != null) {
            a2 += defpackage.dlx.c(2, this.b.intValue());
        }
        if (this.c != null) {
            a2 += defpackage.dlx.c(3, this.c.intValue());
        }
        if (this.d != null) {
            return a2 + defpackage.dlx.b(4, this.d);
        }
        return a2;
    }

    public final /* synthetic */ defpackage.dmf a(defpackage.dlw dlw) {
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 10:
                    this.a = dlw.d();
                    continue;
                case 16:
                    this.b = java.lang.Integer.valueOf(dlw.e());
                    continue;
                case 24:
                    this.c = java.lang.Integer.valueOf(dlw.e());
                    continue;
                case 34:
                    this.d = dlw.d();
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
