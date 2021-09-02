package defpackage;

/* renamed from: een reason: default package */
/* compiled from: PG */
public final class een extends defpackage.dlz {
    public defpackage.eem a;
    public defpackage.efl b;
    public int c;
    public defpackage.edz d;
    public java.lang.String e;

    public een() {
        this.a = null;
        this.b = null;
        this.c = Integer.MIN_VALUE;
        this.d = null;
        this.e = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null) {
            dlx.a(1, (defpackage.dmf) this.a);
        }
        if (this.b != null) {
            dlx.a(2, (defpackage.dmf) this.b);
        }
        if (this.c != Integer.MIN_VALUE) {
            dlx.a(3, this.c);
        }
        if (this.d != null) {
            dlx.a(4, (defpackage.dmf) this.d);
        }
        if (this.e != null) {
            dlx.a(5, this.e);
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
        if (this.c != Integer.MIN_VALUE) {
            a2 += defpackage.dlx.c(3, this.c);
        }
        if (this.d != null) {
            a2 += defpackage.dlx.b(4, (defpackage.dmf) this.d);
        }
        if (this.e != null) {
            return a2 + defpackage.dlx.b(5, this.e);
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final defpackage.een a(defpackage.dlw dlw) {
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new defpackage.eem();
                    }
                    dlw.a((defpackage.dmf) this.a);
                    continue;
                case 18:
                    if (this.b == null) {
                        this.b = new defpackage.efl();
                    }
                    dlw.a((defpackage.dmf) this.b);
                    continue;
                case 24:
                    int i = dlw.i();
                    try {
                        int e2 = dlw.e();
                        if (e2 < 0 || e2 > 6) {
                            throw new java.lang.IllegalArgumentException(e2 + " is not a valid enum MemoryEventCode");
                        }
                        this.c = e2;
                        continue;
                    } catch (java.lang.IllegalArgumentException e3) {
                        dlw.e(i);
                        a(dlw, a2);
                        break;
                    }
                case 34:
                    if (this.d == null) {
                        this.d = new defpackage.edz();
                    }
                    dlw.a((defpackage.dmf) this.d);
                    continue;
                case 42:
                    this.e = dlw.d();
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
