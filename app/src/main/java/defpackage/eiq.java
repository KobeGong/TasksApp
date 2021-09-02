package defpackage;

/* renamed from: eiq reason: default package */
/* compiled from: PG */
public abstract class eiq {
    public org.chromium.net.NetworkChangeNotifierAutoDetect a;

    public abstract void b();

    /* access modifiers changed from: protected */
    public final void a() {
        org.chromium.net.NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.a;
        if (!networkChangeNotifierAutoDetect.g) {
            if (networkChangeNotifierAutoDetect.i) {
                networkChangeNotifierAutoDetect.c();
            }
            networkChangeNotifierAutoDetect.h = defpackage.ehw.a.registerReceiver(networkChangeNotifierAutoDetect, networkChangeNotifierAutoDetect.a) != null;
            networkChangeNotifierAutoDetect.g = true;
            if (networkChangeNotifierAutoDetect.e != null) {
                defpackage.eii eii = networkChangeNotifierAutoDetect.e;
                android.net.Network[] a2 = org.chromium.net.NetworkChangeNotifierAutoDetect.a(eii.b.d, (android.net.Network) null);
                eii.a = null;
                if (a2.length == 1) {
                    android.net.NetworkCapabilities d = eii.b.d.d(a2[0]);
                    if (d != null && d.hasTransport(4)) {
                        eii.a = a2[0];
                    }
                }
                try {
                    networkChangeNotifierAutoDetect.d.a.registerNetworkCallback(networkChangeNotifierAutoDetect.f, networkChangeNotifierAutoDetect.e);
                } catch (java.lang.IllegalArgumentException e) {
                    networkChangeNotifierAutoDetect.j = true;
                    networkChangeNotifierAutoDetect.e = null;
                }
                if (!networkChangeNotifierAutoDetect.j && networkChangeNotifierAutoDetect.i) {
                    android.net.Network[] a3 = org.chromium.net.NetworkChangeNotifierAutoDetect.a(networkChangeNotifierAutoDetect.d, (android.net.Network) null);
                    long[] jArr = new long[a3.length];
                    for (int i = 0; i < a3.length; i++) {
                        jArr[i] = org.chromium.net.NetworkChangeNotifierAutoDetect.a(a3[i]);
                    }
                    networkChangeNotifierAutoDetect.b.a(jArr);
                }
            }
        }
    }

    public void a(org.chromium.net.NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.a = networkChangeNotifierAutoDetect;
    }
}
