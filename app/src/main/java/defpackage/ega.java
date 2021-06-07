package defpackage;

/* renamed from: ega  reason: default package */
/* compiled from: PG */
public final class ega extends dlz {
    private static volatile ega[] d;
    public efz a = null;
    public Integer b = null;
    public Long c = null;

    public static ega[] d() {
        if (d == null) {
            synchronized (dmd.b) {
                if (d == null) {
                    d = new ega[0];
                }
            }
        }
        return d;
    }

    public ega() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a);
        }
        if (this.b != null) {
            dlx.a(2, this.b.intValue());
        }
        if (this.c != null) {
            dlx.a(3, this.c.longValue());
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
            a2 += dlx.c(2, this.b.intValue());
        }
        if (this.c != null) {
            return a2 + dlx.c(3, this.c.longValue());
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
                        this.a = new efz();
                    }
                    dlw.a(this.a);
                    break;
                case 16:
                    this.b = Integer.valueOf(dlw.e());
                    break;
                case 24:
                    this.c = Long.valueOf(dlw.b());
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
