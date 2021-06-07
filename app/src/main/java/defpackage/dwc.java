package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: dwc  reason: default package */
/* compiled from: PG */
public final class dwc implements Runnable {
    private static final Logger a = Logger.getLogger(dwc.class.getName());
    private final Runnable b;

    public dwc(Runnable runnable) {
        this.b = (Runnable) cld.a(runnable, "task");
    }

    public final void run() {
        try {
            this.b.run();
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(this.b);
            logger.logp(level, "io.grpc.internal.LogExceptionRunnable", "run", new StringBuilder(String.valueOf(valueOf).length() + 35).append("Exception while executing runnable ").append(valueOf).toString(), th);
            cld.a((Object) th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            } else if (th instanceof Error) {
                throw ((Error) th);
            } else {
                throw new AssertionError(th);
            }
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        return new StringBuilder(String.valueOf(valueOf).length() + 22).append("LogExceptionRunnable(").append(valueOf).append(")").toString();
    }
}
