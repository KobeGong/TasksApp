package defpackage;

/* renamed from: bwt reason: default package */
/* compiled from: PG */
public final class bwt implements defpackage.bwq {
    public static final java.util.concurrent.atomic.AtomicInteger a = new java.util.concurrent.atomic.AtomicInteger();
    public android.content.Context b;
    public java.util.concurrent.ExecutorService c;

    public final void a(java.lang.Runnable runnable) {
        this.c.execute(runnable);
    }

    public final java.util.concurrent.Future a(java.util.concurrent.Callable callable) {
        return this.c.submit(callable);
    }

    public final void b(java.lang.Runnable runnable) {
        com.google.android.libraries.notifications.executor.impl.basic.ChimeExecutorApiService.a(this.b, runnable);
    }

    public final void a(android.content.BroadcastReceiver.PendingResult pendingResult, java.lang.Runnable runnable) {
        android.os.PowerManager powerManager = (android.os.PowerManager) this.b.getSystemService("power");
        java.lang.String valueOf = java.lang.String.valueOf("ChimeExecutorApi::");
        java.lang.String valueOf2 = java.lang.String.valueOf(this.b.getPackageName());
        this.c.execute(new defpackage.bwu(powerManager.newWakeLock(1, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new java.lang.String(valueOf)), runnable, pendingResult));
    }
}
