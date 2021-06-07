package defpackage;

/* renamed from: efs  reason: default package */
/* compiled from: PG */
public final class efs extends dlz {
    private static volatile efs[] f;
    public String a = null;
    public Long b = null;
    public Long c = null;
    public Long d = null;
    public Long e = null;
    private Long g = null;
    private int h = Integer.MIN_VALUE;

    public static efs[] d() {
        if (f == null) {
            synchronized (dmd.b) {
                if (f == null) {
                    f = new efs[0];
                }
            }
        }
        return f;
    }

    public efs() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a);
        }
        if (this.b != null) {
            dlx.b(2, this.b.longValue());
        }
        if (this.c != null) {
            dlx.b(3, this.c.longValue());
        }
        if (this.d != null) {
            dlx.a(4, this.d.longValue());
        }
        if (this.e != null) {
            dlx.a(5, this.e.longValue());
        }
        if (this.g != null) {
            dlx.a(6, this.g.longValue());
        }
        if (this.h != Integer.MIN_VALUE) {
            dlx.a(7, this.h);
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
            this.b.longValue();
            a2 += dlx.c(16) + 8;
        }
        if (this.c != null) {
            this.c.longValue();
            a2 += dlx.c(24) + 8;
        }
        if (this.d != null) {
            a2 += dlx.c(4, this.d.longValue());
        }
        if (this.e != null) {
            a2 += dlx.c(5, this.e.longValue());
        }
        if (this.g != null) {
            a2 += dlx.c(6, this.g.longValue());
        }
        if (this.h != Integer.MIN_VALUE) {
            return a2 + dlx.c(7, this.h);
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        return r6;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.efs a(defpackage.dlw r7) {
        /*
        // Method dump skipped, instructions count: 162
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efs.a(dlw):efs");
    }
}
