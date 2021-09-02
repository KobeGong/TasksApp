package defpackage;

/* renamed from: edt reason: default package */
/* compiled from: PG */
public final class edt extends defpackage.dlz {
    private int[] a;
    private defpackage.edg b;
    private int c;
    private java.lang.String d;
    private int e;
    private int f;
    private java.lang.String g;
    private defpackage.efy h;
    private int i;

    public edt() {
        this.a = defpackage.dmh.a;
        this.b = null;
        this.c = Integer.MIN_VALUE;
        this.d = null;
        this.e = Integer.MIN_VALUE;
        this.f = Integer.MIN_VALUE;
        this.g = null;
        this.h = null;
        this.i = Integer.MIN_VALUE;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null && this.a.length > 0) {
            for (int a2 : this.a) {
                dlx.a(1, a2);
            }
        }
        if (this.b != null) {
            dlx.a(2, (defpackage.dmf) this.b);
        }
        if (this.c != Integer.MIN_VALUE) {
            dlx.a(3, this.c);
        }
        if (this.d != null) {
            dlx.a(4, this.d);
        }
        if (this.e != Integer.MIN_VALUE) {
            dlx.a(5, this.e);
        }
        if (this.f != Integer.MIN_VALUE) {
            dlx.a(6, this.f);
        }
        if (this.g != null) {
            dlx.a(7, this.g);
        }
        if (this.h != null) {
            dlx.a(8, (defpackage.dmf) this.h);
        }
        if (this.i != Integer.MIN_VALUE) {
            dlx.a(9, this.i);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int i2;
        int a2 = super.a();
        if (this.a == null || this.a.length <= 0) {
            i2 = a2;
        } else {
            int i3 = 0;
            for (int a3 : this.a) {
                i3 += defpackage.dlx.a(a3);
            }
            i2 = a2 + i3 + (this.a.length * 1);
        }
        if (this.b != null) {
            i2 += defpackage.dlx.b(2, (defpackage.dmf) this.b);
        }
        if (this.c != Integer.MIN_VALUE) {
            i2 += defpackage.dlx.c(3, this.c);
        }
        if (this.d != null) {
            i2 += defpackage.dlx.b(4, this.d);
        }
        if (this.e != Integer.MIN_VALUE) {
            i2 += defpackage.dlx.c(5, this.e);
        }
        if (this.f != Integer.MIN_VALUE) {
            i2 += defpackage.dlx.c(6, this.f);
        }
        if (this.g != null) {
            i2 += defpackage.dlx.b(7, this.g);
        }
        if (this.h != null) {
            i2 += defpackage.dlx.b(8, (defpackage.dmf) this.h);
        }
        if (this.i != Integer.MIN_VALUE) {
            return i2 + defpackage.dlx.c(9, this.i);
        }
        return i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final defpackage.edt a(defpackage.dlw dlw) {
        int length;
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    int a3 = defpackage.dmh.a(dlw, 8);
                    int[] iArr = new int[a3];
                    int i2 = 0;
                    for (int i3 = 0; i3 < a3; i3++) {
                        if (i3 != 0) {
                            dlw.a();
                        }
                        int i4 = dlw.i();
                        try {
                            iArr[i2] = defpackage.ehw.a(dlw.e());
                            i2++;
                        } catch (java.lang.IllegalArgumentException e2) {
                            dlw.e(i4);
                            a(dlw, a2);
                        }
                    }
                    if (i2 != 0) {
                        int length2 = this.a == null ? 0 : this.a.length;
                        if (length2 != 0 || i2 != iArr.length) {
                            int[] iArr2 = new int[(length2 + i2)];
                            if (length2 != 0) {
                                java.lang.System.arraycopy(this.a, 0, iArr2, 0, length2);
                            }
                            java.lang.System.arraycopy(iArr, 0, iArr2, length2, i2);
                            this.a = iArr2;
                            break;
                        } else {
                            this.a = iArr;
                            break;
                        }
                    } else {
                        continue;
                    }
                    break;
                case 10:
                    int c2 = dlw.c(dlw.e());
                    int i5 = dlw.i();
                    int i6 = 0;
                    while (dlw.h() > 0) {
                        try {
                            defpackage.ehw.a(dlw.e());
                            i6++;
                        } catch (java.lang.IllegalArgumentException e3) {
                        }
                    }
                    if (i6 != 0) {
                        dlw.e(i5);
                        if (this.a == null) {
                            length = 0;
                        } else {
                            length = this.a.length;
                        }
                        int[] iArr3 = new int[(i6 + length)];
                        if (length != 0) {
                            java.lang.System.arraycopy(this.a, 0, iArr3, 0, length);
                        }
                        while (dlw.h() > 0) {
                            int i7 = dlw.i();
                            try {
                                iArr3[length] = defpackage.ehw.a(dlw.e());
                                length++;
                            } catch (java.lang.IllegalArgumentException e4) {
                                dlw.e(i7);
                                a(dlw, 8);
                            }
                        }
                        this.a = iArr3;
                    }
                    dlw.d(c2);
                    continue;
                case 18:
                    if (this.b == null) {
                        this.b = new defpackage.edg();
                    }
                    dlw.a((defpackage.dmf) this.b);
                    continue;
                case 24:
                    int i8 = dlw.i();
                    try {
                        int e5 = dlw.e();
                        if (e5 < 0 || e5 > 10) {
                            throw new java.lang.IllegalArgumentException(e5 + " is not a valid enum ProvisionMode");
                        }
                        this.c = e5;
                        continue;
                    } catch (java.lang.IllegalArgumentException e6) {
                        dlw.e(i8);
                        a(dlw, a2);
                        break;
                    }
                case 34:
                    this.d = dlw.d();
                    continue;
                case 40:
                    int i9 = dlw.i();
                    try {
                        int e7 = dlw.e();
                        if (e7 < 0 || e7 > 3) {
                            throw new java.lang.IllegalArgumentException(e7 + " is not a valid enum EventState");
                        }
                        this.e = e7;
                        continue;
                    } catch (java.lang.IllegalArgumentException e8) {
                        dlw.e(i9);
                        a(dlw, a2);
                        break;
                    }
                case 48:
                    int i10 = dlw.i();
                    try {
                        int e9 = dlw.e();
                        if (e9 < 0 || e9 > 2) {
                            throw new java.lang.IllegalArgumentException(e9 + " is not a valid enum Mitigation");
                        }
                        this.f = e9;
                        continue;
                    } catch (java.lang.IllegalArgumentException e10) {
                        dlw.e(i10);
                        a(dlw, a2);
                        break;
                    }
                case 58:
                    this.g = dlw.d();
                    continue;
                case 66:
                    if (this.h == null) {
                        this.h = new defpackage.efy();
                    }
                    dlw.a((defpackage.dmf) this.h);
                    continue;
                case 72:
                    int i11 = dlw.i();
                    try {
                        int e11 = dlw.e();
                        if (e11 < 0 || e11 > 7) {
                            throw new java.lang.IllegalArgumentException(e11 + " is not a valid enum ProvisionEntryPoint");
                        }
                        this.i = e11;
                        continue;
                    } catch (java.lang.IllegalArgumentException e12) {
                        dlw.e(i11);
                        a(dlw, a2);
                        break;
                    }
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
