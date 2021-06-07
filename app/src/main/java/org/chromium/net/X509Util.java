package org.chromium.net;

import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.chromium.base.metrics.RecordHistogram;

/* compiled from: PG */
public class X509Util {
    public static KeyStore a;
    public static final Object b = new Object();
    private static CertificateFactory c;
    private static ejk d;
    private static eji e;
    private static ejk f;
    private static KeyStore g;
    private static File h;
    private static Set i;
    private static boolean j;
    private static final char[] k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private static native void nativeNotifyKeyChainChanged();

    static void a() {
        synchronized (b) {
            d();
        }
    }

    private static void d() {
        if (c == null) {
            c = CertificateFactory.getInstance("X.509");
        }
        if (d == null) {
            d = a((KeyStore) null);
        }
        if (!j) {
            try {
                g = KeyStore.getInstance("AndroidCAStore");
                try {
                    g.load(null);
                } catch (IOException e2) {
                }
                h = new File(System.getenv("ANDROID_ROOT") + "/etc/security/cacerts");
            } catch (KeyStoreException e3) {
            }
            if (Build.VERSION.SDK_INT >= 17) {
                RecordHistogram.a("Net.FoundSystemTrustRootsAndroid", g != null);
            }
            j = true;
        }
        if (i == null) {
            i = new HashSet();
        }
        if (a == null) {
            a = KeyStore.getInstance(KeyStore.getDefaultType());
            try {
                a.load(null);
            } catch (IOException e4) {
            }
        }
        if (f == null) {
            f = a(a);
        }
        if (e == null) {
            e = new eji();
            IntentFilter intentFilter = new IntentFilter();
            if (Build.VERSION.SDK_INT >= 26) {
                intentFilter.addAction("android.security.action.KEYCHAIN_CHANGED");
                intentFilter.addAction("android.security.action.KEY_ACCESS_CHANGED");
                intentFilter.addAction("android.security.action.TRUST_STORE_CHANGED");
            } else {
                intentFilter.addAction("android.security.STORAGE_CHANGED");
            }
            ehw.a.registerReceiver(e, intentFilter);
        }
    }

    private static ejk a(KeyStore keyStore) {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init(keyStore);
        TrustManager[] trustManagers = instance.getTrustManagers();
        for (TrustManager trustManager : trustManagers) {
            if (trustManager instanceof X509TrustManager) {
                try {
                    if (Build.VERSION.SDK_INT >= 17) {
                        return new ejl((X509TrustManager) trustManager);
                    }
                    return new ejj((X509TrustManager) trustManager);
                } catch (IllegalArgumentException e2) {
                    Log.e("X509Util", "Error creating trust manager (" + trustManager.getClass().getName() + "): " + e2);
                }
            }
        }
        Log.e("X509Util", "Could not find suitable trust manager");
        return null;
    }

    static void b() {
        f = a(a);
    }

    public static void c() {
        synchronized (b) {
            d = null;
            i = null;
            d();
        }
        nativeNotifyKeyChainChanged();
    }

