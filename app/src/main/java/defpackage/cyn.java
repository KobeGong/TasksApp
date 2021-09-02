package defpackage;

/* renamed from: cyn reason: default package */
/* compiled from: PG */
public enum cyn implements java.util.concurrent.Executor {
    ;

    private cyn(java.lang.String str) {
    }

    public final void execute(java.lang.Runnable runnable) {
        runnable.run();
    }

    public final java.lang.String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
