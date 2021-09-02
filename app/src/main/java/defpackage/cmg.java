package defpackage;

/* renamed from: cmg reason: default package */
/* compiled from: PG */
public final class cmg extends defpackage.cmh {
    public static final defpackage.cmg a = new defpackage.cmg();

    private cmg() {
        super(defpackage.efk.class);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ java.lang.String a(defpackage.dmf dmf) {
        return ((defpackage.efk) dmf).g.b;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ defpackage.dmf a(defpackage.dmf dmf, defpackage.dmf dmf2) {
        defpackage.efk efk = (defpackage.efk) dmf;
        defpackage.efk efk2 = (defpackage.efk) dmf2;
        if (efk == null || efk2 == null) {
            return efk;
        }
        defpackage.efk efk3 = new defpackage.efk();
        efk3.g = efk.g;
        efk3.a = defpackage.cky.a(efk.a, efk2.a);
        efk3.b = defpackage.cky.a(efk.b, efk2.b);
        efk3.c = defpackage.cky.a(efk.c, efk2.c);
        efk3.d = defpackage.cky.a(efk.d, efk2.d);
        efk3.e = defpackage.cky.a(efk.e, efk2.e);
        efk3.f = defpackage.cky.a(efk.f, efk2.f);
        if (defpackage.cky.a(efk3)) {
            return null;
        }
        return efk3;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ defpackage.dmf a(java.lang.String str, java.lang.Object obj) {
        android.os.health.HealthStats healthStats = (android.os.health.HealthStats) obj;
        defpackage.efk efk = new defpackage.efk();
        efk.a = defpackage.cky.a(healthStats, 30001);
        efk.b = defpackage.cky.a(healthStats, 30002);
        efk.c = defpackage.cky.a(healthStats, 30003);
        efk.d = defpackage.cky.a(healthStats, 30004);
        efk.e = defpackage.cky.a(healthStats, 30005);
        efk.f = defpackage.cky.a(healthStats, 30006);
        efk.g = defpackage.cky.a(str);
        if (defpackage.cky.a(efk)) {
            return null;
        }
        return efk;
    }
}
