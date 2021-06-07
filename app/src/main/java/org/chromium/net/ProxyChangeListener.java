package org.chromium.net;

import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import org.chromium.base.annotations.CalledByNative;

/* compiled from: PG */
public class ProxyChangeListener {
    private static boolean c = true;
    public final Looper a = Looper.myLooper();
    public final Handler b = new Handler(this.a);
    private long d;
    private eiw e;

    private ProxyChangeListener() {
    }

    private native void nativeProxySettingsChanged(long j);

    private native void nativeProxySettingsChangedTo(long j, String str, int i, String str2, String[] strArr);

    @CalledByNative
    public static ProxyChangeListener create() {
        return new ProxyChangeListener();
    }

    @CalledByNative
    public static String getProperty(String str) {
        return System.getProperty(str);
    }

    @CalledByNative
    public void start(long j) {
        this.d = j;
        if (this.e == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PROXY_CHANGE");
            this.e = new eiw(this);
            ehw.a.registerReceiver(this.e, intentFilter);
        }
    }

    @CalledByNative
    public void stop() {
        this.d = 0;
        if (this.e != null) {
            ehw.a.unregisterReceiver(this.e);
            this.e = null;
        }
    }

    public final void a(eiw eiw, eiv eiv) {
        if (c && eiw == this.e && this.d != 0) {
            if (eiv != null) {
                nativeProxySettingsChangedTo(this.d, eiv.a, eiv.b, eiv.c, eiv.d);
            } else {
                nativeProxySettingsChanged(this.d);
            }
        }
    }
}
