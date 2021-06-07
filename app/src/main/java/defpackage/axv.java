package defpackage;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;

/* renamed from: axv  reason: default package */
/* compiled from: PG */
public class axv {
    public static final int b = axz.a;

    axv() {
    }

    public static int a(Context context) {
        int b2 = axz.b(context);
        if (axz.b(context, b2)) {
            return 18;
        }
        return b2;
    }

    public static void b(Context context) {
        axz.c(context);
    }

    public static boolean a(int i) {
        return axz.b(i);
    }

    public static Intent a(Context context, int i, String str) {
        switch (i) {
            case 1:
            case 2:
                if (context == null || !azb.a(context)) {
                    return beq.a("com.google.android.gms", a(context, str));
                }
                return beq.a();
            case 3:
                return beq.a("com.google.android.gms");
            default:
                return null;
        }
    }

    public static PendingIntent a(Context context, int i, int i2, String str) {
        Intent a = a(context, i, str);
        if (a == null) {
            return null;
        }
        return PendingIntent.getActivity(context, 0, a, 268435456);
    }

    public static void c(Context context) {
        if (!axz.b.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException e) {
            }
        }
    }

    public static boolean a(Context context, int i) {
        return axz.b(context, i);
    }

    public static String b(int i) {
        return axz.a(i);
    }

    private static String a(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(b);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(bjg.a.a(context).b(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return sb.toString();
    }

    static {
        new axv();
    }
}
