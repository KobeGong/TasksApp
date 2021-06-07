package defpackage;

/* renamed from: eeb  reason: default package */
/* compiled from: PG */
public final class eeb extends dlz {
    private Boolean a = null;
    private Integer b = null;

    public eeb() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a.booleanValue());
        }
        if (this.b != null) {
            dlx.b(2, this.b.intValue());
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            this.a.booleanValue();
            a2 += dlx.c(8) + 1;
        }
        if (this.b != null) {
            return a2 + dlx.d(2, this.b.intValue());
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
                    this.a = Boolean.valueOf(dlw.c());
                    break;
                case 16:
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
