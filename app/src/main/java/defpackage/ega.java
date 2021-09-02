package defpackage;

/* renamed from: ega reason: default package */
/* compiled from: PG */
public final class ega extends defpackage.dlz {
    private static volatile defpackage.ega[] d;
    public defpackage.efz a;
    public java.lang.Integer b;
    public java.lang.Long c;

    public static defpackage.ega[] d() {
        if (d == null) {
            synchronized (defpackage.dmd.b) {
                if (d == null) {
                    d = new defpackage.ega[0];
                }
            }
        }
        return d;
    }

    public ega() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null) {
            dlx.a(1, (defpackage.dmf) this.a);
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
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += defpackage.dlx.b(1, (defpackage.dmf) this.a);
        }
        if (this.b != null) {
            a2 += defpackage.dlx.c(2, this.b.intValue());
        }
        if (this.c != null) {
            return a2 + defpackage.dlx.c(3, this.c.longValue());
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
                    if (this.a == null) {
                        this.a = new defpackage.efz();
                    }
                    dlw.a((defpackage.dmf) this.a);
                    continue;
                case 16:
                    this.b = java.lang.Integer.valueOf(dlw.e());
                    continue;
                case 24:
                    this.c = java.lang.Long.valueOf(dlw.b());
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
