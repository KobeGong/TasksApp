package defpackage;

/* renamed from: axz reason: default package */
/* compiled from: PG */
public class axz {
    @java.lang.Deprecated
    public static final int a = 11910000;
    public static final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean();
    private static boolean c = false;
    private static boolean d = false;
    private static final java.util.concurrent.atomic.AtomicBoolean e = new java.util.concurrent.atomic.AtomicBoolean();

    @java.lang.Deprecated
    public static java.lang.String a(int i) {
        return defpackage.axq.a(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x014c  */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(android.content.Context r8) {

            r3 = 9
            r2 = 1
            r1 = 0
            android.content.pm.PackageManager r5 = r8.getPackageManager()
            android.content.res.Resources r0 = r8.getResources()     // Catch:{ Throwable -> 0x0034 }
            r4 = 2131951703(0x7f130057, float:1.9539828E38)
            r0.getString(r4)     // Catch:{ Throwable -> 0x0034 }
        L_0x0012:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r4 = r8.getPackageName()
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0082
            java.util.concurrent.atomic.AtomicBoolean r0 = e
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0082
            int r0 = defpackage.bdz.a(r8)
            if (r0 != 0) goto L_0x003d
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"
            r0.<init>(r1)
            throw r0
        L_0x0034:
            r0 = move-exception
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.String r4 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r0, r4)
            goto L_0x0012
        L_0x003d:
            int r4 = a
            if (r0 == r4) goto L_0x0082
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            int r2 = a
            java.lang.String r3 = "com.google.android.gms.version"
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            int r4 = r4 + 290
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected "
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r4 = " but found "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = ".  You must have the following declaration within the <application> element:     <meta-data android:name=\""
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r2 = "\" android:value=\"@integer/google_play_services_version\" />"
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0082:
            boolean r0 = defpackage.azb.a(r8)
            if (r0 != 0) goto L_0x00df
            java.lang.Boolean r0 = defpackage.azb.e
            if (r0 != 0) goto L_0x00ab
            android.content.pm.PackageManager r0 = r8.getPackageManager()
            java.lang.String r4 = "android.hardware.type.iot"
            boolean r0 = r0.hasSystemFeature(r4)
            if (r0 != 0) goto L_0x00a4
            android.content.pm.PackageManager r0 = r8.getPackageManager()
            java.lang.String r4 = "android.hardware.type.embedded"
            boolean r0 = r0.hasSystemFeature(r4)
            if (r0 == 0) goto L_0x00dd
        L_0x00a4:
            r0 = r2
        L_0x00a5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            defpackage.azb.e = r0
        L_0x00ab:
            java.lang.Boolean r0 = defpackage.azb.e
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00df
            r4 = r2
        L_0x00b4:
            r0 = 0
            if (r4 == 0) goto L_0x00bf
            java.lang.String r0 = "com.android.vending"
            r6 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r0 = r5.getPackageInfo(r0, r6)     // Catch:{ NameNotFoundException -> 0x00e1 }
        L_0x00bf:
            java.lang.String r6 = "com.google.android.gms"
            r7 = 64
            android.content.pm.PackageInfo r6 = r5.getPackageInfo(r6, r7)     // Catch:{ NameNotFoundException -> 0x00eb }
            defpackage.aya.a(r8)
            if (r4 == 0) goto L_0x0107
            bfd[] r4 = defpackage.bfg.a
            bfd r0 = defpackage.aya.a(r0, r4)
            if (r0 != 0) goto L_0x00f4
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.String r1 = "Google Play Store signature invalid."
            android.util.Log.w(r0, r1)
            r2 = r3
        L_0x00dc:
            return r2
        L_0x00dd:
            r0 = r1
            goto L_0x00a5
        L_0x00df:
            r4 = r1
            goto L_0x00b4
        L_0x00e1:
            r0 = move-exception
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.String r1 = "Google Play Store is missing."
            android.util.Log.w(r0, r1)
            r2 = r3
            goto L_0x00dc
        L_0x00eb:
            r0 = move-exception
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.String r1 = "Google Play services is missing."
            android.util.Log.w(r0, r1)
            goto L_0x00dc
        L_0x00f4:
            bfd[] r4 = new defpackage.bfd[r2]
            r4[r1] = r0
            bfd r0 = defpackage.aya.a(r6, r4)
            if (r0 != 0) goto L_0x0118
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.String r1 = "Google Play services signature invalid."
            android.util.Log.w(r0, r1)
            r2 = r3
            goto L_0x00dc
        L_0x0107:
            bfd[] r0 = defpackage.bfg.a
            bfd r0 = defpackage.aya.a(r6, r0)
            if (r0 != 0) goto L_0x0118
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.String r1 = "Google Play services signature invalid."
            android.util.Log.w(r0, r1)
            r2 = r3
            goto L_0x00dc
        L_0x0118:
            int r0 = a
            int r0 = r0 / 1000
            int r3 = r6.versionCode
            int r3 = r3 / 1000
            if (r3 >= r0) goto L_0x014c
            java.lang.String r0 = "GooglePlayServicesUtil"
            int r1 = a
            int r2 = r6.versionCode
            r3 = 77
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Google Play services out of date.  Requires "
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r3 = " but found "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r0, r1)
            r2 = 2
            goto L_0x00dc
        L_0x014c:
            android.content.pm.ApplicationInfo r0 = r6.applicationInfo
            if (r0 != 0) goto L_0x0157
            java.lang.String r0 = "com.google.android.gms"
            r3 = 0
            android.content.pm.ApplicationInfo r0 = r5.getApplicationInfo(r0, r3)     // Catch:{ NameNotFoundException -> 0x015d }
        L_0x0157:
            boolean r0 = r0.enabled
            if (r0 != 0) goto L_0x0167
            r2 = 3
            goto L_0x00dc
        L_0x015d:
            r0 = move-exception
            java.lang.String r1 = "GooglePlayServicesUtil"
            java.lang.String r3 = "Google Play services missing when getting application info."
            android.util.Log.wtf(r1, r3, r0)
            goto L_0x00dc
        L_0x0167:
            r2 = r1
            goto L_0x00dc
    }

