package defpackage;

/* renamed from: edl reason: default package */
/* compiled from: PG */
public final class edl extends defpackage.dlz {
    public int a;
    public java.lang.Long b;
    public java.lang.String c;
    public java.lang.String d;
    public defpackage.eeo e;
    public int f;
    public java.lang.Long g;
    public defpackage.egf h;
    public java.lang.Long i;
    private defpackage.egg[] l;
    private defpackage.efw[] m;

    private static int a(int i2) {
        if (i2 >= 0 && i2 <= 6) {
            return i2;
        }
        throw new java.lang.IllegalArgumentException(i2 + " is not a valid enum SampleInfo");
    }

    public edl() {
        this.a = Integer.MIN_VALUE;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = Integer.MIN_VALUE;
        this.g = null;
        this.l = defpackage.egg.d();
        this.m = defpackage.efw.d();
        this.h = null;
        this.i = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != Integer.MIN_VALUE) {
            dlx.a(1, this.a);
        }
        if (this.f != Integer.MIN_VALUE) {
            dlx.a(2, this.f);
        }
        if (this.g != null) {
            dlx.a(3, this.g.longValue());
        }
        if (this.l != null && this.l.length > 0) {
            for (defpackage.egg egg : this.l) {
                if (egg != null) {
                    dlx.a(4, (defpackage.dmf) egg);
                }
            }
        }
        if (this.m != null && this.m.length > 0) {
            for (defpackage.efw efw : this.m) {
                if (efw != null) {
                    dlx.a(5, (defpackage.dmf) efw);
                }
            }
        }
        if (this.h != null) {
            dlx.a(6, (defpackage.dmf) this.h);
        }
        if (this.i != null) {
            dlx.a(7, this.i.longValue());
        }
        if (this.b != null) {
            dlx.b(8, this.b.longValue());
        }
        if (this.c != null) {
            dlx.a(9, this.c);
        }
        if (this.d != null) {
            dlx.a(10, this.d);
        }
        if (this.e != null) {
            dlx.a(11, (defpackage.dmf) this.e);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != Integer.MIN_VALUE) {
            a2 += defpackage.dlx.c(1, this.a);
        }
        if (this.f != Integer.MIN_VALUE) {
            a2 += defpackage.dlx.c(2, this.f);
        }
        if (this.g != null) {
            a2 += defpackage.dlx.c(3, this.g.longValue());
        }
        if (this.l != null && this.l.length > 0) {
            int i2 = a2;
            for (defpackage.egg egg : this.l) {
                if (egg != null) {
                    i2 += defpackage.dlx.b(4, (defpackage.dmf) egg);
                }
            }
            a2 = i2;
        }
        if (this.m != null && this.m.length > 0) {
            for (defpackage.efw efw : this.m) {
                if (efw != null) {
                    a2 += defpackage.dlx.b(5, (defpackage.dmf) efw);
                }
            }
        }
        if (this.h != null) {
            a2 += defpackage.dlx.b(6, (defpackage.dmf) this.h);
        }
        if (this.i != null) {
            a2 += defpackage.dlx.c(7, this.i.longValue());
        }
        if (this.b != null) {
            this.b.longValue();
            a2 += defpackage.dlx.c(64) + 8;
        }
        if (this.c != null) {
            a2 += defpackage.dlx.b(9, this.c);
        }
        if (this.d != null) {
            a2 += defpackage.dlx.b(10, this.d);
        }
        if (this.e != null) {
            return a2 + defpackage.dlx.b(11, (defpackage.dmf) this.e);
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final defpackage.edl a(defpackage.dlw dlw) {
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    int i2 = dlw.i();
                    try {
                        this.a = a(dlw.e());
                        continue;
                    } catch (java.lang.IllegalArgumentException e2) {
                        dlw.e(i2);
                        a(dlw, a2);
                        break;
                    }
                case 16:
                    int i3 = dlw.i();
                    try {
                        this.f = a(dlw.e());
                        continue;
                    } catch (java.lang.IllegalArgumentException e3) {
                        dlw.e(i3);
                        a(dlw, a2);
                        break;
                    }
                case 24:
                    this.g = java.lang.Long.valueOf(dlw.b());
                    continue;
                case 34:
                    int a3 = defpackage.dmh.a(dlw, 34);
                    int length = this.l == null ? 0 : this.l.length;
                    defpackage.egg[] eggArr = new defpackage.egg[(a3 + length)];
                    if (length != 0) {
                        java.lang.System.arraycopy(this.l, 0, eggArr, 0, length);
                    }
                    while (length < eggArr.length - 1) {
                        eggArr[length] = new defpackage.egg();
                        dlw.a((defpackage.dmf) eggArr[length]);
                        dlw.a();
                        length++;
                    }
                    eggArr[length] = new defpackage.egg();
                    dlw.a((defpackage.dmf) eggArr[length]);
                    this.l = eggArr;
                    continue;
                case 42:
                    int a4 = defpackage.dmh.a(dlw, 42);
                    int length2 = this.m == null ? 0 : this.m.length;
                    defpackage.efw[] efwArr = new defpackage.efw[(a4 + length2)];
                    if (length2 != 0) {
                        java.lang.System.arraycopy(this.m, 0, efwArr, 0, length2);
                    }
                    while (length2 < efwArr.length - 1) {
                        efwArr[length2] = new defpackage.efw();
                        dlw.a((defpackage.dmf) efwArr[length2]);
                        dlw.a();
                        length2++;
                    }
                    efwArr[length2] = new defpackage.efw();
                    dlw.a((defpackage.dmf) efwArr[length2]);
                    this.m = efwArr;
                    continue;
                case 50:
                    if (this.h == null) {
                        this.h = new defpackage.egf();
                    }
                    dlw.a((defpackage.dmf) this.h);
                    continue;
                case 56:
                    this.i = java.lang.Long.valueOf(dlw.b());
                    continue;
                case 65:
                    this.b = java.lang.Long.valueOf(dlw.g());
                    continue;
                case 74:
                    this.c = dlw.d();
                    continue;
                case 82:
                    this.d = dlw.d();
                    continue;
                case 90:
                    if (this.e == null) {
                        this.e = new defpackage.eeo();
                    }
                    dlw.a((defpackage.dmf) this.e);
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
