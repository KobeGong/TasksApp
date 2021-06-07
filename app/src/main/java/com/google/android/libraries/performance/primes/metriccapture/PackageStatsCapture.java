package com.google.android.libraries.performance.primes.metriccapture;

import android.content.Context;
import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageManager;
import android.content.pm.PackageStats;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
public final class PackageStatsCapture {
    public static final PackageStatsInvocation[] GETTER_INVOCATIONS = {new cnu("getPackageSizeInfo", new Class[]{String.class, IPackageStatsObserver.class}), new cnv("getPackageSizeInfo", new Class[]{String.class, Integer.TYPE, IPackageStatsObserver.class}), new cnw("getPackageSizeInfoAsUser", new Class[]{String.class, Integer.TYPE, IPackageStatsObserver.class})};

    private PackageStatsCapture() {
    }

    /* access modifiers changed from: package-private */
    /* compiled from: PG */
    public final class PackageStatsCallback extends IPackageStatsObserver.Stub {
        public final Semaphore a = new Semaphore(1);
        public volatile PackageStats b;

        PackageStatsCallback() {
        }

        public final void onGetStatsCompleted(PackageStats packageStats, boolean z) {
            if (z) {
                String valueOf = String.valueOf(packageStats);
                cdm.a(3, "PackageStatsCapture", new StringBuilder(String.valueOf(valueOf).length() + 30).append("Success getting PackageStats: ").append(valueOf).toString(), new Object[0]);
                this.b = packageStats;
            } else {
                cdm.a(5, "PackageStatsCapture", "Failure getting PackageStats", new Object[0]);
            }
            this.a.release();
        }
    }

    private static boolean a() {
        try {
            return !Modifier.isAbstract(PackageStatsCallback.class.getMethod("onGetStatsCompleted", new Class[]{PackageStats.class, Boolean.TYPE}).getModifiers());
        } catch (Error | Exception e) {
            cdm.a("PackageStatsCapture", "failure", e, new Object[0]);
            return false;
        }
    }

    /* compiled from: PG */
    public abstract class PackageStatsInvocation {
        private final String a;
        private final Class[] b;

        public PackageStatsInvocation(String str, Class[] clsArr) {
            this.a = str;
            this.b = clsArr;
        }

        public abstract Object[] a(String str, int i, IPackageStatsObserver iPackageStatsObserver);

        /* access modifiers changed from: package-private */
        public boolean invoke(PackageManager packageManager, String str, int i, IPackageStatsObserver iPackageStatsObserver) {
            try {
                packageManager.getClass().getMethod(this.a, this.b).invoke(packageManager, a(str, i, iPackageStatsObserver));
                return true;
            } catch (NoSuchMethodException e) {
                cdm.a("PackageStatsCapture", "PackageStats getter not found", e, new Object[0]);
                return false;
            } catch (Error | Exception e2) {
                StringBuilder sb = new StringBuilder();
                sb.append(e2.getClass().getSimpleName()).append(" for ").append(this.a).append('(').append(Arrays.asList(this.b)).append(") invocation");
                cdm.a(4, "PackageStatsCapture", sb.toString(), new Object[0]);
                return false;
            }
        }
    }

    static PackageStats getPackageStatsUsingInternalAPI(Context context, long j, PackageStatsInvocation... packageStatsInvocationArr) {
        if (!a()) {
            cdm.a(5, "PackageStatsCapture", "Callback implementation stripped by proguard.", new Object[0]);
            return null;
        }
        PackageStatsCallback packageStatsCallback = new PackageStatsCallback();
        try {
            packageStatsCallback.a.acquire();
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            int myUid = Process.myUid();
            for (PackageStatsInvocation packageStatsInvocation : packageStatsInvocationArr) {
                if (packageStatsInvocation.invoke(packageManager, packageName, myUid, packageStatsCallback)) {
                    cdm.a(4, "PackageStatsCapture", "Success invoking PackageStats capture.", new Object[0]);
                    if (packageStatsCallback.a.tryAcquire(j, TimeUnit.MILLISECONDS)) {
                        return packageStatsCallback.b;
                    }
                    cdm.a(5, "PackageStatsCapture", "Timeout while waiting for PackageStats callback", new Object[0]);
                    return null;
                }
            }
            cdm.a(5, "PackageStatsCapture", "Couldn't capture PackageStats.", new Object[0]);
            return null;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    public static PackageStats getPackageStats(Context context) {
        boolean z = false;
        cky.c();
        if (Build.VERSION.SDK_INT >= 26) {
            return cky.b(context);
        }
        if (context.getPackageManager().checkPermission("android.permission.GET_PACKAGE_SIZE", context.getPackageName()) == 0 || context.checkCallingOrSelfPermission("android.permission.GET_PACKAGE_SIZE") == 0) {
            z = true;
        }
        if (z) {
            return getPackageStatsUsingInternalAPI(context, 15000, GETTER_INVOCATIONS);
        }
        cdm.a(5, "PackageStatsCapture", "android.permission.GET_PACKAGE_SIZE required", new Object[0]);
        return null;
    }
}
