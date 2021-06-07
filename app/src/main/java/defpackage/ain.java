package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ain  reason: default package */
/* compiled from: PG */
public final class ain {
    private static final Map b = new HashMap();
    public final SharedPreferences a;

    private ain(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public static synchronized cyi a(Context context, String str) {
        cyu cyu;
        synchronized (ain.class) {
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "prefs-".concat(valueOf) : new String("prefs-");
            cyi cyi = (cyi) b.get(concat);
            cyu = cyi;
            if (cyi == null) {
                cyu cyu2 = new cyu();
                ajd.b(context).c().execute(new aio(cyu2, context, concat));
                b.put(concat, cyu2);
                cyu = cyu2;
            }
        }
        return cyu;
    }

    public static synchronized ain b(Context context, String str) {
        ain ain;
        synchronized (ain.class) {
            ain = (ain) cyd.c(a(context, str));
        }
        return ain;
    }

    public final String a() {
        return this.a.getString("sel-task-list-id", null);
    }

    public final void a(String str) {
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString("sel-task-list-id", str);
        edit.apply();
    }

    public final ajr b(String str) {
        SharedPreferences sharedPreferences = this.a;
        String valueOf = String.valueOf("task-list-order:");
        String valueOf2 = String.valueOf(str);
        String string = sharedPreferences.getString(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), null);
        if (string != null) {
            try {
                return ajr.a(string);
            } catch (IllegalArgumentException e) {
                azb.b("Cannot map 'task order' name stored in preferences to enum value: %s", string);
            }
        }
        return null;
    }
}
