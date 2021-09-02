package defpackage;

/* renamed from: dzc reason: default package */
/* compiled from: PG */
class dzc implements java.util.concurrent.Executor {
    private static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.dzc.class.getName());
    private boolean b;
    private java.util.ArrayDeque c;

    dzc() {
    }

    public void execute(java.lang.Runnable runnable) {
        defpackage.cld.a((java.lang.Object) runnable, (java.lang.Object) "'task' must not be null.");
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
                this.c = new java.util.ArrayDeque(4);
            }
            this.c.add(runnable);
        }
    }

    private final void a() {
        while (true) {
            java.lang.Runnable runnable = (java.lang.Runnable) this.c.poll();
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    java.lang.String valueOf = java.lang.String.valueOf(runnable);
                    a.logp(java.util.logging.Level.SEVERE, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "completeQueuedTasks", new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 35).append("Exception while executing runnable ").append(valueOf).toString(), th);
                }
            } else {
                return;
            }
        }
    }
}
