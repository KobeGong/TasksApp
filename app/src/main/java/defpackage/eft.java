package defpackage;

/* renamed from: eft reason: default package */
/* compiled from: PG */
public final class eft extends defpackage.dlz {
    private static volatile defpackage.eft[] b;
    public java.lang.String a;

    public static defpackage.eft[] d() {
        if (b == null) {
            synchronized (defpackage.dmd.b) {
                if (b == null) {
                    b = new defpackage.eft[0];
                }
            }
        }
        return b;
    }

    public eft() {
        this.a = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            return a2 + defpackage.dlx.b(1, this.a);
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
