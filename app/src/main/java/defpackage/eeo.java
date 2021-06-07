package defpackage;

import java.io.IOException;

/* renamed from: eeo  reason: default package */
/* compiled from: PG */
public final class eeo extends dlz {
    private eda a;
    private eec b = null;
    private eey c = null;
    private edp d = null;
    private eex e = null;
    private egh f = null;
    private edt g = null;
    private bhe h = null;
    private eeb i = null;
    private egd l = null;
    private edn m = null;
    private edx n = null;

    public eeo() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null) {
            eda eda = this.a;
            if (dlx.b == null) {
                dlx.b = dhn.a(dlx.a);
                dlx.c = dlx.a.position();
            } else if (dlx.c != dlx.a.position()) {
                dlx.b.c(dlx.a.array(), dlx.c, dlx.a.position() - dlx.c);
                dlx.c = dlx.a.position();
            }
            dhn dhn = dlx.b;
            dhn.a(1, eda);
            dhn.h();
            dlx.c = dlx.a.position();
        }
        if (this.b != null) {
            dlx.a(2, this.b);
        }
        if (this.c != null) {
            dlx.a(3, this.c);
        }
        if (this.d != null) {
            dlx.a(4, this.d);
        }
        if (this.e != null) {
            dlx.a(5, this.e);
        }
        if (this.f != null) {
            dlx.a(6, this.f);
        }
        if (this.g != null) {
            dlx.a(7, this.g);
        }
        if (this.h != null) {
            dlx.a(8, this.h);
        }
        if (this.i != null) {
            dlx.a(9, this.i);
        }
        if (this.l != null) {
            dlx.a(10, this.l);
        }
        if (this.m != null) {
            dlx.a(11, this.m);
        }
        if (this.n != null) {
            dlx.a(12, this.n);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += dhn.c(1, this.a);
        }
        if (this.b != null) {
            a2 += dlx.b(2, this.b);
        }
        if (this.c != null) {
            a2 += dlx.b(3, this.c);
        }
        if (this.d != null) {
            a2 += dlx.b(4, this.d);
        }
        if (this.e != null) {
            a2 += dlx.b(5, this.e);
        }
        if (this.f != null) {
            a2 += dlx.b(6, this.f);
        }
        if (this.g != null) {
            a2 += dlx.b(7, this.g);
        }
        if (this.h != null) {
            a2 += dlx.b(8, this.h);
        }
        if (this.i != null) {
            a2 += dlx.b(9, this.i);
        }
        if (this.l != null) {
            a2 += dlx.b(10, this.l);
        }
        if (this.m != null) {
            a2 += dlx.b(11, this.m);
        }
        if (this.n != null) {
            return a2 + dlx.b(12, this.n);
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
                    djx djx = (djx) eda.a.a(bg.aq);
                    if (dlw.h == null) {
                        dlw.h = dhj.a(dlw.a, dlw.b, dlw.c, false);
                    }
                    int u = dlw.h.u();
                    int i2 = dlw.d - dlw.b;
                    if (u <= i2) {
                        dlw.h.e(i2 - u);
                        dhj dhj = dlw.h;
                        int i3 = dlw.g - dlw.f;
                        if (i3 >= 0) {
                            dhj.b = i3;
                            dlw.b(dlw.e);
                            this.a = (eda) ((dih) dlw.h.a(djx, dhw.b()));
                            break;
                        } else {
                            throw new IllegalArgumentException(new StringBuilder(47).append("Recursion limit cannot be negative: ").append(i3).toString());
                        }
                    } else {
                        throw new IOException(String.format("CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s", Integer.valueOf(u), Integer.valueOf(i2)));
                    }
                case 18:
                    if (this.b == null) {
                        this.b = new eec();
                    }
                    dlw.a(this.b);
                    break;
                case 26:
                    if (this.c == null) {
                        this.c = new eey();
                    }
                    dlw.a(this.c);
                    break;
                case 34:
                    if (this.d == null) {
                        this.d = new edp();
                    }
                    dlw.a(this.d);
                    break;
                case 42:
                    if (this.e == null) {
                        this.e = new eex();
                    }
                    dlw.a(this.e);
                    break;
                case by.aU:
                    if (this.f == null) {
                        this.f = new egh();
                    }
                    dlw.a(this.f);
                    break;
                case by.bc:
                    if (this.g == null) {
                        this.g = new edt();
                    }
                    dlw.a(this.g);
                    break;
                case 66:
                    if (this.h == null) {
                        this.h = new bhe();
                    }
                    dlw.a(this.h);
                    break;
                case 74:
                    if (this.i == null) {
                        this.i = new eeb();
                    }
                    dlw.a(this.i);
                    break;
                case 82:
                    if (this.l == null) {
                        this.l = new egd();
                    }
                    dlw.a(this.l);
                    break;
                case 90:
                    if (this.m == null) {
                        this.m = new edn();
                    }
                    dlw.a(this.m);
                    break;
                case 98:
                    if (this.n == null) {
                        this.n = new edx();
                    }
                    dlw.a(this.n);
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
