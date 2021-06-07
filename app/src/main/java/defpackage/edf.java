package defpackage;

/* renamed from: edf  reason: default package */
/* compiled from: PG */
public final class edf extends dlz {
    public Long a = null;
    public Boolean b = null;
    public Integer c = null;
    public String d = null;

    public edf() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a.longValue());
        }
        if (this.b != null) {
            dlx.a(2, this.b.booleanValue());
        }
        if (this.c != null) {
            dlx.a(3, this.c.intValue());
        }
        if (this.d != null) {
            dlx.a(4, this.d);
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
            this.b.booleanValue();
            a2 += dlx.c(16) + 1;
        }
        if (this.c != null) {
            a2 += dlx.c(3, this.c.intValue());
        }
        if (this.d != null) {
            return a2 + dlx.b(4, this.d);
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
                    this.b = Boolean.valueOf(dlw.c());
                    break;
                case 24:
                    this.c = Integer.valueOf(dlw.e());
                    break;
                case 34:
                    this.d = dlw.d();
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
