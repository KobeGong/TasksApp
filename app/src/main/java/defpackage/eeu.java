package defpackage;

/* renamed from: eeu reason: default package */
/* compiled from: PG */
public final class eeu extends defpackage.dlz {
    private static volatile defpackage.eeu[] d;
    public defpackage.efo[] a;
    public defpackage.edu[] b;
    public defpackage.eed c;

    public static defpackage.eeu[] d() {
        if (d == null) {
            synchronized (defpackage.dmd.b) {
                if (d == null) {
                    d = new defpackage.eeu[0];
                }
            }
        }
        return d;
    }

    public eeu() {
        this.a = defpackage.efo.d();
        this.b = defpackage.edu.d();
        this.c = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null && this.a.length > 0) {
            for (defpackage.efo efo : this.a) {
                if (efo != null) {
                    dlx.a(1, (defpackage.dmf) efo);
                }
            }
        }
        if (this.b != null && this.b.length > 0) {
            for (defpackage.edu edu : this.b) {
                if (edu != null) {
                    dlx.a(2, (defpackage.dmf) edu);
                }
            }
        }
        if (this.c != null) {
            dlx.a(3, (defpackage.dmf) this.c);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null && this.a.length > 0) {
            int i = a2;
            for (defpackage.efo efo : this.a) {
                if (efo != null) {
                    i += defpackage.dlx.b(1, (defpackage.dmf) efo);
                }
            }
            a2 = i;
        }
        if (this.b != null && this.b.length > 0) {
            for (defpackage.edu edu : this.b) {
                if (edu != null) {
                    a2 += defpackage.dlx.b(2, (defpackage.dmf) edu);
                }
            }
        }
        if (this.c != null) {
            return a2 + defpackage.dlx.b(3, (defpackage.dmf) this.c);
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
                    defpackage.efo[] efoArr = new defpackage.efo[(a3 + length)];
                    if (length != 0) {
                        java.lang.System.arraycopy(this.a, 0, efoArr, 0, length);
                    }
                    while (length < efoArr.length - 1) {
                        efoArr[length] = new defpackage.efo();
                        dlw.a((defpackage.dmf) efoArr[length]);
                        dlw.a();
                        length++;
                    }
                    efoArr[length] = new defpackage.efo();
                    dlw.a((defpackage.dmf) efoArr[length]);
                    this.a = efoArr;
                    continue;
                case 18:
                    int a4 = defpackage.dmh.a(dlw, 18);
                    int length2 = this.b == null ? 0 : this.b.length;
                    defpackage.edu[] eduArr = new defpackage.edu[(a4 + length2)];
                    if (length2 != 0) {
                        java.lang.System.arraycopy(this.b, 0, eduArr, 0, length2);
                    }
                    while (length2 < eduArr.length - 1) {
                        eduArr[length2] = new defpackage.edu();
                        dlw.a((defpackage.dmf) eduArr[length2]);
                        dlw.a();
                        length2++;
                    }
                    eduArr[length2] = new defpackage.edu();
                    dlw.a((defpackage.dmf) eduArr[length2]);
                    this.b = eduArr;
                    continue;
                case 26:
                    if (this.c == null) {
                        this.c = new defpackage.eed();
                    }
                    dlw.a((defpackage.dmf) this.c);
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
