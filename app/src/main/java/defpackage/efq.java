package defpackage;

/* renamed from: efq  reason: default package */
/* compiled from: PG */
public final class efq extends dlz {
    private static volatile efq[] a;
    private efp[] b = efp.d();
    private int c = Integer.MIN_VALUE;

    public static efq[] d() {
        if (a == null) {
            synchronized (dmd.b) {
                if (a == null) {
                    a = new efq[0];
                }
            }
        }
        return a;
    }

    public efq() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.b != null && this.b.length > 0) {
            for (int i = 0; i < this.b.length; i++) {
                efp efp = this.b[i];
                if (efp != null) {
                    dlx.a(1, efp);
                }
            }
        }
        if (this.c != Integer.MIN_VALUE) {
            dlx.a(2, this.c);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int a2 = super.a();
        if (this.b != null && this.b.length > 0) {
            for (int i = 0; i < this.b.length; i++) {
                efp efp = this.b[i];
                if (efp != null) {
                    a2 += dlx.b(1, efp);
                }
            }
        }
        if (this.c != Integer.MIN_VALUE) {
            return a2 + dlx.c(2, this.c);
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        return r7;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.efq a(defpackage.dlw r8) {
        /*
        // Method dump skipped, instructions count: 144
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efq.a(dlw):efq");
    }
}
