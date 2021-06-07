package org.chromium.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import org.chromium.base.annotations.CalledByNative;

/* compiled from: PG */
public class SystemMessageHandler extends Handler {
    public long a;
    private boolean b;
    private final MessageQueue.IdleHandler c = new egz(this);

    private SystemMessageHandler(long j) {
        this.a = j;
        Looper.myQueue().addIdleHandler(this.c);
    }

    /* access modifiers changed from: private */
    public native void nativeDoIdleWork(long j);

    private native void nativeDoRunLoopOnce(long j, boolean z);

    public void handleMessage(Message message) {
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

    @CalledByNative
    private void scheduleWork() {
        sendMessage(a(1));
    }

    @CalledByNative
    private void scheduleDelayedWork(long j) {
        if (this.b) {
            removeMessages(2);
        }
        this.b = true;
        sendMessageDelayed(a(2), j);
    }

    @CalledByNative
    private void shutdown() {
        this.a = 0;
    }

    private static Message a(int i) {
        Message obtain = Message.obtain();
        obtain.what = i;
        eha.a.a(obtain);
        return obtain;
    }

    @CalledByNative
    private static SystemMessageHandler create(long j) {
        return new SystemMessageHandler(j);
    }
}
