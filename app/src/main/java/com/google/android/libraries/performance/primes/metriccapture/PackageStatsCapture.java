package com.google.android.libraries.performance.primes.metriccapture;

/* compiled from: PG */
public final class PackageStatsCapture {
    public static final com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture.PackageStatsInvocation[] GETTER_INVOCATIONS = {new defpackage.cnu("getPackageSizeInfo", new java.lang.Class[]{java.lang.String.class, android.content.pm.IPackageStatsObserver.class}), new defpackage.cnv("getPackageSizeInfo", new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE, android.content.pm.IPackageStatsObserver.class}), new defpackage.cnw("getPackageSizeInfoAsUser", new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE, android.content.pm.IPackageStatsObserver.class})};

    /* compiled from: PG */
    final class PackageStatsCallback extends android.content.pm.IPackageStatsObserver.Stub {
        public final java.util.concurrent.Semaphore a = new java.util.concurrent.Semaphore(1);
        public volatile android.content.pm.PackageStats b;

        PackageStatsCallback() {
        }

        public final void onGetStatsCompleted(android.content.pm.PackageStats packageStats, boolean z) {
            if (z) {
                java.lang.String valueOf = java.lang.String.valueOf(packageStats);
                defpackage.cdm.a(3, "PackageStatsCapture", new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 30).append("Success getting PackageStats: ").append(valueOf).toString(), new java.lang.Object[0]);
                this.b = packageStats;
            } else {
                defpackage.cdm.a(5, "PackageStatsCapture", "Failure getting PackageStats", new java.lang.Object[0]);
            }
            this.a.release();
        }
    }

    /* compiled from: PG */
    public abstract class PackageStatsInvocation {
        private final java.lang.String a;
        private final java.lang.Class[] b;

        public PackageStatsInvocation(java.lang.String str, java.lang.Class[] clsArr) {
            this.a = str;
            this.b = clsArr;
        }

        public abstract java.lang.Object[] a(java.lang.String str, int i, android.content.pm.IPackageStatsObserver iPackageStatsObserver);

        /* access modifiers changed from: 0000 */
        public boolean invoke(android.content.pm.PackageManager packageManager, java.lang.String str, int i, android.content.pm.IPackageStatsObserver iPackageStatsObserver) {
            try {
                packageManager.getClass().getMethod(this.a, this.b).invoke(packageManager, a(str, i, iPackageStatsObserver));
                return true;
            } catch (java.lang.NoSuchMethodException e) {
                defpackage.cdm.a("PackageStatsCapture", "PackageStats getter not found", (java.lang.Throwable) e, new java.lang.Object[0]);
                return false;
            } catch (java.lang.Error | java.lang.Exception e2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(e2.getClass().getSimpleName()).append(" for ").append(this.a).append('(').append(java.util.Arrays.asList(this.b)).append(") invocation");
                defpackage.cdm.a(4, "PackageStatsCapture", sb.toString(), new java.lang.Object[0]);
                return false;
            }
        }
    }

    private PackageStatsCapture() {
    }

    private static boolean a() {
        try {
            if (!java.lang.reflect.Modifier.isAbstract(com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture.PackageStatsCallback.class.getMethod("onGetStatsCompleted", new java.lang.Class[]{android.content.pm.PackageStats.class, java.lang.Boolean.TYPE}).getModifiers())) {
                return true;
            }
            return false;
        } catch (java.lang.Error | java.lang.Exception e) {
            defpackage.cdm.a("PackageStatsCapture", "failure", e, new java.lang.Object[0]);
            return false;
        }
    }

    static android.content.pm.PackageStats getPackageStatsUsingInternalAPI(android.content.Context context, long j, com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture.PackageStatsInvocation... packageStatsInvocationArr) {
        if (!a()) {
            defpackage.cdm.a(5, "PackageStatsCapture", "Callback implementation stripped by proguard.", new java.lang.Object[0]);
            return null;
        }
        com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture.PackageStatsCallback packageStatsCallback = new com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture.PackageStatsCallback();
        try {
            packageStatsCallback.a.acquire();
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            java.lang.String packageName = context.getPackageName();
            int myUid = android.os.Process.myUid();
            for (com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture.PackageStatsInvocation invoke : packageStatsInvocationArr) {
                if (invoke.invoke(packageManager, packageName, myUid, packageStatsCallback)) {
                    defpackage.cdm.a(4, "PackageStatsCapture", "Success invoking PackageStats capture.", new java.lang.Object[0]);
                    if (packageStatsCallback.a.tryAcquire(j, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                        return packageStatsCallback.b;
                    }
                    defpackage.cdm.a(5, "PackageStatsCapture", "Timeout while waiting for PackageStats callback", new java.lang.Object[0]);
                    return null;
                }
            }
            defpackage.cdm.a(5, "PackageStatsCapture", "Couldn't capture PackageStats.", new java.lang.Object[0]);
            return null;
        } catch (java.lang.InterruptedException e) {
            java.lang.Thread.currentThread().interrupt();
            return null;
        }
    }

    public static android.content.pm.PackageStats getPackageStats(android.content.Context context) {
        boolean z = false;
        defpackage.cky.c();
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return defpackage.cky.b(context);
        }
        if (context.getPackageManager().checkPermission("android.permission.GET_PACKAGE_SIZE", context.getPackageName()) == 0 || context.checkCallingOrSelfPermission("android.permission.GET_PACKAGE_SIZE") == 0) {
            z = true;
        }
        if (z) {
            return getPackageStatsUsingInternalAPI(context, 15000, GETTER_INVOCATIONS);
        }
        defpackage.cdm.a(5, "PackageStatsCapture", "android.permission.GET_PACKAGE_SIZE required", new java.lang.Object[0]);
        return null;
    }
}
