package defpackage;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import org.chromium.net.AndroidNetworkLibrary;

/* renamed from: eir  reason: default package */
/* compiled from: PG */
public final class eir {
    private final Context a;
    private final Object b;
    private boolean c;
    private boolean d;
    private WifiManager e;

    public eir(Context context) {
        this.b = new Object();
        this.a = context;
    }

    eir() {
        this.b = new Object();
        this.a = null;
    }

    public final String a() {
        WifiManager wifiManager;
        boolean z;
        boolean z2 = true;
        synchronized (this.b) {
            if (this.c) {
                z = this.d;
            } else {
                if (this.a.getPackageManager().checkPermission("android.permission.ACCESS_WIFI_STATE", this.a.getPackageName()) != 0) {
                    z2 = false;
                }
                this.d = z2;
                if (this.d) {
                    wifiManager = (WifiManager) this.a.getSystemService("wifi");
                } else {
                    wifiManager = null;
                }
                this.e = wifiManager;
                this.c = true;
                z = this.d;
            }
            if (!z) {
                return AndroidNetworkLibrary.getWifiSSID();
            }
            WifiInfo b2 = b();
            if (b2 == null) {
                return "";
            }
            return b2.getSSID();
        }
    }

    private final WifiInfo b() {
        try {
            return this.e.getConnectionInfo();
        } catch (NullPointerException e2) {
            try {
                return this.e.getConnectionInfo();
            } catch (NullPointerException e3) {
                return null;
            }
        }
    }
}
