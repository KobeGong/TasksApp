package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: axz  reason: default package */
/* compiled from: PG */
public class axz {
    @Deprecated
    public static final int a = 11910000;
    public static final AtomicBoolean b = new AtomicBoolean();
    private static boolean c = false;
    private static boolean d = false;
    private static final AtomicBoolean e = new AtomicBoolean();

    @Deprecated
    public static String a(int i) {
        return axq.a(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x014c  */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(android.content.Context r8) {
        /*
        // Method dump skipped, instructions count: 362
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axz.b(android.content.Context):int");
    }

    @Deprecated
    public static void c(Context context) {
        int a2 = axv.a(context);
        if (a2 != 0) {
            Intent a3 = axv.a(context, a2, "e");
            Log.e("GooglePlayServicesUtil", new StringBuilder(57).append("GooglePlayServices not available due to error ").append(a2).toString());
            if (a3 == null) {
                throw new axw();
            }
            throw new axx(a2, "Google Play Services not available", a3);
        }
    }

    @Deprecated
    public static boolean a(Context context, int i) {
        return azb.a(context, i);
    }

    public static boolean d(Context context) {
        if (!d) {
            try {
                PackageInfo b2 = bjg.a.a(context).b("com.google.android.gms", 64);
                if (b2 != null) {
                    aya.a(context);
                    if (aya.a(b2, bfg.a[1]) != null) {
                        c = true;
                    }
                }
                c = false;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
            } finally {
                d = true;
            }
        }
        return c || !"user".equals(Build.TYPE);
    }

    @Deprecated
    public static boolean b(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 9:
                return true;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            default:
                return false;
        }
    }

    public static Resources e(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException e2) {
            return null;
        }
    }

    @Deprecated
    public static boolean b(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return a(context, "com.google.android.gms");
        }
        return false;
    }

    @TargetApi(21)
    static boolean a(Context context, String str) {
        Bundle applicationRestrictions;
        boolean equals = str.equals("com.google.android.gms");
        if (azb.h()) {
            try {
                for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(sessionInfo.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception e2) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (equals) {
                return applicationInfo.enabled;
            }
            if (applicationInfo.enabled) {
                if (!(Build.VERSION.SDK_INT >= 18 && (applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName())) != null && "true".equals(applicationRestrictions.getString("restricted_profile")))) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e3) {
            return false;
        }
    }
}
