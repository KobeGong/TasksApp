package defpackage;

/* renamed from: edp  reason: default package */
/* compiled from: PG */
public final class edp extends dlz {
    private int[] a = dmh.a;
    private int b = Integer.MIN_VALUE;
    private Integer c = null;
    private Integer d = null;

    public edp() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null && this.a.length > 0) {
            for (int i = 0; i < this.a.length; i++) {
                dlx.a(1, this.a[i]);
            }
        }
        if (this.b != Integer.MIN_VALUE) {
            dlx.a(2, this.b);
        }
        if (this.c != null) {
            dlx.a(3, this.c.intValue());
        }
        if (this.d != null) {
            dlx.a(4, this.d.intValue());
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int i;
        int a2 = super.a();
        if (this.a == null || this.a.length <= 0) {
            i = a2;
        } else {
            int i2 = 0;
            for (int i3 = 0; i3 < this.a.length; i3++) {
                i2 += dlx.a(this.a[i3]);
            }
            i = a2 + i2 + (this.a.length * 1);
        }
        if (this.b != Integer.MIN_VALUE) {
            i += dlx.c(2, this.b);
        }
        if (this.c != null) {
            i += dlx.c(3, this.c.intValue());
        }
        if (this.d != null) {
            return i + dlx.c(4, this.d.intValue());
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        return r7;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.edp a(defpackage.dlw r8) {
        /*
        // Method dump skipped, instructions count: 236
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edp.a(dlw):edp");
    }
}
