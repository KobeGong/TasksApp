package defpackage;

/* renamed from: eer  reason: default package */
/* compiled from: PG */
public final class eer extends dlz {
    private static volatile eer[] v;
    public String a = null;
    public String b = null;
    public Integer c = null;
    public Integer d = null;
    public Integer e = null;
    public Integer f = null;
    public Integer g = null;
    public int h = Integer.MIN_VALUE;
    public edf i = null;
    public eeq l = null;
    public eeo m = null;
    public Long n = null;
    public int o = Integer.MIN_VALUE;
    public int p = Integer.MIN_VALUE;
    public Integer q = null;
    public Integer r = null;
    public String s = null;
    public long[] t = dmh.b;
    public String u = null;
    private efv[] w = efv.d();
    private int x = Integer.MIN_VALUE;
    private efn y = null;

    public static eer[] d() {
        if (v == null) {
            synchronized (dmd.b) {
                if (v == null) {
                    v = new eer[0];
                }
            }
        }
        return v;
    }

    public eer() {
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
        if (this.d != null) {
            dlx.a(4, this.d.intValue());
        }
        if (this.e != null) {
            dlx.a(5, this.e.intValue());
        }
        if (this.f != null) {
            dlx.b(6, this.f.intValue());
        }
        if (this.g != null) {
            dlx.b(7, this.g.intValue());
        }
        if (this.h != Integer.MIN_VALUE) {
            dlx.a(8, this.h);
        }
        if (this.w != null && this.w.length > 0) {
            for (int i2 = 0; i2 < this.w.length; i2++) {
                efv efv = this.w[i2];
                if (efv != null) {
                    dlx.a(9, efv);
                }
            }
        }
        if (this.i != null) {
            dlx.a(10, this.i);
        }
        if (this.l != null) {
            dlx.a(11, this.l);
        }
        if (this.m != null) {
            dlx.a(12, this.m);
        }
        if (this.n != null) {
            dlx.a(13, this.n.longValue());
        }
        if (this.o != Integer.MIN_VALUE) {
            dlx.a(14, this.o);
        }
        if (this.p != Integer.MIN_VALUE) {
            dlx.a(15, this.p);
        }
        if (this.r != null) {
            dlx.a(16, this.r.intValue());
        }
        if (this.s != null) {
            dlx.a(17, this.s);
        }
        if (this.x != Integer.MIN_VALUE) {
            dlx.a(18, this.x);
        }
        if (this.q != null) {
            dlx.a(19, this.q.intValue());
        }
        if (this.u != null) {
            dlx.a(20, this.u);
        }
        if (this.t != null && this.t.length > 0) {
            for (int i3 = 0; i3 < this.t.length; i3++) {
                dlx.b(21, this.t[i3]);
            }
        }
        if (this.y != null) {
            dlx.a(22, this.y);
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
        if (this.d != null) {
            a2 += dlx.c(4, this.d.intValue());
        }
        if (this.e != null) {
            a2 += dlx.c(5, this.e.intValue());
        }
        if (this.f != null) {
            a2 += dlx.d(6, this.f.intValue());
        }
        if (this.g != null) {
            a2 += dlx.d(7, this.g.intValue());
        }
        if (this.h != Integer.MIN_VALUE) {
            a2 += dlx.c(8, this.h);
        }
        if (this.w != null && this.w.length > 0) {
            int i2 = a2;
            for (int i3 = 0; i3 < this.w.length; i3++) {
                efv efv = this.w[i3];
                if (efv != null) {
                    i2 += dlx.b(9, efv);
                }
            }
            a2 = i2;
        }
        if (this.i != null) {
            a2 += dlx.b(10, this.i);
        }
        if (this.l != null) {
            a2 += dlx.b(11, this.l);
        }
        if (this.m != null) {
            a2 += dlx.b(12, this.m);
        }
        if (this.n != null) {
            a2 += dlx.c(13, this.n.longValue());
        }
        if (this.o != Integer.MIN_VALUE) {
            a2 += dlx.c(14, this.o);
        }
        if (this.p != Integer.MIN_VALUE) {
            a2 += dlx.c(15, this.p);
        }
        if (this.r != null) {
            a2 += dlx.c(16, this.r.intValue());
        }
        if (this.s != null) {
            a2 += dlx.b(17, this.s);
        }
        if (this.x != Integer.MIN_VALUE) {
            a2 += dlx.c(18, this.x);
        }
        if (this.q != null) {
            a2 += dlx.c(19, this.q.intValue());
        }
        if (this.u != null) {
            a2 += dlx.b(20, this.u);
        }
        if (this.t != null && this.t.length > 0) {
            a2 = a2 + (this.t.length * 8) + (this.t.length * 2);
        }
        if (this.y != null) {
            return a2 + dlx.b(22, this.y);
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0086, code lost:
        throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder(57).append(r3).append(" is not a valid enum RequestNegotiatedProtocol").toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013d, code lost:
        throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder(45).append(r3).append(" is not a valid enum RequestStatus").toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0173, code lost:
        throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder(51).append(r3).append(" is not a valid enum RequestFailedReason").toString());
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.eer a(defpackage.dlw r8) {
        /*
        // Method dump skipped, instructions count: 682
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eer.a(dlw):eer");
    }
}
