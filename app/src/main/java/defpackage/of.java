package defpackage;

/* renamed from: of reason: default package */
/* compiled from: PG */
final class of implements java.util.concurrent.ThreadFactory {
    private final java.util.concurrent.atomic.AtomicInteger a = new java.util.concurrent.atomic.AtomicInteger(1);

    of() {
    }

    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, "ModernAsyncTask #" + this.a.getAndIncrement());
    }
}
