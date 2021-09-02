package defpackage;

/* renamed from: eji reason: default package */
/* compiled from: PG */
public final class eji extends android.content.BroadcastReceiver {
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        boolean z = true;
        if (android.os.Build.VERSION.SDK_INT < 26) {
            z = "android.security.STORAGE_CHANGED".equals(intent.getAction());
        } else if (!"android.security.action.KEYCHAIN_CHANGED".equals(intent.getAction()) && !"android.security.action.TRUST_STORE_CHANGED".equals(intent.getAction()) && (!"android.security.action.KEY_ACCESS_CHANGED".equals(intent.getAction()) || intent.getBooleanExtra("android.security.extra.KEY_ACCESSIBLE", false))) {
            z = false;
        }
        if (z) {
            try {
                org.chromium.net.X509Util.c();
            } catch (java.security.cert.CertificateException e) {
                android.util.Log.e("X509Util", "Unable to reload the default TrustManager", e);
            } catch (java.security.KeyStoreException e2) {
                android.util.Log.e("X509Util", "Unable to reload the default TrustManager", e2);
            } catch (java.security.NoSuchAlgorithmException e3) {
                android.util.Log.e("X509Util", "Unable to reload the default TrustManager", e3);
            }
        }
    }
}
