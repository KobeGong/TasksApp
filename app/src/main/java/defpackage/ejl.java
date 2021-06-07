package defpackage;

import android.annotation.SuppressLint;
import android.net.http.X509TrustManagerExtensions;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;

/* renamed from: ejl  reason: default package */
/* compiled from: PG */
public final class ejl implements ejk {
    private final X509TrustManagerExtensions a;

    @SuppressLint({"NewApi"})
    public ejl(X509TrustManager x509TrustManager) {
        this.a = new X509TrustManagerExtensions(x509TrustManager);
    }

    @Override // defpackage.ejk
    @SuppressLint({"NewApi"})
    public final List a(X509Certificate[] x509CertificateArr, String str, String str2) {
        return this.a.checkServerTrusted(x509CertificateArr, str, str2);
    }
}