    public static X509Certificate a(byte[] bArr) {
        a();
        return (X509Certificate) c.generateCertificate(new ByteArrayInputStream(bArr));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(java.security.cert.X509Certificate r5) {
        /*
            r1 = 1
            r2 = 0
            java.util.List r0 = r5.getExtendedKeyUsage()     // Catch:{ NullPointerException -> 0x000a }
            if (r0 != 0) goto L_0x000d
            r0 = r1
        L_0x0009:
            return r0
        L_0x000a:
            r0 = move-exception
            r0 = r2
            goto L_0x0009
        L_0x000d:
            java.util.Iterator r3 = r0.iterator()
        L_0x0011:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x003f
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r4 = "1.3.6.1.5.5.7.3.1"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x003d
            java.lang.String r4 = "2.5.29.37.0"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x003d
            java.lang.String r4 = "2.16.840.1.113730.4.1"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x003d
            java.lang.String r4 = "1.3.6.1.4.1.311.10.3.3"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0011
        L_0x003d:
            r0 = r1
            goto L_0x0009
        L_0x003f:
            r0 = r2
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.X509Util.a(java.security.cert.X509Certificate):boolean");
    }

    public static AndroidCertVerifyResult a(byte[][] bArr, String str, String str2) {
        List a2;
        boolean z = true;
        if (bArr == null || bArr.length == 0 || bArr[0] == null) {
            throw new IllegalArgumentException("Expected non-null and non-empty certificate chain passed as |certChain|. |certChain|=" + Arrays.deepToString(bArr));
        }
        try {
            a();
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(a(bArr[0]));
                for (int i2 = 1; i2 < bArr.length; i2++) {
                    try {
                        arrayList.add(a(bArr[i2]));
                    } catch (CertificateException e2) {
                        Log.w("X509Util", "intermediate " + i2 + " failed parsing");
                    }
                }
                X509Certificate[] x509CertificateArr = (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                try {
                    x509CertificateArr[0].checkValidity();
                    if (!a(x509CertificateArr[0])) {
                        return new AndroidCertVerifyResult(-6);
                    }
                    synchronized (b) {
                        if (d == null) {
                            return new AndroidCertVerifyResult(-1);
                        }
                        try {
                            a2 = d.a(x509CertificateArr, str, str2);
                        } catch (CertificateException e3) {
                            try {
                                a2 = f.a(x509CertificateArr, str, str2);
                            } catch (CertificateException e4) {
                                new StringBuilder("Failed to validate the certificate chain, error: ").append(e3.getMessage());
                                return new AndroidCertVerifyResult(-2);
                            }
                        }
                        if (a2.size() > 0) {
                            X509Certificate x509Certificate = (X509Certificate) a2.get(a2.size() - 1);
                            if (g != null) {
                                Pair pair = new Pair(x509Certificate.getSubjectX500Principal(), x509Certificate.getPublicKey());
                                if (!i.contains(pair)) {
                                    byte[] digest = MessageDigest.getInstance("MD5").digest(x509Certificate.getSubjectX500Principal().getEncoded());
                                    char[] cArr = new char[8];
                                    for (int i3 = 0; i3 < 4; i3++) {
                                        cArr[i3 * 2] = k[(digest[3 - i3] >> 4) & 15];
                                        cArr[(i3 * 2) + 1] = k[digest[3 - i3] & 15];
                                    }
                                    String str3 = new String(cArr);
                                    int i4 = 0;
                                    while (true) {
                                        String str4 = str3 + '.' + i4;
                                        if (!new File(h, str4).exists()) {
                                            break;
                                        }
                                        Certificate certificate = g.getCertificate("system:" + str4);
                                        if (certificate != null) {
                                            if (certificate instanceof X509Certificate) {
                                                X509Certificate x509Certificate2 = (X509Certificate) certificate;
                                                if (x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getSubjectX500Principal()) && x509Certificate.getPublicKey().equals(x509Certificate2.getPublicKey())) {
                                                    i.add(pair);
                                                    break;
                                                }
                                            } else {
                                                Log.e("X509Util", "Anchor " + str4 + " not an X509Certificate: " + certificate.getClass().getName());
                                            }
                                        }
                                        i4++;
                                    }
                                }
                            }
                            z = false;
                        } else {
                            z = false;
                        }
                        return new AndroidCertVerifyResult(z, a2);
                    }
                } catch (CertificateExpiredException e5) {
                    return new AndroidCertVerifyResult(-3);
                } catch (CertificateNotYetValidException e6) {
                    return new AndroidCertVerifyResult(-4);
                } catch (CertificateException e7) {
                    return new AndroidCertVerifyResult(-1);
                }
            } catch (CertificateException e8) {
                return new AndroidCertVerifyResult(-5);
            }
        } catch (CertificateException e9) {
            return new AndroidCertVerifyResult(-1);
        }
    }
}
