package defpackage;

import android.view.View;
import com.google.android.apps.tasks.ui.components.FancyCheckboxView;

/* access modifiers changed from: package-private */
/* renamed from: akw  reason: default package */
public final /* synthetic */ class akw implements View.OnClickListener {
    private final akv a;

    akw(akv akv) {
        this.a = akv;
    }

    public final void onClick(View view) {
        boolean z;
        dca dca;
        dih dih;
        float f = 1.0f;
        akv akv = this.a;
        boolean z2 = akv.v.a == 1.0f;
        FancyCheckboxView fancyCheckboxView = akv.v;
        if (z2) {
            f = 0.0f;
        }
        fancyCheckboxView.a(f);
        if (akv.p != null) {
            aky aky = akv.p;
            int d = akv.d();
            if (!z2) {
                z = true;
            } else {
                z = false;
            }
            akt akt = aky.a;
            akz akz = (akz) akt.a.get(d);
            dby b = akz.b();
            dii dii = (dii) b.a(bg.ao);
            dii.a((dih) b);
            dii dii2 = dii;
            dby b2 = akz.b();
            if (b2.e == null) {
                dca = dca.g;
            } else {
                dca = b2.e;
            }
            dii dii3 = (dii) dca.a(bg.ao);
            dii3.a((dih) dca);
            dii g = dii2.g(dii3.a(z));
            if (g.b) {
                dih = g.a;
            } else {
                dih dih2 = g.a;
                djz.a.a(dih2).c(dih2);
                g.b = true;
                dih = g.a;
            }
            dih dih3 = dih;
            if (!dih.a(dih3, Boolean.TRUE.booleanValue())) {
                throw new dkw();
            }
            dby dby = (dby) dih3;
            akt.a.set(d, akz.a(akz.a(), dby));
            if (akt.b != null) {
                aku aku = akt.b;
                ala.P().a(akz.a().b, dby.d, z);
                aku.a.c();
            }
        }
    }
}
