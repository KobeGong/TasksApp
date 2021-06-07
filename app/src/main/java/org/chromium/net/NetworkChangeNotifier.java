package org.chromium.net;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.annotations.CalledByNative;

/* compiled from: PG */
public class NetworkChangeNotifier {
    @SuppressLint({"StaticFieldLeak"})
    public static NetworkChangeNotifier a;
    private final ArrayList b = new ArrayList();
    private final egu c = new egu();
    private final ConnectivityManager d = ((ConnectivityManager) ehw.a.getSystemService("connectivity"));
    private NetworkChangeNotifierAutoDetect e;
    private int f = 0;

    protected NetworkChangeNotifier() {
    }

    private native void nativeNotifyConnectionTypeChanged(long j, int i, long j2);

    private native void nativeNotifyMaxBandwidthChanged(long j, int i);

    private native void nativeNotifyOfNetworkConnect(long j, long j2, int i);

    private native void nativeNotifyOfNetworkDisconnect(long j, long j2);

    private native void nativeNotifyOfNetworkSoonToDisconnect(long j, long j2);

    private native void nativeNotifyPurgeActiveNetworkList(long j, long[] jArr);

    @CalledByNative
    public static NetworkChangeNotifier init() {
        if (a == null) {
            a = new NetworkChangeNotifier();
        }
        return a;
    }

    @CalledByNative
    public int getCurrentConnectionType() {
        return this.f;
    }

    @CalledByNative
    public int getCurrentConnectionSubtype() {
        if (this.e == null) {
            return 0;
        }
        return this.e.b().b();
    }

    @CalledByNative
    public long getCurrentDefaultNetId() {
        long j = -1;
        if (this.e != null) {
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.e;
            if (Build.VERSION.SDK_INT >= 21) {
                eih eih = networkChangeNotifierAutoDetect.d;
                NetworkInfo activeNetworkInfo = eih.a.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    Network[] a2 = NetworkChangeNotifierAutoDetect.a(eih, (Network) null);
                    for (Network network : a2) {
                        NetworkInfo a3 = eih.a(network);
                        if (a3 != null && (a3.getType() == activeNetworkInfo.getType() || a3.getType() == 17)) {
                            j = NetworkChangeNotifierAutoDetect.a(network);
                        }
                    }
                }
            }
        }
        return j;
    }

    @CalledByNative
    public long[] getCurrentNetworksAndTypes() {
        if (this.e == null) {
            return new long[0];
        }
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.e;
        if (Build.VERSION.SDK_INT < 21) {
            return new long[0];
        }
        Network[] a2 = NetworkChangeNotifierAutoDetect.a(networkChangeNotifierAutoDetect.d, (Network) null);
        long[] jArr = new long[(a2.length << 1)];
        int i = 0;
        for (Network network : a2) {
            int i2 = i + 1;
            jArr[i] = NetworkChangeNotifierAutoDetect.a(network);
            i = i2 + 1;
            jArr[i2] = (long) networkChangeNotifierAutoDetect.d.b(network);
        }
        return jArr;
    }

    @CalledByNative
    public void addNativeObserver(long j) {
        this.b.add(Long.valueOf(j));
    }

    @CalledByNative
    public void removeNativeObserver(long j) {
        this.b.remove(Long.valueOf(j));
    }

    @CalledByNative
    public boolean registerNetworkCallbackFailed() {
        if (this.e == null) {
            return false;
        }
        return this.e.j;
    }

    private static void a() {
        a.a(false, (eiq) new eja());
    }

    public final void a(boolean z, eiq eiq) {
        if (z) {
            if (this.e == null) {
                this.e = new NetworkChangeNotifierAutoDetect(new eip(this), eiq);
                eio b2 = this.e.b();
                a(b2.a());
                b(b2.b());
            }
        } else if (this.e != null) {
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.e;
            networkChangeNotifierAutoDetect.c.b();
            networkChangeNotifierAutoDetect.a();
            this.e = null;
        }
    }

    @CalledByNative
    public static void forceConnectivityState(boolean z) {
        int i = 6;
        int i2 = 0;
        a();
        NetworkChangeNotifier networkChangeNotifier = a;
        if ((networkChangeNotifier.f != 6) != z) {
            if (z) {
                i = 0;
            }
            networkChangeNotifier.a(i);
            if (!z) {
                i2 = 1;
            }
            networkChangeNotifier.b(i2);
        }
    }

    @CalledByNative
    public static void fakeNetworkConnected(long j, int i) {
        a();
        a.a(j, i);
    }

    @CalledByNative
    public static void fakeNetworkSoonToBeDisconnected(long j) {
        a();
        a.a(j);
    }

    @CalledByNative
    public static void fakeNetworkDisconnected(long j) {
        a();
        a.b(j);
    }

    @CalledByNative
    public static void fakePurgeActiveNetworkList(long[] jArr) {
        a();
        a.a(jArr);
    }

    @CalledByNative
    public static void fakeDefaultNetwork(long j, int i) {
        a();
        a.a(i, j);
    }

    @CalledByNative
    public static void fakeConnectionSubtypeChanged(int i) {
        a();
        a.b(i);
    }

    public final void a(int i) {
        this.f = i;
        a(i, getCurrentDefaultNetId());
    }

    private final void a(int i, long j) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            nativeNotifyConnectionTypeChanged(((Long) arrayList.get(i2)).longValue(), i, j);
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((eif) it.next()).a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(int i) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            nativeNotifyMaxBandwidthChanged(((Long) obj).longValue(), i);
        }
    }

    public final void a(long j, int i) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            nativeNotifyOfNetworkConnect(((Long) arrayList.get(i2)).longValue(), j, i);
        }
    }

    public final void a(long j) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            nativeNotifyOfNetworkSoonToDisconnect(((Long) obj).longValue(), j);
        }
    }

    public final void b(long j) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            nativeNotifyOfNetworkDisconnect(((Long) obj).longValue(), j);
        }
    }

    public final void a(long[] jArr) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            nativeNotifyPurgeActiveNetworkList(((Long) obj).longValue(), jArr);
        }
    }

    @CalledByNative
    public static boolean isProcessBoundToNetwork() {
        NetworkChangeNotifier networkChangeNotifier = a;
        if (Build.VERSION.SDK_INT >= 21) {
            if (Build.VERSION.SDK_INT < 23) {
                return ConnectivityManager.getProcessDefaultNetwork() != null;
            }
            if (networkChangeNotifier.d.getBoundNetworkForProcess() != null) {
                return true;
            }
        }
        return false;
    }
}
