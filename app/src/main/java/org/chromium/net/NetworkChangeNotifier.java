package org.chromium.net;

/* compiled from: PG */
public class NetworkChangeNotifier {
    @android.annotation.SuppressLint({"StaticFieldLeak"})
    public static org.chromium.net.NetworkChangeNotifier a;
    private final java.util.ArrayList b = new java.util.ArrayList();
    private final defpackage.egu c = new defpackage.egu();
    private final android.net.ConnectivityManager d = ((android.net.ConnectivityManager) defpackage.ehw.a.getSystemService("connectivity"));
    private org.chromium.net.NetworkChangeNotifierAutoDetect e;
    private int f = 0;

    protected NetworkChangeNotifier() {
    }

    private native void nativeNotifyConnectionTypeChanged(long j, int i, long j2);

    private native void nativeNotifyMaxBandwidthChanged(long j, int i);

    private native void nativeNotifyOfNetworkConnect(long j, long j2, int i);

    private native void nativeNotifyOfNetworkDisconnect(long j, long j2);

    private native void nativeNotifyOfNetworkSoonToDisconnect(long j, long j2);

    private native void nativeNotifyPurgeActiveNetworkList(long j, long[] jArr);

    @org.chromium.base.annotations.CalledByNative
    public static org.chromium.net.NetworkChangeNotifier init() {
        if (a == null) {
            a = new org.chromium.net.NetworkChangeNotifier();
        }
        return a;
    }

    @org.chromium.base.annotations.CalledByNative
    public int getCurrentConnectionType() {
        return this.f;
    }

    @org.chromium.base.annotations.CalledByNative
    public int getCurrentConnectionSubtype() {
        if (this.e == null) {
            return 0;
        }
        return this.e.b().b();
    }

