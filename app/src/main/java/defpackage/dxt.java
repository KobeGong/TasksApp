package defpackage;

/* renamed from: dxt reason: default package */
/* compiled from: PG */
final class dxt {
    public static java.net.PasswordAuthentication a(java.lang.String str, java.net.InetAddress inetAddress, int i, java.lang.String str2, java.lang.String str3) {
        java.net.URL url;
        try {
            url = new java.net.URL(str2, str, i, "");
        } catch (java.net.MalformedURLException e) {
            defpackage.dxr.b.logp(java.util.logging.Level.WARNING, "io.grpc.internal.ProxyDetectorImpl$1", "requestPasswordAuthentication", java.lang.String.format("failed to create URL for Authenticator: %s %s", new java.lang.Object[]{str2, str}));
            url = null;
        }
        return java.net.Authenticator.requestPasswordAuthentication(str, inetAddress, i, str2, str3, null, url, java.net.Authenticator.RequestorType.PROXY);
    }

    dxt() {
    }
}
