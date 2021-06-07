package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
/* renamed from: dxr  reason: default package */
/* compiled from: PG */
public class dxr implements dxq {
    public static final Logger b = Logger.getLogger(dxr.class.getName());
    private static final dxt c = new dxt();
    private static final csd d = new dxs();
    private final csd e;
    private final dxu f;

    public dxr() {
        this(d, c, System.getenv("GRPC_PROXY_EXP"));
    }

    private dxr(csd csd, dxt dxt, String str) {
        InetSocketAddress inetSocketAddress;
        this.e = (csd) cld.a(csd);
        cld.a(dxt);
        if (str != null) {
            if (str == null) {
                inetSocketAddress = null;
            } else {
                String[] split = str.split(":", 2);
                int i = split.length > 1 ? Integer.parseInt(split[1]) : 80;
                b.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "overrideProxy", "Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
                inetSocketAddress = new InetSocketAddress(split[0], i);
            }
            this.f = new dxu(inetSocketAddress, null, null);
            return;
        }
        this.f = null;
    }

    @Override // defpackage.dxq
    public final dxu a(SocketAddress socketAddress) {
        if (this.f != null) {
            return this.f;
        }
        if (!(socketAddress instanceof InetSocketAddress)) {
            return null;
        }
        return a((InetSocketAddress) socketAddress);
    }

    private final dxu a(InetSocketAddress inetSocketAddress) {
        InetSocketAddress inetSocketAddress2;
        try {
            try {
                List<Proxy> select = ((ProxySelector) this.e.b()).select(new URI("https", null, dvc.a(inetSocketAddress), inetSocketAddress.getPort(), null, null, null));
                if (select.size() > 1) {
                    b.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = select.get(0);
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                InetSocketAddress inetSocketAddress3 = (InetSocketAddress) proxy.address();
                PasswordAuthentication a = dxt.a(dvc.a(inetSocketAddress3), inetSocketAddress3.getAddress(), inetSocketAddress3.getPort(), "https", "");
                if (inetSocketAddress3.isUnresolved()) {
                    inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress3.getHostName()), inetSocketAddress3.getPort());
                } else {
                    inetSocketAddress2 = inetSocketAddress3;
                }
                if (a == null) {
                    return new dxu(inetSocketAddress2, null, null);
                }
                return new dxu(inetSocketAddress2, a.getUserName(), new String(a.getPassword()));
            } catch (URISyntaxException e2) {
                b.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e2);
                return null;
            }
        } catch (Throwable th) {
            b.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to get host for proxy lookup, proceeding without proxy", th);
            return null;
        }
    }
}
