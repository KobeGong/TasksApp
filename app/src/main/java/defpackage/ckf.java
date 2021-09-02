package defpackage;

/* renamed from: ckf reason: default package */
/* compiled from: PG */
public final class ckf implements java.util.concurrent.RejectedExecutionHandler {
    public final void rejectedExecution(java.lang.Runnable runnable, java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
        java.lang.String valueOf = java.lang.String.valueOf(runnable);
        defpackage.cdm.a(3, "PrimesExecutors", new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 30).append("Service rejected execution of ").append(valueOf).toString(), new java.lang.Object[0]);
    }
}
