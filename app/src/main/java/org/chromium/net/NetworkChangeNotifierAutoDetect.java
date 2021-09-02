package org.chromium.net;

@android.annotation.SuppressLint({"NewApi"})
/* compiled from: PG */
public class NetworkChangeNotifierAutoDetect extends android.content.BroadcastReceiver {
    public final org.chromium.net.NetworkChangeNotifierAutoDetect.NetworkConnectivityIntentFilter a;
    public final defpackage.eip b;
    public final defpackage.eiq c;
    public defpackage.eih d;
    public defpackage.eii e;
    public android.net.NetworkRequest f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    private final android.os.Looper k = android.os.Looper.myLooper();
    private final android.os.Handler l = new android.os.Handler(this.k);
    private defpackage.eir m;
    private defpackage.eio n;

    @android.annotation.SuppressLint({"NewApi", "ParcelCreator"})
    /* compiled from: PG */
    class NetworkConnectivityIntentFilter extends android.content.IntentFilter {
        NetworkConnectivityIntentFilter() {
            addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    @android.annotation.TargetApi(21)
    public NetworkChangeNotifierAutoDetect(defpackage.eip eip, defpackage.eiq eiq) {
        this.b = eip;
        this.d = new defpackage.eih(defpackage.ehw.a);
        this.m = new defpackage.eir(defpackage.ehw.a);
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            this.e = new defpackage.eii(this);
            this.f = new android.net.NetworkRequest.Builder().addCapability(12).removeCapability(15).build();
        } else {
            this.e = null;
            this.f = null;
        }
        this.n = b();
        this.a = new org.chromium.net.NetworkChangeNotifierAutoDetect.NetworkConnectivityIntentFilter();
        this.h = false;
        this.i = false;
        this.c = eiq;
        this.c.a(this);
        this.i = true;
    }

    public final void a(java.lang.Runnable runnable) {
        if (this.k == android.os.Looper.myLooper()) {
            runnable.run();
        } else {
            this.l.post(runnable);
        }
    }

    public final void a() {
        if (this.g) {
            defpackage.ehw.a.unregisterReceiver(this);
            this.g = false;
            if (this.e != null) {
                defpackage.eih eih = this.d;
                eih.a.unregisterNetworkCallback(this.e);
            }
        }
    }

    public final defpackage.eio b() {
        android.net.NetworkInfo networkInfo;
        defpackage.eih eih = this.d;
        defpackage.eir eir = this.m;
        android.net.NetworkInfo activeNetworkInfo = eih.a.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            networkInfo = null;
        } else {
            if (!activeNetworkInfo.isConnected()) {
                if (android.os.Build.VERSION.SDK_INT < 21) {
                    networkInfo = null;
                } else if (activeNetworkInfo.getDetailedState() != android.net.NetworkInfo.DetailedState.BLOCKED) {
                    networkInfo = null;
                } else if (org.chromium.base.ApplicationStatus.getStateForApplication() != 1) {
                    networkInfo = null;
                }
            }
            networkInfo = activeNetworkInfo;
        }
        if (networkInfo == null) {
            return new defpackage.eio(false, -1, -1, null);
        }
        if (networkInfo.getType() != 1) {
            return new defpackage.eio(true, networkInfo.getType(), networkInfo.getSubtype(), null);
        }
        if (networkInfo.getExtraInfo() == null || "".equals(networkInfo.getExtraInfo())) {
            return new defpackage.eio(true, networkInfo.getType(), networkInfo.getSubtype(), eir.a());
        }
        return new defpackage.eio(true, networkInfo.getType(), networkInfo.getSubtype(), networkInfo.getExtraInfo());
    }

    @android.annotation.TargetApi(21)
    public static android.net.Network[] a(defpackage.eih eih, android.net.Network network) {
        android.net.Network[] allNetworks = eih.a.getAllNetworks();
        if (allNetworks == null) {
            allNetworks = new android.net.Network[0];
        }
        int i2 = 0;
        for (android.net.Network network2 : allNetworks) {
            if (!network2.equals(network)) {
                android.net.NetworkCapabilities d2 = eih.d(network2);
                if (d2 != null && d2.hasCapability(12)) {
                    if (!d2.hasTransport(4)) {
                        int i3 = i2 + 1;
                        allNetworks[i2] = network2;
                        i2 = i3;
                    } else if (defpackage.eih.c(network2)) {
                        return new android.net.Network[]{network2};
                    }
                }
            }
        }
        return (android.net.Network[]) java.util.Arrays.copyOf(allNetworks, i2);
    }

    public static int a(int i2, int i3) {
        switch (i2) {
            case 0:
                switch (i3) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return 3;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        return 4;
                    case 13:
                        return 5;
                    default:
                        return 0;
                }
            case 1:
                return 2;
            case 6:
                return 5;
            case 7:
                return 7;
            case 9:
                return 1;
            default:
                return 0;
        }
    }

    public void onReceive(android.content.Context context, android.content.Intent intent) {
        a((java.lang.Runnable) new defpackage.eig(this));
    }

    public final void c() {
        defpackage.eio b2 = b();
        if (b2.a() != this.n.a() || !b2.a.equals(this.n.a)) {
            this.b.a(b2.a());
        }
        if (!(b2.a() == this.n.a() && b2.b() == this.n.b())) {
            defpackage.eip eip = this.b;
            eip.a.b(b2.b());
        }
        this.n = b2;
    }

    @android.annotation.TargetApi(21)
    public static long a(android.net.Network network) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return network.getNetworkHandle();
        }
        return (long) java.lang.Integer.parseInt(network.toString());
    }

    static {
        org.chromium.net.NetworkChangeNotifierAutoDetect.class.getSimpleName();
    }
}
