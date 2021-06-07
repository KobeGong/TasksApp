package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.util.Log;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

/* renamed from: bhu  reason: default package */
/* compiled from: PG */
public final class bhu {
    public static bij a;
    public static bhw b;
    public static String f;
    private static Map g = new qr();
    public KeyPair c;
    public String d = "";
    public long e;

    private bhu(Context context, String str) {
        context.getApplicationContext();
        this.d = str;
    }

    static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            String valueOf = String.valueOf(e2);
            Log.w("InstanceID", new StringBuilder(String.valueOf(valueOf).length() + 38).append("Never happens: can't find own package ").append(valueOf).toString());
            return 0;
        }
    }

    static String b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e2) {
            String valueOf = String.valueOf(e2);
            Log.w("InstanceID", new StringBuilder(String.valueOf(valueOf).length() + 38).append("Never happens: can't find own package ").append(valueOf).toString());
            return null;
        }
    }

    public static bhu c(Context context) {
        return d(context);
    }

    private static synchronized bhu d(Context context) {
        bhu bhu;
        synchronized (bhu.class) {
            Context applicationContext = context.getApplicationContext();
            if (a == null) {
                a = new bij(applicationContext);
                b = new bhw(applicationContext);
            }
            f = Integer.toString(a(applicationContext));
            bhu = (bhu) g.get("");
            if (bhu == null) {
                bhu = new bhu(applicationContext, "");
                g.put("", bhu);
            }
        }
        return bhu;
    }

    static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    static String a(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException e2) {
            Log.w("InstanceID", "Unexpected error, device missing required algorithms");
            return null;
        }
    }
}
