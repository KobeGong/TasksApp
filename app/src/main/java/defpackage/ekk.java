package defpackage;

/* renamed from: ekk reason: default package */
/* compiled from: PG */
final class ekk implements java.lang.Runnable {
    private final /* synthetic */ java.lang.Runnable a;
    private final /* synthetic */ defpackage.ekj b;

    ekk(defpackage.ekj ekj, java.lang.Runnable runnable) {
        this.b = ekj;
        this.a = runnable;
    }

    public final void run() {
        java.lang.Thread.currentThread().setName("JavaCronetEngine");
        android.os.Process.setThreadPriority(this.b.a);
        this.a.run();
    }
}
