package defpackage;

import android.content.pm.IPackageStatsObserver;
import com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture;

/* renamed from: cnw  reason: default package */
/* compiled from: PG */
public final class cnw extends PackageStatsCapture.PackageStatsInvocation {
    public cnw(String str, Class[] clsArr) {
        super(str, clsArr);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture.PackageStatsInvocation
    public final Object[] a(String str, int i, IPackageStatsObserver iPackageStatsObserver) {
        return new Object[]{str, Integer.valueOf(i), iPackageStatsObserver};
    }
}
