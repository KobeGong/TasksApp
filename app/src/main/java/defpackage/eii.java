package defpackage;

@android.annotation.TargetApi(21)
/* renamed from: eii reason: default package */
/* compiled from: PG */
public final class eii extends android.net.ConnectivityManager.NetworkCallback {
    public android.net.Network a;
    public final /* synthetic */ org.chromium.net.NetworkChangeNotifierAutoDetect b;

    public eii(org.chromium.net.NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.b = networkChangeNotifierAutoDetect;
    }

    private final boolean a(android.net.Network network) {
        return this.a != null && !this.a.equals(network);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (defpackage.eih.c(r4) == false) goto L_0x0025;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a(android.net.Network r4, android.net.NetworkCapabilities r5) {
        /*
            r3 = this;
            r1 = 1
            r0 = 0
            boolean r2 = r3.a(r4)
            if (r2 != 0) goto L_0x0028
            if (r5 != 0) goto L_0x0012
            org.chromium.net.NetworkChangeNotifierAutoDetect r2 = r3.b
            eih r2 = r2.d
            android.net.NetworkCapabilities r5 = r2.d(r4)
        L_0x0012:
            if (r5 == 0) goto L_0x0025
            r2 = 4
            boolean r2 = r5.hasTransport(r2)
            if (r2 == 0) goto L_0x002a
            org.chromium.net.NetworkChangeNotifierAutoDetect r2 = r3.b
            eih r2 = r2.d
            boolean r2 = defpackage.eih.c(r4)
            if (r2 != 0) goto L_0x002a
        L_0x0025:
            r2 = r1
        L_0x0026:
            if (r2 == 0) goto L_0x0029
        L_0x0028:
            r0 = r1
        L_0x0029:
            return r0
        L_0x002a:
            r2 = r0
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eii.a(android.net.Network, android.net.NetworkCapabilities):boolean");
    }

    public final void onAvailable(android.net.Network network) {
        android.net.NetworkCapabilities d = this.b.d.d(network);
        if (!a(network, d)) {
            boolean hasTransport = d.hasTransport(4);
            if (hasTransport) {
                this.a = network;
            }
            this.b.a((java.lang.Runnable) new defpackage.eij(this, org.chromium.net.NetworkChangeNotifierAutoDetect.a(network), this.b.d.b(network), hasTransport));
        }
    }

    public final void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
        if (!a(network, networkCapabilities)) {
            this.b.a((java.lang.Runnable) new defpackage.eik(this, org.chromium.net.NetworkChangeNotifierAutoDetect.a(network), this.b.d.b(network)));
        }
    }

    public final void onLosing(android.net.Network network, int i) {
        if (!a(network, null)) {
            this.b.a((java.lang.Runnable) new defpackage.eil(this, org.chromium.net.NetworkChangeNotifierAutoDetect.a(network)));
        }
    }

    public final void onLost(android.net.Network network) {
        if (!a(network)) {
            this.b.a((java.lang.Runnable) new defpackage.eim(this, network));
            if (this.a != null) {
                this.a = null;
                for (android.net.Network onAvailable : org.chromium.net.NetworkChangeNotifierAutoDetect.a(this.b.d, network)) {
                    onAvailable(onAvailable);
                }
                this.b.a((java.lang.Runnable) new defpackage.ein(this, this.b.b().a()));
            }
        }
    }
}
