package defpackage;

/* renamed from: edj  reason: default package */
/* compiled from: PG */
public final class edj extends dlz {
    private Integer a = null;
    private Integer b = null;

    public edj() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null) {
            dlx.a(2, this.a.intValue());
        }
        if (this.b != null) {
            dlx.a(3, this.b.intValue());
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += dlx.c(2, this.a.intValue());
        }
        if (this.b != null) {
            return a2 + dlx.c(3, this.b.intValue());
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
                case 16:
                    this.a = Integer.valueOf(dlw.e());
                    break;
                case 24:
                    this.b = Integer.valueOf(dlw.e());
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
