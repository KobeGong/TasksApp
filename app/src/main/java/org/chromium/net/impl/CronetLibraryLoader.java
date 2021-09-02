package org.chromium.net.impl;

/* compiled from: PG */
public class CronetLibraryLoader {
    private static final java.lang.Object a = new java.lang.Object();
    private static final java.lang.String b = ("cronet." + "67.0.3387.0");
    private static final java.lang.String c = org.chromium.net.impl.CronetLibraryLoader.class.getSimpleName();
    private static final android.os.HandlerThread d = new android.os.HandlerThread("CronetInit");
    private static volatile boolean e = false;
    private static volatile boolean f = false;
    private static final android.os.ConditionVariable g = new android.os.ConditionVariable();

    private static native void nativeCronetInitOnInitThread();

    private static native java.lang.String nativeGetCronetVersion();

    public static void a(android.content.Context context, defpackage.ejv ejv) {
        synchronized (a) {
            if (!f) {
                if (defpackage.ehw.a != null && defpackage.ehw.a != context) {
                    throw new java.lang.RuntimeException("Attempting to set multiple global application contexts.");
                } else if (context == null) {
                    throw new java.lang.RuntimeException("Global application context cannot be set to null.");
                } else {
                    defpackage.ehw.a = context;
                    if (!d.isAlive()) {
                        d.start();
                    }
                    a(new defpackage.ejy());
                }
            }
            if (!e) {
                ejv.b();
                java.lang.System.loadLibrary(b);
                java.lang.String str = "67.0.3387.0";
                if (!str.equals(nativeGetCronetVersion())) {
                    throw new java.lang.RuntimeException(java.lang.String.format("Expected Cronet version number %s, actual version number %s.", new java.lang.Object[]{str, nativeGetCronetVersion()}));
                }
                defpackage.dpt.a(c, "Cronet version: %s, arch: %s", str, java.lang.System.getProperty("os.arch"));
                e = true;
                g.open();
            }
        }
    }

    public static void a() {
        if (!f) {
            org.chromium.net.NetworkChangeNotifier.init();
            org.chromium.net.NetworkChangeNotifier.a.a(true, (defpackage.eiq) new defpackage.eiz());
            g.block();
            nativeCronetInitOnInitThread();
            f = true;
        }
    }

    public static void a(java.lang.Runnable runnable) {
        if (d.getLooper() == android.os.Looper.myLooper()) {
            runnable.run();
        } else {
            new android.os.Handler(d.getLooper()).post(runnable);
        }
    }

    @org.chromium.base.annotations.CalledByNative
    private static java.lang.String getDefaultUserAgent() {
        return defpackage.ekr.a(defpackage.ehw.a);
    }

    @org.chromium.base.annotations.CalledByNative
    private static void ensureInitializedFromNative() {
        synchronized (a) {
            e = true;
            g.open();
        }
        a(defpackage.ehw.a, null);
    }
}
