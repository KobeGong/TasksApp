package defpackage;

/* renamed from: ain reason: default package */
/* compiled from: PG */
public final class ain {
    private static final java.util.Map b = new java.util.HashMap();
    public final android.content.SharedPreferences a;

    private ain(android.content.SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public static synchronized defpackage.cyi a(android.content.Context context, java.lang.String str) {
        defpackage.cyi cyi;
        synchronized (defpackage.ain.class) {
            java.lang.String str2 = "prefs-";
            java.lang.String valueOf = java.lang.String.valueOf(str);
            java.lang.String str3 = valueOf.length() != 0 ? str2.concat(valueOf) : new java.lang.String(str2);
            cyi = (defpackage.cyi) b.get(str3);
            if (cyi == 0) {
                defpackage.cyu cyu = new defpackage.cyu();
                defpackage.ajd.b(context).c().execute(new defpackage.aio(cyu, context, str3));
                b.put(str3, cyu);
                cyi = cyu;
            }
        }
        return cyi;
    }

    public static synchronized defpackage.ain b(android.content.Context context, java.lang.String str) {
        defpackage.ain ain;
        synchronized (defpackage.ain.class) {
            ain = (defpackage.ain) defpackage.cyd.c(a(context, str));
        }
        return ain;
    }

    public final java.lang.String a() {
        return this.a.getString("sel-task-list-id", null);
    }

    public final void a(java.lang.String str) {
        android.content.SharedPreferences.Editor edit = this.a.edit();
        edit.putString("sel-task-list-id", str);
        edit.apply();
    }

    public final defpackage.ajr b(java.lang.String str) {
        android.content.SharedPreferences sharedPreferences = this.a;
        java.lang.String valueOf = java.lang.String.valueOf("task-list-order:");
        java.lang.String valueOf2 = java.lang.String.valueOf(str);
        java.lang.String string = sharedPreferences.getString(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new java.lang.String(valueOf), null);
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
