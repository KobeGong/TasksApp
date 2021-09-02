package defpackage;

/* renamed from: cmi reason: default package */
/* compiled from: PG */
public final class cmi extends defpackage.cmh {
    public static final defpackage.cmi a = new defpackage.cmi();

    private cmi() {
        super(defpackage.efo.class);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ java.lang.String a(defpackage.dmf dmf) {
        return ((defpackage.efo) dmf).c.b;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ defpackage.dmf a(defpackage.dmf dmf, defpackage.dmf dmf2) {
        defpackage.efo efo = (defpackage.efo) dmf;
        defpackage.efo efo2 = (defpackage.efo) dmf2;
        if (efo == null || efo2 == null) {
            return efo;
        }
        defpackage.efo efo3 = new defpackage.efo();
        efo3.c = efo.c;
        efo3.a = defpackage.cky.a(efo.a, efo2.a);
        efo3.b = defpackage.cky.a(efo.b, efo2.b);
        if (defpackage.cky.a(efo3)) {
            return null;
        }
        return efo3;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ defpackage.dmf a(java.lang.String str, java.lang.Object obj) {
        android.os.health.HealthStats healthStats = (android.os.health.HealthStats) obj;
        defpackage.efo efo = new defpackage.efo();
        efo.a = defpackage.cky.a(defpackage.cky.a(healthStats, 50001));
        efo.b = defpackage.cky.a(defpackage.cky.a(healthStats, 50002));
        efo.c = defpackage.cky.a(str);
        if (defpackage.cky.a(efo)) {
            return null;
        }
        return efo;
    }
}
