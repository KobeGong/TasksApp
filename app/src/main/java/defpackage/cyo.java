package defpackage;

/* renamed from: cyo reason: default package */
/* compiled from: PG */
public final class cyo extends defpackage.cxm implements defpackage.cym {
    private final java.util.concurrent.ScheduledExecutorService a;

    public cyo(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.a = (java.util.concurrent.ScheduledExecutorService) defpackage.cld.a((java.lang.Object) scheduledExecutorService);
    }

    /* renamed from: a */
    public final defpackage.cyk schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        defpackage.cyx a2 = defpackage.cyx.a(runnable, null);
        return new defpackage.cyp(a2, this.a.schedule(a2, j, timeUnit));
    }

    public final /* synthetic */ java.util.concurrent.ScheduledFuture scheduleWithFixedDelay(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        defpackage.cyq cyq = new defpackage.cyq(runnable);
        return new defpackage.cyp(cyq, this.a.scheduleWithFixedDelay(cyq, j, j2, timeUnit));
    }

    public final /* synthetic */ java.util.concurrent.ScheduledFuture scheduleAtFixedRate(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        defpackage.cyq cyq = new defpackage.cyq(runnable);
        return new defpackage.cyp(cyq, this.a.scheduleAtFixedRate(cyq, j, j2, timeUnit));
    }

    public final /* synthetic */ java.util.concurrent.ScheduledFuture schedule(java.util.concurrent.Callable callable, long j, java.util.concurrent.TimeUnit timeUnit) {
        defpackage.cyx a2 = defpackage.cyx.a(callable);
        return new defpackage.cyp(a2, this.a.schedule(a2, j, timeUnit));
    }
}
