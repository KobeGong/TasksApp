package defpackage;

/* renamed from: edt  reason: default package */
/* compiled from: PG */
public final class edt extends dlz {
    private int[] a = dmh.a;
    private edg b = null;
    private int c = Integer.MIN_VALUE;
    private String d = null;
    private int e = Integer.MIN_VALUE;
    private int f = Integer.MIN_VALUE;
    private String g = null;
    private efy h = null;
    private int i = Integer.MIN_VALUE;

    public edt() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null && this.a.length > 0) {
            for (int i2 = 0; i2 < this.a.length; i2++) {
                dlx.a(1, this.a[i2]);
            }
        }
        if (this.b != null) {
            dlx.a(2, this.b);
        }
        if (this.c != Integer.MIN_VALUE) {
            dlx.a(3, this.c);
        }
        if (this.d != null) {
            dlx.a(4, this.d);
        }
        if (this.e != Integer.MIN_VALUE) {
            dlx.a(5, this.e);
        }
        if (this.f != Integer.MIN_VALUE) {
            dlx.a(6, this.f);
        }
        if (this.g != null) {
            dlx.a(7, this.g);
        }
        if (this.h != null) {
            dlx.a(8, this.h);
        }
        if (this.i != Integer.MIN_VALUE) {
            dlx.a(9, this.i);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int i2;
        int a2 = super.a();
        if (this.a == null || this.a.length <= 0) {
            i2 = a2;
        } else {
            int i3 = 0;
            for (int i4 = 0; i4 < this.a.length; i4++) {
                i3 += dlx.a(this.a[i4]);
            }
            i2 = a2 + i3 + (this.a.length * 1);
        }
        if (this.b != null) {
            i2 += dlx.b(2, this.b);
        }
        if (this.c != Integer.MIN_VALUE) {
            i2 += dlx.c(3, this.c);
        }
        if (this.d != null) {
            i2 += dlx.b(4, this.d);
        }
        if (this.e != Integer.MIN_VALUE) {
            i2 += dlx.c(5, this.e);
        }
        if (this.f != Integer.MIN_VALUE) {
            i2 += dlx.c(6, this.f);
        }
        if (this.g != null) {
            i2 += dlx.b(7, this.g);
        }
        if (this.h != null) {
            i2 += dlx.b(8, this.h);
        }
        if (this.i != Integer.MIN_VALUE) {
            return i2 + dlx.c(9, this.i);
        }
        return i2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01c2, code lost:
        throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder(51).append(r2).append(" is not a valid enum ProvisionEntryPoint").toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x013e, code lost:
        throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder(42).append(r2).append(" is not a valid enum EventState").toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0173, code lost:
        throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder(42).append(r2).append(" is not a valid enum Mitigation").toString());
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.edt a(defpackage.dlw r10) {
        /*
        // Method dump skipped, instructions count: 500
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edt.a(dlw):edt");
    }
}
