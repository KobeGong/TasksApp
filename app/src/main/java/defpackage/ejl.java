package defpackage;

/* renamed from: ejl reason: default package */
/* compiled from: PG */
public final class ejl implements defpackage.ejk {
    private final android.net.http.X509TrustManagerExtensions a;

    @android.annotation.SuppressLint({"NewApi"})
    public ejl(javax.net.ssl.X509TrustManager x509TrustManager) {
        this.a = new android.net.http.X509TrustManagerExtensions(x509TrustManager);
    }

    @android.annotation.SuppressLint({"NewApi"})
    public final java.util.List a(java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str, java.lang.String str2) {
        return this.a.checkServerTrusted(x509CertificateArr, str, str2);
    }
}
