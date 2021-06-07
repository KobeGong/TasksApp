package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: qb  reason: default package */
/* compiled from: PG */
public final class qb {
    public final Object a = new Object();
    public HandlerThread b;
    public Handler c;
    public final int d;
    private int e;
    private Handler.Callback f = new qc(this);
    private final int g;
    private final String h;

    public qb(String str) {
        this.h = str;
        this.g = 10;
        this.d = 10000;
        this.e = 0;
    }

    /* access modifiers changed from: package-private */
    public final void a(Runnable runnable) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new HandlerThread(this.h, this.g);
                this.b.start();
                this.c = new Handler(this.b.getLooper(), this.f);
                this.e++;
            }
            this.c.removeMessages(0);
            this.c.sendMessage(this.c.obtainMessage(1, runnable));
        }
    }

    public final Object a(Callable callable, int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        a(new qf(atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos((long) i);
            do {
                try {
                    nanos = newCondition.awaitNanos(nanos);
                } catch (InterruptedException e2) {
                }
                if (!atomicBoolean.get()) {
                    Object obj = atomicReference.get();
                    reentrantLock.unlock();
                    return obj;
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }
}
