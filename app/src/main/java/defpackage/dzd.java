package defpackage;

/* renamed from: dzd reason: default package */
/* compiled from: PG */
public final class dzd implements java.lang.Runnable, java.util.concurrent.Executor {
    private static final java.util.logging.Logger b = java.util.logging.Logger.getLogger(defpackage.dzd.class.getName());
    private static final defpackage.dze c = a();
    public volatile int a = 0;
    private final java.util.concurrent.Executor d;
    private final java.util.Queue e = new java.util.concurrent.ConcurrentLinkedQueue();

    private static defpackage.dze a() {
        try {
            return new defpackage.dzf(java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.dzd.class, "a"));
        } catch (Throwable th) {
            b.logp(java.util.logging.Level.SEVERE, "io.grpc.internal.SerializingExecutor", "getAtomicHelper", "FieldUpdaterAtomicHelper failed", th);
            return new defpackage.dzg();
        }
    }

    public dzd(java.util.concurrent.Executor executor) {
        defpackage.cld.a((java.lang.Object) executor, (java.lang.Object) "'executor' must not be null.");
        this.d = executor;
    }

    public final void execute(java.lang.Runnable runnable) {
        this.e.add((java.lang.Runnable) defpackage.cld.a((java.lang.Object) runnable, (java.lang.Object) "'r' must not be null."));
        a(runnable);
    }

    private final void a(java.lang.Runnable runnable) {
        if (c.a(this)) {
            try {
                this.d.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.e.remove(runnable);
                }
                c.b(this);
                throw th;
            }
        }
    }

    public final void run() {
        java.lang.Runnable runnable;
        while (true) {
            try {
                runnable = (java.lang.Runnable) this.e.poll();
                if (runnable == null) {
                    break;
                }
                runnable.run();
            } catch (java.lang.RuntimeException e2) {
                java.lang.String valueOf = java.lang.String.valueOf(runnable);
                b.logp(java.util.logging.Level.SEVERE, "io.grpc.internal.SerializingExecutor", "run", new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 35).append("Exception while executing runnable ").append(valueOf).toString(), e2);
            } catch (Throwable th) {
                c.b(this);
                throw th;
            }
        }
        c.b(this);
        if (!this.e.isEmpty()) {
            a(null);
        }
    }
}
