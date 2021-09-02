package defpackage;

/* renamed from: aly reason: default package */
final /* synthetic */ class aly implements defpackage.crq {
    private final defpackage.dmk a;

    aly(defpackage.dmk dmk) {
        this.a = dmk;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        defpackage.dca dca;
        defpackage.dih dih;
        defpackage.dmk dmk = this.a;
        defpackage.dby dby = (defpackage.dby) obj;
        if (dby.e == null) {
            dca = defpackage.dca.g;
        } else {
            dca = dby.e;
        }
        defpackage.dii dii = (defpackage.dii) dca.a(defpackage.bg.ao);
        dii.a((defpackage.dih) dca);
        defpackage.dii dii2 = dii;
        if (dmk == null) {
            dii2.g();
        } else {
            dii2.a(dmk);
        }
        defpackage.dii dii3 = (defpackage.dii) dby.a(defpackage.bg.ao);
        dii3.a((defpackage.dih) dby);
        defpackage.dii g = dii3.g(dii2);
        if (g.b) {
            dih = g.a;
        } else {
            defpackage.dih dih2 = g.a;
            defpackage.djz.a.a((java.lang.Object) dih2).c(dih2);
            g.b = true;
            dih = g.a;
        }
        defpackage.dih dih3 = dih;
        if (defpackage.dih.a(dih3, java.lang.Boolean.TRUE.booleanValue())) {
            return (defpackage.dby) dih3;
        }
        throw new defpackage.dkw();
    }
}
