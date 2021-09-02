package defpackage;

/* renamed from: cyw reason: default package */
/* compiled from: PG */
public final class cyw implements java.util.concurrent.ThreadFactory {
    private final /* synthetic */ java.util.concurrent.ThreadFactory a;
    private final /* synthetic */ java.lang.String b;
    private final /* synthetic */ java.util.concurrent.atomic.AtomicLong c;
    private final /* synthetic */ java.lang.Boolean d;
    private final /* synthetic */ java.lang.Integer e = null;
    private final /* synthetic */ java.lang.Thread.UncaughtExceptionHandler f = null;

    public cyw(java.util.concurrent.ThreadFactory threadFactory, java.lang.String str, java.util.concurrent.atomic.AtomicLong atomicLong, java.lang.Boolean bool) {
        this.a = threadFactory;
        this.b = str;
        this.c = atomicLong;
        this.d = bool;
    }

    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread newThread = this.a.newThread(runnable);
        if (this.b != null) {
            newThread.setName(defpackage.cyv.a(this.b, java.lang.Long.valueOf(this.c.getAndIncrement())));
        }
        if (this.d != null) {
            newThread.setDaemon(this.d.booleanValue());
        }
        return newThread;
    }
}
