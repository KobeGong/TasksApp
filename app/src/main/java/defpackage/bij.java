package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: bij  reason: default package */
/* compiled from: PG */
public final class bij {
    private SharedPreferences a;
    private Context b;

    public bij(Context context) {
        this(context, "com.google.android.gms.appid");
    }

    private bij(Context context, String str) {
        File a2;
        this.b = context;
        this.a = context.getSharedPreferences(str, 0);
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf("-no-backup");
        String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        Context context2 = this.b;
        if (azb.h()) {
            a2 = context2.getNoBackupFilesDir();
        } else {
            a2 = azb.a(new File(context2.getApplicationInfo().dataDir, "no_backup"));
        }
        File file = new File(a2, concat);
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !this.a.getAll().isEmpty()) {
                    bhv.a(this.b, this);
                }
            } catch (IOException e) {
            }
        }
    }

    private static String b(String str, String str2, String str3) {
        return new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf("|T|").length() + String.valueOf(str2).length() + String.valueOf(str3).length()).append(str).append("|T|").append(str2).append("|").append(str3).toString();
    }

    private final synchronized String a(String str, String str2) {
        return this.a.getString(new StringBuilder(String.valueOf(str).length() + String.valueOf("|S|").length() + String.valueOf(str2).length()).append(str).append("|S|").append(str2).toString(), null);
    }

    public final synchronized String a(String str) {
        return this.a.getString(str, null);
    }

    private final synchronized void a(SharedPreferences.Editor editor, String str, String str2, String str3) {
        editor.putString(new StringBuilder(String.valueOf(str).length() + String.valueOf("|S|").length() + String.valueOf(str2).length()).append(str).append("|S|").append(str2).toString(), str3);
    }

    public final synchronized void a() {
        this.a.edit().clear().commit();
    }

    public final synchronized String a(String str, String str2, String str3) {
        return this.a.getString(b(str, str2, str3), null);
    }

    public final synchronized void a(String str, String str2, String str3, String str4, String str5) {
        String b2 = b(str, str2, str3);
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(b2, str4);
        edit.putString("appVersion", str5);
        edit.putString("lastToken", Long.toString(System.currentTimeMillis() / 1000));
        edit.commit();
    }

    public final synchronized KeyPair a(String str, long j) {
        KeyPair a2;
        a2 = bjr.a();
        SharedPreferences.Editor edit = this.a.edit();
        a(edit, str, "|P|", bhu.a(a2.getPublic().getEncoded()));
        a(edit, str, "|K|", bhu.a(a2.getPrivate().getEncoded()));
        a(edit, str, "cre", Long.toString(j));
        edit.commit();
        return a2;
    }

    public final KeyPair b(String str) {
        String a2 = a(str, "|P|");
        String a3 = a(str, "|K|");
        if (a2 == null || a3 == null) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(a2, 8);
            byte[] decode2 = Base64.decode(a3, 8);
            KeyFactory instance = KeyFactory.getInstance("RSA");
            return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode)), instance.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            String valueOf = String.valueOf(e);
            Log.w("InstanceID/Store", new StringBuilder(String.valueOf(valueOf).length() + 19).append("Invalid key stored ").append(valueOf).toString());
            bhv.a(this.b, this);
            return null;
        }
    }
}
