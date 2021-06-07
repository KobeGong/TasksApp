package defpackage;

/* renamed from: edw  reason: default package */
/* compiled from: PG */
public final class edw extends dlz {
    public Boolean a = null;
    public efl b = null;
    public String c = null;
    public String d = null;
    public int e = Integer.MIN_VALUE;
    public Long f = null;
    public String g = null;

    public edw() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a.booleanValue());
        }
        if (this.b != null) {
            dlx.a(2, this.b);
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
        if (this.f != null) {
            dlx.b(6, this.f.longValue());
        }
        if (this.g != null) {
            dlx.a(7, this.g);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            this.a.booleanValue();
            a2 += dlx.c(8) + 1;
        }
        if (this.b != null) {
            a2 += dlx.b(2, this.b);
        }
        if (this.c != null) {
            a2 += dlx.b(3, this.c);
        }
        if (this.d != null) {
            a2 += dlx.b(4, this.d);
        }
        if (this.e != Integer.MIN_VALUE) {
            a2 += dlx.c(5, this.e);
        }
        if (this.f != null) {
            this.f.longValue();
            a2 += dlx.c(48) + 8;
        }
        if (this.g != null) {
            return a2 + dlx.b(7, this.g);
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder(41).append(r2).append(" is not a valid enum CrashType").toString());
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.edw a(defpackage.dlw r7) {
        /*
        // Method dump skipped, instructions count: 160
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edw.a(dlw):edw");
    }
}
