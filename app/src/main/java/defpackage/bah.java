package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* access modifiers changed from: package-private */
/* renamed from: bah  reason: default package */
/* compiled from: PG */
public final class bah extends Handler {
    private /* synthetic */ baf a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    bah(baf baf, Looper looper) {
        super(looper);
        this.a = baf;
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                bag bag = (bag) message.obj;
                baf baf = this.a;
                baf.a.lock();
                try {
                    if (baf.k == bag.a) {
                        bag.a();
                        baf.a.unlock();
                        return;
                    }
                    return;
                } finally {
                    baf.a.unlock();
                }
            case 2:
                throw ((RuntimeException) message.obj);
            default:
                Log.w("GACStateManager", new StringBuilder(31).append("Unknown message id: ").append(message.what).toString());
                return;
        }
    }
}
