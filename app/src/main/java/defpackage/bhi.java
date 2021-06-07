package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: bhi  reason: default package */
/* compiled from: PG */
final class bhi {
    private static bhi d;
    public final Context a;
    public String b;
    public final AtomicInteger c = new AtomicInteger((int) SystemClock.elapsedRealtime());

    static synchronized bhi a(Context context) {
        bhi bhi;
        synchronized (bhi.class) {
            if (d == null) {
                d = new bhi(context);
            }
            bhi = d;
        }
        return bhi;
    }

    static String a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return bundle.getString(str.replace("gcm.n.", "gcm.notification."));
        }
        return string;
    }

    private bhi(Context context) {
        this.a = context.getApplicationContext();
    }

    /* access modifiers changed from: package-private */
    public final String b(Bundle bundle, String str) {
        String a2 = a(bundle, str);
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf("_loc_key");
        String a3 = a(bundle, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        if (TextUtils.isEmpty(a3)) {
            return null;
        }
        Resources resources = this.a.getResources();
        int identifier = resources.getIdentifier(a3, "string", this.a.getPackageName());
        if (identifier == 0) {
            String valueOf3 = String.valueOf(str);
            String valueOf4 = String.valueOf("_loc_key");
            String substring = (valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3)).substring(6);
            Log.w("GcmNotification", new StringBuilder(String.valueOf(substring).length() + 49 + String.valueOf(a3).length()).append(substring).append(" resource not found: ").append(a3).append(" Default value will be used.").toString());
            return null;
        }
        String valueOf5 = String.valueOf(str);
        String valueOf6 = String.valueOf("_loc_args");
        String a4 = a(bundle, valueOf6.length() != 0 ? valueOf5.concat(valueOf6) : new String(valueOf5));
        if (TextUtils.isEmpty(a4)) {
            return resources.getString(identifier);
        }
        try {
            JSONArray jSONArray = new JSONArray(a4);
            Object[] objArr = new String[jSONArray.length()];
            for (int i = 0; i < objArr.length; i++) {
                objArr[i] = jSONArray.opt(i);
            }
            return resources.getString(identifier, objArr);
        } catch (JSONException e) {
            String valueOf7 = String.valueOf(str);
            String valueOf8 = String.valueOf("_loc_args");
            String substring2 = (valueOf8.length() != 0 ? valueOf7.concat(valueOf8) : new String(valueOf7)).substring(6);
            Log.w("GcmNotification", new StringBuilder(String.valueOf(substring2).length() + 41 + String.valueOf(a4).length()).append("Malformed ").append(substring2).append(": ").append(a4).append("  Default value will be used.").toString());
            return null;
        } catch (MissingFormatArgumentException e2) {
            Log.w("GcmNotification", new StringBuilder(String.valueOf(a3).length() + 58 + String.valueOf(a4).length()).append("Missing format argument for ").append(a3).append(": ").append(a4).append(" Default value will be used.").toString(), e2);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final Bundle a() {
        ApplicationInfo applicationInfo = null;
        try {
            applicationInfo = this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
        }
        if (applicationInfo == null || applicationInfo.metaData == null) {
            return Bundle.EMPTY;
        }
        return applicationInfo.metaData;
    }
}
