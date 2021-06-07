package defpackage;

/* renamed from: dsi  reason: default package */
/* compiled from: PG */
final class dsi extends dnm {
    public volatile int a;
    public final boolean b;
    public final ecc c = ebv.a;
    private final /* synthetic */ dsg d;

    dsi(dsg dsg, dpb dpb) {
        this.d = dsg;
        cld.a(dpb, "method");
        this.b = dpb.h;
        dsg.c.a(dsg.a(dpb.b));
    }

    @Override // defpackage.dnm
    public final dqc a(dor dor) {
        dor.b(this.d.d);
        dor.a(this.d.d, this.c.b);
        return new dsj(this.c);
    }
}
