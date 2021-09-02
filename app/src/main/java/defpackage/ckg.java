package defpackage;

/* renamed from: ckg reason: default package */
/* compiled from: PG */
public final class ckg implements java.util.concurrent.ThreadFactory {
    public final int a;
    private final java.util.concurrent.atomic.AtomicInteger b;
    private final java.lang.String c;

    public ckg(int i) {
        this("Primes", i);
    }

    public ckg(java.lang.String str, int i) {
        this.b = new java.util.concurrent.atomic.AtomicInteger(1);
        this.a = i;
        this.c = str;
    }

    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        defpackage.ckh ckh = new defpackage.ckh(this, runnable);
        java.lang.String str = this.c;
        java.lang.Thread thread = new java.lang.Thread(ckh, new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 12).append(str).append("-").append(this.b.getAndIncrement()).toString());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
