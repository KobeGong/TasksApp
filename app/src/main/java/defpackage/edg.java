package defpackage;

/* renamed from: edg  reason: default package */
/* compiled from: PG */
public final class edg extends dlz {
    private Integer a = null;
    private Integer b = null;
    private Integer c = null;
    private eeg[] d = eeg.d();

    public edg() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
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
            for (int i = 0; i < this.d.length; i++) {
                eeg eeg = this.d[i];
                if (eeg != null) {
                    dlx.a(4, eeg);
                }
            }
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += dlx.c(1, this.a.intValue());
        }
        if (this.b != null) {
            a2 += dlx.c(2, this.b.intValue());
        }
        if (this.c != null) {
            a2 += dlx.c(3, this.c.intValue());
        }
        if (this.d == null || this.d.length <= 0) {
            return a2;
        }
        int i = a2;
        for (int i2 = 0; i2 < this.d.length; i2++) {
            eeg eeg = this.d[i2];
            if (eeg != null) {
                i += dlx.b(4, eeg);
            }
        }
        return i;
    }

    @Override // defpackage.dmf
    public final /* synthetic */ dmf a(dlw dlw) {
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    this.a = Integer.valueOf(dlw.e());
                    break;
                case 16:
                    this.b = Integer.valueOf(dlw.e());
                    break;
                case 24:
                    this.c = Integer.valueOf(dlw.e());
                    break;
                case 34:
                    int a3 = dmh.a(dlw, 34);
                    int length = this.d == null ? 0 : this.d.length;
                    eeg[] eegArr = new eeg[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.d, 0, eegArr, 0, length);
                    }
                    while (length < eegArr.length - 1) {
                        eegArr[length] = new eeg();
                        dlw.a(eegArr[length]);
                        dlw.a();
                        length++;
                    }
                    eegArr[length] = new eeg();
                    dlw.a(eegArr[length]);
                    this.d = eegArr;
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
