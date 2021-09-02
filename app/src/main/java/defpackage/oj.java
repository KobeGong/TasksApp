package defpackage;

/* renamed from: oj reason: default package */
/* compiled from: PG */
final class oj implements java.util.concurrent.Callable {
    private final /* synthetic */ defpackage.oe a;

    oj() {
    }

    oj(defpackage.oe oeVar) {
        this.a = oeVar;
        this();
    }

    public final java.lang.Object call() {
        this.a.g.set(true);
        java.lang.Object obj = null;
        try {
            android.os.Process.setThreadPriority(10);
            obj = this.a.b();
            android.os.Binder.flushPendingCommands();
            this.a.c(obj);
            return obj;
        } catch (Throwable th) {
            this.a.c(obj);
            throw th;
        }
    }
}
