package org.chromium.base;

/* compiled from: PG */
public class SystemMessageHandler extends android.os.Handler {
    public long a;
    private boolean b;
    private final android.os.MessageQueue.IdleHandler c = new defpackage.egz(this);

    private SystemMessageHandler(long j) {
        this.a = j;
        android.os.Looper.myQueue().addIdleHandler(this.c);
    }

    /* access modifiers changed from: private */
    public native void nativeDoIdleWork(long j);

    private native void nativeDoRunLoopOnce(long j, boolean z);

    public void handleMessage(android.os.Message message) {
        boolean z;
        if (this.a != 0) {
            if (message.what == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.b = false;
            }
            nativeDoRunLoopOnce(this.a, z);
        }
    }

    @org.chromium.base.annotations.CalledByNative
    private void scheduleWork() {
        sendMessage(a(1));
    }

    @org.chromium.base.annotations.CalledByNative
    private void scheduleDelayedWork(long j) {
        if (this.b) {
            removeMessages(2);
        }
        this.b = true;
        sendMessageDelayed(a(2), j);
    }

    @org.chromium.base.annotations.CalledByNative
    private void shutdown() {
        this.a = 0;
    }

    private static android.os.Message a(int i) {
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = i;
        defpackage.eha.a.a(obtain);
        return obtain;
    }

    @org.chromium.base.annotations.CalledByNative
    private static org.chromium.base.SystemMessageHandler create(long j) {
        return new org.chromium.base.SystemMessageHandler(j);
    }
}
