package defpackage;

/* renamed from: dss reason: default package */
/* compiled from: PG */
final class dss implements defpackage.dzq {
    public final defpackage.dne a;
    public boolean b;
    public final /* synthetic */ defpackage.dsq c;

    public dss(defpackage.dsq dsq, defpackage.dne dne) {
        this.c = dsq;
        this.a = (defpackage.dne) defpackage.cld.a((java.lang.Object) dne, (java.lang.Object) "observer");
    }

    public final void a(defpackage.dor dor) {
        this.c.b.execute(new defpackage.dst(this, dor));
    }

    public final void a(defpackage.dzr dzr) {
        this.c.b.execute(new defpackage.dsu(this, dzr));
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.dpw dpw, defpackage.dor dor) {
        this.b = true;
        this.c.f = true;
        try {
            defpackage.dsq.a(this.a, dpw, dor);
        } finally {
            this.c.b();
            this.c.c.a(dpw.a());
        }
    }

    public final void b(defpackage.dpw dpw, defpackage.dor dor) {
        a(dpw, defpackage.bg.av, dor);
    }

    public final void a(defpackage.dpw dpw, int i, defpackage.dor dor) {
        defpackage.dny c2 = this.c.c();
        if (dpw.l == defpackage.dpx.CANCELLED && c2 != null && c2.a()) {
            dpw = defpackage.dpw.e;
            dor = new defpackage.dor();
        }
        this.c.b.execute(new defpackage.dsv(this, dpw, dor));
    }

    public final void a() {
        this.c.b.execute(new defpackage.dsw(this));
    }
}
