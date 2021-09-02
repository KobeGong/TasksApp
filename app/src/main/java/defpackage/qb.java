package defpackage;

/* renamed from: qb reason: default package */
/* compiled from: PG */
public final class qb {
    public final java.lang.Object a = new java.lang.Object();
    public android.os.HandlerThread b;
    public android.os.Handler c;
    public final int d;
    private int e;
    private android.os.Handler.Callback f = new defpackage.qc(this);
    private final int g;
    private final java.lang.String h;

    public qb(java.lang.String str) {
        this.h = str;
        this.g = 10;
        this.d = 10000;
        this.e = 0;
    }

    /* access modifiers changed from: 0000 */
    public final void a(java.lang.Runnable runnable) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new android.os.HandlerThread(this.h, this.g);
                this.b.start();
                this.c = new android.os.Handler(this.b.getLooper(), this.f);
                this.e++;
            }
            this.c.removeMessages(0);
            this.c.sendMessage(this.c.obtainMessage(1, runnable));
        }
    }

    public final java.lang.Object a(java.util.concurrent.Callable callable, int i) {
        java.lang.Object obj;
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        java.util.concurrent.locks.Condition newCondition = reentrantLock.newCondition();
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(true);
        a(new defpackage.qf(atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                obj = atomicReference.get();
            } else {
                long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos((long) i);
                do {
                    try {
                        nanos = newCondition.awaitNanos(nanos);
                    } catch (java.lang.InterruptedException e2) {
                    }
                    if (!atomicBoolean.get()) {
                        obj = atomicReference.get();
                        reentrantLock.unlock();
                    }
                } while (nanos > 0);
                throw new java.lang.InterruptedException("timeout");
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
