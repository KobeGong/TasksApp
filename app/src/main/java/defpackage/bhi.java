package defpackage;

/* renamed from: bhi reason: default package */
/* compiled from: PG */
final class bhi {
    private static defpackage.bhi d;
    public final android.content.Context a;
    public java.lang.String b;
    public final java.util.concurrent.atomic.AtomicInteger c = new java.util.concurrent.atomic.AtomicInteger((int) android.os.SystemClock.elapsedRealtime());

    static synchronized defpackage.bhi a(android.content.Context context) {
        defpackage.bhi bhi;
        synchronized (defpackage.bhi.class) {
            if (d == null) {
                d = new defpackage.bhi(context);
            }
            bhi = d;
        }
        return bhi;
    }

    static java.lang.String a(android.os.Bundle bundle, java.lang.String str) {
        java.lang.String string = bundle.getString(str);
        if (string == null) {
            return bundle.getString(str.replace("gcm.n.", "gcm.notification."));
        }
        return string;
    }

    private bhi(android.content.Context context) {
        this.a = context.getApplicationContext();
    }

    /* access modifiers changed from: 0000 */
    public final java.lang.String b(android.os.Bundle bundle, java.lang.String str) {
        java.lang.String a2 = a(bundle, str);
        if (!android.text.TextUtils.isEmpty(a2)) {
            return a2;
        }
        java.lang.String valueOf = java.lang.String.valueOf(str);
        java.lang.String valueOf2 = java.lang.String.valueOf("_loc_key");
        java.lang.String a3 = a(bundle, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new java.lang.String(valueOf));
        if (android.text.TextUtils.isEmpty(a3)) {
            return null;
        }
        android.content.res.Resources resources = this.a.getResources();
        int identifier = resources.getIdentifier(a3, "string", this.a.getPackageName());
        if (identifier == 0) {
            java.lang.String str2 = "GcmNotification";
            java.lang.String valueOf3 = java.lang.String.valueOf(str);
            java.lang.String valueOf4 = java.lang.String.valueOf("_loc_key");
            java.lang.String substring = (valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new java.lang.String(valueOf3)).substring(6);
            android.util.Log.w(str2, new java.lang.StringBuilder(java.lang.String.valueOf(substring).length() + 49 + java.lang.String.valueOf(a3).length()).append(substring).append(" resource not found: ").append(a3).append(" Default value will be used.").toString());
            return null;
        }
        java.lang.String valueOf5 = java.lang.String.valueOf(str);
        java.lang.String valueOf6 = java.lang.String.valueOf("_loc_args");
        java.lang.String a4 = a(bundle, valueOf6.length() != 0 ? valueOf5.concat(valueOf6) : new java.lang.String(valueOf5));
        if (android.text.TextUtils.isEmpty(a4)) {
            return resources.getString(identifier);
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(a4);
            java.lang.Object[] objArr = new java.lang.String[jSONArray.length()];
            for (int i = 0; i < objArr.length; i++) {
                objArr[i] = jSONArray.opt(i);
            }
            return resources.getString(identifier, objArr);
        } catch (org.json.JSONException e) {
            java.lang.String str3 = "GcmNotification";
            java.lang.String valueOf7 = java.lang.String.valueOf(str);
            java.lang.String valueOf8 = java.lang.String.valueOf("_loc_args");
            java.lang.String substring2 = (valueOf8.length() != 0 ? valueOf7.concat(valueOf8) : new java.lang.String(valueOf7)).substring(6);
            android.util.Log.w(str3, new java.lang.StringBuilder(java.lang.String.valueOf(substring2).length() + 41 + java.lang.String.valueOf(a4).length()).append("Malformed ").append(substring2).append(": ").append(a4).append("  Default value will be used.").toString());
            return null;
        } catch (java.util.MissingFormatArgumentException e2) {
            android.util.Log.w("GcmNotification", new java.lang.StringBuilder(java.lang.String.valueOf(a3).length() + 58 + java.lang.String.valueOf(a4).length()).append("Missing format argument for ").append(a3).append(": ").append(a4).append(" Default value will be used.").toString(), e2);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    public final android.os.Bundle a() {
        android.content.pm.ApplicationInfo applicationInfo = null;
        try {
            applicationInfo = this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 128);
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
        }
        if (applicationInfo == null || applicationInfo.metaData == null) {
            return android.os.Bundle.EMPTY;
        }
        return applicationInfo.metaData;
    }
}
