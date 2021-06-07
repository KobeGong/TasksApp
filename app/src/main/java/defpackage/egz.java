package defpackage;

import android.os.MessageQueue;
import org.chromium.base.SystemMessageHandler;

/* renamed from: egz  reason: default package */
/* compiled from: PG */
public final class egz implements MessageQueue.IdleHandler {
    private final /* synthetic */ SystemMessageHandler a;

    public egz(SystemMessageHandler systemMessageHandler) {
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
