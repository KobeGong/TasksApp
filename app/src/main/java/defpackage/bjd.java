package defpackage;

/* renamed from: bjd reason: default package */
/* compiled from: PG */
public final class bjd implements java.util.concurrent.ThreadFactory {
    private final java.lang.String a;
    private final java.util.concurrent.atomic.AtomicInteger b;
    private final java.util.concurrent.ThreadFactory c;

    public bjd(java.lang.String str) {
        this(str, 0);
    }

    private bjd(java.lang.String str, byte b2) {
        this.b = new java.util.concurrent.atomic.AtomicInteger();
        this.c = java.util.concurrent.Executors.defaultThreadFactory();
        this.a = (java.lang.String) defpackage.azb.b((java.lang.Object) str, (java.lang.Object) "Name must not be null");
    }

    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread newThread = this.c.newThread(new defpackage.bje(runnable));
        java.lang.String str = this.a;
        newThread.setName(new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 13).append(str).append("[").append(this.b.getAndIncrement()).append("]").toString());
        return newThread;
    }
}
