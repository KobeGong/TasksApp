package defpackage;

/* renamed from: eft  reason: default package */
/* compiled from: PG */
public final class eft extends dlz {
    private static volatile eft[] b;
    public String a = null;

    public static eft[] d() {
        if (b == null) {
            synchronized (dmd.b) {
                if (b == null) {
                    b = new eft[0];
                }
            }
        }
        return b;
    }

    public eft() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            return a2 + dlx.b(1, this.a);
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
                    this.a = dlw.d();
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
