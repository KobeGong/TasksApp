package defpackage;

/* renamed from: dsd  reason: default package */
/* compiled from: PG */
public final class dsd implements dnf {
    private final boolean a;
    private final boolean b;
    private final /* synthetic */ drz c;

    public dsd(drz drz, boolean z, boolean z2) {
        this.c = drz;
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.dnf
    public final dnd a(dpb dpb, dna dna, dnc dnc) {
        dsb dsb = new dsb(this.c, this.c.d.b(), dpb.b, this.a, this.b);
        return new dse(dnc.a(dpb, dna.a(dsb)), dsb);
    }
}
