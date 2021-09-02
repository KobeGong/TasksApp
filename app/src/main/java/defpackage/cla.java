package defpackage;

/* renamed from: cla reason: default package */
/* compiled from: PG */
public final class cla implements java.util.concurrent.ScheduledExecutorService {
    private final java.util.concurrent.ScheduledExecutorService a;

    public cla(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.cld cld) {
        this.a = (java.util.concurrent.ScheduledExecutorService) defpackage.cky.a((java.lang.Object) scheduledExecutorService);
        defpackage.cky.a((java.lang.Object) cld);
    }

    private final java.lang.Runnable a(java.lang.Runnable runnable) {
        return new defpackage.clb(this, runnable);
    }

    private final java.util.concurrent.Callable a(java.util.concurrent.Callable callable) {
        return new defpackage.clc(this, callable);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Collection, code=java.util.Collection<java.util.concurrent.Callable>, for r4v0, types: [java.util.Collection<java.util.concurrent.Callable>, java.util.Collection] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List a(java.util.Collection<java.util.concurrent.Callable> r4) {
        /*
            r3 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r4.iterator()
        L_0x0009:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001d
            java.lang.Object r0 = r2.next()
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
            java.util.concurrent.Callable r0 = r3.a(r0)
            r1.add(r0)
            goto L_0x0009
        L_0x001d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cla.a(java.util.Collection):java.util.List");
    }

    public final java.util.concurrent.ScheduledFuture schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        return this.a.schedule(a(runnable), j, timeUnit);
    }

    public final java.util.concurrent.ScheduledFuture schedule(java.util.concurrent.Callable callable, long j, java.util.concurrent.TimeUnit timeUnit) {
        return this.a.schedule(a(callable), j, timeUnit);
    }

    public final java.util.concurrent.ScheduledFuture scheduleAtFixedRate(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        return this.a.scheduleAtFixedRate(a(runnable), j, j2, timeUnit);
    }

    public final java.util.concurrent.ScheduledFuture scheduleWithFixedDelay(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        return this.a.scheduleWithFixedDelay(a(runnable), j, j2, timeUnit);
    }

    public final void execute(java.lang.Runnable runnable) {
        this.a.execute(a(runnable));
    }

    public final java.util.concurrent.Future submit(java.lang.Runnable runnable) {
        return this.a.submit(a(runnable));
    }

    public final java.util.concurrent.Future submit(java.lang.Runnable runnable, java.lang.Object obj) {
        return this.a.submit(a(runnable), obj);
    }

    public final java.util.concurrent.Future submit(java.util.concurrent.Callable callable) {
        return this.a.submit(a(callable));
    }

    public final void shutdown() {
        this.a.shutdown();
    }

    public final java.util.List shutdownNow() {
        return this.a.shutdownNow();
    }

    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    public final boolean awaitTermination(long j, java.util.concurrent.TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    public final java.lang.Object invokeAny(java.util.Collection collection) {
        return this.a.invokeAny(a(collection));
    }

    public final java.lang.Object invokeAny(java.util.Collection collection, long j, java.util.concurrent.TimeUnit timeUnit) {
        return this.a.invokeAny(a(collection), j, timeUnit);
    }

    public final java.util.List invokeAll(java.util.Collection collection) {
        return this.a.invokeAll(a(collection));
    }

    public final java.util.List invokeAll(java.util.Collection collection, long j, java.util.concurrent.TimeUnit timeUnit) {
        return this.a.invokeAll(a(collection), j, timeUnit);
    }
}
