package org.chromium.net;

/* compiled from: PG */
public class ProxyChangeListener {
    private static boolean c = true;
    public final android.os.Looper a = android.os.Looper.myLooper();
    public final android.os.Handler b = new android.os.Handler(this.a);
    private long d;
    private defpackage.eiw e;

    private ProxyChangeListener() {
    }

    private native void nativeProxySettingsChanged(long j);

    private native void nativeProxySettingsChangedTo(long j, java.lang.String str, int i, java.lang.String str2, java.lang.String[] strArr);

    @org.chromium.base.annotations.CalledByNative
    public static org.chromium.net.ProxyChangeListener create() {
        return new org.chromium.net.ProxyChangeListener();
    }

    @org.chromium.base.annotations.CalledByNative
    public static java.lang.String getProperty(java.lang.String str) {
        return java.lang.System.getProperty(str);
    }

    @org.chromium.base.annotations.CalledByNative
    public void start(long j) {
        this.d = j;
        if (this.e == null) {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.intent.action.PROXY_CHANGE");
            this.e = new defpackage.eiw(this);
            defpackage.ehw.a.registerReceiver(this.e, intentFilter);
        }
    }

    @org.chromium.base.annotations.CalledByNative
    public void stop() {
        this.d = 0;
        if (this.e != null) {
            defpackage.ehw.a.unregisterReceiver(this.e);
            this.e = null;
        }
    }

    public final void a(defpackage.eiw eiw, defpackage.eiv eiv) {
        if (c && eiw == this.e && this.d != 0) {
            if (eiv != null) {
                nativeProxySettingsChangedTo(this.d, eiv.a, eiv.b, eiv.c, eiv.d);
                return;
            }
            nativeProxySettingsChanged(this.d);
        }
    }
}
