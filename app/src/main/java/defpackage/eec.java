package defpackage;

/* renamed from: eec reason: default package */
/* compiled from: PG */
public final class eec extends defpackage.dlz {
    private java.lang.Integer a;
    private java.lang.Integer b;
    private defpackage.edb c;

    public eec() {
        this.a = null;
        this.b = null;
        this.c = null;
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
            dlx.a(3, (defpackage.dmf) this.c);
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
            return a2 + defpackage.dlx.b(3, (defpackage.dmf) this.c);
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
                case 26:
                    if (this.c == null) {
                        this.c = new defpackage.edb();
                    }
                    dlw.a((defpackage.dmf) this.c);
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
