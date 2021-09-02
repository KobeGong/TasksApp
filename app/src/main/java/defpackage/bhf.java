package defpackage;

/* renamed from: bhf reason: default package */
/* compiled from: PG */
public final class bhf extends defpackage.dlz {
    private java.lang.String a;
    private java.lang.Integer b;

    public bhf() {
        this.a = null;
        this.b = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a);
        }
        if (this.b != null) {
            dlx.a(2, this.b.intValue());
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
            return a2 + defpackage.dlx.c(2, this.b.intValue());
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
