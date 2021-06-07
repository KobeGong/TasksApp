package org.chromium.base;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.lang.Thread;
import org.chromium.base.annotations.CalledByNative;

/* compiled from: PG */
public class JavaHandlerThread {
    public final HandlerThread a;
    public Throwable b;

    private JavaHandlerThread(String str) {
        this.a = new HandlerThread(str);
    }

    /* access modifiers changed from: private */
    public native void nativeInitializeThread(long j, long j2);

    /* access modifiers changed from: private */
    public native void nativeOnLooperStopped(long j);

    private native void nativeStopThread(long j);

    @CalledByNative
    private static JavaHandlerThread create(String str) {
        return new JavaHandlerThread(str);
    }

    @CalledByNative
    private void startAndInitialize(long j, long j2) {
        if (!(this.a.getState() != Thread.State.NEW)) {
            this.a.start();
        }
        new Handler(this.a.getLooper()).post(new egp(this, j, j2));
    }

    /* access modifiers changed from: private */
    @CalledByNative
    public void stopOnThread(long j) {
        nativeStopThread(j);
        Looper.myQueue().addIdleHandler(new egq(this, j));
    }

    @CalledByNative
    private void joinThread() {
        boolean z = false;
        while (!z) {
            try {
                this.a.join();
                z = true;
            } catch (InterruptedException e) {
            }
        }
    }

    @CalledByNative
    private void stop(long j) {
        Looper looper = this.a.getLooper();
        if (isAlive() && looper != null) {
            new Handler(looper).post(new egr(this, j));
            joinThread();
        }
    }

    @CalledByNative
    private boolean isAlive() {
        return this.a.isAlive();
    }

    @CalledByNative
    private void listenForUncaughtExceptionsForTesting() {
        this.a.setUncaughtExceptionHandler(new egs(this));
    }

    @CalledByNative
    private Throwable getUncaughtExceptionIfAny() {
        return this.b;
    }
}
