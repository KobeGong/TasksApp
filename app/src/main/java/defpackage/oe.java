package defpackage;

import android.os.Handler;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
/* renamed from: oe  reason: default package */
/* compiled from: PG */
public abstract class oe {
    private static final ThreadFactory a = new of();
    public static final Executor b;
    private static final BlockingQueue h = new LinkedBlockingQueue(10);
    private static oi i;
    private static volatile Executor j;
    public final oj c = new oj(this);
    public final FutureTask d = new og(this, this.c);
    public volatile int e = bg.A;
    public final AtomicBoolean f = new AtomicBoolean();
    public final AtomicBoolean g = new AtomicBoolean();

    private static Handler d() {
        oi oiVar;
        synchronized (oe.class) {
            if (i == null) {
                i = new oi();
            }
            oiVar = i;
        }
        return oiVar;
    }

    /* access modifiers changed from: protected */
    public abstract Object b();

    oe() {
    }

    /* access modifiers changed from: package-private */
    public final void b(Object obj) {
        if (!this.g.get()) {
            c(obj);
        }
    }

    /* access modifiers changed from: package-private */
    public final Object c(Object obj) {
        d().obtainMessage(1, new oh(this, obj)).sendToTarget();
        return obj;
    }

    /* access modifiers changed from: protected */
    public void a(Object obj) {
    }

    protected static void c() {
    }

    /* access modifiers changed from: protected */
    public void a() {
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, h, a);
        b = threadPoolExecutor;
        j = threadPoolExecutor;
    }
}
