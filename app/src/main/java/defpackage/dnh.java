package defpackage;

/* renamed from: dnh reason: default package */
/* compiled from: PG */
final class dnh implements defpackage.dnf {
    public final /* synthetic */ defpackage.dpd a;
    public final /* synthetic */ defpackage.dpd b;
    private final /* synthetic */ defpackage.dnf c;

    dnh(defpackage.dpd dpd, defpackage.dpd dpd2, defpackage.dnf dnf) {
        this.a = dpd;
        this.b = dpd2;
        this.c = dnf;
    }

    public final defpackage.dnd a(defpackage.dpb dpb, defpackage.dna dna, defpackage.dnc dnc) {
        defpackage.dpd dpd = this.a;
        defpackage.dpd dpd2 = this.b;
        defpackage.dpc dpc = new defpackage.dpc();
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
        return new defpackage.dni(this, this.c.a(dpc.a(), dna, dnc), dpb);
    }
}
