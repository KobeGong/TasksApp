package defpackage;

/* renamed from: eee  reason: default package */
/* compiled from: PG */
public final class eee extends dlz {
    private static volatile eee[] d;
    public Integer a = null;
    public Integer b = null;
    public Integer c = null;

    public static eee[] d() {
        if (d == null) {
            synchronized (dmd.b) {
                if (d == null) {
                    d = new eee[0];
                }
            }
        }
        return d;
    }

    public eee() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a.intValue());
        }
        if (this.b != null) {
            dlx.a(2, this.b.intValue());
        }
        if (this.c != null) {
            dlx.a(3, this.c.intValue());
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += dlx.c(1, this.a.intValue());
        }
        if (this.b != null) {
            a2 += dlx.c(2, this.b.intValue());
        }
        if (this.c != null) {
            return a2 + dlx.c(3, this.c.intValue());
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
                    this.a = Integer.valueOf(dlw.e());
                    break;
                case 16:
                    this.b = Integer.valueOf(dlw.e());
                    break;
                case 24:
                    this.c = Integer.valueOf(dlw.e());
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
