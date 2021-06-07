package defpackage;

/* renamed from: eeu  reason: default package */
/* compiled from: PG */
public final class eeu extends dlz {
    private static volatile eeu[] d;
    public efo[] a = efo.d();
    public edu[] b = edu.d();
    public eed c = null;

    public static eeu[] d() {
        if (d == null) {
            synchronized (dmd.b) {
                if (d == null) {
                    d = new eeu[0];
                }
            }
        }
        return d;
    }

    public eeu() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null && this.a.length > 0) {
            for (int i = 0; i < this.a.length; i++) {
                efo efo = this.a[i];
                if (efo != null) {
                    dlx.a(1, efo);
                }
            }
        }
        if (this.b != null && this.b.length > 0) {
            for (int i2 = 0; i2 < this.b.length; i2++) {
                edu edu = this.b[i2];
                if (edu != null) {
                    dlx.a(2, edu);
                }
            }
        }
        if (this.c != null) {
            dlx.a(3, this.c);
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
                efo efo = this.a[i2];
                if (efo != null) {
                    i += dlx.b(1, efo);
                }
            }
            a2 = i;
        }
        if (this.b != null && this.b.length > 0) {
            for (int i3 = 0; i3 < this.b.length; i3++) {
                edu edu = this.b[i3];
                if (edu != null) {
                    a2 += dlx.b(2, edu);
                }
            }
        }
        if (this.c != null) {
            return a2 + dlx.b(3, this.c);
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
                    efo[] efoArr = new efo[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.a, 0, efoArr, 0, length);
                    }
                    while (length < efoArr.length - 1) {
                        efoArr[length] = new efo();
                        dlw.a(efoArr[length]);
                        dlw.a();
                        length++;
                    }
                    efoArr[length] = new efo();
                    dlw.a(efoArr[length]);
                    this.a = efoArr;
                    break;
                case 18:
                    int a4 = dmh.a(dlw, 18);
                    int length2 = this.b == null ? 0 : this.b.length;
                    edu[] eduArr = new edu[(a4 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.b, 0, eduArr, 0, length2);
                    }
                    while (length2 < eduArr.length - 1) {
                        eduArr[length2] = new edu();
                        dlw.a(eduArr[length2]);
                        dlw.a();
                        length2++;
                    }
                    eduArr[length2] = new edu();
                    dlw.a(eduArr[length2]);
                    this.b = eduArr;
                    break;
                case 26:
                    if (this.c == null) {
                        this.c = new eed();
                    }
                    dlw.a(this.c);
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
