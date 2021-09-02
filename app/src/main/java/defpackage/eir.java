package defpackage;

/* renamed from: eir reason: default package */
/* compiled from: PG */
public final class eir {
    private final android.content.Context a;
    private final java.lang.Object b;
    private boolean c;
    private boolean d;
    private android.net.wifi.WifiManager e;

    public eir(android.content.Context context) {
        this.b = new java.lang.Object();
        this.a = context;
    }

    eir() {
        this.b = new java.lang.Object();
        this.a = null;
    }

    public final java.lang.String a() {
        android.net.wifi.WifiManager wifiManager;
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
                    wifiManager = (android.net.wifi.WifiManager) this.a.getSystemService("wifi");
                } else {
                    wifiManager = null;
                }
                this.e = wifiManager;
                this.c = true;
                z = this.d;
            }
            if (!z) {
                return org.chromium.net.AndroidNetworkLibrary.getWifiSSID();
            }
            android.net.wifi.WifiInfo b2 = b();
            if (b2 != null) {
                java.lang.String ssid = b2.getSSID();
                return ssid;
            }
            java.lang.String str = "";
            return str;
        }
    }

    private final android.net.wifi.WifiInfo b() {
        try {
            return this.e.getConnectionInfo();
        } catch (java.lang.NullPointerException e2) {
            try {
                return this.e.getConnectionInfo();
            } catch (java.lang.NullPointerException e3) {
                return null;
            }
        }
    }
}
