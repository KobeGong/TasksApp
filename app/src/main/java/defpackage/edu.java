package defpackage;

/* renamed from: edu  reason: default package */
/* compiled from: PG */
public final class edu extends dlz {
    private static volatile edu[] c;
    public Integer a = null;
    public eed b = null;

    public static edu[] d() {
        if (c == null) {
            synchronized (dmd.b) {
                if (c == null) {
                    c = new edu[0];
                }
            }
        }
        return c;
    }

    public edu() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a.intValue());
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
            a2 += dlx.c(1, this.a.intValue());
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
                case 8:
                    this.a = Integer.valueOf(dlw.e());
                    break;
                case 18:
                    if (this.b == null) {
                        this.b = new eed();
                    }
                    dlw.a(this.b);
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
