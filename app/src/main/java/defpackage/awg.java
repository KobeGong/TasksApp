package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* renamed from: awg  reason: default package */
/* compiled from: PG */
public final class awg {
    private static final Lock c = new ReentrantLock();
    private static awg d;
    public final Lock a = new ReentrantLock();
    public final SharedPreferences b;

    public static awg a(Context context) {
        azb.b(context);
        c.lock();
        try {
            if (d == null) {
                d = new awg(context.getApplicationContext());
            }
            return d;
        } finally {
            c.unlock();
        }
    }

    private awg(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* access modifiers changed from: protected */
    public final void a(String str, String str2) {
        this.a.lock();
        try {
            this.b.edit().putString(str, str2).apply();
        } finally {
            this.a.unlock();
        }
    }

    public final GoogleSignInAccount a() {
        return c(a("defaultGoogleSignInAccount"));
    }

    private final GoogleSignInAccount c(String str) {
        String a2;
        if (TextUtils.isEmpty(str) || (a2 = a(b("googleSignInAccount", str))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.a(a2);
        } catch (JSONException e) {
            return null;
        }
    }

    public final GoogleSignInOptions b() {
        return d(a("defaultGoogleSignInAccount"));
    }

    private final GoogleSignInOptions d(String str) {
        String a2;
        if (TextUtils.isEmpty(str) || (a2 = a(b("googleSignInOptions", str))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.a(a2);
        } catch (JSONException e) {
            return null;
        }
    }

    public final String a(String str) {
        this.a.lock();
        try {
            return this.b.getString(str, null);
        } finally {
            this.a.unlock();
        }
    }

    public final void b(String str) {
        this.a.lock();
        try {
            this.b.edit().remove(str).apply();
        } finally {
            this.a.unlock();
        }
    }

    public static String b(String str, String str2) {
        return new StringBuilder(String.valueOf(str).length() + String.valueOf(":").length() + String.valueOf(str2).length()).append(str).append(":").append(str2).toString();
    }
}
