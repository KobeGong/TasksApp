package defpackage;

/* renamed from: efd  reason: default package */
/* compiled from: PG */
public final class efd extends dlz {
    private Integer a = null;
    private Float b = null;

    public efd() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a.intValue());
        }
        if (this.b != null) {
            dlx.a(2, this.b.floatValue());
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
        if (this.b == null) {
            return a2;
        }
        this.b.floatValue();
        return a2 + dlx.c(16) + 4;
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
                case 21:
                    this.b = Float.valueOf(Float.intBitsToFloat(dlw.f()));
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
