package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import java.io.IOException;
import java.security.KeyPair;

/* renamed from: bry  reason: default package */
/* compiled from: PG */
public final class bry extends bru {
    private final Context a;

    public bry(Context context) {
        this.a = context;
    }

    @Override // defpackage.bru
    public final String a(String str, String str2) {
        boolean z;
        String a2;
        boolean z2 = false;
        boolean z3 = true;
        bhu c = bhu.c(this.a);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        String a3 = bhu.a.a("appVersion");
        if (a3 == null || !a3.equals(bhu.f)) {
            z = true;
        } else {
            String a4 = bhu.a.a("lastToken");
            if (a4 == null) {
                z = true;
            } else if ((System.currentTimeMillis() / 1000) - Long.valueOf(Long.parseLong(a4)).longValue() > 604800) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            a2 = null;
        } else {
            a2 = bhu.a.a(c.d, str, str2);
        }
        if (a2 == null) {
            Bundle bundle = new Bundle();
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
            String str3 = "".equals(c.d) ? str : c.d;
            if (!bundle.containsKey("legacy.register")) {
                bundle.putString("subscription", str);
                bundle.putString("subtype", str3);
                bundle.putString("X-subscription", str);
                bundle.putString("X-subtype", str3);
            }
            bhw bhw = bhu.b;
            if (c.c == null) {
                c.c = bhu.a.b(c.d);
            }
            if (c.c == null) {
                c.e = System.currentTimeMillis();
                c.c = bhu.a.a(c.d, c.e);
            }
            KeyPair keyPair = c.c;
            Intent a5 = bhw.a(bundle, keyPair);
            if (a5 != null && a5.hasExtra("google.messenger") && (a5 = bhw.a(bundle, keyPair)) != null && a5.hasExtra("google.messenger")) {
                a5 = null;
            }
            if (a5 == null) {
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
            a2 = a5.getStringExtra("registration_id");
            if (a2 == null) {
                a2 = a5.getStringExtra("unregistered");
            }
            a5.getLongExtra("Retry-After", 0);
            if (a2 == null) {
                String stringExtra = a5.getStringExtra("error");
                if (stringExtra != null) {
                    throw new IOException(stringExtra);
                }
                String valueOf = String.valueOf(a5.getExtras());
                Log.w("InstanceID/Rpc", new StringBuilder(String.valueOf(valueOf).length() + 29).append("Unexpected response from GCM ").append(valueOf).toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            } else if (a2 != null && z2) {
                bhu.a.a(c.d, str, str2, a2, bhu.f);
            }
        }
        return a2;
    }
}
