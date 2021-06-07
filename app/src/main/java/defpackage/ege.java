package defpackage;

/* renamed from: ege  reason: default package */
/* compiled from: PG */
public final class ege extends dlz {
    private String a = null;
    private String b = null;
    private Integer c = null;
    private int d = Integer.MIN_VALUE;
    private int e = Integer.MIN_VALUE;
    private String f = null;

    public ege() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a);
        }
        if (this.b != null) {
            dlx.a(2, this.b);
        }
        if (this.c != null) {
            dlx.a(3, this.c.intValue());
        }
        if (this.d != Integer.MIN_VALUE) {
            dlx.a(4, this.d);
        }
        if (this.e != Integer.MIN_VALUE) {
            dlx.a(5, this.e);
        }
        if (this.f != null) {
            dlx.a(6, this.f);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += dlx.b(1, this.a);
        }
        if (this.b != null) {
            a2 += dlx.b(2, this.b);
        }
        if (this.c != null) {
            a2 += dlx.c(3, this.c.intValue());
        }
        if (this.d != Integer.MIN_VALUE) {
            a2 += dlx.c(4, this.d);
        }
        if (this.e != Integer.MIN_VALUE) {
            a2 += dlx.c(5, this.e);
        }
        if (this.f != null) {
            return a2 + dlx.b(6, this.f);
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
        throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder(38).append(r2).append(" is not a valid enum Source").toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        return r6;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ege a(defpackage.dlw r7) {
        /*
        // Method dump skipped, instructions count: 180
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ege.a(dlw):ege");
    }
}
