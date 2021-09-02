package defpackage;

/* renamed from: egz reason: default package */
/* compiled from: PG */
public final class egz implements android.os.MessageQueue.IdleHandler {
    private final /* synthetic */ org.chromium.base.SystemMessageHandler a;

    public egz(org.chromium.base.SystemMessageHandler systemMessageHandler) {
        this.a = systemMessageHandler;
    }

    public final boolean queueIdle() {
        if (this.a.a == 0) {
            return false;
        }
        this.a.nativeDoIdleWork(this.a.a);
        return true;
    }
}