    @java.lang.Deprecated
    public static void c(android.content.Context context) {
        int a2 = defpackage.axv.a(context);
        if (a2 != 0) {
            android.content.Intent a3 = defpackage.axv.a(context, a2, "e");
            android.util.Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + a2);
            if (a3 == null) {
                throw new defpackage.axw();
            }
            throw new defpackage.axx(a2, "Google Play Services not available", a3);
        }
    }

    @java.lang.Deprecated
    public static boolean a(android.content.Context context, int i) {
        return defpackage.azb.a(context, i);
    }

    public static boolean d(android.content.Context context) {
        if (!d) {
            try {
                android.content.pm.PackageInfo b2 = defpackage.bjg.a.a(context).b("com.google.android.gms", 64);
                if (b2 != null) {
                    defpackage.aya.a(context);
                    if (defpackage.aya.a(b2, defpackage.bfg.a[1]) != null) {
                        c = true;
                    }
                }
                c = false;
            } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
                android.util.Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
            } finally {
                d = true;
            }
        }
        if (c || !"user".equals(android.os.Build.TYPE)) {
            return true;
        }
        return false;
    }

    @java.lang.Deprecated
    public static boolean b(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 9:
                return true;
            default:
                return false;
        }
    }

    public static android.content.res.Resources e(android.content.Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
            return null;
        }
    }

    @java.lang.Deprecated
    public static boolean b(android.content.Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return a(context, "com.google.android.gms");
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0075  */
    @android.annotation.TargetApi(21)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean a(android.content.Context r5, java.lang.String r6) {
            r1 = 1
            r2 = 0
            java.lang.String r0 = "com.google.android.gms"
            boolean r3 = r6.equals(r0)
            boolean r0 = defpackage.azb.h()
            if (r0 == 0) goto L_0x0039
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch:{ Exception -> 0x0036 }
            android.content.pm.PackageInstaller r0 = r0.getPackageInstaller()     // Catch:{ Exception -> 0x0036 }
            java.util.List r0 = r0.getAllSessions()     // Catch:{ Exception -> 0x0036 }
            java.util.Iterator r4 = r0.iterator()
        L_0x001e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0039
            java.lang.Object r0 = r4.next()
            android.content.pm.PackageInstaller$SessionInfo r0 = (android.content.pm.PackageInstaller.SessionInfo) r0
            boolean r0 = r6.equals(r0.getAppPackageName())
            if (r0 == 0) goto L_0x001e
            r0 = r1
        L_0x0035:
            return r0
        L_0x0036:
            r0 = move-exception
            r0 = r2
            goto L_0x0035
        L_0x0039:
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            r4 = 8192(0x2000, float:1.14794E-41)
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r6, r4)     // Catch:{ NameNotFoundException -> 0x007b }
            if (r3 == 0) goto L_0x0048
            boolean r0 = r0.enabled     // Catch:{ NameNotFoundException -> 0x007b }
            goto L_0x0035
        L_0x0048:
            boolean r0 = r0.enabled     // Catch:{ NameNotFoundException -> 0x007b }
            if (r0 == 0) goto L_0x0079
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException -> 0x007b }
            r3 = 18
            if (r0 < r3) goto L_0x0077
            java.lang.String r0 = "user"
            java.lang.Object r0 = r5.getSystemService(r0)     // Catch:{ NameNotFoundException -> 0x007b }
            android.os.UserManager r0 = (android.os.UserManager) r0     // Catch:{ NameNotFoundException -> 0x007b }
            java.lang.String r3 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x007b }
            android.os.Bundle r0 = r0.getApplicationRestrictions(r3)     // Catch:{ NameNotFoundException -> 0x007b }
            if (r0 == 0) goto L_0x0077
            java.lang.String r3 = "true"
            java.lang.String r4 = "restricted_profile"
            java.lang.String r0 = r0.getString(r4)     // Catch:{ NameNotFoundException -> 0x007b }
            boolean r0 = r3.equals(r0)     // Catch:{ NameNotFoundException -> 0x007b }
            if (r0 == 0) goto L_0x0077
            r0 = r1
        L_0x0073:
            if (r0 != 0) goto L_0x0079
            r0 = r1
            goto L_0x0035
        L_0x0077:
            r0 = r2
            goto L_0x0073
        L_0x0079:
            r0 = r2
            goto L_0x0035
        L_0x007b:
            r0 = move-exception
            r0 = r2
            goto L_0x0035
    }
}
