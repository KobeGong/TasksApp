package defpackage;

/* renamed from: edk reason: default package */
/* compiled from: PG */
public final class edk extends defpackage.dlz {
    private java.lang.Boolean a;
    private java.lang.Boolean b;

    public edk() {
        this.a = null;
        this.b = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a.booleanValue());
        }
        if (this.b != null) {
            dlx.a(2, this.b.booleanValue());
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
        if (this.b == null) {
            return a2;
        }
        this.b.booleanValue();
        return a2 + defpackage.dlx.c(16) + 1;
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
                case 16:
                    this.b = java.lang.Boolean.valueOf(dlw.c());
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
