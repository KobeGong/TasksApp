package defpackage;

/* renamed from: bhz reason: default package */
/* compiled from: PG */
final class bhz {
    public final android.content.Intent a;
    private final android.content.BroadcastReceiver.PendingResult b;
    private boolean c = false;
    private final java.util.concurrent.ScheduledFuture d;

    bhz(android.content.Intent intent, android.content.BroadcastReceiver.PendingResult pendingResult, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.a = intent;
        this.b = pendingResult;
        this.d = scheduledExecutorService.schedule(new defpackage.bia(this, intent), 9500, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void a() {
        if (!this.c) {
            this.b.finish();
            this.d.cancel(false);
            this.c = true;
        }
    }
}
