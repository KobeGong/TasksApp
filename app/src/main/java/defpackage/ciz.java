package defpackage;

import android.content.SharedPreferences;
import android.content.pm.PackageStats;
import android.os.SystemClock;
import com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture;

/* renamed from: ciz  reason: default package */
/* compiled from: PG */
final class ciz implements Runnable {
    private final /* synthetic */ ciy a;

    ciz(ciy ciy) {
        this.a = ciy;
    }

    public final void run() {
        boolean z;
        boolean z2 = true;
        SharedPreferences sharedPreferences = this.a.d;
        cky.c();
        long j = sharedPreferences.getLong("primes.packageMetric.lastSendTime", -1);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime < j) {
            if (!sharedPreferences.edit().remove("primes.packageMetric.lastSendTime").commit()) {
                cdm.a(3, "PackageMetricService", "Failure storing timestamp persistently", new Object[0]);
            }
            j = -1;
        }
        if (j == -1 || elapsedRealtime > j + 43200000) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            ciy ciy = this.a;
            PackageStats packageStats = PackageStatsCapture.getPackageStats(ciy.a);
            if (packageStats != null) {
                efx efx = new efx();
                cky.a(packageStats);
                eev eev = new eev();
                eev.a = Long.valueOf(packageStats.cacheSize);
                eev.b = Long.valueOf(packageStats.codeSize);
                eev.c = Long.valueOf(packageStats.dataSize);
                eev.d = Long.valueOf(packageStats.externalCacheSize);
                eev.e = Long.valueOf(packageStats.externalCodeSize);
                eev.f = Long.valueOf(packageStats.externalDataSize);
                eev.g = Long.valueOf(packageStats.externalMediaSize);
                eev.h = Long.valueOf(packageStats.externalObbSize);
                efx.i = eev;
                if (ciy.e) {
                    efx.i.i = cky.a(ciy.a, ciy.f, ciy.g);
                }
                ciy.a(efx);
                if (ciy.d.edit().putLong("primes.packageMetric.lastSendTime", SystemClock.elapsedRealtime()).commit()) {
                    z2 = false;
                }
                if (z2) {
                    cdm.a(3, "PackageMetricService", "Failure storing timestamp persistently", new Object[0]);
                    return;
                }
                return;
            }
            cdm.a(5, "PackageMetricService", "PackageStats capture failed.", new Object[0]);
        }
    }
}
