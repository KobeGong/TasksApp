package defpackage;

/* renamed from: anr reason: default package */
final /* synthetic */ class anr implements defpackage.anx {
    private final int a;

    anr(int i) {
        this.a = i;
    }

    public final java.lang.Object a(defpackage.anu anu) {
        defpackage.dih dih;
        int i = this.a;
        if (i == 0) {
            return defpackage.czq.NONE;
        }
        defpackage.amb amb = anu.b;
        defpackage.ead b = amb.b();
        defpackage.dii dii = (defpackage.dii) defpackage.czm.c.a(defpackage.bg.ao);
        defpackage.czn czn = defpackage.czn.ANDROID;
        dii.b();
        defpackage.czm czm = (defpackage.czm) dii.a;
        if (czn == null) {
            throw new java.lang.NullPointerException();
        }
        czm.a = czn.a();
        dii.b();
        ((defpackage.czm) dii.a).b = i;
        if (dii.b) {
            dih = dii.a;
        } else {
            defpackage.dih dih2 = dii.a;
            defpackage.djz.a.a((java.lang.Object) dih2).c(dih2);
            dii.b = true;
            dih = dii.a;
        }
        defpackage.dih dih3 = dih;
        if (!defpackage.dih.a(dih3, java.lang.Boolean.TRUE.booleanValue())) {
            throw new defpackage.dkw();
        }
        defpackage.czm czm2 = (defpackage.czm) dih3;
        b.getClass();
        defpackage.czq a2 = defpackage.czq.a(((defpackage.czp) amb.a(czm2, new defpackage.amd(b))).a);
        if (a2 == null) {
            return defpackage.czq.UNRECOGNIZED;
        }
        return a2;
    }
}
