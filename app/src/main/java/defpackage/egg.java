package defpackage;

/* renamed from: egg  reason: default package */
/* compiled from: PG */
public final class egg extends dlz {
    private static volatile egg[] a;
    private eed b = null;
    private Integer c = null;
    private Long d = null;

    public static egg[] d() {
        if (a == null) {
            synchronized (dmd.b) {
                if (a == null) {
                    a = new egg[0];
                }
            }
        }
        return a;
    }

    public egg() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.b != null) {
            dlx.a(1, this.b);
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
            a2 += dlx.b(1, this.b);
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
                case 10:
                    if (this.b == null) {
                        this.b = new eed();
                    }
                    dlw.a(this.b);
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
