package defpackage;

/* renamed from: cmf reason: default package */
/* compiled from: PG */
public final class cmf extends defpackage.cmh {
    public static final defpackage.cmf a = new defpackage.cmf();

    private cmf() {
        super(defpackage.eeu.class);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ java.lang.String a(defpackage.dmf dmf) {
        return ((defpackage.eeu) dmf).c.b;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ defpackage.dmf a(defpackage.dmf dmf, defpackage.dmf dmf2) {
        defpackage.eeu eeu = (defpackage.eeu) dmf;
        defpackage.eeu eeu2 = (defpackage.eeu) dmf2;
        if (eeu == null || eeu2 == null) {
            return eeu;
        }
        defpackage.eeu eeu3 = new defpackage.eeu();
        eeu3.c = eeu.c;
        eeu3.a = (defpackage.efo[]) defpackage.cmi.a.a((defpackage.dmf[]) eeu.a, (defpackage.dmf[]) eeu2.a);
        eeu3.b = (defpackage.edu[]) defpackage.cme.a.a((defpackage.dmf[]) eeu.b, (defpackage.dmf[]) eeu2.b);
        if (defpackage.cky.a(eeu3)) {
            return null;
        }
        return eeu3;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ defpackage.dmf a(java.lang.String str, java.lang.Object obj) {
        android.os.health.HealthStats healthStats = (android.os.health.HealthStats) obj;
        defpackage.eeu eeu = new defpackage.eeu();
        eeu.a = (defpackage.efo[]) defpackage.cmi.a.a(defpackage.cky.d(healthStats, 40001));
        eeu.b = (defpackage.edu[]) defpackage.cme.a.a((healthStats == null || !healthStats.hasMeasurements(40002)) ? null : healthStats.getMeasurements(40002));
        eeu.c = defpackage.cky.a(str);
        if (defpackage.cky.a(eeu)) {
            return null;
        }
        return eeu;
    }
}
