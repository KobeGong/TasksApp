package defpackage;

/* renamed from: efi reason: default package */
/* compiled from: PG */
public final class efi extends defpackage.dlz {
    public java.lang.Long a;
    public defpackage.efs[] b;

    public efi() {
        this.a = null;
        this.b = defpackage.efs.d();
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null) {
            dlx.b(1, this.a.longValue());
        }
        if (this.b != null && this.b.length > 0) {
            for (defpackage.efs efs : this.b) {
                if (efs != null) {
                    dlx.a(2, (defpackage.dmf) efs);
                }
            }
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            this.a.longValue();
            a2 += defpackage.dlx.c(8) + 8;
        }
        if (this.b == null || this.b.length <= 0) {
            return a2;
        }
        int i = a2;
        for (defpackage.efs efs : this.b) {
            if (efs != null) {
                i += defpackage.dlx.b(2, (defpackage.dmf) efs);
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
                case 9:
                    this.a = java.lang.Long.valueOf(dlw.g());
                    continue;
                case 18:
                    int a3 = defpackage.dmh.a(dlw, 18);
                    int length = this.b == null ? 0 : this.b.length;
                    defpackage.efs[] efsArr = new defpackage.efs[(a3 + length)];
                    if (length != 0) {
                        java.lang.System.arraycopy(this.b, 0, efsArr, 0, length);
                    }
                    while (length < efsArr.length - 1) {
                        efsArr[length] = new defpackage.efs();
                        dlw.a((defpackage.dmf) efsArr[length]);
                        dlw.a();
                        length++;
                    }
                    efsArr[length] = new defpackage.efs();
                    dlw.a((defpackage.dmf) efsArr[length]);
                    this.b = efsArr;
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
