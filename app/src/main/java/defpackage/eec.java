package defpackage;

/* renamed from: eec  reason: default package */
/* compiled from: PG */
public final class eec extends dlz {
    private Integer a = null;
    private Integer b = null;
    private edb c = null;

    public eec() {
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
            dlx.a(3, this.c);
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
            return a2 + dlx.b(3, this.c);
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
                case 26:
                    if (this.c == null) {
                        this.c = new edb();
                    }
                    dlw.a(this.c);
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
