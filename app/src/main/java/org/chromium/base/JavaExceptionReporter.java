package org.chromium.base;

/* compiled from: PG */
public class JavaExceptionReporter implements java.lang.Thread.UncaughtExceptionHandler {
    private final java.lang.Thread.UncaughtExceptionHandler a;
    private final boolean b;
    private boolean c;

    private JavaExceptionReporter(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler, boolean z) {
        this.a = uncaughtExceptionHandler;
        this.b = z;
    }

    private static native void nativeReportJavaException(boolean z, java.lang.Throwable th);

    private static native void nativeReportJavaStackTrace(java.lang.String str);

    public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        if (!this.c) {
            this.c = true;
            nativeReportJavaException(this.b, th);
        }
        if (this.a != null) {
            this.a.uncaughtException(thread, th);
        }
    }

    @org.chromium.base.annotations.CalledByNative
    private static void installHandler(boolean z) {
        java.lang.Thread.setDefaultUncaughtExceptionHandler(new org.chromium.base.JavaExceptionReporter(java.lang.Thread.getDefaultUncaughtExceptionHandler(), z));
    }
}
