package defpackage;

/* renamed from: efi  reason: default package */
/* compiled from: PG */
public final class efi extends dlz {
    public Long a = null;
    public efs[] b = efs.d();

    public efi() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null) {
            dlx.b(1, this.a.longValue());
        }
        if (this.b != null && this.b.length > 0) {
            for (int i = 0; i < this.b.length; i++) {
                efs efs = this.b[i];
                if (efs != null) {
                    dlx.a(2, efs);
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
            this.a.longValue();
            a2 += dlx.c(8) + 8;
        }
        if (this.b == null || this.b.length <= 0) {
            return a2;
        }
        int i = a2;
        for (int i2 = 0; i2 < this.b.length; i2++) {
            efs efs = this.b[i2];
            if (efs != null) {
                i += dlx.b(2, efs);
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
                case 9:
                    this.a = Long.valueOf(dlw.g());
                    break;
                case 18:
                    int a3 = dmh.a(dlw, 18);
                    int length = this.b == null ? 0 : this.b.length;
                    efs[] efsArr = new efs[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.b, 0, efsArr, 0, length);
                    }
                    while (length < efsArr.length - 1) {
                        efsArr[length] = new efs();
                        dlw.a(efsArr[length]);
                        dlw.a();
                        length++;
                    }
                    efsArr[length] = new efs();
                    dlw.a(efsArr[length]);
                    this.b = efsArr;
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
