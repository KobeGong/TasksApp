package org.chromium.base;

import java.lang.Thread;
import org.chromium.base.annotations.CalledByNative;

/* compiled from: PG */
public class JavaExceptionReporter implements Thread.UncaughtExceptionHandler {
    private final Thread.UncaughtExceptionHandler a;
    private final boolean b;
    private boolean c;

    private JavaExceptionReporter(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, boolean z) {
        this.a = uncaughtExceptionHandler;
        this.b = z;
    }

    private static native void nativeReportJavaException(boolean z, Throwable th);

    private static native void nativeReportJavaStackTrace(String str);

    public void uncaughtException(Thread thread, Throwable th) {
        if (!this.c) {
            this.c = true;
            nativeReportJavaException(this.b, th);
        }
        if (this.a != null) {
            this.a.uncaughtException(thread, th);
        }
    }

    @CalledByNative
    private static void installHandler(boolean z) {
        Thread.setDefaultUncaughtExceptionHandler(new JavaExceptionReporter(Thread.getDefaultUncaughtExceptionHandler(), z));
    }
}
