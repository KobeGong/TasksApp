package defpackage;

/* renamed from: efd reason: default package */
/* compiled from: PG */
public final class efd extends defpackage.dlz {
    private java.lang.Integer a;
    private java.lang.Float b;

    public efd() {
        this.a = null;
        this.b = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a.intValue());
        }
        if (this.b != null) {
            dlx.a(2, this.b.floatValue());
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += defpackage.dlx.c(1, this.a.intValue());
        }
        if (this.b == null) {
            return a2;
        }
        this.b.floatValue();
        return a2 + defpackage.dlx.c(16) + 4;
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
                case 21:
                    this.b = java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(dlw.f()));
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
