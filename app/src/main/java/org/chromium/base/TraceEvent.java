package org.chromium.base;

import android.os.Looper;
import org.chromium.base.annotations.CalledByNative;

/* compiled from: PG */
public class TraceEvent implements AutoCloseable {
    public static volatile boolean a;

    private static native void nativeBegin(String str, String str2);

    /* access modifiers changed from: private */
    public static native void nativeBeginToplevel(String str);

    private static native void nativeEnd(String str, String str2);

    /* access modifiers changed from: private */
    public static native void nativeEndToplevel();

    private static native void nativeFinishAsync(String str, long j);

    private static native void nativeInstant(String str, String str2);

    private static native void nativeRegisterEnabledObserver();

    private static native void nativeStartATrace();

    private static native void nativeStartAsync(String str, long j);

    private static native void nativeStopATrace();

    @Override // java.lang.AutoCloseable
    public void close() {
        throw new NoSuchMethodError();
    }

    @CalledByNative
    public static void setEnabled(boolean z) {
        ehf ehf;
        if (z) {
            synchronized (EarlyTraceEvent.a) {
                if (EarlyTraceEvent.b()) {
                    EarlyTraceEvent.b = 2;
                    EarlyTraceEvent.c();
                }
            }
        }
        if (a != z) {
            a = z;
            Looper looper = ThreadUtils.a().getLooper();
            if (z) {
                ehf = ehh.a;
            } else {
                ehf = null;
            }
            looper.setMessageLogging(ehf);
        }
    }

    public static void a(String str, String str2) {
        if (a) {
            nativeInstant(str, str2);
        }
    }

    public static void b(String str, String str2) {
        EarlyTraceEvent.a(str);
        if (a) {
            nativeBegin(str, str2);
        }
    }

    public static void a(String str) {
        EarlyTraceEvent.b(str);
        if (a) {
            nativeEnd(str, null);
        }
    }
}
