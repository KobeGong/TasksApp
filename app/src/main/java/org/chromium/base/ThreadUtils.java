package org.chromium.base;

/* compiled from: PG */
public class ThreadUtils {
    private static final java.lang.Object a = new java.lang.Object();
    private static android.os.Handler b;

    public static android.os.Handler a() {
        android.os.Handler handler;
        synchronized (a) {
            if (b == null) {
                b = new android.os.Handler(android.os.Looper.getMainLooper());
            }
            handler = b;
        }
        return handler;
    }

    public static void b() {
    }

    public static void c() {
    }

    @org.chromium.base.annotations.CalledByNative
    public static void setThreadPriorityAudio(int i) {
        android.os.Process.setThreadPriority(i, -16);
    }

    @org.chromium.base.annotations.CalledByNative
    private static boolean isThreadPriorityAudio(int i) {
        return android.os.Process.getThreadPriority(i) == -16;
    }
}
