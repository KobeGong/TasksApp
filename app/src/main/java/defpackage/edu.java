package defpackage;

/* renamed from: edu reason: default package */
/* compiled from: PG */
public final class edu extends defpackage.dlz {
    private static volatile defpackage.edu[] c;
    public java.lang.Integer a;
    public defpackage.eed b;

    public static defpackage.edu[] d() {
        if (c == null) {
            synchronized (defpackage.dmd.b) {
                if (c == null) {
                    c = new defpackage.edu[0];
                }
            }
        }
        return c;
    }

    public edu() {
        this.a = null;
        this.b = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a.intValue());
        }
        if (this.b != null) {
            dlx.a(2, (defpackage.dmf) this.b);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += defpackage.dlx.c(1, this.a.intValue());
        }
        if (this.b != null) {
            return a2 + defpackage.dlx.b(2, (defpackage.dmf) this.b);
        }
        return a2;
    }

    public final /* synthetic */ defpackage.dmf a(defpackage.dlw dlw) {
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    this.a = java.lang.Integer.valueOf(dlw.e());
                    continue;
                case 18:
                    if (this.b == null) {
                        this.b = new defpackage.eed();
                    }
                    dlw.a((defpackage.dmf) this.b);
                    continue;
                default:
                    if (!super.a(dlw, a2)) {
                        break;
                    } else {
                        continue;
                    }
            }
        }
        return this;
    }
}
