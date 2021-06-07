package org.chromium.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import org.chromium.base.annotations.CalledByNative;

/* compiled from: PG */
public class ThreadUtils {
    private static final Object a = new Object();
    private static Handler b;

    public static Handler a() {
        Handler handler;
        synchronized (a) {
            if (b == null) {
                b = new Handler(Looper.getMainLooper());
            }
            handler = b;
        }
        return handler;
    }

    public static void b() {
    }

    public static void c() {
    }

    @CalledByNative
    public static void setThreadPriorityAudio(int i) {
        Process.setThreadPriority(i, -16);
    }

    @CalledByNative
    private static boolean isThreadPriorityAudio(int i) {
        return Process.getThreadPriority(i) == -16;
    }
}
