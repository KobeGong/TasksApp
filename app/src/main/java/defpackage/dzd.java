package defpackage;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: dzd  reason: default package */
/* compiled from: PG */
public final class dzd implements Runnable, Executor {
    private static final Logger b = Logger.getLogger(dzd.class.getName());
    private static final dze c = a();
    public volatile int a = 0;
    private final Executor d;
    private final Queue e = new ConcurrentLinkedQueue();

    private static dze a() {
        try {
            return new dzf(AtomicIntegerFieldUpdater.newUpdater(dzd.class, "a"));
        } catch (Throwable th) {
            b.logp(Level.SEVERE, "io.grpc.internal.SerializingExecutor", "getAtomicHelper", "FieldUpdaterAtomicHelper failed", th);
            return new dzg();
        }
    }

    public dzd(Executor executor) {
        cld.a(executor, "'executor' must not be null.");
        this.d = executor;
    }

    public final void execute(Runnable runnable) {
        this.e.add((Runnable) cld.a(runnable, "'r' must not be null."));
        a(runnable);
    }

    private final void a(Runnable runnable) {
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

    /* JADX INFO: finally extract failed */
    public final void run() {
        while (true) {
            try {
                Runnable runnable = (Runnable) this.e.poll();
                if (runnable == null) {
                    break;
                }
                try {
                    runnable.run();
                } catch (RuntimeException e2) {
                    Logger logger = b;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(runnable);
                    logger.logp(level, "io.grpc.internal.SerializingExecutor", "run", new StringBuilder(String.valueOf(valueOf).length() + 35).append("Exception while executing runnable ").append(valueOf).toString(), (Throwable) e2);
                }
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
