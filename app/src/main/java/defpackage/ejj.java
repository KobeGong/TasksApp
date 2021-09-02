package defpackage;

/* renamed from: ejj reason: default package */
/* compiled from: PG */
public final class ejj implements defpackage.ejk {
    private final javax.net.ssl.X509TrustManager a;

    public ejj(javax.net.ssl.X509TrustManager x509TrustManager) {
        this.a = x509TrustManager;
    }

    public final java.util.List a(java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str, java.lang.String str2) {
        this.a.checkServerTrusted(x509CertificateArr, str);
        return java.util.Collections.emptyList();
    }
}
