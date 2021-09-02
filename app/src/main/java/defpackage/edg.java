package defpackage;

/* renamed from: edg reason: default package */
/* compiled from: PG */
public final class edg extends defpackage.dlz {
    private java.lang.Integer a;
    private java.lang.Integer b;
    private java.lang.Integer c;
    private defpackage.eeg[] d;

    public edg() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = defpackage.eeg.d();
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a.intValue());
        }
        if (this.b != null) {
            dlx.a(2, this.b.intValue());
        }
        if (this.c != null) {
            dlx.a(3, this.c.intValue());
        }
        if (this.d != null && this.d.length > 0) {
            for (defpackage.eeg eeg : this.d) {
                if (eeg != null) {
                    dlx.a(4, (defpackage.dmf) eeg);
                }
            }
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += defpackage.dlx.c(1, this.a.intValue());
        }
        if (this.b != null) {
            a2 += defpackage.dlx.c(2, this.b.intValue());
        }
        if (this.c != null) {
            a2 += defpackage.dlx.c(3, this.c.intValue());
        }
        if (this.d == null || this.d.length <= 0) {
            return a2;
        }
        int i = a2;
        for (defpackage.eeg eeg : this.d) {
            if (eeg != null) {
                i += defpackage.dlx.b(4, (defpackage.dmf) eeg);
            }
        }
        return i;
    }

    public final /* synthetic */ defpackage.dmf a(defpackage.dlw dlw) {
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    this.a = java.lang.Integer.valueOf(dlw.e());
                    continue;
                case 16:
                    this.b = java.lang.Integer.valueOf(dlw.e());
                    continue;
                case 24:
                    this.c = java.lang.Integer.valueOf(dlw.e());
                    continue;
                case 34:
                    int a3 = defpackage.dmh.a(dlw, 34);
                    int length = this.d == null ? 0 : this.d.length;
                    defpackage.eeg[] eegArr = new defpackage.eeg[(a3 + length)];
                    if (length != 0) {
                        java.lang.System.arraycopy(this.d, 0, eegArr, 0, length);
                    }
                    while (length < eegArr.length - 1) {
                        eegArr[length] = new defpackage.eeg();
                        dlw.a((defpackage.dmf) eegArr[length]);
                        dlw.a();
                        length++;
                    }
                    eegArr[length] = new defpackage.eeg();
                    dlw.a((defpackage.dmf) eegArr[length]);
                    this.d = eegArr;
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