    @org.chromium.base.annotations.CalledByNative
    public long getCurrentDefaultNetId() {
        android.net.Network[] a2;
        long j = -1;
        if (this.e != null) {
            org.chromium.net.NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.e;
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                defpackage.eih eih = networkChangeNotifierAutoDetect.d;
                android.net.NetworkInfo activeNetworkInfo = eih.a.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    for (android.net.Network network : org.chromium.net.NetworkChangeNotifierAutoDetect.a(eih, (android.net.Network) null)) {
                        android.net.NetworkInfo a3 = eih.a(network);
                        if (a3 != null && (a3.getType() == activeNetworkInfo.getType() || a3.getType() == 17)) {
                            j = org.chromium.net.NetworkChangeNotifierAutoDetect.a(network);
                        }
                    }
                }
            }
        }
        return j;
    }

    @org.chromium.base.annotations.CalledByNative
    public long[] getCurrentNetworksAndTypes() {
        if (this.e == null) {
            return new long[0];
        }
        org.chromium.net.NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.e;
        if (android.os.Build.VERSION.SDK_INT < 21) {
            return new long[0];
        }
        android.net.Network[] a2 = org.chromium.net.NetworkChangeNotifierAutoDetect.a(networkChangeNotifierAutoDetect.d, (android.net.Network) null);
        long[] jArr = new long[(a2.length << 1)];
        int i = 0;
        for (android.net.Network network : a2) {
            int i2 = i + 1;
            jArr[i] = org.chromium.net.NetworkChangeNotifierAutoDetect.a(network);
            i = i2 + 1;
            jArr[i2] = (long) networkChangeNotifierAutoDetect.d.b(network);
        }
        return jArr;
    }

    @org.chromium.base.annotations.CalledByNative
    public void addNativeObserver(long j) {
        this.b.add(java.lang.Long.valueOf(j));
    }

    @org.chromium.base.annotations.CalledByNative
    public void removeNativeObserver(long j) {
        this.b.remove(java.lang.Long.valueOf(j));
    }

    @org.chromium.base.annotations.CalledByNative
    public boolean registerNetworkCallbackFailed() {
        if (this.e == null) {
            return false;
        }
        return this.e.j;
    }

    private static void a() {
        a.a(false, (defpackage.eiq) new defpackage.eja());
    }

    public final void a(boolean z, defpackage.eiq eiq) {
        if (z) {
            if (this.e == null) {
                this.e = new org.chromium.net.NetworkChangeNotifierAutoDetect(new defpackage.eip(this), eiq);
                defpackage.eio b2 = this.e.b();
                a(b2.a());
                b(b2.b());
            }
        } else if (this.e != null) {
            org.chromium.net.NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.e;
            networkChangeNotifierAutoDetect.c.b();
            networkChangeNotifierAutoDetect.a();
            this.e = null;
        }
    }

    @org.chromium.base.annotations.CalledByNative
    public static void forceConnectivityState(boolean z) {
        int i = 6;
        int i2 = 0;
        a();
        org.chromium.net.NetworkChangeNotifier networkChangeNotifier = a;
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

    @org.chromium.base.annotations.CalledByNative
    public static void fakeNetworkConnected(long j, int i) {
        a();
        a.a(j, i);
    }

    @org.chromium.base.annotations.CalledByNative
    public static void fakeNetworkSoonToBeDisconnected(long j) {
        a();
        a.a(j);
    }

    @org.chromium.base.annotations.CalledByNative
    public static void fakeNetworkDisconnected(long j) {
        a();
        a.b(j);
    }

    @org.chromium.base.annotations.CalledByNative
    public static void fakePurgeActiveNetworkList(long[] jArr) {
        a();
        a.a(jArr);
    }

    @org.chromium.base.annotations.CalledByNative
    public static void fakeDefaultNetwork(long j, int i) {
        a();
        a.a(i, j);
    }

    @org.chromium.base.annotations.CalledByNative
    public static void fakeConnectionSubtypeChanged(int i) {
        a();
        a.b(i);
    }

    public final void a(int i) {
        this.f = i;
        a(i, getCurrentDefaultNetId());
    }

    private final void a(int i, long j) {
        java.util.ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            nativeNotifyConnectionTypeChanged(((java.lang.Long) arrayList.get(i2)).longValue(), i, j);
            i2 = i3;
        }
        java.util.Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((defpackage.eif) it.next()).a();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b(int i) {
        java.util.ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            java.lang.Object obj = arrayList.get(i2);
            i2++;
            nativeNotifyMaxBandwidthChanged(((java.lang.Long) obj).longValue(), i);
        }
    }

    public final void a(long j, int i) {
        java.util.ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            nativeNotifyOfNetworkConnect(((java.lang.Long) arrayList.get(i2)).longValue(), j, i);
            i2 = i3;
        }
    }

    public final void a(long j) {
        java.util.ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            java.lang.Object obj = arrayList.get(i);
            i++;
            nativeNotifyOfNetworkSoonToDisconnect(((java.lang.Long) obj).longValue(), j);
        }
    }

    public final void b(long j) {
        java.util.ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            java.lang.Object obj = arrayList.get(i);
            i++;
            nativeNotifyOfNetworkDisconnect(((java.lang.Long) obj).longValue(), j);
        }
    }

    public final void a(long[] jArr) {
        java.util.ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            java.lang.Object obj = arrayList.get(i);
            i++;
            nativeNotifyPurgeActiveNetworkList(((java.lang.Long) obj).longValue(), jArr);
        }
    }

    @org.chromium.base.annotations.CalledByNative
    public static boolean isProcessBoundToNetwork() {
        org.chromium.net.NetworkChangeNotifier networkChangeNotifier = a;
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            if (android.os.Build.VERSION.SDK_INT < 23) {
                if (android.net.ConnectivityManager.getProcessDefaultNetwork() != null) {
                    return true;
                }
                return false;
            } else if (networkChangeNotifier.d.getBoundNetworkForProcess() != null) {
                return true;
            }
        }
        return false;
    }
}
