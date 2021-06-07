package org.chromium.net.impl;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.net.NetworkChangeNotifier;

/* compiled from: PG */
public class CronetLibraryLoader {
    private static final Object a = new Object();
    private static final String b = ("cronet." + "67.0.3387.0");
    private static final String c = CronetLibraryLoader.class.getSimpleName();
    private static final HandlerThread d = new HandlerThread("CronetInit");
    private static volatile boolean e = false;
    private static volatile boolean f = false;
    private static final ConditionVariable g = new ConditionVariable();

    private static native void nativeCronetInitOnInitThread();

    private static native String nativeGetCronetVersion();

    public static void a(Context context, ejv ejv) {
        synchronized (a) {
            if (!f) {
                if (ehw.a != null && ehw.a != context) {
                    throw new RuntimeException("Attempting to set multiple global application contexts.");
                } else if (context == null) {
                    throw new RuntimeException("Global application context cannot be set to null.");
                } else {
                    ehw.a = context;
                    if (!d.isAlive()) {
                        d.start();
                    }
                    a(new ejy());
                }
            }
            if (!e) {
                ejv.b();
                System.loadLibrary(b);
                if (!"67.0.3387.0".equals(nativeGetCronetVersion())) {
                    throw new RuntimeException(String.format("Expected Cronet version number %s, actual version number %s.", "67.0.3387.0", nativeGetCronetVersion()));
                }
                dpt.a(c, "Cronet version: %s, arch: %s", "67.0.3387.0", System.getProperty("os.arch"));
                e = true;
                g.open();
            }
        }
    }

    public static void a() {
        if (!f) {
            NetworkChangeNotifier.init();
            NetworkChangeNotifier.a.a(true, (eiq) new eiz());
            g.block();
            nativeCronetInitOnInitThread();
            f = true;
        }
    }

    public static void a(Runnable runnable) {
        if (d.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            new Handler(d.getLooper()).post(runnable);
        }
    }

    @CalledByNative
    private static String getDefaultUserAgent() {
        return ekr.a(ehw.a);
    }

    @CalledByNative
    private static void ensureInitializedFromNative() {
        synchronized (a) {
            e = true;
            g.open();
        }
        a(ehw.a, null);
    }
}
