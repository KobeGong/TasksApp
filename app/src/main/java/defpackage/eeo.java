package defpackage;

/* renamed from: eeo reason: default package */
/* compiled from: PG */
public final class eeo extends defpackage.dlz {
    private defpackage.eda a;
    private defpackage.eec b;
    private defpackage.eey c;
    private defpackage.edp d;
    private defpackage.eex e;
    private defpackage.egh f;
    private defpackage.edt g;
    private defpackage.bhe h;
    private defpackage.eeb i;
    private defpackage.egd l;
    private defpackage.edn m;
    private defpackage.edx n;

    public eeo() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null) {
            defpackage.eda eda = this.a;
            if (dlx.b == null) {
                dlx.b = defpackage.dhn.a(dlx.a);
                dlx.c = dlx.a.position();
            } else if (dlx.c != dlx.a.position()) {
                dlx.b.c(dlx.a.array(), dlx.c, dlx.a.position() - dlx.c);
                dlx.c = dlx.a.position();
            }
            defpackage.dhn dhn = dlx.b;
            dhn.a(1, (defpackage.djo) eda);
            dhn.h();
            dlx.c = dlx.a.position();
        }
        if (this.b != null) {
            dlx.a(2, (defpackage.dmf) this.b);
        }
        if (this.c != null) {
            dlx.a(3, (defpackage.dmf) this.c);
        }
        if (this.d != null) {
            dlx.a(4, (defpackage.dmf) this.d);
        }
        if (this.e != null) {
            dlx.a(5, (defpackage.dmf) this.e);
        }
        if (this.f != null) {
            dlx.a(6, (defpackage.dmf) this.f);
        }
        if (this.g != null) {
            dlx.a(7, (defpackage.dmf) this.g);
        }
        if (this.h != null) {
            dlx.a(8, (defpackage.dmf) this.h);
        }
        if (this.i != null) {
            dlx.a(9, (defpackage.dmf) this.i);
        }
        if (this.l != null) {
            dlx.a(10, (defpackage.dmf) this.l);
        }
        if (this.m != null) {
            dlx.a(11, (defpackage.dmf) this.m);
        }
        if (this.n != null) {
            dlx.a(12, (defpackage.dmf) this.n);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += defpackage.dhn.c(1, (defpackage.djo) this.a);
        }
        if (this.b != null) {
            a2 += defpackage.dlx.b(2, (defpackage.dmf) this.b);
        }
        if (this.c != null) {
            a2 += defpackage.dlx.b(3, (defpackage.dmf) this.c);
        }
        if (this.d != null) {
            a2 += defpackage.dlx.b(4, (defpackage.dmf) this.d);
        }
        if (this.e != null) {
            a2 += defpackage.dlx.b(5, (defpackage.dmf) this.e);
        }
        if (this.f != null) {
            a2 += defpackage.dlx.b(6, (defpackage.dmf) this.f);
        }
        if (this.g != null) {
            a2 += defpackage.dlx.b(7, (defpackage.dmf) this.g);
        }
        if (this.h != null) {
            a2 += defpackage.dlx.b(8, (defpackage.dmf) this.h);
        }
        if (this.i != null) {
            a2 += defpackage.dlx.b(9, (defpackage.dmf) this.i);
        }
        if (this.l != null) {
            a2 += defpackage.dlx.b(10, (defpackage.dmf) this.l);
        }
        if (this.m != null) {
            a2 += defpackage.dlx.b(11, (defpackage.dmf) this.m);
        }
        if (this.n != null) {
            return a2 + defpackage.dlx.b(12, (defpackage.dmf) this.n);
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
                    defpackage.djx djx = (defpackage.djx) defpackage.eda.a.a(defpackage.bg.aq);
                    if (dlw.h == null) {
                        dlw.h = defpackage.dhj.a(dlw.a, dlw.b, dlw.c, false);
                    }
                    int u = dlw.h.u();
                    int i2 = dlw.d - dlw.b;
                    if (u > i2) {
                        throw new java.io.IOException(java.lang.String.format("CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s", new java.lang.Object[]{java.lang.Integer.valueOf(u), java.lang.Integer.valueOf(i2)}));
                    }
                    dlw.h.e(i2 - u);
                    defpackage.dhj dhj = dlw.h;
                    int i3 = dlw.g - dlw.f;
                    if (i3 < 0) {
                        throw new java.lang.IllegalArgumentException("Recursion limit cannot be negative: " + i3);
                    }
                    dhj.b = i3;
                    defpackage.dih dih = (defpackage.dih) dlw.h.a(djx, defpackage.dhw.b());
                    dlw.b(dlw.e);
                    this.a = (defpackage.eda) dih;
                    continue;
                case 18:
                    if (this.b == null) {
                        this.b = new defpackage.eec();
                    }
                    dlw.a((defpackage.dmf) this.b);
                    continue;
                case 26:
                    if (this.c == null) {
                        this.c = new defpackage.eey();
                    }
                    dlw.a((defpackage.dmf) this.c);
                    continue;
                case 34:
                    if (this.d == null) {
                        this.d = new defpackage.edp();
                    }
                    dlw.a((defpackage.dmf) this.d);
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new defpackage.eex();
                    }
                    dlw.a((defpackage.dmf) this.e);
                    continue;
                case 50:
                    if (this.f == null) {
                        this.f = new defpackage.egh();
                    }
                    dlw.a((defpackage.dmf) this.f);
                    continue;
                case 58:
                    if (this.g == null) {
                        this.g = new defpackage.edt();
                    }
                    dlw.a((defpackage.dmf) this.g);
                    continue;
                case 66:
                    if (this.h == null) {
                        this.h = new defpackage.bhe();
                    }
                    dlw.a((defpackage.dmf) this.h);
                    continue;
                case 74:
                    if (this.i == null) {
                        this.i = new defpackage.eeb();
                    }
                    dlw.a((defpackage.dmf) this.i);
                    continue;
                case 82:
                    if (this.l == null) {
                        this.l = new defpackage.egd();
                    }
                    dlw.a((defpackage.dmf) this.l);
                    continue;
                case 90:
                    if (this.m == null) {
                        this.m = new defpackage.edn();
                    }
                    dlw.a((defpackage.dmf) this.m);
                    continue;
                case 98:
                    if (this.n == null) {
                        this.n = new defpackage.edx();
                    }
                    dlw.a((defpackage.dmf) this.n);
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
