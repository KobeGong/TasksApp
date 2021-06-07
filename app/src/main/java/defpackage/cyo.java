package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: cyo  reason: default package */
/* compiled from: PG */
public final class cyo extends cxm implements cym {
    private final ScheduledExecutorService a;

    public cyo(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.a = (ScheduledExecutorService) cld.a(scheduledExecutorService);
    }

    @Override // defpackage.cym
    /* renamed from: a */
    public final cyk schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        cyx a2 = cyx.a(runnable, (Object) null);
        return new cyp(a2, this.a.schedule(a2, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        cyq cyq = new cyq(runnable);
        return new cyp(cyq, this.a.scheduleWithFixedDelay(cyq, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        cyq cyq = new cyq(runnable);
        return new cyp(cyq, this.a.scheduleAtFixedRate(cyq, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        cyx a2 = cyx.a(callable);
        return new cyp(a2, this.a.schedule(a2, j, timeUnit));
    }
}
