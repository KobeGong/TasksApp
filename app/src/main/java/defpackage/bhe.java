package defpackage;

/* renamed from: bhe reason: default package */
/* compiled from: PG */
public final class bhe extends defpackage.dlz {
    private defpackage.bhd a;
    private defpackage.bhc b;
    private defpackage.bhf c;

    public bhe() {
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
            dlx.a(2, (defpackage.dmf) this.b);
        }
        if (this.c != null) {
            dlx.a(3, (defpackage.dmf) this.c);
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
            a2 += defpackage.dlx.b(2, (defpackage.dmf) this.b);
        }
        if (this.c != null) {
            return a2 + defpackage.dlx.b(3, (defpackage.dmf) this.c);
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
                        this.a = new defpackage.bhd();
                    }
                    dlw.a((defpackage.dmf) this.a);
                    continue;
                case 18:
                    if (this.b == null) {
                        this.b = new defpackage.bhc();
                    }
                    dlw.a((defpackage.dmf) this.b);
                    continue;
                case 26:
                    if (this.c == null) {
                        this.c = new defpackage.bhf();
                    }
                    dlw.a((defpackage.dmf) this.c);
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
