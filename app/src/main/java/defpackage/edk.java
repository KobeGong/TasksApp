package defpackage;

/* renamed from: edk  reason: default package */
/* compiled from: PG */
public final class edk extends dlz {
    private Boolean a = null;
    private Boolean b = null;

    public edk() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a.booleanValue());
        }
        if (this.b != null) {
            dlx.a(2, this.b.booleanValue());
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
        if (this.b == null) {
            return a2;
        }
        this.b.booleanValue();
        return a2 + dlx.c(16) + 1;
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
                    this.b = Boolean.valueOf(dlw.c());
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
