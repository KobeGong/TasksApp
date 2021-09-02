package defpackage;

/* renamed from: bry reason: default package */
/* compiled from: PG */
public final class bry extends defpackage.bru {
    private final android.content.Context a;

    public bry(android.content.Context context) {
        this.a = context;
    }

    public final java.lang.String a(java.lang.String str, java.lang.String str2) {
        boolean z;
        java.lang.String a2;
        java.lang.String str3;
        boolean z2 = false;
        boolean z3 = true;
        defpackage.bhu c = defpackage.bhu.c(this.a);
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            throw new java.io.IOException("MAIN_THREAD");
        }
        java.lang.String a3 = defpackage.bhu.a.a("appVersion");
        if (a3 == null || !a3.equals(defpackage.bhu.f)) {
            z = true;
        } else {
            java.lang.String a4 = defpackage.bhu.a.a("lastToken");
            if (a4 == null) {
                z = true;
            } else {
                if ((java.lang.System.currentTimeMillis() / 1000) - java.lang.Long.valueOf(java.lang.Long.parseLong(a4)).longValue() > 604800) {
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        if (z) {
            a2 = null;
        } else {
            a2 = defpackage.bhu.a.a(c.d, str, str2);
        }
        if (str3 == null) {
            android.os.Bundle bundle = new android.os.Bundle();
            if (bundle.getString("ttl") != null) {
                z3 = false;
            }
            if (!"jwt".equals(bundle.getString("type"))) {
                z2 = z3;
            }
            if (str2 != null) {
                bundle.putString("scope", str2);
            }
            bundle.putString("sender", str);
            java.lang.String str4 = "".equals(c.d) ? str : c.d;
            if (!bundle.containsKey("legacy.register")) {
                bundle.putString("subscription", str);
                bundle.putString("subtype", str4);
                bundle.putString("X-subscription", str);
                bundle.putString("X-subtype", str4);
            }
            defpackage.bhw bhw = defpackage.bhu.b;
            if (c.c == null) {
                c.c = defpackage.bhu.a.b(c.d);
            }
            if (c.c == null) {
                c.e = java.lang.System.currentTimeMillis();
                c.c = defpackage.bhu.a.a(c.d, c.e);
            }
            java.security.KeyPair keyPair = c.c;
            android.content.Intent a5 = bhw.a(bundle, keyPair);
            if (a5 != null && a5.hasExtra("google.messenger")) {
                a5 = bhw.a(bundle, keyPair);
                if (a5 != null && a5.hasExtra("google.messenger")) {
                    a5 = null;
                }
            }
            if (a5 == null) {
                throw new java.io.IOException("SERVICE_NOT_AVAILABLE");
            }
            str3 = a5.getStringExtra("registration_id");
            if (str3 == null) {
                str3 = a5.getStringExtra("unregistered");
            }
            a5.getLongExtra("Retry-After", 0);
            if (str3 == null) {
                java.lang.String stringExtra = a5.getStringExtra("error");
                if (stringExtra != null) {
                    throw new java.io.IOException(stringExtra);
                }
                java.lang.String valueOf = java.lang.String.valueOf(a5.getExtras());
                android.util.Log.w("InstanceID/Rpc", new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 29).append("Unexpected response from GCM ").append(valueOf).toString(), new java.lang.Throwable());
                throw new java.io.IOException("SERVICE_NOT_AVAILABLE");
            } else if (str3 != null && z2) {
                defpackage.bhu.a.a(c.d, str, str2, str3, defpackage.bhu.f);
            }
        }
        return str3;
    }
}
