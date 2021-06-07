package defpackage;

import java.lang.Thread;

/* renamed from: cje  reason: default package */
/* compiled from: PG */
final class cje implements cjf, Thread.UncaughtExceptionHandler {
    private final Thread.UncaughtExceptionHandler a;
    private volatile cjh b;

    cje(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    @Override // defpackage.cjf
    public final void a(chk chk) {
        this.b = chk;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        if (this.b == null) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                cdm.a(5, "Primes", "Wait for initialization is interrupted", new Object[0]);
                Thread.currentThread().interrupt();
            }
        }
        if (this.b != null) {
            this.b.a(this.a).uncaughtException(thread, th);
        } else if (this.a != null) {
            this.a.uncaughtException(thread, th);
        }
    }
}
