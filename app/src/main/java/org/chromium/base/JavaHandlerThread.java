package org.chromium.base;

/* compiled from: PG */
public class JavaHandlerThread {
    public final android.os.HandlerThread a;
    public java.lang.Throwable b;

    private JavaHandlerThread(java.lang.String str) {
        this.a = new android.os.HandlerThread(str);
    }

    /* access modifiers changed from: private */
    public native void nativeInitializeThread(long j, long j2);

    /* access modifiers changed from: private */
    public native void nativeOnLooperStopped(long j);

    private native void nativeStopThread(long j);

    @org.chromium.base.annotations.CalledByNative
    private static org.chromium.base.JavaHandlerThread create(java.lang.String str) {
        return new org.chromium.base.JavaHandlerThread(str);
    }

    @org.chromium.base.annotations.CalledByNative
    private void startAndInitialize(long j, long j2) {
        if (!(this.a.getState() != java.lang.Thread.State.NEW)) {
            this.a.start();
        }
        new android.os.Handler(this.a.getLooper()).post(new defpackage.egp(this, j, j2));
    }

    /* access modifiers changed from: private */
    @org.chromium.base.annotations.CalledByNative
    public void stopOnThread(long j) {
        nativeStopThread(j);
        android.os.Looper.myQueue().addIdleHandler(new defpackage.egq(this, j));
    }

    @org.chromium.base.annotations.CalledByNative
    private void joinThread() {
        boolean z = false;
        while (!z) {
            try {
                this.a.join();
                z = true;
            } catch (java.lang.InterruptedException e) {
            }
        }
    }

    @org.chromium.base.annotations.CalledByNative
    private void stop(long j) {
        android.os.Looper looper = this.a.getLooper();
        if (isAlive() && looper != null) {
            new android.os.Handler(looper).post(new defpackage.egr(this, j));
            joinThread();
        }
    }

    @org.chromium.base.annotations.CalledByNative
    private boolean isAlive() {
        return this.a.isAlive();
    }

    @org.chromium.base.annotations.CalledByNative
    private void listenForUncaughtExceptionsForTesting() {
        this.a.setUncaughtExceptionHandler(new defpackage.egs(this));
    }

    @org.chromium.base.annotations.CalledByNative
    private java.lang.Throwable getUncaughtExceptionIfAny() {
        return this.b;
    }
}
