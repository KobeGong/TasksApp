package defpackage;

import android.os.health.HealthStats;

/* renamed from: cmi  reason: default package */
/* compiled from: PG */
public final class cmi extends cmh {
    public static final cmi a = new cmi();

    private cmi() {
        super(efo.class);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cmh
    public final /* synthetic */ String a(dmf dmf) {
        return ((efo) dmf).c.b;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cmh
    public final /* synthetic */ dmf a(dmf dmf, dmf dmf2) {
        efo efo = (efo) dmf;
        efo efo2 = (efo) dmf2;
        if (efo == null || efo2 == null) {
            return efo;
        }
        efo efo3 = new efo();
        efo3.c = efo.c;
        efo3.a = cky.a(efo.a, efo2.a);
        efo3.b = cky.a(efo.b, efo2.b);
        if (cky.a(efo3)) {
            return null;
        }
        return efo3;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cmh
    public final /* synthetic */ dmf a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        efo efo = new efo();
        efo.a = cky.a(cky.a(healthStats, 50001));
        efo.b = cky.a(cky.a(healthStats, 50002));
        efo.c = cky.a(str);
        if (cky.a(efo)) {
            return null;
        }
        return efo;
    }
}
