package defpackage;

/* renamed from: dsd reason: default package */
/* compiled from: PG */
public final class dsd implements defpackage.dnf {
    private final boolean a;
    private final boolean b;
    private final /* synthetic */ defpackage.drz c;

    public dsd(defpackage.drz drz, boolean z, boolean z2) {
        this.c = drz;
        this.a = z;
        this.b = z2;
    }

    public final defpackage.dnd a(defpackage.dpb dpb, defpackage.dna dna, defpackage.dnc dnc) {
        defpackage.dsb dsb = new defpackage.dsb(this.c, this.c.d.b(), dpb.b, this.a, this.b);
        return new defpackage.dse(dnc.a(dpb, dna.a((defpackage.dnm) dsb)), dsb);
    }
}
