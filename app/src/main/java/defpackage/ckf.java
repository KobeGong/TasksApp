package defpackage;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: ckf  reason: default package */
/* compiled from: PG */
public final class ckf implements RejectedExecutionHandler {
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        String valueOf = String.valueOf(runnable);
        cdm.a(3, "PrimesExecutors", new StringBuilder(String.valueOf(valueOf).length() + 30).append("Service rejected execution of ").append(valueOf).toString(), new Object[0]);
    }
}
