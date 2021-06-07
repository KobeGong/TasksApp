package org.chromium.net;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import org.chromium.base.ApplicationStatus;

@SuppressLint({"NewApi"})
/* compiled from: PG */
public class NetworkChangeNotifierAutoDetect extends BroadcastReceiver {
    public final NetworkConnectivityIntentFilter a;
    public final eip b;
    public final eiq c;
    public eih d;
    public eii e;
    public NetworkRequest f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    private final Looper k = Looper.myLooper();
    private final Handler l = new Handler(this.k);
    private eir m;
    private eio n;

    /* access modifiers changed from: package-private */
    @SuppressLint({"NewApi", "ParcelCreator"})
    /* compiled from: PG */
    public class NetworkConnectivityIntentFilter extends IntentFilter {
        NetworkConnectivityIntentFilter() {
            addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    @TargetApi(21)
    public NetworkChangeNotifierAutoDetect(eip eip, eiq eiq) {
        this.b = eip;
        this.d = new eih(ehw.a);
        this.m = new eir(ehw.a);
        if (Build.VERSION.SDK_INT >= 21) {
            this.e = new eii(this);
            this.f = new NetworkRequest.Builder().addCapability(12).removeCapability(15).build();
        } else {
            this.e = null;
            this.f = null;
        }
        this.n = b();
        this.a = new NetworkConnectivityIntentFilter();
        this.h = false;
        this.i = false;
        this.c = eiq;
        this.c.a(this);
        this.i = true;
    }

    public final void a(Runnable runnable) {
        if (this.k == Looper.myLooper()) {
            runnable.run();
        } else {
            this.l.post(runnable);
        }
    }

    public final void a() {
        if (this.g) {
            ehw.a.unregisterReceiver(this);
            this.g = false;
            if (this.e != null) {
                eih eih = this.d;
                eih.a.unregisterNetworkCallback(this.e);
            }
        }
    }

    public final eio b() {
        NetworkInfo networkInfo;
        eih eih = this.d;
        eir eir = this.m;
        NetworkInfo activeNetworkInfo = eih.a.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            networkInfo = null;
        } else {
            if (!activeNetworkInfo.isConnected()) {
                if (Build.VERSION.SDK_INT < 21) {
                    networkInfo = null;
                } else if (activeNetworkInfo.getDetailedState() != NetworkInfo.DetailedState.BLOCKED) {
                    networkInfo = null;
                } else if (ApplicationStatus.getStateForApplication() != 1) {
                    networkInfo = null;
                }
            }
            networkInfo = activeNetworkInfo;
        }
        if (networkInfo == null) {
            return new eio(false, -1, -1, null);
        }
        if (networkInfo.getType() != 1) {
            return new eio(true, networkInfo.getType(), networkInfo.getSubtype(), null);
        }
        if (networkInfo.getExtraInfo() == null || "".equals(networkInfo.getExtraInfo())) {
            return new eio(true, networkInfo.getType(), networkInfo.getSubtype(), eir.a());
        }
        return new eio(true, networkInfo.getType(), networkInfo.getSubtype(), networkInfo.getExtraInfo());
    }

    @TargetApi(21)
    public static Network[] a(eih eih, Network network) {
        NetworkCapabilities d2;
        Network[] allNetworks = eih.a.getAllNetworks();
        if (allNetworks == null) {
            allNetworks = new Network[0];
        }
        int i2 = 0;
        for (Network network2 : allNetworks) {
            if (!network2.equals(network) && (d2 = eih.d(network2)) != null && d2.hasCapability(12)) {
                if (!d2.hasTransport(4)) {
                    allNetworks[i2] = network2;
                    i2++;
                } else if (eih.c(network2)) {
                    return new Network[]{network2};
                }
            }
        }
        return (Network[]) Arrays.copyOf(allNetworks, i2);
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
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            default:
                return 0;
            case 6:
                return 5;
            case 7:
                return 7;
            case 9:
                return 1;
        }
    }

    public void onReceive(Context context, Intent intent) {
        a(new eig(this));
    }

    public final void c() {
        eio b2 = b();
        if (b2.a() != this.n.a() || !b2.a.equals(this.n.a)) {
            this.b.a(b2.a());
        }
        if (!(b2.a() == this.n.a() && b2.b() == this.n.b())) {
            eip eip = this.b;
            eip.a.b(b2.b());
        }
        this.n = b2;
    }

    @TargetApi(21)
    public static long a(Network network) {
        if (Build.VERSION.SDK_INT >= 23) {
            return network.getNetworkHandle();
        }
        return (long) Integer.parseInt(network.toString());
    }

    static {
        NetworkChangeNotifierAutoDetect.class.getSimpleName();
    }
}
