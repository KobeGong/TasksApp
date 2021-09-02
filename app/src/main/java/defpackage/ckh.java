package defpackage;

/* renamed from: ckh reason: default package */
/* compiled from: PG */
final class ckh implements java.lang.Runnable {
    private final /* synthetic */ java.lang.Runnable a;
    private final /* synthetic */ defpackage.ckg b;

    ckh(defpackage.ckg ckg, java.lang.Runnable runnable) {
        this.b = ckg;
        this.a = runnable;
    }

    public final void run() {
        if (this.b.a != 0) {
            android.os.Process.setThreadPriority(this.b.a);
        }
        this.a.run();
    }
}
