package defpackage;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: nm  reason: default package */
/* compiled from: PG */
public final class nm {
    private static final Object a = new Object();
    private static String b;
    private static Set c = new HashSet();
    private static final Object f = new Object();
    private static nq g;
    private final Context d;
    private final NotificationManager e = ((NotificationManager) this.d.getSystemService("notification"));

    public static nm a(Context context) {
        return new nm(context);
    }

    private nm(Context context) {
        this.d = context;
    }

    public final void a(String str) {
        this.e.cancel(str, 0);
        if (Build.VERSION.SDK_INT <= 19) {
            a(new nn(this.d.getPackageName(), str));
        }
    }

    public final void a(String str, Notification notification) {
        Bundle a2 = jd.a(notification);
        if (a2 != null && a2.getBoolean("android.support.useSideChannel")) {
            a(new no(this.d.getPackageName(), str, notification));
            this.e.cancel(str, 0);
            return;
        }
        this.e.notify(str, 0, notification);
    }

    public final boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.e.areNotificationsEnabled();
        }
        if (Build.VERSION.SDK_INT < 19) {
            return true;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.d.getSystemService("appops");
        ApplicationInfo applicationInfo = this.d.getApplicationInfo();
        String packageName = this.d.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            return ((Integer) cls.getMethod("checkOpNoThrow", new Class[]{Integer.TYPE, Integer.TYPE, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), packageName})).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException e2) {
            return true;
        }
    }

    public static Set b(Context context) {
        Set set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (a) {
            if (string != null) {
                if (!string.equals(b)) {
                    String[] split = string.split(":");
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
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

    private final void a(ns nsVar) {
        synchronized (f) {
            if (g == null) {
                g = new nq(this.d.getApplicationContext());
            }
            g.a.obtainMessage(0, nsVar).sendToTarget();
        }
    }
}
