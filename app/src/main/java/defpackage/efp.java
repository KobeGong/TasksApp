package defpackage;

/* renamed from: efp  reason: default package */
/* compiled from: PG */
public final class efp extends dlz {
    private static volatile efp[] a;
    private Integer b = null;
    private Integer c = null;
    private Long d = null;

    public static efp[] d() {
        if (a == null) {
            synchronized (dmd.b) {
                if (a == null) {
                    a = new efp[0];
                }
            }
        }
        return a;
    }

    public efp() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.b != null) {
            dlx.a(1, this.b.intValue());
        }
        if (this.c != null) {
            dlx.a(2, this.c.intValue());
        }
        if (this.d != null) {
            dlx.a(3, this.d.longValue());
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int a2 = super.a();
        if (this.b != null) {
            a2 += dlx.c(1, this.b.intValue());
        }
        if (this.c != null) {
            a2 += dlx.c(2, this.c.intValue());
        }
        if (this.d != null) {
            return a2 + dlx.c(3, this.d.longValue());
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
                case 8:
                    this.b = Integer.valueOf(dlw.e());
                    break;
                case 16:
                    this.c = Integer.valueOf(dlw.e());
                    break;
                case 24:
                    this.d = Long.valueOf(dlw.b());
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
