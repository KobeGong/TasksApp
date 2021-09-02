package defpackage;

/* renamed from: eer reason: default package */
/* compiled from: PG */
public final class eer extends defpackage.dlz {
    private static volatile defpackage.eer[] v;
    public java.lang.String a;
    public java.lang.String b;
    public java.lang.Integer c;
    public java.lang.Integer d;
    public java.lang.Integer e;
    public java.lang.Integer f;
    public java.lang.Integer g;
    public int h;
    public defpackage.edf i;
    public defpackage.eeq l;
    public defpackage.eeo m;
    public java.lang.Long n;
    public int o;
    public int p;
    public java.lang.Integer q;
    public java.lang.Integer r;
    public java.lang.String s;
    public long[] t;
    public java.lang.String u;
    private defpackage.efv[] w;
    private int x;
    private defpackage.efn y;

    public static defpackage.eer[] d() {
        if (v == null) {
            synchronized (defpackage.dmd.b) {
                if (v == null) {
                    v = new defpackage.eer[0];
                }
            }
        }
        return v;
    }

    public eer() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = Integer.MIN_VALUE;
        this.w = defpackage.efv.d();
        this.i = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = Integer.MIN_VALUE;
        this.p = Integer.MIN_VALUE;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = defpackage.dmh.b;
        this.x = Integer.MIN_VALUE;
        this.u = null;
        this.y = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a);
        }
        if (this.b != null) {
            dlx.a(2, this.b);
        }
        if (this.c != null) {
            dlx.a(3, this.c.intValue());
        }
        if (this.d != null) {
            dlx.a(4, this.d.intValue());
        }
        if (this.e != null) {
            dlx.a(5, this.e.intValue());
        }
        if (this.f != null) {
            dlx.b(6, this.f.intValue());
        }
        if (this.g != null) {
            dlx.b(7, this.g.intValue());
        }
        if (this.h != Integer.MIN_VALUE) {
            dlx.a(8, this.h);
        }
        if (this.w != null && this.w.length > 0) {
            for (defpackage.efv efv : this.w) {
                if (efv != null) {
                    dlx.a(9, (defpackage.dmf) efv);
                }
            }
        }
        if (this.i != null) {
            dlx.a(10, (defpackage.dmf) this.i);
        }
        if (this.l != null) {
            dlx.a(11, (defpackage.dmf) this.l);
        }
        if (this.m != null) {
            dlx.a(12, (defpackage.dmf) this.m);
        }
        if (this.n != null) {
            dlx.a(13, this.n.longValue());
        }
        if (this.o != Integer.MIN_VALUE) {
            dlx.a(14, this.o);
        }
        if (this.p != Integer.MIN_VALUE) {
            dlx.a(15, this.p);
        }
        if (this.r != null) {
            dlx.a(16, this.r.intValue());
        }
        if (this.s != null) {
            dlx.a(17, this.s);
        }
        if (this.x != Integer.MIN_VALUE) {
            dlx.a(18, this.x);
        }
        if (this.q != null) {
            dlx.a(19, this.q.intValue());
        }
        if (this.u != null) {
            dlx.a(20, this.u);
        }
        if (this.t != null && this.t.length > 0) {
            for (long b2 : this.t) {
                dlx.b(21, b2);
            }
        }
        if (this.y != null) {
            dlx.a(22, (defpackage.dmf) this.y);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += defpackage.dlx.b(1, this.a);
        }
        if (this.b != null) {
            a2 += defpackage.dlx.b(2, this.b);
        }
        if (this.c != null) {
            a2 += defpackage.dlx.c(3, this.c.intValue());
        }
        if (this.d != null) {
            a2 += defpackage.dlx.c(4, this.d.intValue());
        }
        if (this.e != null) {
            a2 += defpackage.dlx.c(5, this.e.intValue());
        }
        if (this.f != null) {
            a2 += defpackage.dlx.d(6, this.f.intValue());
        }
        if (this.g != null) {
            a2 += defpackage.dlx.d(7, this.g.intValue());
        }
        if (this.h != Integer.MIN_VALUE) {
            a2 += defpackage.dlx.c(8, this.h);
        }
        if (this.w != null && this.w.length > 0) {
            int i2 = a2;
            for (defpackage.efv efv : this.w) {
                if (efv != null) {
                    i2 += defpackage.dlx.b(9, (defpackage.dmf) efv);
                }
            }
            a2 = i2;
        }
        if (this.i != null) {
            a2 += defpackage.dlx.b(10, (defpackage.dmf) this.i);
        }
        if (this.l != null) {
            a2 += defpackage.dlx.b(11, (defpackage.dmf) this.l);
        }
        if (this.m != null) {
            a2 += defpackage.dlx.b(12, (defpackage.dmf) this.m);
        }
        if (this.n != null) {
            a2 += defpackage.dlx.c(13, this.n.longValue());
        }
        if (this.o != Integer.MIN_VALUE) {
            a2 += defpackage.dlx.c(14, this.o);
        }
        if (this.p != Integer.MIN_VALUE) {
            a2 += defpackage.dlx.c(15, this.p);
        }
        if (this.r != null) {
            a2 += defpackage.dlx.c(16, this.r.intValue());
        }
        if (this.s != null) {
            a2 += defpackage.dlx.b(17, this.s);
        }
        if (this.x != Integer.MIN_VALUE) {
            a2 += defpackage.dlx.c(18, this.x);
        }
        if (this.q != null) {
            a2 += defpackage.dlx.c(19, this.q.intValue());
        }
        if (this.u != null) {
            a2 += defpackage.dlx.b(20, this.u);
        }
        if (this.t != null && this.t.length > 0) {
            a2 = a2 + (this.t.length * 8) + (this.t.length * 2);
        }
        if (this.y != null) {
            return a2 + defpackage.dlx.b(22, (defpackage.dmf) this.y);
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final defpackage.eer a(defpackage.dlw dlw) {
        int length;
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 10:
                    this.a = dlw.d();
                    continue;
                case 18:
                    this.b = dlw.d();
                    continue;
                case 24:
                    this.c = java.lang.Integer.valueOf(dlw.e());
                    continue;
                case 32:
                    this.d = java.lang.Integer.valueOf(dlw.e());
                    continue;
                case 40:
                    this.e = java.lang.Integer.valueOf(dlw.e());
                    continue;
                case 48:
                    this.f = java.lang.Integer.valueOf(dlw.e());
                    continue;
                case 56:
                    this.g = java.lang.Integer.valueOf(dlw.e());
                    continue;
                case 64:
                    int i2 = dlw.i();
                    try {
                        int e2 = dlw.e();
                        if (e2 < 0 || e2 > 6) {
                            throw new java.lang.IllegalArgumentException(e2 + " is not a valid enum RequestNegotiatedProtocol");
                        }
                        this.h = e2;
                        continue;
                    } catch (java.lang.IllegalArgumentException e3) {
                        dlw.e(i2);
                        a(dlw, a2);
                        break;
                    }
                case 74:
                    int a3 = defpackage.dmh.a(dlw, 74);
                    int length2 = this.w == null ? 0 : this.w.length;
                    defpackage.efv[] efvArr = new defpackage.efv[(a3 + length2)];
                    if (length2 != 0) {
                        java.lang.System.arraycopy(this.w, 0, efvArr, 0, length2);
                    }
                    while (length2 < efvArr.length - 1) {
                        efvArr[length2] = new defpackage.efv();
                        dlw.a((defpackage.dmf) efvArr[length2]);
                        dlw.a();
                        length2++;
                    }
                    efvArr[length2] = new defpackage.efv();
                    dlw.a((defpackage.dmf) efvArr[length2]);
                    this.w = efvArr;
                    continue;
                case 82:
                    if (this.i == null) {
                        this.i = new defpackage.edf();
                    }
                    dlw.a((defpackage.dmf) this.i);
                    continue;
                case 90:
                    if (this.l == null) {
                        this.l = new defpackage.eeq();
                    }
                    dlw.a((defpackage.dmf) this.l);
                    continue;
                case 98:
                    if (this.m == null) {
                        this.m = new defpackage.eeo();
                    }
                    dlw.a((defpackage.dmf) this.m);
                    continue;
                case 104:
                    this.n = java.lang.Long.valueOf(dlw.b());
                    continue;
                case 112:
                    int i3 = dlw.i();
                    try {
                        int e4 = dlw.e();
                        if (e4 < 0 || e4 > 3) {
                            throw new java.lang.IllegalArgumentException(e4 + " is not a valid enum RequestStatus");
                        }
                        this.o = e4;
                        continue;
                    } catch (java.lang.IllegalArgumentException e5) {
                        dlw.e(i3);
                        a(dlw, a2);
                        break;
                    }
                case 120:
                    int i4 = dlw.i();
                    try {
                        int e6 = dlw.e();
                        if (e6 < 0 || e6 > 12) {
                            throw new java.lang.IllegalArgumentException(e6 + " is not a valid enum RequestFailedReason");
                        }
                        this.p = e6;
                        continue;
                    } catch (java.lang.IllegalArgumentException e7) {
                        dlw.e(i4);
                        a(dlw, a2);
                        break;
                    }
                case 128:
                    this.r = java.lang.Integer.valueOf(dlw.e());
                    continue;
                case 138:
                    this.s = dlw.d();
                    continue;
                case 144:
                    int i5 = dlw.i();
                    try {
                        int e8 = dlw.e();
                        if (e8 < 0 || e8 > 7) {
                            throw new java.lang.IllegalArgumentException(e8 + " is not a valid enum HttpMethod");
                        }
                        this.x = e8;
                        continue;
                    } catch (java.lang.IllegalArgumentException e9) {
                        dlw.e(i5);
                        a(dlw, a2);
                        break;
                    }
                case 152:
                    this.q = java.lang.Integer.valueOf(dlw.e());
                    continue;
                case 162:
                    this.u = dlw.d();
                    continue;
                case 169:
                    int a4 = defpackage.dmh.a(dlw, 169);
                    if (this.t == null) {
                        length = 0;
                    } else {
                        length = this.t.length;
                    }
                    long[] jArr = new long[(a4 + length)];
                    if (length != 0) {
                        java.lang.System.arraycopy(this.t, 0, jArr, 0, length);
                    }
                    while (length < jArr.length - 1) {
                        jArr[length] = dlw.g();
                        dlw.a();
                        length++;
                    }
                    jArr[length] = dlw.g();
                    this.t = jArr;
                    continue;
                case 170:
                    int e10 = dlw.e();
                    int c2 = dlw.c(e10);
                    int i6 = e10 / 8;
                    int length3 = this.t == null ? 0 : this.t.length;
                    long[] jArr2 = new long[(i6 + length3)];
                    if (length3 != 0) {
                        java.lang.System.arraycopy(this.t, 0, jArr2, 0, length3);
                    }
                    while (length3 < jArr2.length) {
                        jArr2[length3] = dlw.g();
                        length3++;
                    }
                    this.t = jArr2;
                    dlw.d(c2);
                    continue;
                case 178:
                    if (this.y == null) {
                        this.y = new defpackage.efn();
                    }
                    dlw.a((defpackage.dmf) this.y);
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
