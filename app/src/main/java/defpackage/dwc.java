package defpackage;

/* renamed from: dwc reason: default package */
/* compiled from: PG */
public final class dwc implements java.lang.Runnable {
    private static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.dwc.class.getName());
    private final java.lang.Runnable b;

    public dwc(java.lang.Runnable runnable) {
        this.b = (java.lang.Runnable) defpackage.cld.a((java.lang.Object) runnable, (java.lang.Object) "task");
    }

    public final void run() {
        try {
            this.b.run();
        } catch (Throwable th) {
            java.lang.String valueOf = java.lang.String.valueOf(this.b);
            a.logp(java.util.logging.Level.SEVERE, "io.grpc.internal.LogExceptionRunnable", "run", new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 35).append("Exception while executing runnable ").append(valueOf).toString(), th);
            defpackage.cld.a((java.lang.Object) th);
            if (th instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) th);
            } else if (th instanceof java.lang.Error) {
                throw ((java.lang.Error) th);
            } else {
                throw new java.lang.AssertionError(th);
            }
        }
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.b);
        return new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 22).append("LogExceptionRunnable(").append(valueOf).append(")").toString();
    }
}
