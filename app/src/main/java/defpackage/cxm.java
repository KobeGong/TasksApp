package defpackage;

/* renamed from: cxm reason: default package */
/* compiled from: PG */
public class cxm extends java.util.concurrent.AbstractExecutorService implements defpackage.cyl {
    private final java.util.concurrent.ExecutorService a;

    public cxm() {
    }

    /* access modifiers changed from: protected */
    public final java.util.concurrent.RunnableFuture newTaskFor(java.lang.Runnable runnable, java.lang.Object obj) {
        return defpackage.cyx.a(runnable, obj);
    }

    /* access modifiers changed from: protected */
    public final java.util.concurrent.RunnableFuture newTaskFor(java.util.concurrent.Callable callable) {
        return defpackage.cyx.a(callable);
    }

    /* renamed from: a */
    public final defpackage.cyi submit(java.lang.Runnable runnable) {
        return (defpackage.cyi) super.submit(runnable);
    }

    /* renamed from: a */
    public final defpackage.cyi submit(java.util.concurrent.Callable callable) {
        return (defpackage.cyi) super.submit(callable);
    }

    public /* synthetic */ java.util.concurrent.Future submit(java.lang.Runnable runnable, java.lang.Object obj) {
        return (defpackage.cyi) super.submit(runnable, obj);
    }

    public cxm(java.util.concurrent.ExecutorService executorService) {
        this();
        this.a = (java.util.concurrent.ExecutorService) defpackage.cld.a((java.lang.Object) executorService);
    }

    public boolean awaitTermination(long j, java.util.concurrent.TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    public boolean isShutdown() {
        return this.a.isShutdown();
    }

    public boolean isTerminated() {
        return this.a.isTerminated();
    }

    public void shutdown() {
        this.a.shutdown();
    }

    public java.util.List shutdownNow() {
        return this.a.shutdownNow();
    }

    public void execute(java.lang.Runnable runnable) {
        this.a.execute(runnable);
    }
}
