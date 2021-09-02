package defpackage;

/* renamed from: bhu reason: default package */
/* compiled from: PG */
public final class bhu {
    public static defpackage.bij a;
    public static defpackage.bhw b;
    public static java.lang.String f;
    private static java.util.Map g = new defpackage.qr();
    public java.security.KeyPair c;
    public java.lang.String d = "";
    public long e;

    private bhu(android.content.Context context, java.lang.String str) {
        context.getApplicationContext();
        this.d = str;
    }

    static int a(android.content.Context context) {
        boolean z = false;
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
            java.lang.String valueOf = java.lang.String.valueOf(e2);
            android.util.Log.w("InstanceID", new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 38).append("Never happens: can't find own package ").append(valueOf).toString());
            return z;
        }
    }

    static java.lang.String b(android.content.Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
            java.lang.String valueOf = java.lang.String.valueOf(e2);
            android.util.Log.w("InstanceID", new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 38).append("Never happens: can't find own package ").append(valueOf).toString());
            return null;
        }
    }

    public static defpackage.bhu c(android.content.Context context) {
        return d(context);
    }

    private static synchronized defpackage.bhu d(android.content.Context context) {
        defpackage.bhu bhu;
        synchronized (defpackage.bhu.class) {
            java.lang.String str = "";
            android.content.Context applicationContext = context.getApplicationContext();
            if (a == null) {
                a = new defpackage.bij(applicationContext);
                b = new defpackage.bhw(applicationContext);
            }
            f = java.lang.Integer.toString(a(applicationContext));
            bhu = (defpackage.bhu) g.get(str);
            if (bhu == null) {
                bhu = new defpackage.bhu(applicationContext, str);
                g.put(str, bhu);
            }
        }
        return bhu;
    }

    static java.lang.String a(byte[] bArr) {
        return android.util.Base64.encodeToString(bArr, 11);
    }

    static java.lang.String a(java.security.KeyPair keyPair) {
        try {
            byte[] digest = java.security.MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return android.util.Base64.encodeToString(digest, 0, 8, 11);
        } catch (java.security.NoSuchAlgorithmException e2) {
            android.util.Log.w("InstanceID", "Unexpected error, device missing required algorithms");
            return null;
        }
    }
}
