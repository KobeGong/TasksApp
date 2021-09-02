package defpackage;

/* renamed from: oe reason: default package */
/* compiled from: PG */
abstract class oe {
    private static final java.util.concurrent.ThreadFactory a = new defpackage.of();
    public static final java.util.concurrent.Executor b;
    private static final java.util.concurrent.BlockingQueue h = new java.util.concurrent.LinkedBlockingQueue(10);
    private static defpackage.oi i;
    private static volatile java.util.concurrent.Executor j;
    public final defpackage.oj c = new defpackage.oj(this);
    public final java.util.concurrent.FutureTask d = new defpackage.og(this, this.c);
    public volatile int e = defpackage.bg.A;
    public final java.util.concurrent.atomic.AtomicBoolean f = new java.util.concurrent.atomic.AtomicBoolean();
    public final java.util.concurrent.atomic.AtomicBoolean g = new java.util.concurrent.atomic.AtomicBoolean();

    private static android.os.Handler d() {
        defpackage.oi oiVar;
        synchronized (defpackage.oe.class) {
            if (i == null) {
                i = new defpackage.oi();
            }
            oiVar = i;
        }
        return oiVar;
    }

    /* access modifiers changed from: protected */
    public abstract java.lang.Object b();

    oe() {
    }

    /* access modifiers changed from: 0000 */
    public final void b(java.lang.Object obj) {
        if (!this.g.get()) {
            c(obj);
        }
    }

    /* access modifiers changed from: 0000 */
    public final java.lang.Object c(java.lang.Object obj) {
        d().obtainMessage(1, new defpackage.oh(this, obj)).sendToTarget();
        return obj;
    }

    /* access modifiers changed from: protected */
    public void a(java.lang.Object obj) {
    }

    protected static void c() {
    }

    /* access modifiers changed from: protected */
    public void a() {
    }

    static {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(5, 128, 1, java.util.concurrent.TimeUnit.SECONDS, h, a);
        b = threadPoolExecutor;
        j = threadPoolExecutor;
    }
}
