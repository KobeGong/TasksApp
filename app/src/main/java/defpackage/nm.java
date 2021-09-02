package defpackage;

/* renamed from: nm reason: default package */
/* compiled from: PG */
public final class nm {
    private static final java.lang.Object a = new java.lang.Object();
    private static java.lang.String b;
    private static java.util.Set c = new java.util.HashSet();
    private static final java.lang.Object f = new java.lang.Object();
    private static defpackage.nq g;
    private final android.content.Context d;
    private final android.app.NotificationManager e = ((android.app.NotificationManager) this.d.getSystemService("notification"));

    public static defpackage.nm a(android.content.Context context) {
        return new defpackage.nm(context);
    }

    private nm(android.content.Context context) {
        this.d = context;
    }

    public final void a(java.lang.String str) {
        this.e.cancel(str, 0);
        if (android.os.Build.VERSION.SDK_INT <= 19) {
            a((defpackage.ns) new defpackage.nn(this.d.getPackageName(), str));
        }
    }

    public final void a(java.lang.String str, android.app.Notification notification) {
        android.os.Bundle a2 = defpackage.jd.a(notification);
        if (a2 != null && a2.getBoolean("android.support.useSideChannel")) {
            a((defpackage.ns) new defpackage.no(this.d.getPackageName(), str, notification));
            this.e.cancel(str, 0);
            return;
        }
        this.e.notify(str, 0, notification);
    }

    public final boolean a() {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return this.e.areNotificationsEnabled();
        }
        if (android.os.Build.VERSION.SDK_INT < 19) {
            return true;
        }
        android.app.AppOpsManager appOpsManager = (android.app.AppOpsManager) this.d.getSystemService("appops");
        android.content.pm.ApplicationInfo applicationInfo = this.d.getApplicationInfo();
        java.lang.String packageName = this.d.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            java.lang.Class cls = java.lang.Class.forName(android.app.AppOpsManager.class.getName());
            return ((java.lang.Integer) cls.getMethod("checkOpNoThrow", new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.String.class}).invoke(appOpsManager, new java.lang.Object[]{java.lang.Integer.valueOf(((java.lang.Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(java.lang.Integer.class)).intValue()), java.lang.Integer.valueOf(i), packageName})).intValue() == 0;
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchFieldException | java.lang.NoSuchMethodException | java.lang.RuntimeException | java.lang.reflect.InvocationTargetException e2) {
            return true;
        }
    }

    public static java.util.Set b(android.content.Context context) {
        java.util.Set set;
        java.lang.String string = android.provider.Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (a) {
            if (string != null) {
                if (!string.equals(b)) {
                    java.lang.String[] split = string.split(":");
                    java.util.HashSet hashSet = new java.util.HashSet(split.length);
                    for (java.lang.String unflattenFromString : split) {
                        android.content.ComponentName unflattenFromString2 = android.content.ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    c = hashSet;
                    b = string;
                }
            }
            set = c;
        }
        return set;
    }

    private final void a(defpackage.ns nsVar) {
        synchronized (f) {
            if (g == null) {
                g = new defpackage.nq(this.d.getApplicationContext());
            }
            g.a.obtainMessage(0, nsVar).sendToTarget();
        }
    }
}
