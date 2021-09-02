package defpackage;

/* renamed from: efv reason: default package */
/* compiled from: PG */
public final class efv extends defpackage.dlz {
    private static volatile defpackage.efv[] a;
    private java.lang.String b;

    public static defpackage.efv[] d() {
        if (a == null) {
            synchronized (defpackage.dmd.b) {
                if (a == null) {
                    a = new defpackage.efv[0];
                }
            }
        }
        return a;
    }

    public efv() {
        this.b = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.b != null) {
            dlx.a(1, this.b);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.b != null) {
            return a2 + defpackage.dlx.b(1, this.b);
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
