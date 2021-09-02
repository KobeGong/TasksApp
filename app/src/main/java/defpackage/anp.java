package defpackage;

/* renamed from: anp reason: default package */
final /* synthetic */ class anp implements defpackage.anx {
    private final java.lang.String a;

    anp(java.lang.String str) {
        this.a = str;
    }

    public final java.lang.Object a(defpackage.anu anu) {
        defpackage.dih dih;
        java.lang.String str = this.a;
        defpackage.amb amb = anu.b;
        defpackage.dbo[] dboArr = new defpackage.dbo[1];
        defpackage.dii d = ((defpackage.dii) defpackage.dbo.d.a(defpackage.bg.ao)).d(str);
        defpackage.dii dii = (defpackage.dii) defpackage.dab.b.a(defpackage.bg.ao);
        dii.b();
        ((defpackage.dab) dii.a).a = 2;
        d.b();
        defpackage.dbo.b((defpackage.dbo) d.a, dii);
        if (d.b) {
            dih = d.a;
        } else {
            defpackage.dih dih2 = d.a;
            defpackage.djz.a.a((java.lang.Object) dih2).c(dih2);
            d.b = true;
            dih = d.a;
        }
        defpackage.dih dih3 = dih;
        if (!defpackage.dih.a(dih3, java.lang.Boolean.TRUE.booleanValue())) {
            throw new defpackage.dkw();
        }
        dboArr[0] = (defpackage.dbo) dih3;
        amb.a(dboArr);
        return null;
    }
}
