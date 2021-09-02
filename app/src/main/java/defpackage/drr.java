package defpackage;

/* renamed from: drr reason: default package */
/* compiled from: PG */
final class drr implements defpackage.dnf {
    private final /* synthetic */ defpackage.drp a;

    drr(defpackage.drp drp) {
        this.a = drp;
    }

    public final defpackage.dnd a(defpackage.dpb dpb, defpackage.dna dna, defpackage.dnc dnc) {
        defpackage.dnf a2 = this.a.a();
        if (a2 == null) {
            return dnc.a(dpb, dna);
        }
        return defpackage.dng.a(a2, defpackage.drp.b, defpackage.drp.b).a(dpb, dna, dnc);
    }
}
