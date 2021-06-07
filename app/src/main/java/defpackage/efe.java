package defpackage;

/* renamed from: efe  reason: default package */
/* compiled from: PG */
public final class efe extends dlz {
    private int a = Integer.MIN_VALUE;
    private Integer b = null;
    private int[] c = dmh.a;

    public efe() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != Integer.MIN_VALUE) {
            dlx.a(1, this.a);
        }
        if (this.b != null) {
            dlx.a(2, this.b.intValue());
        }
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                dlx.a(3, this.c[i]);
            }
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int a2 = super.a();
        if (this.a != Integer.MIN_VALUE) {
            a2 += dlx.c(1, this.a);
        }
        if (this.b != null) {
            a2 += dlx.c(2, this.b.intValue());
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
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        return r7;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.efe a(defpackage.dlw r8) {
        /*
        // Method dump skipped, instructions count: 216
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efe.a(dlw):efe");
    }
}
