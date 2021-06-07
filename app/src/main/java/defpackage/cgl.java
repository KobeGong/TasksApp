package defpackage;

/* renamed from: cgl  reason: default package */
/* compiled from: PG */
public final class cgl implements brd, cgk {
    private final cds a;
    private final cdq b;

    cgl() {
    }

    @Override // defpackage.cgk
    public final cjh a() {
        return new ciw();
    }

    public cgl(cds cds, cdq cdq) {
        this.a = cds;
        this.b = cdq;
    }

    @Override // defpackage.brd
    public final void a(brc brc) {
        cds cds = this.a;
        cdq cdq = this.b;
        bsb bsb = (bsb) brc;
        if (!bsb.a().b() || bsb.b() == null) {
            cdq.a(null);
        } else {
            new cdt(bsb, cdq).executeOnExecutor(cds.a, new Void[0]);
        }
    }
}
