package defpackage;

/* renamed from: eep reason: default package */
/* compiled from: PG */
public final class eep extends defpackage.dlz {
    public java.lang.Long a;
    public java.lang.Long b;

    public eep() {
        this.a = null;
        this.b = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a.longValue());
        }
        if (this.b != null) {
            dlx.a(2, this.b.longValue());
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
            return a2 + defpackage.dlx.c(2, this.b.longValue());
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
                    this.a = java.lang.Long.valueOf(dlw.b());
                    continue;
                case 16:
                    this.b = java.lang.Long.valueOf(dlw.b());
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
