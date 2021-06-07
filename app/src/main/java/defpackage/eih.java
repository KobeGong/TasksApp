package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import java.io.IOException;
import java.net.Socket;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* renamed from: eih  reason: default package */
/* compiled from: PG */
public final class eih {
    public final ConnectivityManager a;

    public eih(Context context) {
        this.a = (ConnectivityManager) context.getSystemService("connectivity");
    }

    eih() {
        this.a = null;
    }

    public final NetworkInfo a(Network network) {
        try {
            return this.a.getNetworkInfo(network);
        } catch (NullPointerException e) {
            try {
                return this.a.getNetworkInfo(network);
            } catch (NullPointerException e2) {
                return null;
            }
        }
    }

    @TargetApi(21)
    public final int b(Network network) {
        NetworkInfo a2 = a(network);
        if (a2 != null && a2.getType() == 17) {
            a2 = this.a.getActiveNetworkInfo();
        }
        if (a2 == null || !a2.isConnected()) {
            return 6;
        }
        return NetworkChangeNotifierAutoDetect.a(a2.getType(), a2.getSubtype());
    }

    @TargetApi(21)
    public static boolean c(Network network) {
        Socket socket = new Socket();
        try {
            network.bindSocket(socket);
            try {
                socket.close();
            } catch (IOException e) {
            }
            return true;
        } catch (IOException e2) {
            try {
                socket.close();
            } catch (IOException e3) {
            }
            return false;
        } catch (Throwable th) {
            try {
                socket.close();
            } catch (IOException e4) {
            }
            throw th;
        }
    }

    @TargetApi(21)
    public final NetworkCapabilities d(Network network) {
        return this.a.getNetworkCapabilities(network);
    }
}
