package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import org.json.JSONObject;

/* renamed from: avy  reason: default package */
/* compiled from: PG */
public final class avy {
    private static avy a = null;
    private awg b;

    private avy(Context context) {
        this.b = awg.a(context);
        this.b.a();
        this.b.b();
    }

    public static synchronized avy a(Context context) {
        avy b2;
        synchronized (avy.class) {
            b2 = b(context.getApplicationContext());
        }
        return b2;
    }

    private static synchronized avy b(Context context) {
        avy avy;
        synchronized (avy.class) {
            if (a == null) {
                a = new avy(context);
            }
            avy = a;
        }
        return avy;
    }

    public final synchronized void a() {
        awg awg = this.b;
        awg.a.lock();
        try {
            awg.b.edit().clear().apply();
        } finally {
            awg.a.unlock();
        }
    }

    public final synchronized void a(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        awg awg = this.b;
        azb.b(googleSignInAccount);
        azb.b(googleSignInOptions);
        awg.a("defaultGoogleSignInAccount", googleSignInAccount.b);
        azb.b(googleSignInAccount);
        azb.b(googleSignInOptions);
        String str = googleSignInAccount.b;
        String b2 = awg.b("googleSignInAccount", str);
        JSONObject b3 = googleSignInAccount.b();
        b3.remove("serverAuthCode");
        awg.a(b2, b3.toString());
        awg.a(awg.b("googleSignInOptions", str), googleSignInOptions.b().toString());
    }
}
