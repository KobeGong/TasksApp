package defpackage;

/* renamed from: eed reason: default package */
/* compiled from: PG */
public final class eed extends defpackage.dlz {
    public java.lang.Long a;
    public java.lang.String b;

    public eed() {
        this.a = null;
        this.b = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null) {
            dlx.b(1, this.a.longValue());
        }
        if (this.b != null) {
            dlx.a(2, this.b);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            this.a.longValue();
            a2 += defpackage.dlx.c(8) + 8;
        }
        if (this.b != null) {
            return a2 + defpackage.dlx.b(2, this.b);
        }
        return a2;
    }

    public final /* synthetic */ defpackage.dmf a(defpackage.dlw dlw) {
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 9:
                    this.a = java.lang.Long.valueOf(dlw.g());
                    continue;
                case 18:
                    this.b = dlw.d();
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
