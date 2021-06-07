package defpackage;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.logging.Level;

/* access modifiers changed from: package-private */
/* renamed from: dxt  reason: default package */
/* compiled from: PG */
public final class dxt {
    public static PasswordAuthentication a(String str, InetAddress inetAddress, int i, String str2, String str3) {
        URL url;
        try {
            url = new URL(str2, str, i, "");
        } catch (MalformedURLException e) {
            dxr.b.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl$1", "requestPasswordAuthentication", String.format("failed to create URL for Authenticator: %s %s", str2, str));
            url = null;
        }
        return Authenticator.requestPasswordAuthentication(str, inetAddress, i, str2, str3, null, url, Authenticator.RequestorType.PROXY);
    }

    dxt() {
    }
}
