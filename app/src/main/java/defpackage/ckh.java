package defpackage;

import android.os.Process;

/* renamed from: ckh  reason: default package */
/* compiled from: PG */
final class ckh implements Runnable {
    private final /* synthetic */ Runnable a;
    private final /* synthetic */ ckg b;

    ckh(ckg ckg, Runnable runnable) {
        this.b = ckg;
        this.a = runnable;
    }

    public final void run() {
        if (this.b.a != 0) {
            Process.setThreadPriority(this.b.a);
        }
        this.a.run();
    }
}
