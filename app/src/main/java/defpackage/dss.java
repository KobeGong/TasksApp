package defpackage;

/* renamed from: dss  reason: default package */
/* compiled from: PG */
final class dss implements dzq {
    public final dne a;
    public boolean b;
    public final /* synthetic */ dsq c;

    public dss(dsq dsq, dne dne) {
        this.c = dsq;
        this.a = (dne) cld.a(dne, "observer");
    }

    @Override // defpackage.dzq
    public final void a(dor dor) {
        this.c.b.execute(new dst(this, dor));
    }

    @Override // defpackage.dzq
    public final void a(dzr dzr) {
        this.c.b.execute(new dsu(this, dzr));
    }

    /* access modifiers changed from: package-private */
    public final void a(dpw dpw, dor dor) {
        this.b = true;
        this.c.f = true;
        try {
            dsq.a(this.a, dpw, dor);
        } finally {
            this.c.b();
            this.c.c.a(dpw.a());
        }
    }

    @Override // defpackage.dzq
    public final void b(dpw dpw, dor dor) {
        a(dpw, bg.av, dor);
    }

    @Override // defpackage.dzq
    public final void a(dpw dpw, int i, dor dor) {
        dny c2 = this.c.c();
        if (dpw.l == dpx.CANCELLED && c2 != null && c2.a()) {
            dpw = dpw.e;
            dor = new dor();
        }
        this.c.b.execute(new dsv(this, dpw, dor));
    }

    @Override // defpackage.dzq
    public final void a() {
        this.c.b.execute(new dsw(this));
    }
}
