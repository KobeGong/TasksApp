package defpackage;

/* renamed from: efh  reason: default package */
/* compiled from: PG */
public final class efh extends dlz {
    public edw a = null;
    private efe b = null;
    private efd c = null;

    public efh() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a);
        }
        if (this.b != null) {
            dlx.a(2, this.b);
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
            a2 += dlx.b(1, this.a);
        }
        if (this.b != null) {
            a2 += dlx.b(2, this.b);
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
                case 10:
                    if (this.a == null) {
                        this.a = new edw();
                    }
                    dlw.a(this.a);
                    break;
                case 18:
                    if (this.b == null) {
                        this.b = new efe();
                    }
                    dlw.a(this.b);
                    break;
                case 26:
                    if (this.c == null) {
                        this.c = new efd();
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
