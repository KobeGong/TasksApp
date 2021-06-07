package defpackage;

import android.os.MessageQueue;
import org.chromium.base.JavaHandlerThread;

/* renamed from: egq  reason: default package */
/* compiled from: PG */
public final class egq implements MessageQueue.IdleHandler {
    private final /* synthetic */ long a;
    private final /* synthetic */ JavaHandlerThread b;

    public egq(JavaHandlerThread javaHandlerThread, long j) {
        this.b = javaHandlerThread;
        this.a = j;
    }

    public final boolean queueIdle() {
        this.b.a.getLooper().quit();
        this.b.nativeOnLooperStopped(this.a);
        return false;
    }
}
