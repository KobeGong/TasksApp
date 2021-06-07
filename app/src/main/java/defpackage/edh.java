package defpackage;

/* renamed from: edh  reason: default package */
/* compiled from: PG */
public final class edh extends dlz {
    public String a = null;
    public String b = null;
    public int c = Integer.MIN_VALUE;
    public Long d = null;
    public String e = null;

    public edh() {
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
        if (this.c != Integer.MIN_VALUE) {
            dlx.a(3, this.c);
        }
        if (this.d != null) {
            dlx.a(4, this.d.longValue());
        }
        if (this.e != null) {
            dlx.a(5, this.e);
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
        if (this.c != Integer.MIN_VALUE) {
            a2 += dlx.c(3, this.c);
        }
        if (this.d != null) {
            a2 += dlx.c(4, this.d.longValue());
        }
        if (this.e != null) {
            return a2 + dlx.b(5, this.e);
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        return r6;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.edh a(defpackage.dlw r7) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edh.a(dlw):edh");
    }
}
