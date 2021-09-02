package defpackage;

/* renamed from: avy reason: default package */
/* compiled from: PG */
public final class avy {
    private static defpackage.avy a = null;
    private defpackage.awg b;

    private avy(android.content.Context context) {
        this.b = defpackage.awg.a(context);
        this.b.a();
        this.b.b();
    }

    public static synchronized defpackage.avy a(android.content.Context context) {
        defpackage.avy b2;
        synchronized (defpackage.avy.class) {
            b2 = b(context.getApplicationContext());
        }
        return b2;
    }

    private static synchronized defpackage.avy b(android.content.Context context) {
        defpackage.avy avy;
        synchronized (defpackage.avy.class) {
            if (a == null) {
                a = new defpackage.avy(context);
            }
            avy = a;
        }
        return avy;
    }

    public final synchronized void a() {
        defpackage.awg awg = this.b;
        awg.a.lock();
        try {
            awg.b.edit().clear().apply();
            awg.a.unlock();
        } catch (Throwable th) {
            awg.a.unlock();
            throw th;
        }
    }

    public final synchronized void a(com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        defpackage.awg awg = this.b;
        defpackage.azb.b((java.lang.Object) googleSignInAccount);
        defpackage.azb.b((java.lang.Object) googleSignInOptions);
        awg.a("defaultGoogleSignInAccount", googleSignInAccount.b);
        defpackage.azb.b((java.lang.Object) googleSignInAccount);
        defpackage.azb.b((java.lang.Object) googleSignInOptions);
        java.lang.String str = googleSignInAccount.b;
        java.lang.String b2 = defpackage.awg.b("googleSignInAccount", str);
        org.json.JSONObject b3 = googleSignInAccount.b();
        b3.remove("serverAuthCode");
        awg.a(b2, b3.toString());
        awg.a(defpackage.awg.b("googleSignInOptions", str), googleSignInOptions.b().toString());
    }
}
