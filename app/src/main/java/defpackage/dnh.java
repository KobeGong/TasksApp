package defpackage;

/* renamed from: dnh  reason: default package */
/* compiled from: PG */
final class dnh implements dnf {
    public final /* synthetic */ dpd a;
    public final /* synthetic */ dpd b;
    private final /* synthetic */ dnf c;

    dnh(dpd dpd, dpd dpd2, dnf dnf) {
        this.a = dpd;
        this.b = dpd2;
        this.c = dnf;
    }

    @Override // defpackage.dnf
    public final dnd a(dpb dpb, dna dna, dnc dnc) {
        dpd dpd = this.a;
        dpd dpd2 = this.b;
        dpc dpc = new dpc();
        dpc.a = null;
        dpc.b = null;
        dpc.a = dpd;
        dpc.b = dpd2;
        dpc.c = dpb.a;
        dpc.d = dpb.b;
        dpc.e = dpb.f;
        dpc.f = dpb.g;
        dpc.h = dpb.h;
        dpc.g = dpb.e;
        return new dni(this, this.c.a(dpc.a(), dna, dnc), dpb);
    }
}
