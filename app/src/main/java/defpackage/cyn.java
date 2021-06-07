package defpackage;

import java.util.concurrent.Executor;

/* renamed from: cyn  reason: default package */
/* compiled from: PG */
public enum cyn implements Executor {
    INSTANCE;

    public final void execute(Runnable runnable) {
        runnable.run();
    }

    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
