package defpackage;

/* renamed from: cje reason: default package */
/* compiled from: PG */
final class cje implements defpackage.cjf, java.lang.Thread.UncaughtExceptionHandler {
    private final java.lang.Thread.UncaughtExceptionHandler a;
    private volatile defpackage.cjh b;

    cje(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    public final void a(defpackage.chk chk) {
        this.b = chk;
    }

    public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        if (this.b == null) {
            try {
                java.lang.Thread.sleep(100);
            } catch (java.lang.InterruptedException e) {
                defpackage.cdm.a(5, "Primes", "Wait for initialization is interrupted", new java.lang.Object[0]);
                java.lang.Thread.currentThread().interrupt();
            }
        }
        if (this.b != null) {
            this.b.a(this.a).uncaughtException(thread, th);
        } else if (this.a != null) {
            this.a.uncaughtException(thread, th);
        }
    }
}
