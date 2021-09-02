package defpackage;

/* renamed from: cxy reason: default package */
/* compiled from: PG */
public final class cxy {
    private static final java.util.logging.Logger c = java.util.logging.Logger.getLogger(defpackage.cxy.class.getName());
    public defpackage.cxz a;
    public boolean b;

    static void a(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        try {
            executor.execute(runnable);
        } catch (java.lang.RuntimeException e) {
            java.lang.String valueOf = java.lang.String.valueOf(runnable);
            java.lang.String valueOf2 = java.lang.String.valueOf(executor);
            c.logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.ExecutionList", "executeListener", new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 57 + java.lang.String.valueOf(valueOf2).length()).append("RuntimeException while executing runnable ").append(valueOf).append(" with executor ").append(valueOf2).toString(), e);
        }
    }
}
