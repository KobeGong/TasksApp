package defpackage;

/* renamed from: edo  reason: default package */
/* compiled from: PG */
public final class edo extends dlz {
    private Integer a = null;
    private Integer b = null;
    private String c = null;
    private String d = null;
    private int e = Integer.MIN_VALUE;

    public edo() {
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
            dlx.a(3, this.c);
        }
        if (this.d != null) {
            dlx.a(4, this.d);
        }
        if (this.e != Integer.MIN_VALUE) {
            dlx.a(5, this.e);
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
            a2 += dlx.b(3, this.c);
        }
        if (this.d != null) {
            a2 += dlx.b(4, this.d);
        }
        if (this.e != Integer.MIN_VALUE) {
            return a2 + dlx.c(5, this.e);
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        return r6;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.edo a(defpackage.dlw r7) {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edo.a(dlw):edo");
    }
}
