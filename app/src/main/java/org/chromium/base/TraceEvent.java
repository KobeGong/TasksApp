package org.chromium.base;

/* compiled from: PG */
public class TraceEvent implements java.lang.AutoCloseable {
    public static volatile boolean a;

    private static native void nativeBegin(java.lang.String str, java.lang.String str2);

    /* access modifiers changed from: private */
    public static native void nativeBeginToplevel(java.lang.String str);

    private static native void nativeEnd(java.lang.String str, java.lang.String str2);

    /* access modifiers changed from: private */
    public static native void nativeEndToplevel();

    private static native void nativeFinishAsync(java.lang.String str, long j);

    private static native void nativeInstant(java.lang.String str, java.lang.String str2);

    private static native void nativeRegisterEnabledObserver();

    private static native void nativeStartATrace();

    private static native void nativeStartAsync(java.lang.String str, long j);

    private static native void nativeStopATrace();

    public void close() {
        throw new java.lang.NoSuchMethodError();
    }

    @org.chromium.base.annotations.CalledByNative
    public static void setEnabled(boolean z) {
        defpackage.ehf ehf;
        if (z) {
            synchronized (org.chromium.base.EarlyTraceEvent.a) {
                if (org.chromium.base.EarlyTraceEvent.b()) {
                    org.chromium.base.EarlyTraceEvent.b = 2;
                    org.chromium.base.EarlyTraceEvent.c();
                }
            }
        }
        if (a != z) {
            a = z;
            android.os.Looper looper = org.chromium.base.ThreadUtils.a().getLooper();
            if (z) {
                ehf = defpackage.ehh.a;
            } else {
                ehf = null;
            }
            looper.setMessageLogging(ehf);
        }
    }

    public static void a(java.lang.String str, java.lang.String str2) {
        if (a) {
            nativeInstant(str, str2);
        }
    }

    public static void b(java.lang.String str, java.lang.String str2) {
        org.chromium.base.EarlyTraceEvent.a(str);
        if (a) {
            nativeBegin(str, str2);
        }
    }

    public static void a(java.lang.String str) {
        org.chromium.base.EarlyTraceEvent.b(str);
        if (a) {
            nativeEnd(str, null);
        }
    }
}
