package defpackage;

/* renamed from: eed  reason: default package */
/* compiled from: PG */
public final class eed extends dlz {
    public Long a = null;
    public String b = null;

    public eed() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null) {
            dlx.b(1, this.a.longValue());
        }
        if (this.b != null) {
            dlx.a(2, this.b);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            this.a.longValue();
            a2 += dlx.c(8) + 8;
        }
        if (this.b != null) {
            return a2 + dlx.b(2, this.b);
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
                case 9:
                    this.a = Long.valueOf(dlw.g());
                    break;
                case 18:
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
