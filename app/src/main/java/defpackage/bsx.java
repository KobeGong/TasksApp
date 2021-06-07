package defpackage;

/* renamed from: bsx  reason: default package */
/* compiled from: PG */
public final class bsx implements bse {
    private static final brt a = new bsy();
    private static final brt b = new bsz();

    @Override // defpackage.bse
    public final brb a(cql cql, bsf bsf) {
        if (!(bsf instanceof bso)) {
            throw new IllegalArgumentException("listener must be an instance of BaseGcoreOnDataChangedImpl.");
        }
        ayp a2 = a(cql);
        bly bly = ((bso) bsf).a;
        Integer.valueOf(1);
        return new brb(a2.a((bca) new bju(a2, ((bnq) a2.a(blz.a)).a(a2, bly), 1)), a);
    }

    @Override // defpackage.bse
    public final brb b(cql cql, bsf bsf) {
        if (!(bsf instanceof bso)) {
            throw new IllegalArgumentException("listener must be an instance of BaseGcoreOnDataChangedImpl.");
        }
        ayp a2 = a(cql);
        return new brb(a2.a((bca) new bjv(a2, ((bso) bsf).a)), b);
    }

    private static ayp a(cql cql) {
        if (cql instanceof bta) {
            return ((bta) cql).a;
        }
        return null;
    }
}
