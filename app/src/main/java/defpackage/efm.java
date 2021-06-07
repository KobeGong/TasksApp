package defpackage;

/* renamed from: efm  reason: default package */
/* compiled from: PG */
public final class efm extends dlz {
    private static volatile efm[] a;
    private int b = Integer.MIN_VALUE;
    private int[] c = dmh.a;

    public static efm[] d() {
        if (a == null) {
            synchronized (dmd.b) {
                if (a == null) {
                    a = new efm[0];
                }
            }
        }
        return a;
    }

    public efm() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.b != Integer.MIN_VALUE) {
            dlx.a(1, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                dlx.a(2, this.c[i]);
            }
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int a2 = super.a();
        if (this.b != Integer.MIN_VALUE) {
            a2 += dlx.c(1, this.b);
        }
        if (this.c == null || this.c.length <= 0) {
            return a2;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.c.length; i2++) {
            i += dlx.a(this.c[i2]);
        }
        return a2 + i + (this.c.length * 1);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        return r9;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.efm a(defpackage.dlw r10) {
        /*
        // Method dump skipped, instructions count: 224
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efm.a(dlw):efm");
    }
}
