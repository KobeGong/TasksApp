package defpackage;

/* renamed from: qf reason: default package */
/* compiled from: PG */
final class qf implements java.lang.Runnable {
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference a;
    private final /* synthetic */ java.util.concurrent.Callable b;
    private final /* synthetic */ java.util.concurrent.locks.ReentrantLock c;
    private final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean d;
    private final /* synthetic */ java.util.concurrent.locks.Condition e;

    qf(java.util.concurrent.atomic.AtomicReference atomicReference, java.util.concurrent.Callable callable, java.util.concurrent.locks.ReentrantLock reentrantLock, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, java.util.concurrent.locks.Condition condition) {
        this.a = atomicReference;
        this.b = callable;
        this.c = reentrantLock;
        this.d = atomicBoolean;
        this.e = condition;
    }

    public final void run() {
        try {
            this.a.set(this.b.call());
        } catch (java.lang.Exception e2) {
        }
        this.c.lock();
        try {
            this.d.set(false);
            this.e.signal();
        } finally {
            this.c.unlock();
        }
    }
}
