package defpackage;

import android.content.BroadcastReceiver;
import android.os.PowerManager;

/* renamed from: bwu  reason: default package */
/* compiled from: PG */
final class bwu implements Runnable {
    private final /* synthetic */ PowerManager.WakeLock a;
    private final /* synthetic */ Runnable b;
    private final /* synthetic */ BroadcastReceiver.PendingResult c;

    bwu(PowerManager.WakeLock wakeLock, Runnable runnable, BroadcastReceiver.PendingResult pendingResult) {
        this.a = wakeLock;
        this.b = runnable;
        this.c = pendingResult;
    }

    public final void run() {
        try {
            bty.c("ChimeExecutorApiImpl", "Started Broadcast execution [%d].", Integer.valueOf(bwt.a.incrementAndGet()));
            this.a.acquire();
            this.b.run();
            this.a.release();
            this.c.finish();
            bty.c("ChimeExecutorApiImpl", "Finished Broadcast execution [%d].", Integer.valueOf(bwt.a.get()));
        } catch (Throwable th) {
            this.a.release();
            this.c.finish();
            bty.c("ChimeExecutorApiImpl", "Finished Broadcast execution [%d].", Integer.valueOf(bwt.a.get()));
            throw th;
        }
    }
}
