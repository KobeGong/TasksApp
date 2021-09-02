package defpackage;

/* renamed from: edz reason: default package */
/* compiled from: PG */
public final class edz extends defpackage.dlz {
    public java.lang.Boolean a;

    public edz() {
        this.a = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a.booleanValue());
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a == null) {
            return a2;
        }
        this.a.booleanValue();
        return a2 + defpackage.dlx.c(8) + 1;
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
