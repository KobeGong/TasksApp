package defpackage;

/* renamed from: edj reason: default package */
/* compiled from: PG */
public final class edj extends defpackage.dlz {
    private java.lang.Integer a;
    private java.lang.Integer b;

    public edj() {
        this.a = null;
        this.b = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null) {
            dlx.a(2, this.a.intValue());
        }
        if (this.b != null) {
            dlx.a(3, this.b.intValue());
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += defpackage.dlx.c(2, this.a.intValue());
        }
        if (this.b != null) {
            return a2 + defpackage.dlx.c(3, this.b.intValue());
        }
        return a2;
    }

    public final /* synthetic */ defpackage.dmf a(defpackage.dlw dlw) {
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 16:
                    this.a = java.lang.Integer.valueOf(dlw.e());
                    continue;
                case 24:
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
