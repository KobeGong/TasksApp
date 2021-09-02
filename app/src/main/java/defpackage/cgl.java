package defpackage;

/* renamed from: cgl reason: default package */
/* compiled from: PG */
public final class cgl implements defpackage.brd, defpackage.cgk {
    private final defpackage.cds a;
    private final defpackage.cdq b;

    cgl() {
    }

    public final defpackage.cjh a() {
        return new defpackage.ciw();
    }

    public cgl(defpackage.cds cds, defpackage.cdq cdq) {
        this.a = cds;
        this.b = cdq;
    }

    public final void a(defpackage.brc brc) {
        defpackage.cds cds = this.a;
        defpackage.cdq cdq = this.b;
        defpackage.bsb bsb = (defpackage.bsb) brc;
        if (!bsb.a().b() || bsb.b() == null) {
            cdq.a(null);
        } else {
            new defpackage.cdt(bsb, cdq).executeOnExecutor(cds.a, new java.lang.Void[0]);
        }
    }
}
