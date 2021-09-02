package defpackage;

/* renamed from: bij reason: default package */
/* compiled from: PG */
public final class bij {
    private android.content.SharedPreferences a;
    private android.content.Context b;

    public bij(android.content.Context context) {
        this(context, "com.google.android.gms.appid");
    }

    private bij(android.content.Context context, java.lang.String str) {
        java.io.File a2;
        this.b = context;
        this.a = context.getSharedPreferences(str, 0);
        java.lang.String valueOf = java.lang.String.valueOf(str);
        java.lang.String valueOf2 = java.lang.String.valueOf("-no-backup");
        java.lang.String str2 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new java.lang.String(valueOf);
        android.content.Context context2 = this.b;
        if (defpackage.azb.h()) {
            a2 = context2.getNoBackupFilesDir();
        } else {
            a2 = defpackage.azb.a(new java.io.File(context2.getApplicationInfo().dataDir, "no_backup"));
        }
        java.io.File file = new java.io.File(a2, str2);
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !this.a.getAll().isEmpty()) {
                    defpackage.bhv.a(this.b, this);
                }
            } catch (java.io.IOException e) {
            }
        }
    }

    private static java.lang.String b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4 = "|T|";
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 1 + java.lang.String.valueOf(str4).length() + java.lang.String.valueOf(str2).length() + java.lang.String.valueOf(str3).length()).append(str).append(str4).append(str2).append("|").append(str3).toString();
    }

    private final synchronized java.lang.String a(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        str3 = "|S|";
        return this.a.getString(new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + java.lang.String.valueOf(str3).length() + java.lang.String.valueOf(str2).length()).append(str).append(str3).append(str2).toString(), null);
    }

    public final synchronized java.lang.String a(java.lang.String str) {
        return this.a.getString(str, null);
    }

    private final synchronized void a(android.content.SharedPreferences.Editor editor, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4 = "|S|";
        editor.putString(new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + java.lang.String.valueOf(str4).length() + java.lang.String.valueOf(str2).length()).append(str).append(str4).append(str2).toString(), str3);
    }

    public final synchronized void a() {
        this.a.edit().clear().commit();
    }

    public final synchronized java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return this.a.getString(b(str, str2, str3), null);
    }

    public final synchronized void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        java.lang.String b2 = b(str, str2, str3);
        android.content.SharedPreferences.Editor edit = this.a.edit();
        edit.putString(b2, str4);
        edit.putString("appVersion", str5);
        edit.putString("lastToken", java.lang.Long.toString(java.lang.System.currentTimeMillis() / 1000));
        edit.commit();
    }

    public final synchronized java.security.KeyPair a(java.lang.String str, long j) {
        java.security.KeyPair a2;
        a2 = defpackage.bjr.a();
        android.content.SharedPreferences.Editor edit = this.a.edit();
        a(edit, str, "|P|", defpackage.bhu.a(a2.getPublic().getEncoded()));
        a(edit, str, "|K|", defpackage.bhu.a(a2.getPrivate().getEncoded()));
        a(edit, str, "cre", java.lang.Long.toString(j));
        edit.commit();
        return a2;
    }

    public final java.security.KeyPair b(java.lang.String str) {
        java.lang.String a2 = a(str, "|P|");
        java.lang.String a3 = a(str, "|K|");
        if (a2 == null || a3 == null) {
            return null;
        }
        try {
            byte[] decode = android.util.Base64.decode(a2, 8);
            byte[] decode2 = android.util.Base64.decode(a3, 8);
            java.security.KeyFactory instance = java.security.KeyFactory.getInstance("RSA");
            return new java.security.KeyPair(instance.generatePublic(new java.security.spec.X509EncodedKeySpec(decode)), instance.generatePrivate(new java.security.spec.PKCS8EncodedKeySpec(decode2)));
        } catch (java.security.NoSuchAlgorithmException | java.security.spec.InvalidKeySpecException e) {
            java.lang.String valueOf = java.lang.String.valueOf(e);
            android.util.Log.w("InstanceID/Store", new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 19).append("Invalid key stored ").append(valueOf).toString());
            defpackage.bhv.a(this.b, this);
            return null;
        }
    }
}
