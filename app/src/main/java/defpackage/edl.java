package defpackage;

/* renamed from: edl  reason: default package */
/* compiled from: PG */
public final class edl extends dlz {
    public int a = Integer.MIN_VALUE;
    public Long b = null;
    public String c = null;
    public String d = null;
    public eeo e = null;
    public int f = Integer.MIN_VALUE;
    public Long g = null;
    public egf h = null;
    public Long i = null;
    private egg[] l = egg.d();
    private efw[] m = efw.d();

    private static int a(int i2) {
        if (i2 >= 0 && i2 <= 6) {
            return i2;
        }
        throw new IllegalArgumentException(new StringBuilder(42).append(i2).append(" is not a valid enum SampleInfo").toString());
    }

    public edl() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
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
            for (int i2 = 0; i2 < this.l.length; i2++) {
                egg egg = this.l[i2];
                if (egg != null) {
                    dlx.a(4, egg);
                }
            }
        }
        if (this.m != null && this.m.length > 0) {
            for (int i3 = 0; i3 < this.m.length; i3++) {
                efw efw = this.m[i3];
                if (efw != null) {
                    dlx.a(5, efw);
                }
            }
        }
        if (this.h != null) {
            dlx.a(6, this.h);
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
            dlx.a(11, this.e);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int a2 = super.a();
        if (this.a != Integer.MIN_VALUE) {
            a2 += dlx.c(1, this.a);
        }
        if (this.f != Integer.MIN_VALUE) {
            a2 += dlx.c(2, this.f);
        }
        if (this.g != null) {
            a2 += dlx.c(3, this.g.longValue());
        }
        if (this.l != null && this.l.length > 0) {
            int i2 = a2;
            for (int i3 = 0; i3 < this.l.length; i3++) {
                egg egg = this.l[i3];
                if (egg != null) {
                    i2 += dlx.b(4, egg);
                }
            }
            a2 = i2;
        }
        if (this.m != null && this.m.length > 0) {
            for (int i4 = 0; i4 < this.m.length; i4++) {
                efw efw = this.m[i4];
                if (efw != null) {
                    a2 += dlx.b(5, efw);
                }
            }
        }
        if (this.h != null) {
            a2 += dlx.b(6, this.h);
        }
        if (this.i != null) {
            a2 += dlx.c(7, this.i.longValue());
        }
        if (this.b != null) {
            this.b.longValue();
            a2 += dlx.c(64) + 8;
        }
        if (this.c != null) {
            a2 += dlx.b(9, this.c);
        }
        if (this.d != null) {
            a2 += dlx.b(10, this.d);
        }
        if (this.e != null) {
            return a2 + dlx.b(11, this.e);
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final edl a(dlw dlw) {
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    int i2 = dlw.i();
                    try {
                        this.a = a(dlw.e());
                        break;
                    } catch (IllegalArgumentException e2) {
                        dlw.e(i2);
                        a(dlw, a2);
                        break;
                    }
                case 16:
                    int i3 = dlw.i();
                    try {
                        this.f = a(dlw.e());
                        break;
                    } catch (IllegalArgumentException e3) {
                        dlw.e(i3);
                        a(dlw, a2);
                        break;
                    }
                case 24:
                    this.g = Long.valueOf(dlw.b());
                    break;
                case 34:
                    int a3 = dmh.a(dlw, 34);
                    int length = this.l == null ? 0 : this.l.length;
                    egg[] eggArr = new egg[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.l, 0, eggArr, 0, length);
                    }
                    while (length < eggArr.length - 1) {
                        eggArr[length] = new egg();
                        dlw.a(eggArr[length]);
                        dlw.a();
                        length++;
                    }
                    eggArr[length] = new egg();
                    dlw.a(eggArr[length]);
                    this.l = eggArr;
                    break;
                case 42:
                    int a4 = dmh.a(dlw, 42);
                    int length2 = this.m == null ? 0 : this.m.length;
                    efw[] efwArr = new efw[(a4 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.m, 0, efwArr, 0, length2);
                    }
                    while (length2 < efwArr.length - 1) {
                        efwArr[length2] = new efw();
                        dlw.a(efwArr[length2]);
                        dlw.a();
                        length2++;
                    }
                    efwArr[length2] = new efw();
                    dlw.a(efwArr[length2]);
                    this.m = efwArr;
                    break;
                case by.aU:
                    if (this.h == null) {
                        this.h = new egf();
                    }
                    dlw.a(this.h);
                    break;
                case by.ba:
                    this.i = Long.valueOf(dlw.b());
                    break;
                case 65:
                    this.b = Long.valueOf(dlw.g());
                    break;
                case 74:
                    this.c = dlw.d();
                    break;
                case 82:
                    this.d = dlw.d();
                    break;
                case 90:
                    if (this.e == null) {
                        this.e = new eeo();
                    }
                    dlw.a(this.e);
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
