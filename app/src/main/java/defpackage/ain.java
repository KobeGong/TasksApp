package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: ain reason: default package */
/* compiled from: PG */
public final class ain {
    private static final java.util.Map b = new java.util.HashMap();
    public final SharedPreferences preferences;

    private ain(SharedPreferences sharedPreferences) {
        this.preferences = sharedPreferences;
    }

    public static synchronized defpackage.cyi a(Context context, String accountName) {
        defpackage.cyi cyi;
        synchronized (defpackage.ain.class) {
            String valueOf = String.valueOf(accountName);
            String str3 = valueOf.length() != 0 ? "prefs-".concat(valueOf) : "prefs-";
            cyi = (defpackage.cyi) b.get(str3);
            if (cyi == 0) {
                defpackage.cyu cyu = new defpackage.cyu();
                defpackage.ajd.b(context).c().execute(new Runnable() {
                    @Override
                    public void run() {
                        cyu.a(new defpackage.ain(context.getApplicationContext().getSharedPreferences(str3, 0)));
                    }
                });
                b.put(str3, cyu);
                cyi = cyu;
            }
        }
        return cyi;
    }

    public static synchronized defpackage.ain b(Context context, String accountName) {
        defpackage.ain ain;
        synchronized (defpackage.ain.class) {
            ain = (defpackage.ain) defpackage.cyd.c(a(context, accountName));
        }
        return ain;
    }

    public final String a() {
        return this.preferences.getString("sel-task-list-id", null);
    }

    public final void a(String str) {
        SharedPreferences.Editor edit = this.preferences.edit();
        edit.putString("sel-task-list-id", str);
        edit.apply();
    }

    public final defpackage.ajr b(String str) {
        String valueOf = "task-list-order:";
        String valueOf2 = String.valueOf(str);
        String string = this.preferences.getString(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : valueOf, null);
        if (string != null) {
            try {
                return defpackage.ajr.a(string);
            } catch (java.lang.IllegalArgumentException e) {
                defpackage.azb.b("Cannot map 'task order' name stored in preferences to enum value: %s", string);
            }
        }
        return null;
    }
}
