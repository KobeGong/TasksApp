package defpackage;

/* renamed from: akw reason: default package */
final /* synthetic */ class akw implements android.view.View.OnClickListener {
    private final defpackage.akv a;

    akw(defpackage.akv akv) {
        this.a = akv;
    }

    public final void onClick(android.view.View view) {
        boolean z;
        defpackage.dca dca;
        defpackage.dih dih;
        float f = 1.0f;
        defpackage.akv akv = this.a;
        boolean z2 = akv.v.a == 1.0f;
        com.google.android.apps.tasks.ui.components.FancyCheckboxView fancyCheckboxView = akv.v;
        if (z2) {
            f = 0.0f;
        }
        fancyCheckboxView.a(f);
        if (akv.p != null) {
            defpackage.aky aky = akv.p;
            int d = akv.d();
            if (!z2) {
                z = true;
            } else {
                z = false;
            }
            defpackage.akt akt = aky.a;
            defpackage.akz akz = (defpackage.akz) akt.a.get(d);
            defpackage.dby b = akz.b();
            defpackage.dii dii = (defpackage.dii) b.a(defpackage.bg.ao);
            dii.a((defpackage.dih) b);
            defpackage.dii dii2 = dii;
            defpackage.dby b2 = akz.b();
            if (b2.e == null) {
                dca = defpackage.dca.g;
            } else {
                dca = b2.e;
            }
            defpackage.dii dii3 = (defpackage.dii) dca.a(defpackage.bg.ao);
            dii3.a((defpackage.dih) dca);
            defpackage.dii g = dii2.g(dii3.a(z));
            if (g.b) {
                dih = g.a;
            } else {
                defpackage.dih dih2 = g.a;
                defpackage.djz.a.a((java.lang.Object) dih2).c(dih2);
                g.b = true;
                dih = g.a;
            }
            defpackage.dih dih3 = dih;
            if (!defpackage.dih.a(dih3, java.lang.Boolean.TRUE.booleanValue())) {
                throw new defpackage.dkw();
            }
            defpackage.dby dby = (defpackage.dby) dih3;
            akt.a.set(d, defpackage.akz.a(akz.a(), dby));
            if (akt.b != null) {
                defpackage.aku aku = akt.b;
                defpackage.ala.P().a(akz.a().b, dby.d, z);
                aku.a.c();
            }
        }
    }
}
