package defpackage;

/* renamed from: edn reason: default package */
/* compiled from: PG */
public final class edn extends defpackage.dlz {
    private java.lang.Boolean a;
    private defpackage.edo b;

    public edn() {
        this.a = null;
        this.b = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a.booleanValue());
        }
        if (this.b != null) {
            dlx.a(2, (defpackage.dmf) this.b);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            this.a.booleanValue();
            a2 += defpackage.dlx.c(8) + 1;
        }
        if (this.b != null) {
            return a2 + defpackage.dlx.b(2, (defpackage.dmf) this.b);
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
                    this.a = java.lang.Boolean.valueOf(dlw.c());
                    continue;
                case 18:
                    if (this.b == null) {
                        this.b = new defpackage.edo();
                    }
                    dlw.a((defpackage.dmf) this.b);
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
