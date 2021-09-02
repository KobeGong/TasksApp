package defpackage;

/* renamed from: d reason: default package */
/* compiled from: PG */
public final class d extends defpackage.e {
    private final java.lang.Object a = new java.lang.Object();
    private java.util.concurrent.ExecutorService b = java.util.concurrent.Executors.newFixedThreadPool(2);
    private volatile android.os.Handler c;

    public final void a(java.lang.Runnable runnable) {
        this.b.execute(runnable);
    }

    public final void b(java.lang.Runnable runnable) {
        if (this.c == null) {
            synchronized (this.a) {
                if (this.c == null) {
                    this.c = new android.os.Handler(android.os.Looper.getMainLooper());
                }
            }
        }
        this.c.post(runnable);
    }

    public final boolean b() {
        return android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread();
    }
}
