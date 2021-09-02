package org.chromium.net;

/* compiled from: PG */
public class X509Util {
    public static java.security.KeyStore a;
    public static final java.lang.Object b = new java.lang.Object();
    private static java.security.cert.CertificateFactory c;
    private static defpackage.ejk d;
    private static defpackage.eji e;
    private static defpackage.ejk f;
    private static java.security.KeyStore g;
    private static java.io.File h;
    private static java.util.Set i;
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
            c = java.security.cert.CertificateFactory.getInstance("X.509");
        }
        if (d == null) {
            d = a((java.security.KeyStore) null);
        }
        if (!j) {
            try {
                g = java.security.KeyStore.getInstance("AndroidCAStore");
                try {
                    g.load(null);
                } catch (java.io.IOException e2) {
                }
                h = new java.io.File(java.lang.System.getenv("ANDROID_ROOT") + "/etc/security/cacerts");
            } catch (java.security.KeyStoreException e3) {
            }
            if (android.os.Build.VERSION.SDK_INT >= 17) {
                org.chromium.base.metrics.RecordHistogram.a("Net.FoundSystemTrustRootsAndroid", g != null);
            }
            j = true;
        }
        if (i == null) {
            i = new java.util.HashSet();
        }
        if (a == null) {
            a = java.security.KeyStore.getInstance(java.security.KeyStore.getDefaultType());
            try {
                a.load(null);
            } catch (java.io.IOException e4) {
            }
        }
        if (f == null) {
            f = a(a);
        }
        if (e == null) {
            e = new defpackage.eji();
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                intentFilter.addAction("android.security.action.KEYCHAIN_CHANGED");
                intentFilter.addAction("android.security.action.KEY_ACCESS_CHANGED");
                intentFilter.addAction("android.security.action.TRUST_STORE_CHANGED");
            } else {
                intentFilter.addAction("android.security.STORAGE_CHANGED");
            }
            defpackage.ehw.a.registerReceiver(e, intentFilter);
        }
    }

    private static defpackage.ejk a(java.security.KeyStore keyStore) {
        javax.net.ssl.TrustManagerFactory instance = javax.net.ssl.TrustManagerFactory.getInstance(javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm());
        instance.init(keyStore);
        javax.net.ssl.TrustManager[] trustManagers = instance.getTrustManagers();
        int length = trustManagers.length;
        int i2 = 0;
        while (i2 < length) {
            javax.net.ssl.TrustManager trustManager = trustManagers[i2];
            if (trustManager instanceof javax.net.ssl.X509TrustManager) {
                try {
                    if (android.os.Build.VERSION.SDK_INT >= 17) {
                        return new defpackage.ejl((javax.net.ssl.X509TrustManager) trustManager);
                    }
                    return new defpackage.ejj((javax.net.ssl.X509TrustManager) trustManager);
                } catch (java.lang.IllegalArgumentException e2) {
                    android.util.Log.e("X509Util", "Error creating trust manager (" + trustManager.getClass().getName() + "): " + e2);
                }
            } else {
                i2++;
            }
        }
        android.util.Log.e("X509Util", "Could not find suitable trust manager");
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

    public static java.security.cert.X509Certificate a(byte[] bArr) {
        a();
        return (java.security.cert.X509Certificate) c.generateCertificate(new java.io.ByteArrayInputStream(bArr));
    }

    private static boolean a(java.security.cert.X509Certificate x509Certificate) {
        try {
            java.util.List<java.lang.String> extendedKeyUsage = x509Certificate.getExtendedKeyUsage();
            if (extendedKeyUsage == null) {
                return true;
            }
            for (java.lang.String str : extendedKeyUsage) {
                if (str.equals("1.3.6.1.5.5.7.3.1") || str.equals("2.5.29.37.0") || str.equals("2.16.840.1.113730.4.1")) {
                    return true;
                }
                if (str.equals("1.3.6.1.4.1.311.10.3.3")) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.NullPointerException e2) {
            return false;
        }
    }

    public static org.chromium.net.AndroidCertVerifyResult a(byte[][] bArr, java.lang.String str, java.lang.String str2) {
        java.util.List a2;
        boolean z = true;
        if (bArr == null || bArr.length == 0 || bArr[0] == null) {
            throw new java.lang.IllegalArgumentException("Expected non-null and non-empty certificate chain passed as |certChain|. |certChain|=" + java.util.Arrays.deepToString(bArr));
        }
        try {
            a();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            try {
                arrayList.add(a(bArr[0]));
                for (int i2 = 1; i2 < bArr.length; i2++) {
                    try {
                        arrayList.add(a(bArr[i2]));
                    } catch (java.security.cert.CertificateException e2) {
                        android.util.Log.w("X509Util", "intermediate " + i2 + " failed parsing");
                    }
                }
                java.security.cert.X509Certificate[] x509CertificateArr = (java.security.cert.X509Certificate[]) arrayList.toArray(new java.security.cert.X509Certificate[arrayList.size()]);
                try {
                    x509CertificateArr[0].checkValidity();
                    if (!a(x509CertificateArr[0])) {
                        return new org.chromium.net.AndroidCertVerifyResult(-6);
                    }
                    synchronized (b) {
                        if (d == null) {
                            org.chromium.net.AndroidCertVerifyResult androidCertVerifyResult = new org.chromium.net.AndroidCertVerifyResult(-1);
                            return androidCertVerifyResult;
                        }
                        try {
                            a2 = d.a(x509CertificateArr, str, str2);
                        } catch (java.security.cert.CertificateException e3) {
                            try {
                                a2 = f.a(x509CertificateArr, str, str2);
                            } catch (java.security.cert.CertificateException e4) {
                                new java.lang.StringBuilder("Failed to validate the certificate chain, error: ").append(e3.getMessage());
                                return new org.chromium.net.AndroidCertVerifyResult(-2);
                            }
                        }
                        if (a2.size() > 0) {
                            java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) a2.get(a2.size() - 1);
                            if (g != null) {
                                android.util.Pair pair = new android.util.Pair(x509Certificate.getSubjectX500Principal(), x509Certificate.getPublicKey());
                                if (!i.contains(pair)) {
                                    byte[] digest = java.security.MessageDigest.getInstance("MD5").digest(x509Certificate.getSubjectX500Principal().getEncoded());
                                    char[] cArr = new char[8];
                                    for (int i3 = 0; i3 < 4; i3++) {
                                        cArr[i3 * 2] = k[(digest[3 - i3] >> 4) & 15];
                                        cArr[(i3 * 2) + 1] = k[digest[3 - i3] & 15];
                                    }
                                    java.lang.String str3 = new java.lang.String(cArr);
                                    int i4 = 0;
                                    while (true) {
                                        java.lang.String str4 = str3 + '.' + i4;
                                        if (!new java.io.File(h, str4).exists()) {
                                            break;
                                        }
                                        java.security.cert.Certificate certificate = g.getCertificate("system:" + str4);
                                        if (certificate != null) {
                                            if (certificate instanceof java.security.cert.X509Certificate) {
                                                java.security.cert.X509Certificate x509Certificate2 = (java.security.cert.X509Certificate) certificate;
                                                if (x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getSubjectX500Principal()) && x509Certificate.getPublicKey().equals(x509Certificate2.getPublicKey())) {
                                                    i.add(pair);
                                                    break;
                                                }
                                            } else {
                                                android.util.Log.e("X509Util", "Anchor " + str4 + " not an X509Certificate: " + certificate.getClass().getName());
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
                        org.chromium.net.AndroidCertVerifyResult androidCertVerifyResult2 = new org.chromium.net.AndroidCertVerifyResult(z, a2);
                        return androidCertVerifyResult2;
                    }
                } catch (java.security.cert.CertificateExpiredException e5) {
                    return new org.chromium.net.AndroidCertVerifyResult(-3);
                } catch (java.security.cert.CertificateNotYetValidException e6) {
                    return new org.chromium.net.AndroidCertVerifyResult(-4);
                } catch (java.security.cert.CertificateException e7) {
                    return new org.chromium.net.AndroidCertVerifyResult(-1);
                }
            } catch (java.security.cert.CertificateException e8) {
                return new org.chromium.net.AndroidCertVerifyResult(-5);
            }
        } catch (java.security.cert.CertificateException e9) {
            return new org.chromium.net.AndroidCertVerifyResult(-1);
        }
    }
}
