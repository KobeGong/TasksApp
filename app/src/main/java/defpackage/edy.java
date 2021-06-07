package defpackage;

/* renamed from: edy  reason: default package */
/* compiled from: PG */
public final class edy extends dlz {
    public Long a = null;
    public Long b = null;

    public edy() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a.longValue());
        }
        if (this.b != null) {
            dlx.a(2, this.b.longValue());
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += dlx.c(1, this.a.longValue());
        }
        if (this.b != null) {
            return a2 + dlx.c(2, this.b.longValue());
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
                    this.a = Long.valueOf(dlw.b());
                    break;
                case 16:
                    this.b = Long.valueOf(dlw.b());
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
