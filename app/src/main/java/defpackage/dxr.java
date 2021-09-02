package defpackage;

/* renamed from: dxr reason: default package */
/* compiled from: PG */
class dxr implements defpackage.dxq {
    public static final java.util.logging.Logger b = java.util.logging.Logger.getLogger(defpackage.dxr.class.getName());
    private static final defpackage.dxt c = new defpackage.dxt();
    private static final defpackage.csd d = new defpackage.dxs();
    private final defpackage.csd e;
    private final defpackage.dxu f;

    public dxr() {
        this(d, c, java.lang.System.getenv("GRPC_PROXY_EXP"));
    }

    private dxr(defpackage.csd csd, defpackage.dxt dxt, java.lang.String str) {
        java.net.InetSocketAddress inetSocketAddress;
        this.e = (defpackage.csd) defpackage.cld.a((java.lang.Object) csd);
        defpackage.cld.a((java.lang.Object) dxt);
        if (str != null) {
            if (str == null) {
                inetSocketAddress = null;
            } else {
                java.lang.String[] split = str.split(":", 2);
                int i = 80;
                if (split.length > 1) {
                    i = java.lang.Integer.parseInt(split[1]);
                }
                b.logp(java.util.logging.Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "overrideProxy", "Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
                inetSocketAddress = new java.net.InetSocketAddress(split[0], i);
            }
            this.f = new defpackage.dxu(inetSocketAddress, null, null);
            return;
        }
        this.f = null;
    }

    public final defpackage.dxu a(java.net.SocketAddress socketAddress) {
        if (this.f != null) {
            return this.f;
        }
        if (!(socketAddress instanceof java.net.InetSocketAddress)) {
            return null;
        }
        return a((java.net.InetSocketAddress) socketAddress);
    }

    private final defpackage.dxu a(java.net.InetSocketAddress inetSocketAddress) {
        java.net.InetSocketAddress inetSocketAddress2;
        try {
            try {
                java.util.List select = ((java.net.ProxySelector) this.e.b()).select(new java.net.URI("https", null, defpackage.dvc.a(inetSocketAddress), inetSocketAddress.getPort(), null, null, null));
                if (select.size() > 1) {
                    b.logp(java.util.logging.Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "More than 1 proxy detected, gRPC will select the first one");
                }
                java.net.Proxy proxy = (java.net.Proxy) select.get(0);
                if (proxy.type() == java.net.Proxy.Type.DIRECT) {
                    return null;
                }
                java.net.InetSocketAddress inetSocketAddress3 = (java.net.InetSocketAddress) proxy.address();
                java.net.PasswordAuthentication a = defpackage.dxt.a(defpackage.dvc.a(inetSocketAddress3), inetSocketAddress3.getAddress(), inetSocketAddress3.getPort(), "https", "");
                if (inetSocketAddress3.isUnresolved()) {
                    inetSocketAddress2 = new java.net.InetSocketAddress(java.net.InetAddress.getByName(inetSocketAddress3.getHostName()), inetSocketAddress3.getPort());
                } else {
                    inetSocketAddress2 = inetSocketAddress3;
                }
                if (a == null) {
                    return new defpackage.dxu(inetSocketAddress2, null, null);
                }
                return new defpackage.dxu(inetSocketAddress2, a.getUserName(), new java.lang.String(a.getPassword()));
            } catch (java.net.URISyntaxException e2) {
                b.logp(java.util.logging.Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to construct URI for proxy lookup, proceeding without proxy", e2);
                return null;
            }
        } catch (Throwable th) {
            b.logp(java.util.logging.Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to get host for proxy lookup, proceeding without proxy", th);
            return null;
        }
    }
}
