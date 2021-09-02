package defpackage;

/* renamed from: egg reason: default package */
/* compiled from: PG */
public final class egg extends defpackage.dlz {
    private static volatile defpackage.egg[] a;
    private defpackage.eed b;
    private java.lang.Integer c;
    private java.lang.Long d;

    public static defpackage.egg[] d() {
        if (a == null) {
            synchronized (defpackage.dmd.b) {
                if (a == null) {
                    a = new defpackage.egg[0];
                }
            }
        }
        return a;
    }

    public egg() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.b != null) {
            dlx.a(1, (defpackage.dmf) this.b);
        }
        if (this.c != null) {
            dlx.a(2, this.c.intValue());
        }
        if (this.d != null) {
            dlx.a(3, this.d.longValue());
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.b != null) {
            a2 += defpackage.dlx.b(1, (defpackage.dmf) this.b);
        }
        if (this.c != null) {
            a2 += defpackage.dlx.c(2, this.c.intValue());
        }
        if (this.d != null) {
            return a2 + defpackage.dlx.c(3, this.d.longValue());
        }
        return a2;
    }

    public final /* synthetic */ defpackage.dmf a(defpackage.dlw dlw) {
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 10:
                    if (this.b == null) {
                        this.b = new defpackage.eed();
                    }
                    dlw.a((defpackage.dmf) this.b);
                    continue;
                case 16:
                    this.c = java.lang.Integer.valueOf(dlw.e());
                    continue;
                case 24:
                    this.d = java.lang.Long.valueOf(dlw.b());
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
