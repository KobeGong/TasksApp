package defpackage;

/* renamed from: bsx reason: default package */
/* compiled from: PG */
public final class bsx implements defpackage.bse {
    private static final defpackage.brt a = new defpackage.bsy();
    private static final defpackage.brt b = new defpackage.bsz();

    public final defpackage.brb a(defpackage.cql cql, defpackage.bsf bsf) {
        if (!(bsf instanceof defpackage.bso)) {
            throw new java.lang.IllegalArgumentException("listener must be an instance of BaseGcoreOnDataChangedImpl.");
        }
        defpackage.bso bso = (defpackage.bso) bsf;
        defpackage.ayp a2 = a(cql);
        defpackage.bly bly = bso.a;
        java.lang.Integer.valueOf(1);
        return new defpackage.brb(a2.a((defpackage.bca) new defpackage.bju(a2, ((defpackage.bnq) a2.a(defpackage.blz.a)).a(a2, bly), 1)), a);
    }

    public final defpackage.brb b(defpackage.cql cql, defpackage.bsf bsf) {
        if (!(bsf instanceof defpackage.bso)) {
            throw new java.lang.IllegalArgumentException("listener must be an instance of BaseGcoreOnDataChangedImpl.");
        }
        defpackage.bso bso = (defpackage.bso) bsf;
        defpackage.ayp a2 = a(cql);
        return new defpackage.brb(a2.a((defpackage.bca) new defpackage.bjv(a2, bso.a)), b);
    }

    private static defpackage.ayp a(defpackage.cql cql) {
        if (cql instanceof defpackage.bta) {
            return ((defpackage.bta) cql).a;
        }
        return null;
    }
}
