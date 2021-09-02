package defpackage;

/* renamed from: alx reason: default package */
final /* synthetic */ class alx implements defpackage.crq {
    private final java.lang.String a;

    alx(java.lang.String str) {
        this.a = str;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        defpackage.dca dca;
        defpackage.dih dih;
        java.lang.String str = this.a;
        defpackage.dby dby = (defpackage.dby) obj;
        defpackage.dii dii = (defpackage.dii) dby.a(defpackage.bg.ao);
        dii.a((defpackage.dih) dby);
        defpackage.dii dii2 = dii;
        if (dby.e == null) {
            dca = defpackage.dca.g;
        } else {
            dca = dby.e;
        }
        defpackage.dii dii3 = (defpackage.dii) dca.a(defpackage.bg.ao);
        dii3.a((defpackage.dih) dca);
        defpackage.dii g = dii2.g(dii3.setDetail(str));
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
