package defpackage;

/* renamed from: bwu reason: default package */
/* compiled from: PG */
final class bwu implements java.lang.Runnable {
    private final /* synthetic */ android.os.PowerManager.WakeLock a;
    private final /* synthetic */ java.lang.Runnable b;
    private final /* synthetic */ android.content.BroadcastReceiver.PendingResult c;

    bwu(android.os.PowerManager.WakeLock wakeLock, java.lang.Runnable runnable, android.content.BroadcastReceiver.PendingResult pendingResult) {
        this.a = wakeLock;
        this.b = runnable;
        this.c = pendingResult;
    }

    public final void run() {
        try {
            defpackage.bty.c("ChimeExecutorApiImpl", "Started Broadcast execution [%d].", java.lang.Integer.valueOf(defpackage.bwt.a.incrementAndGet()));
            this.a.acquire();
            this.b.run();
        } finally {
            this.a.release();
            this.c.finish();
            defpackage.bty.c("ChimeExecutorApiImpl", "Finished Broadcast execution [%d].", java.lang.Integer.valueOf(defpackage.bwt.a.get()));
        }
    }
}
