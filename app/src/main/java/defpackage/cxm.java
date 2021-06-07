package defpackage;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: cxm  reason: default package */
/* compiled from: PG */
public class cxm extends AbstractExecutorService implements cyl {
    private final ExecutorService a;

    public cxm() {
    }

    /* access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return cyx.a(runnable, obj);
    }

    /* access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return cyx.a(callable);
    }

    @Override // defpackage.cyl
    /* renamed from: a */
    public final cyi submit(Runnable runnable) {
        return (cyi) super.submit(runnable);
    }

    @Override // defpackage.cyl
    /* renamed from: a */
    public final cyi submit(Callable callable) {
        return (cyi) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (cyi) super.submit(runnable, obj);
    }

    public cxm(ExecutorService executorService) {
        this();
        this.a = (ExecutorService) cld.a(executorService);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
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

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        return this.a.shutdownNow();
    }

    public void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
