package defpackage;

/* renamed from: awg reason: default package */
/* compiled from: PG */
public final class awg {
    private static final java.util.concurrent.locks.Lock c = new java.util.concurrent.locks.ReentrantLock();
    private static defpackage.awg d;
    public final java.util.concurrent.locks.Lock a = new java.util.concurrent.locks.ReentrantLock();
    public final android.content.SharedPreferences b;

    public static defpackage.awg a(android.content.Context context) {
        defpackage.azb.b((java.lang.Object) context);
        c.lock();
        try {
            if (d == null) {
                d = new defpackage.awg(context.getApplicationContext());
            }
            return d;
        } finally {
            c.unlock();
        }
    }

    private awg(android.content.Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* access modifiers changed from: protected */
    public final void a(java.lang.String str, java.lang.String str2) {
        this.a.lock();
        try {
            this.b.edit().putString(str, str2).apply();
        } finally {
            this.a.unlock();
        }
    }

    public final com.google.android.gms.auth.api.signin.GoogleSignInAccount a() {
        return c(a("defaultGoogleSignInAccount"));
    }

    private final com.google.android.gms.auth.api.signin.GoogleSignInAccount c(java.lang.String str) {
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = null;
        if (android.text.TextUtils.isEmpty(str)) {
            return googleSignInAccount;
        }
        java.lang.String a2 = a(b("googleSignInAccount", str));
        if (a2 == null) {
            return googleSignInAccount;
        }
        try {
            return com.google.android.gms.auth.api.signin.GoogleSignInAccount.a(a2);
        } catch (org.json.JSONException e) {
            return googleSignInAccount;
        }
    }

    public final com.google.android.gms.auth.api.signin.GoogleSignInOptions b() {
        return d(a("defaultGoogleSignInAccount"));
    }

    private final com.google.android.gms.auth.api.signin.GoogleSignInOptions d(java.lang.String str) {
        com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions = null;
        if (android.text.TextUtils.isEmpty(str)) {
            return googleSignInOptions;
        }
        java.lang.String a2 = a(b("googleSignInOptions", str));
        if (a2 == null) {
            return googleSignInOptions;
        }
        try {
            return com.google.android.gms.auth.api.signin.GoogleSignInOptions.a(a2);
        } catch (org.json.JSONException e) {
            return googleSignInOptions;
        }
    }

    public final java.lang.String a(java.lang.String str) {
        this.a.lock();
        try {
            return this.b.getString(str, null);
        } finally {
            this.a.unlock();
        }
    }

    public final void b(java.lang.String str) {
        this.a.lock();
        try {
            this.b.edit().remove(str).apply();
        } finally {
            this.a.unlock();
        }
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = ":";
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + java.lang.String.valueOf(str3).length() + java.lang.String.valueOf(str2).length()).append(str).append(str3).append(str2).toString();
    }
}
