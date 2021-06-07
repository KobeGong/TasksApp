package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import org.chromium.net.X509Util;

/* renamed from: eji  reason: default package */
/* compiled from: PG */
public final class eji extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 26) {
            z = "android.security.STORAGE_CHANGED".equals(intent.getAction());
        } else if (!"android.security.action.KEYCHAIN_CHANGED".equals(intent.getAction()) && !"android.security.action.TRUST_STORE_CHANGED".equals(intent.getAction()) && (!"android.security.action.KEY_ACCESS_CHANGED".equals(intent.getAction()) || intent.getBooleanExtra("android.security.extra.KEY_ACCESSIBLE", false))) {
            z = false;
        }
        if (z) {
            try {
                X509Util.c();
            } catch (CertificateException e) {
                Log.e("X509Util", "Unable to reload the default TrustManager", e);
            } catch (KeyStoreException e2) {
                Log.e("X509Util", "Unable to reload the default TrustManager", e2);
            } catch (NoSuchAlgorithmException e3) {
                Log.e("X509Util", "Unable to reload the default TrustManager", e3);
            }
        }
    }
}
