package defpackage;

import android.os.health.HealthStats;

/* renamed from: cmg  reason: default package */
/* compiled from: PG */
public final class cmg extends cmh {
    public static final cmg a = new cmg();

    private cmg() {
        super(efk.class);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cmh
    public final /* synthetic */ String a(dmf dmf) {
        return ((efk) dmf).g.b;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cmh
    public final /* synthetic */ dmf a(dmf dmf, dmf dmf2) {
        efk efk = (efk) dmf;
        efk efk2 = (efk) dmf2;
        if (efk == null || efk2 == null) {
            return efk;
        }
        efk efk3 = new efk();
        efk3.g = efk.g;
        efk3.a = cky.a(efk.a, efk2.a);
        efk3.b = cky.a(efk.b, efk2.b);
        efk3.c = cky.a(efk.c, efk2.c);
        efk3.d = cky.a(efk.d, efk2.d);
        efk3.e = cky.a(efk.e, efk2.e);
        efk3.f = cky.a(efk.f, efk2.f);
        if (cky.a(efk3)) {
            return null;
        }
        return efk3;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cmh
    public final /* synthetic */ dmf a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        efk efk = new efk();
        efk.a = cky.a(healthStats, 30001);
        efk.b = cky.a(healthStats, 30002);
        efk.c = cky.a(healthStats, 30003);
        efk.d = cky.a(healthStats, 30004);
        efk.e = cky.a(healthStats, 30005);
        efk.f = cky.a(healthStats, 30006);
        efk.g = cky.a(str);
        if (cky.a(efk)) {
            return null;
        }
        return efk;
    }
}
