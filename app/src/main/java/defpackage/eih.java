package defpackage;

/* renamed from: eih reason: default package */
/* compiled from: PG */
public final class eih {
    public final android.net.ConnectivityManager a;

    public eih(android.content.Context context) {
        this.a = (android.net.ConnectivityManager) context.getSystemService("connectivity");
    }

    eih() {
        this.a = null;
    }

    public final android.net.NetworkInfo a(android.net.Network network) {
        try {
            return this.a.getNetworkInfo(network);
        } catch (java.lang.NullPointerException e) {
            try {
                return this.a.getNetworkInfo(network);
            } catch (java.lang.NullPointerException e2) {
                return null;
            }
        }
    }

    @android.annotation.TargetApi(21)
    public final int b(android.net.Network network) {
        android.net.NetworkInfo a2 = a(network);
        if (a2 != null && a2.getType() == 17) {
            a2 = this.a.getActiveNetworkInfo();
        }
        if (a2 == null || !a2.isConnected()) {
            return 6;
        }
        return org.chromium.net.NetworkChangeNotifierAutoDetect.a(a2.getType(), a2.getSubtype());
    }

    @android.annotation.TargetApi(21)
    public static boolean c(android.net.Network network) {
        java.net.Socket socket = new java.net.Socket();
        try {
            network.bindSocket(socket);
            return true;
        } catch (java.io.IOException e) {
            return false;
        } finally {
            try {
                socket.close();
            } catch (java.io.IOException e2) {
            }
        }
    }

    @android.annotation.TargetApi(21)
    public final android.net.NetworkCapabilities d(android.net.Network network) {
        return this.a.getNetworkCapabilities(network);
    }
}
