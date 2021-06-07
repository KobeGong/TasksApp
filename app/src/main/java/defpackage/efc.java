package defpackage;

/* renamed from: efc  reason: default package */
/* compiled from: PG */
public final class efc extends dlz {
    private edr[] a = edr.d();
    private eds[] b = eds.d();
    private edi[] c = edi.d();
    private efj[] d = efj.d();
    private efm[] e = efm.d();
    private Integer f = null;

    public efc() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null && this.a.length > 0) {
            for (int i = 0; i < this.a.length; i++) {
                edr edr = this.a[i];
                if (edr != null) {
                    dlx.a(1, edr);
                }
            }
        }
        if (this.b != null && this.b.length > 0) {
            for (int i2 = 0; i2 < this.b.length; i2++) {
                eds eds = this.b[i2];
                if (eds != null) {
                    dlx.a(2, eds);
                }
            }
        }
        if (this.c != null && this.c.length > 0) {
            for (int i3 = 0; i3 < this.c.length; i3++) {
                edi edi = this.c[i3];
                if (edi != null) {
                    dlx.a(3, edi);
                }
            }
        }
        if (this.d != null && this.d.length > 0) {
            for (int i4 = 0; i4 < this.d.length; i4++) {
                efj efj = this.d[i4];
                if (efj != null) {
                    dlx.a(4, efj);
                }
            }
        }
        if (this.f != null) {
            dlx.a(5, this.f.intValue());
        }
        if (this.e != null && this.e.length > 0) {
            for (int i5 = 0; i5 < this.e.length; i5++) {
                efm efm = this.e[i5];
                if (efm != null) {
                    dlx.a(6, efm);
                }
            }
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int a2 = super.a();
        if (this.a != null && this.a.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.a.length; i2++) {
                edr edr = this.a[i2];
                if (edr != null) {
                    i += dlx.b(1, edr);
                }
            }
            a2 = i;
        }
        if (this.b != null && this.b.length > 0) {
            int i3 = a2;
            for (int i4 = 0; i4 < this.b.length; i4++) {
                eds eds = this.b[i4];
                if (eds != null) {
                    i3 += dlx.b(2, eds);
                }
            }
            a2 = i3;
        }
        if (this.c != null && this.c.length > 0) {
            int i5 = a2;
            for (int i6 = 0; i6 < this.c.length; i6++) {
                edi edi = this.c[i6];
                if (edi != null) {
                    i5 += dlx.b(3, edi);
                }
            }
            a2 = i5;
        }
        if (this.d != null && this.d.length > 0) {
            int i7 = a2;
            for (int i8 = 0; i8 < this.d.length; i8++) {
                efj efj = this.d[i8];
                if (efj != null) {
                    i7 += dlx.b(4, efj);
                }
            }
            a2 = i7;
        }
        if (this.f != null) {
            a2 += dlx.c(5, this.f.intValue());
        }
        if (this.e != null && this.e.length > 0) {
            for (int i9 = 0; i9 < this.e.length; i9++) {
                efm efm = this.e[i9];
                if (efm != null) {
                    a2 += dlx.b(6, efm);
                }
            }
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
                    int a3 = dmh.a(dlw, 10);
                    int length = this.a == null ? 0 : this.a.length;
                    edr[] edrArr = new edr[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.a, 0, edrArr, 0, length);
                    }
                    while (length < edrArr.length - 1) {
                        edrArr[length] = new edr();
                        dlw.a(edrArr[length]);
                        dlw.a();
                        length++;
                    }
                    edrArr[length] = new edr();
                    dlw.a(edrArr[length]);
                    this.a = edrArr;
                    break;
                case 18:
                    int a4 = dmh.a(dlw, 18);
                    int length2 = this.b == null ? 0 : this.b.length;
                    eds[] edsArr = new eds[(a4 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.b, 0, edsArr, 0, length2);
                    }
                    while (length2 < edsArr.length - 1) {
                        edsArr[length2] = new eds();
                        dlw.a(edsArr[length2]);
                        dlw.a();
                        length2++;
                    }
                    edsArr[length2] = new eds();
                    dlw.a(edsArr[length2]);
                    this.b = edsArr;
                    break;
                case 26:
                    int a5 = dmh.a(dlw, 26);
                    int length3 = this.c == null ? 0 : this.c.length;
                    edi[] ediArr = new edi[(a5 + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.c, 0, ediArr, 0, length3);
                    }
                    while (length3 < ediArr.length - 1) {
                        ediArr[length3] = new edi();
                        dlw.a(ediArr[length3]);
                        dlw.a();
                        length3++;
                    }
                    ediArr[length3] = new edi();
                    dlw.a(ediArr[length3]);
                    this.c = ediArr;
                    break;
                case 34:
                    int a6 = dmh.a(dlw, 34);
                    int length4 = this.d == null ? 0 : this.d.length;
                    efj[] efjArr = new efj[(a6 + length4)];
                    if (length4 != 0) {
                        System.arraycopy(this.d, 0, efjArr, 0, length4);
                    }
                    while (length4 < efjArr.length - 1) {
                        efjArr[length4] = new efj();
                        dlw.a(efjArr[length4]);
                        dlw.a();
                        length4++;
                    }
                    efjArr[length4] = new efj();
                    dlw.a(efjArr[length4]);
                    this.d = efjArr;
                    break;
                case 40:
                    this.f = Integer.valueOf(dlw.e());
                    break;
                case by.aU:
                    int a7 = dmh.a(dlw, 50);
                    int length5 = this.e == null ? 0 : this.e.length;
                    efm[] efmArr = new efm[(a7 + length5)];
                    if (length5 != 0) {
                        System.arraycopy(this.e, 0, efmArr, 0, length5);
                    }
                    while (length5 < efmArr.length - 1) {
                        efmArr[length5] = new efm();
                        dlw.a(efmArr[length5]);
                        dlw.a();
                        length5++;
                    }
                    efmArr[length5] = new efm();
                    dlw.a(efmArr[length5]);
                    this.e = efmArr;
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
