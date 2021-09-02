package defpackage;

/* renamed from: efc reason: default package */
/* compiled from: PG */
public final class efc extends defpackage.dlz {
    private defpackage.edr[] a;
    private defpackage.eds[] b;
    private defpackage.edi[] c;
    private defpackage.efj[] d;
    private defpackage.efm[] e;
    private java.lang.Integer f;

    public efc() {
        this.a = defpackage.edr.d();
        this.b = defpackage.eds.d();
        this.c = defpackage.edi.d();
        this.d = defpackage.efj.d();
        this.e = defpackage.efm.d();
        this.f = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null && this.a.length > 0) {
            for (defpackage.edr edr : this.a) {
                if (edr != null) {
                    dlx.a(1, (defpackage.dmf) edr);
                }
            }
        }
        if (this.b != null && this.b.length > 0) {
            for (defpackage.eds eds : this.b) {
                if (eds != null) {
                    dlx.a(2, (defpackage.dmf) eds);
                }
            }
        }
        if (this.c != null && this.c.length > 0) {
            for (defpackage.edi edi : this.c) {
                if (edi != null) {
                    dlx.a(3, (defpackage.dmf) edi);
                }
            }
        }
        if (this.d != null && this.d.length > 0) {
            for (defpackage.efj efj : this.d) {
                if (efj != null) {
                    dlx.a(4, (defpackage.dmf) efj);
                }
            }
        }
        if (this.f != null) {
            dlx.a(5, this.f.intValue());
        }
        if (this.e != null && this.e.length > 0) {
            for (defpackage.efm efm : this.e) {
                if (efm != null) {
                    dlx.a(6, (defpackage.dmf) efm);
                }
            }
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null && this.a.length > 0) {
            int i = a2;
            for (defpackage.edr edr : this.a) {
                if (edr != null) {
                    i += defpackage.dlx.b(1, (defpackage.dmf) edr);
                }
            }
            a2 = i;
        }
        if (this.b != null && this.b.length > 0) {
            int i2 = a2;
            for (defpackage.eds eds : this.b) {
                if (eds != null) {
                    i2 += defpackage.dlx.b(2, (defpackage.dmf) eds);
                }
            }
            a2 = i2;
        }
        if (this.c != null && this.c.length > 0) {
            int i3 = a2;
            for (defpackage.edi edi : this.c) {
                if (edi != null) {
                    i3 += defpackage.dlx.b(3, (defpackage.dmf) edi);
                }
            }
            a2 = i3;
        }
        if (this.d != null && this.d.length > 0) {
            int i4 = a2;
            for (defpackage.efj efj : this.d) {
                if (efj != null) {
                    i4 += defpackage.dlx.b(4, (defpackage.dmf) efj);
                }
            }
            a2 = i4;
        }
        if (this.f != null) {
            a2 += defpackage.dlx.c(5, this.f.intValue());
        }
        if (this.e != null && this.e.length > 0) {
            for (defpackage.efm efm : this.e) {
                if (efm != null) {
                    a2 += defpackage.dlx.b(6, (defpackage.dmf) efm);
                }
            }
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
                    int a3 = defpackage.dmh.a(dlw, 10);
                    int length = this.a == null ? 0 : this.a.length;
                    defpackage.edr[] edrArr = new defpackage.edr[(a3 + length)];
                    if (length != 0) {
                        java.lang.System.arraycopy(this.a, 0, edrArr, 0, length);
                    }
                    while (length < edrArr.length - 1) {
                        edrArr[length] = new defpackage.edr();
                        dlw.a((defpackage.dmf) edrArr[length]);
                        dlw.a();
                        length++;
                    }
                    edrArr[length] = new defpackage.edr();
                    dlw.a((defpackage.dmf) edrArr[length]);
                    this.a = edrArr;
                    continue;
                case 18:
                    int a4 = defpackage.dmh.a(dlw, 18);
                    int length2 = this.b == null ? 0 : this.b.length;
                    defpackage.eds[] edsArr = new defpackage.eds[(a4 + length2)];
                    if (length2 != 0) {
                        java.lang.System.arraycopy(this.b, 0, edsArr, 0, length2);
                    }
                    while (length2 < edsArr.length - 1) {
                        edsArr[length2] = new defpackage.eds();
                        dlw.a((defpackage.dmf) edsArr[length2]);
                        dlw.a();
                        length2++;
                    }
                    edsArr[length2] = new defpackage.eds();
                    dlw.a((defpackage.dmf) edsArr[length2]);
                    this.b = edsArr;
                    continue;
                case 26:
                    int a5 = defpackage.dmh.a(dlw, 26);
                    int length3 = this.c == null ? 0 : this.c.length;
                    defpackage.edi[] ediArr = new defpackage.edi[(a5 + length3)];
                    if (length3 != 0) {
                        java.lang.System.arraycopy(this.c, 0, ediArr, 0, length3);
                    }
                    while (length3 < ediArr.length - 1) {
                        ediArr[length3] = new defpackage.edi();
                        dlw.a((defpackage.dmf) ediArr[length3]);
                        dlw.a();
                        length3++;
                    }
                    ediArr[length3] = new defpackage.edi();
                    dlw.a((defpackage.dmf) ediArr[length3]);
                    this.c = ediArr;
                    continue;
                case 34:
                    int a6 = defpackage.dmh.a(dlw, 34);
                    int length4 = this.d == null ? 0 : this.d.length;
                    defpackage.efj[] efjArr = new defpackage.efj[(a6 + length4)];
                    if (length4 != 0) {
                        java.lang.System.arraycopy(this.d, 0, efjArr, 0, length4);
                    }
                    while (length4 < efjArr.length - 1) {
                        efjArr[length4] = new defpackage.efj();
                        dlw.a((defpackage.dmf) efjArr[length4]);
                        dlw.a();
                        length4++;
                    }
                    efjArr[length4] = new defpackage.efj();
                    dlw.a((defpackage.dmf) efjArr[length4]);
                    this.d = efjArr;
                    continue;
                case 40:
                    this.f = java.lang.Integer.valueOf(dlw.e());
                    continue;
                case 50:
                    int a7 = defpackage.dmh.a(dlw, 50);
                    int length5 = this.e == null ? 0 : this.e.length;
                    defpackage.efm[] efmArr = new defpackage.efm[(a7 + length5)];
                    if (length5 != 0) {
                        java.lang.System.arraycopy(this.e, 0, efmArr, 0, length5);
                    }
                    while (length5 < efmArr.length - 1) {
                        efmArr[length5] = new defpackage.efm();
                        dlw.a((defpackage.dmf) efmArr[length5]);
                        dlw.a();
                        length5++;
                    }
                    efmArr[length5] = new defpackage.efm();
                    dlw.a((defpackage.dmf) efmArr[length5]);
                    this.e = efmArr;
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
