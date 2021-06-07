package defpackage;

import android.os.health.HealthStats;

/* renamed from: cmf  reason: default package */
/* compiled from: PG */
public final class cmf extends cmh {
    public static final cmf a = new cmf();

    private cmf() {
        super(eeu.class);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cmh
    public final /* synthetic */ String a(dmf dmf) {
        return ((eeu) dmf).c.b;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cmh
    public final /* synthetic */ dmf a(dmf dmf, dmf dmf2) {
        eeu eeu = (eeu) dmf;
        eeu eeu2 = (eeu) dmf2;
        if (eeu == null || eeu2 == null) {
            return eeu;
        }
        eeu eeu3 = new eeu();
        eeu3.c = eeu.c;
        eeu3.a = (efo[]) cmi.a.a(eeu.a, eeu2.a);
        eeu3.b = (edu[]) cme.a.a(eeu.b, eeu2.b);
        if (cky.a(eeu3)) {
            return null;
        }
        return eeu3;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cmh
    public final /* synthetic */ dmf a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        eeu eeu = new eeu();
        eeu.a = (efo[]) cmi.a.a(cky.d(healthStats, 40001));
        eeu.b = (edu[]) cme.a.a((healthStats == null || !healthStats.hasMeasurements(40002)) ? null : healthStats.getMeasurements(40002));
        eeu.c = cky.a(str);
        if (cky.a(eeu)) {
            return null;
        }
        return eeu;
    }
}
