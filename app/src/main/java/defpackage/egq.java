package defpackage;

/* renamed from: egq reason: default package */
/* compiled from: PG */
public final class egq implements android.os.MessageQueue.IdleHandler {
    private final /* synthetic */ long a;
    private final /* synthetic */ org.chromium.base.JavaHandlerThread b;

    public egq(org.chromium.base.JavaHandlerThread javaHandlerThread, long j) {
        this.b = javaHandlerThread;
        this.a = j;
    }

    public final boolean queueIdle() {
        this.b.a.getLooper().quit();
        this.b.nativeOnLooperStopped(this.a);
        return false;
    }
}
