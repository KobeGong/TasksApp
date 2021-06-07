package defpackage;

/* renamed from: efv  reason: default package */
/* compiled from: PG */
public final class efv extends dlz {
    private static volatile efv[] a;
    private String b = null;

    public static efv[] d() {
        if (a == null) {
            synchronized (dmd.b) {
                if (a == null) {
                    a = new efv[0];
                }
            }
        }
        return a;
    }

    public efv() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.b != null) {
            dlx.a(1, this.b);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int a2 = super.a();
        if (this.b != null) {
            return a2 + dlx.b(1, this.b);
        }
        return a2;
    }

    @Override // defpackage.dmf
    public final /* synthetic */ dmf a(dlw dlw) {
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 10:
                    this.b = dlw.d();
                    break;
                default:
                    if (super.a(dlw, a2)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }
}
