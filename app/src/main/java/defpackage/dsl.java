package defpackage;

/* renamed from: dsl reason: default package */
/* compiled from: PG */
final class dsl implements defpackage.dnf {
    private final /* synthetic */ defpackage.dsg a;

    dsl(defpackage.dsg dsg) {
        this.a = dsg;
    }

    public final defpackage.dnd a(defpackage.dpb dpb, defpackage.dna dna, defpackage.dnc dnc) {
        defpackage.dsg dsg = this.a;
        defpackage.dnv.a();
        defpackage.dsi dsi = new defpackage.dsi(dsg, dpb);
        return new defpackage.dsm(dnc.a(dpb, dna.a((defpackage.dnm) dsi)), dsi);
    }
}
