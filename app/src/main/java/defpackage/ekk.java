package defpackage;

import android.os.Process;

/* renamed from: ekk  reason: default package */
/* compiled from: PG */
final class ekk implements Runnable {
    private final /* synthetic */ Runnable a;
    private final /* synthetic */ ekj b;

    ekk(ekj ekj, Runnable runnable) {
        this.b = ekj;
        this.a = runnable;
    }

    public final void run() {
        Thread.currentThread().setName("JavaCronetEngine");
        Process.setThreadPriority(this.b.a);
        this.a.run();
    }
}
