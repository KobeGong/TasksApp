package defpackage;

import android.net.Network;
import android.net.NetworkCapabilities;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* renamed from: eiq  reason: default package */
/* compiled from: PG */
public abstract class eiq {
    public NetworkChangeNotifierAutoDetect a;

    public abstract void b();

    /* access modifiers changed from: protected */
    public final void a() {
        NetworkCapabilities d;
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.a;
        if (!networkChangeNotifierAutoDetect.g) {
            if (networkChangeNotifierAutoDetect.i) {
                networkChangeNotifierAutoDetect.c();
            }
            networkChangeNotifierAutoDetect.h = ehw.a.registerReceiver(networkChangeNotifierAutoDetect, networkChangeNotifierAutoDetect.a) != null;
            networkChangeNotifierAutoDetect.g = true;
            if (networkChangeNotifierAutoDetect.e != null) {
                eii eii = networkChangeNotifierAutoDetect.e;
                Network[] a2 = NetworkChangeNotifierAutoDetect.a(eii.b.d, (Network) null);
                eii.a = null;
                if (a2.length == 1 && (d = eii.b.d.d(a2[0])) != null && d.hasTransport(4)) {
                    eii.a = a2[0];
                }
                try {
                    networkChangeNotifierAutoDetect.d.a.registerNetworkCallback(networkChangeNotifierAutoDetect.f, networkChangeNotifierAutoDetect.e);
                } catch (IllegalArgumentException e) {
                    networkChangeNotifierAutoDetect.j = true;
                    networkChangeNotifierAutoDetect.e = null;
                }
                if (!networkChangeNotifierAutoDetect.j && networkChangeNotifierAutoDetect.i) {
                    Network[] a3 = NetworkChangeNotifierAutoDetect.a(networkChangeNotifierAutoDetect.d, (Network) null);
                    long[] jArr = new long[a3.length];
                    for (int i = 0; i < a3.length; i++) {
                        jArr[i] = NetworkChangeNotifierAutoDetect.a(a3[i]);
                    }
                    networkChangeNotifierAutoDetect.b.a(jArr);
                }
            }
        }
    }

    public void a(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.a = networkChangeNotifierAutoDetect;
    }
}
