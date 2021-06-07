package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: dzc  reason: default package */
/* compiled from: PG */
class dzc implements Executor {
    private static final Logger a = Logger.getLogger(dzc.class.getName());
    private boolean b;
    private ArrayDeque c;

    dzc() {
    }

    public void execute(Runnable runnable) {
        cld.a(runnable, "'task' must not be null.");
        if (!this.b) {
            this.b = true;
            try {
                runnable.run();
                if (this.c != null) {
                    a();
                }
                this.b = false;
            } catch (Throwable th) {
                if (this.c != null) {
                    a();
                }
                this.b = false;
                throw th;
            }
        } else {
            if (this.c == null) {
                this.c = new ArrayDeque(4);
            }
            this.c.add(runnable);
        }
    }

    private final void a() {
        while (true) {
            Runnable runnable = (Runnable) this.c.poll();
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    Logger logger = a;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(runnable);
                    logger.logp(level, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "completeQueuedTasks", new StringBuilder(String.valueOf(valueOf).length() + 35).append("Exception while executing runnable ").append(valueOf).toString(), th);
                }
            } else {
                return;
            }
        }
    }
}
