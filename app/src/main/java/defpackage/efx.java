package defpackage;

/* renamed from: efx  reason: default package */
/* compiled from: PG */
public final class efx extends dlz {
    public een a = null;
    public Long b = null;
    public String c = null;
    public egc d = null;
    public edh e = null;
    public ees f = null;
    public edw g = null;
    public efg h = null;
    public eev i = null;
    public edm l = null;
    public eej m = null;
    public eel n = null;
    public eeo o = null;
    public eek p = null;
    public efi q = null;
    public String r = null;
    public edv s = null;
    public ega[] t = ega.d();
    public edd u = null;
    public edy v = null;
    public efa w = null;
    private eea x = null;
    private eff y = null;
    private efc z = null;

    public efx() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a);
        }
        if (this.b != null) {
            dlx.b(2, this.b.longValue());
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
        if (this.x != null) {
            dlx.a(11, this.x);
        }
        if (this.m != null) {
            dlx.a(12, this.m);
        }
        if (this.n != null) {
            dlx.a(13, this.n);
        }
        if (this.o != null) {
            dlx.a(14, this.o);
        }
        if (this.p != null) {
            dlx.a(15, this.p);
        }
        if (this.q != null) {
            dlx.a(16, this.q);
        }
        if (this.r != null) {
            dlx.a(17, this.r);
        }
        if (this.s != null) {
            dlx.a(18, this.s);
        }
        if (this.y != null) {
            dlx.a(19, this.y);
        }
        if (this.t != null && this.t.length > 0) {
            for (int i2 = 0; i2 < this.t.length; i2++) {
                ega ega = this.t[i2];
                if (ega != null) {
                    dlx.a(20, ega);
                }
            }
        }
        if (this.u != null) {
            dlx.a(21, this.u);
        }
        if (this.z != null) {
            dlx.a(22, this.z);
        }
        if (this.v != null) {
            dlx.a(23, this.v);
        }
        if (this.w != null) {
            dlx.a(24, this.w);
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
            this.b.longValue();
            a2 += dlx.c(16) + 8;
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
        if (this.x != null) {
            a2 += dlx.b(11, this.x);
        }
        if (this.m != null) {
            a2 += dlx.b(12, this.m);
        }
        if (this.n != null) {
            a2 += dlx.b(13, this.n);
        }
        if (this.o != null) {
            a2 += dlx.b(14, this.o);
        }
        if (this.p != null) {
            a2 += dlx.b(15, this.p);
        }
        if (this.q != null) {
            a2 += dlx.b(16, this.q);
        }
        if (this.r != null) {
            a2 += dlx.b(17, this.r);
        }
        if (this.s != null) {
            a2 += dlx.b(18, this.s);
        }
        if (this.y != null) {
            a2 += dlx.b(19, this.y);
        }
        if (this.t != null && this.t.length > 0) {
            int i2 = a2;
            for (int i3 = 0; i3 < this.t.length; i3++) {
                ega ega = this.t[i3];
                if (ega != null) {
                    i2 += dlx.b(20, ega);
                }
            }
            a2 = i2;
        }
        if (this.u != null) {
            a2 += dlx.b(21, this.u);
        }
        if (this.z != null) {
            a2 += dlx.b(22, this.z);
        }
        if (this.v != null) {
            a2 += dlx.b(23, this.v);
        }
        if (this.w != null) {
            return a2 + dlx.b(24, this.w);
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
                        this.a = new een();
                    }
                    dlw.a(this.a);
                    break;
                case 17:
                    this.b = Long.valueOf(dlw.g());
                    break;
                case 26:
                    this.c = dlw.d();
                    break;
                case 34:
                    if (this.d == null) {
                        this.d = new egc();
                    }
                    dlw.a(this.d);
                    break;
                case 42:
                    if (this.e == null) {
                        this.e = new edh();
                    }
                    dlw.a(this.e);
                    break;
                case by.aU:
                    if (this.f == null) {
                        this.f = new ees();
                    }
                    dlw.a(this.f);
                    break;
                case by.bc:
                    if (this.g == null) {
                        this.g = new edw();
                    }
                    dlw.a(this.g);
                    break;
                case 66:
                    if (this.h == null) {
                        this.h = new efg();
                    }
                    dlw.a(this.h);
                    break;
                case 74:
                    if (this.i == null) {
                        this.i = new eev();
                    }
                    dlw.a(this.i);
                    break;
                case 82:
                    if (this.l == null) {
                        this.l = new edm();
                    }
                    dlw.a(this.l);
                    break;
                case 90:
                    if (this.x == null) {
                        this.x = new eea();
                    }
                    dlw.a(this.x);
                    break;
                case 98:
                    if (this.m == null) {
                        this.m = new eej();
                    }
                    dlw.a(this.m);
                    break;
                case 106:
                    if (this.n == null) {
                        this.n = new eel();
                    }
                    dlw.a(this.n);
                    break;
                case 114:
                    if (this.o == null) {
                        this.o = new eeo();
                    }
                    dlw.a(this.o);
                    break;
                case 122:
                    if (this.p == null) {
                        this.p = new eek();
                    }
                    dlw.a(this.p);
                    break;
                case 130:
                    if (this.q == null) {
                        this.q = new efi();
                    }
                    dlw.a(this.q);
                    break;
                case 138:
                    this.r = dlw.d();
                    break;
                case 146:
                    if (this.s == null) {
                        this.s = new edv();
                    }
                    dlw.a(this.s);
                    break;
                case 154:
                    if (this.y == null) {
                        this.y = new eff();
                    }
                    dlw.a(this.y);
                    break;
                case 162:
                    int a3 = dmh.a(dlw, 162);
                    int length = this.t == null ? 0 : this.t.length;
                    ega[] egaArr = new ega[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.t, 0, egaArr, 0, length);
                    }
                    while (length < egaArr.length - 1) {
                        egaArr[length] = new ega();
                        dlw.a(egaArr[length]);
                        dlw.a();
                        length++;
                    }
                    egaArr[length] = new ega();
                    dlw.a(egaArr[length]);
                    this.t = egaArr;
                    break;
                case 170:
                    if (this.u == null) {
                        this.u = new edd();
                    }
                    dlw.a(this.u);
                    break;
                case 178:
                    if (this.z == null) {
                        this.z = new efc();
                    }
                    dlw.a(this.z);
                    break;
                case 186:
                    if (this.v == null) {
                        this.v = new edy();
                    }
                    dlw.a(this.v);
                    break;
                case 194:
                    if (this.w == null) {
                        this.w = new efa();
                    }
                    dlw.a(this.w);
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
