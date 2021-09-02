package defpackage;

/* renamed from: bje reason: default package */
/* compiled from: PG */
final class bje implements java.lang.Runnable {
    private final java.lang.Runnable a;

    public bje(java.lang.Runnable runnable) {
        this.a = runnable;
    }

    public final void run() {
        android.os.Process.setThreadPriority(0);
        this.a.run();
    }
}
