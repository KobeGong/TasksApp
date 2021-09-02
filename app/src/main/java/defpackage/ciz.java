package defpackage;

/* renamed from: ciz reason: default package */
/* compiled from: PG */
final class ciz implements java.lang.Runnable {
    private final /* synthetic */ defpackage.ciy a;

    ciz(defpackage.ciy ciy) {
        this.a = ciy;
    }

    public final void run() {
        boolean z;
        boolean z2 = true;
        android.content.SharedPreferences sharedPreferences = this.a.d;
        defpackage.cky.c();
        long j = sharedPreferences.getLong("primes.packageMetric.lastSendTime", -1);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (elapsedRealtime < j) {
            if (!sharedPreferences.edit().remove("primes.packageMetric.lastSendTime").commit()) {
                defpackage.cdm.a(3, "PackageMetricService", "Failure storing timestamp persistently", new java.lang.Object[0]);
            }
            j = -1;
        }
        if (j == -1 || elapsedRealtime > j + 43200000) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            defpackage.ciy ciy = this.a;
            android.content.pm.PackageStats packageStats = com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture.getPackageStats(ciy.a);
            if (packageStats != null) {
                defpackage.efx efx = new defpackage.efx();
                defpackage.cky.a((java.lang.Object) packageStats);
                defpackage.eev eev = new defpackage.eev();
                eev.a = java.lang.Long.valueOf(packageStats.cacheSize);
                eev.b = java.lang.Long.valueOf(packageStats.codeSize);
                eev.c = java.lang.Long.valueOf(packageStats.dataSize);
                eev.d = java.lang.Long.valueOf(packageStats.externalCacheSize);
                eev.e = java.lang.Long.valueOf(packageStats.externalCodeSize);
                eev.f = java.lang.Long.valueOf(packageStats.externalDataSize);
                eev.g = java.lang.Long.valueOf(packageStats.externalMediaSize);
                eev.h = java.lang.Long.valueOf(packageStats.externalObbSize);
                efx.i = eev;
                if (ciy.e) {
                    efx.i.i = defpackage.cky.a((android.content.Context) ciy.a, ciy.f, ciy.g);
                }
                ciy.a(efx);
                if (ciy.d.edit().putLong("primes.packageMetric.lastSendTime", android.os.SystemClock.elapsedRealtime()).commit()) {
                    z2 = false;
                }
                if (z2) {
                    defpackage.cdm.a(3, "PackageMetricService", "Failure storing timestamp persistently", new java.lang.Object[0]);
                    return;
                }
                return;
            }
            defpackage.cdm.a(5, "PackageMetricService", "PackageStats capture failed.", new java.lang.Object[0]);
        }
    }
}
