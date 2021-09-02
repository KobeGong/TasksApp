package defpackage;

/* renamed from: bwx reason: default package */
/* compiled from: PG */
public final class bwx implements java.lang.Runnable {
    public final /* synthetic */ com.google.android.libraries.notifications.executor.impl.basic.ChimeExecutorApiService a;
    private final /* synthetic */ android.os.PowerManager.WakeLock b;
    private final /* synthetic */ java.lang.Runnable c;

    public bwx(com.google.android.libraries.notifications.executor.impl.basic.ChimeExecutorApiService chimeExecutorApiService, android.os.PowerManager.WakeLock wakeLock, java.lang.Runnable runnable) {
        this.a = chimeExecutorApiService;
        this.b = wakeLock;
        this.c = runnable;
    }

    public final void run() {
        try {
            this.b.acquire();
            this.c.run();
        } finally {
            this.b.release();
            defpackage.cky.a((java.lang.Runnable) new defpackage.bwy(this));
        }
    }
}
