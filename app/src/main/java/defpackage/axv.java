package defpackage;

/* renamed from: axv reason: default package */
/* compiled from: PG */
public class axv {
    public static final int b = defpackage.axz.a;

    axv() {
    }

    public static int a(android.content.Context context) {
        int b2 = defpackage.axz.b(context);
        if (defpackage.axz.b(context, b2)) {
            return 18;
        }
        return b2;
    }

    public static void b(android.content.Context context) {
        defpackage.axz.c(context);
    }

    public static boolean a(int i) {
        return defpackage.axz.b(i);
    }

    public static android.content.Intent a(android.content.Context context, int i, java.lang.String str) {
        switch (i) {
            case 1:
            case 2:
                if (context == null || !defpackage.azb.a(context)) {
                    return defpackage.beq.a("com.google.android.gms", a(context, str));
                }
                return defpackage.beq.a();
            case 3:
                return defpackage.beq.a("com.google.android.gms");
            default:
                return null;
        }
    }

    public static android.app.PendingIntent a(android.content.Context context, int i, int i2, java.lang.String str) {
        android.content.Intent a = a(context, i, str);
        if (a == null) {
            return null;
        }
        return android.app.PendingIntent.getActivity(context, 0, a, 268435456);
    }

    public static void c(android.content.Context context) {
        if (!defpackage.axz.b.getAndSet(true)) {
            try {
                android.app.NotificationManager notificationManager = (android.app.NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (java.lang.SecurityException e) {
            }
        }
    }

    public static boolean a(android.content.Context context, int i) {
        return defpackage.axz.b(context, i);
    }

    public static java.lang.String b(int i) {
        return defpackage.axz.a(i);
    }

    private static java.lang.String a(android.content.Context context, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("gcore_");
        sb.append(b);
        sb.append("-");
        if (!android.text.TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(defpackage.bjg.a.a(context).b(context.getPackageName(), 0).versionCode);
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            }
        }
        return sb.toString();
    }

    static {
        new defpackage.axv();
    }
}
